/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Ryuu
 */
public class Song {
    private int songID;
    private String name;
    private String release;
    private String idAlbum;
    private String idArtist;
    private int idGenre;
    private String mv_path;
    private String song_path;
    private String img_path;

    public Song() {
    }

    public Song(int songID, String name, String release, String idAlbum, String idArtist, int idGenre, String mv_path, String song_path, String img_path) {
        this.songID = songID;
        this.name = name;
        this.release = release;
        this.idAlbum = idAlbum;
        this.idArtist = idArtist;
        this.idGenre = idGenre;
        this.mv_path = mv_path;
        this.song_path = song_path;
        this.img_path = img_path;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    public String getMv_path() {
        return mv_path;
    }

    public void setMv_path(String mv_path) {
        this.mv_path = mv_path;
    }

    public String getSong_path() {
        return song_path;
    }

    public void setSong_path(String song_path) {
        this.song_path = song_path;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    @Override
    public String toString() {
        return "Song{" + "songID=" + songID + ", name=" + name + ", release=" + release + ", idAlbum=" + idAlbum + ", idArtist=" + idArtist + ", idGenre=" + idGenre + ", mv_path=" + mv_path + ", song_path=" + song_path + ", img_path=" + img_path + '}';
    }

    
    
}
