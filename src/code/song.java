package code;
import javax.swing.Icon;
public class song {
    String name;
    String artist;
    String album;
    Icon cover;
    
    public song() {
        name = "";
        artist = "";
        album = "";
        cover = null;
    }
    
    public song(String name, String artist, String album, Icon cover) {
        setName(name);
        setArtist(artist);
        setAlbum(album);
        setCover(cover);
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Icon getCover() {
        return cover;
    }

    public void setCover(Icon cover) {
        this.cover = cover;
    }        
}
