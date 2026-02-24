package code;
import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame {
    public JPanel mainPanel;
    public CardLayout cardLayout;  
    public song song;
    public GUI() {
        configFrame();
        initComponents();         
    }
    
    private void configFrame() {
        setSize(800, 600);
        setTitle("BatiPlayer");
        setLocationRelativeTo(null);     
        setDefaultCloseOperation(EXIT_ON_CLOSE);         
    }
    
    private void initComponents() {
        mainPanel = new JPanel(new BorderLayout());                        
        
        mainPanel.add(menu(), BorderLayout.WEST);
        mainPanel.add(musicBar(), BorderLayout.SOUTH);
        mainPanel.add(listSongs(),  BorderLayout.CENTER);
                
        getContentPane().add(mainPanel);        
    }
    
    private JPanel menu() {
        JPanel menu = new JPanel(new BorderLayout(10, 10));
                                
        JPanel buttonsSideBar = new JPanel(new BorderLayout());
        buttonsSideBar.setBackground(Color.BLACK);        
        buttonsSideBar.setOpaque(true);
        
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.BLACK);
        headerPanel.setOpaque(true);
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
        
        JLabel iconSideBar = new JLabel();
        iconSideBar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        iconSideBar.setText("BatiPlayer");
        iconSideBar.setForeground(Color.WHITE);
        iconSideBar.setIcon(new ImageIcon(getClass().getResource("/resources/bat.png")));        
        headerPanel.add(iconSideBar);
        
        
        JLabel textSideBar = new JLabel("<html><div style='text-align: center;'>"
                                        + "El mejor music player<br>"
                                        + "oupen surs"
                                        + "</div></html>");       
        textSideBar.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));  
        textSideBar.setForeground(Color.WHITE);
        textSideBar.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(textSideBar);
        
        buttonsSideBar.add(headerPanel, BorderLayout.NORTH);
        
        JPanel centerButtons = new JPanel();
        centerButtons.setBackground(Color.BLACK);
        centerButtons.setOpaque(true);
        centerButtons.setLayout(new BoxLayout(centerButtons, BoxLayout.Y_AXIS));
        
        centerButtons.add(Box.createVerticalGlue());
        
        JButton playlistsBtn = new JButton();        
        playlistsBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        playlistsBtn.setText("Playlists");
        playlistsBtn.setForeground(Color.WHITE);
        playlistsBtn.setContentAreaFilled(false);
        playlistsBtn.setBorderPainted(false);
        playlistsBtn.setFocusable(false);
        playlistsBtn.setIcon(new ImageIcon(getClass().getResource("/resources/playlist.png")));
        centerButtons.add(playlistsBtn);
        
        centerButtons.add(Box.createVerticalStrut(15));
        JButton newSongBtn = new JButton("New Song");
        newSongBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        newSongBtn.setForeground(Color.WHITE);
        newSongBtn.setContentAreaFilled(false);
        newSongBtn.setBorderPainted(false);
        newSongBtn.setFocusable(false);
        newSongBtn.setIcon(new ImageIcon(getClass().getResource("/resources/newSong.png")));
        centerButtons.add(newSongBtn);
                
        centerButtons.add(Box.createVerticalStrut(15));
        JButton newPlaylistBtn = new JButton();
        newPlaylistBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        newPlaylistBtn.setText("New Playlist");
        newPlaylistBtn.setForeground(Color.WHITE);
        newPlaylistBtn.setContentAreaFilled(false);
        newPlaylistBtn.setBorderPainted(false);
        newPlaylistBtn.setFocusable(false);
        newPlaylistBtn.setIcon(new ImageIcon(getClass().getResource("/resources/newPlaylist.png")));
        centerButtons.add(newPlaylistBtn);
        
        centerButtons.add(Box.createVerticalStrut(15));
        JButton queueBtn = new JButton();
        queueBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        queueBtn.setText("Queue");
        queueBtn.setForeground(Color.WHITE);
        queueBtn.setContentAreaFilled(false);
        queueBtn.setBorderPainted(false);
        queueBtn.setFocusable(false);
        queueBtn.setIcon(new ImageIcon(getClass().getResource("/resources/queue.png")));
        centerButtons.add(queueBtn);
        
        centerButtons.add(Box.createVerticalGlue());
                        
        buttonsSideBar.add(centerButtons, BorderLayout.CENTER);
        
        menu.add(buttonsSideBar, BorderLayout.WEST);  
        
        return menu;
    }
    
    private JPanel musicBar() {        
        JPanel musicBar = new JPanel(new BorderLayout(10, 10));        
        
        JPanel songBar = new JPanel(new BorderLayout());
        songBar.setBackground(Color.DARK_GRAY);
        songBar.setOpaque(true);
        
        JPanel buttonsSong = new JPanel(new GridLayout(1, 3));
        buttonsSong.setBackground(Color.DARK_GRAY);
        buttonsSong.setOpaque(true);
                
        JButton lastTrackBtn = new JButton();
        lastTrackBtn.setContentAreaFilled(false);
        lastTrackBtn.setBorderPainted(false);
        lastTrackBtn.setFocusable(false);
        lastTrackBtn.setIcon(new ImageIcon(getClass().getResource("/resources/last.png")));
        buttonsSong.add(lastTrackBtn);
        
        JButton startTrackBtn = new JButton();
        startTrackBtn.setFocusable(false);
        startTrackBtn.setContentAreaFilled(false);
        startTrackBtn.setBorderPainted(false);
        startTrackBtn.setIcon(new ImageIcon(getClass().getResource("/resources/start.png")));
        buttonsSong.add(startTrackBtn);
        
        JButton nextTrackBtn = new JButton();
        nextTrackBtn.setContentAreaFilled(false);
        nextTrackBtn.setBorderPainted(false);
        nextTrackBtn.setFocusable(false);
        nextTrackBtn.setIcon(new ImageIcon(getClass().getResource("/resources/next.png")));
        buttonsSong.add(nextTrackBtn);
        
        
        
        JPanel buttonsQueue = new JPanel(new GridLayout(1, 4));
        buttonsQueue.setBackground(Color.DARK_GRAY);
        buttonsQueue.setOpaque(true);
        
        
                                        
        songBar.add(buttonsSong, BorderLayout.WEST);
        musicBar.add(songBar, BorderLayout.CENTER);
        return musicBar;
    }
    
    private JPanel listSongs() {
        JPanel listSongs = new JPanel(new BorderLayout());
        
        JPanel songsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        songsPanel.setBackground(Color.GRAY);
        songsPanel.setOpaque(true);
        
        listSongs.add(songsPanel, BorderLayout.NORTH);
        return listSongs;
    }
}
