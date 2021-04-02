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
public class SongFavorites {
    private String uid;
    private String sid;
    private String name;
    private String release;
    private String idAlbum;
    private String idArtist;
    private String idGenre;
    private String mv_path;
    private String song_path;
    private String img_path;

    public SongFavorites() {
    }

    public SongFavorites(String uid, String sid, String name, String release, String idAlbum, String idArtist, String idGenre, String mv_path, String song_path, String img_path) {
        this.uid = uid;
        this.sid = sid;
        this.name = name;
        this.release = release;
        this.idAlbum = idAlbum;
        this.idArtist = idArtist;
        this.idGenre = idGenre;
        this.mv_path = mv_path;
        this.song_path = song_path;
        this.img_path = img_path;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public String getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(String idGenre) {
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
        return "SongFavorites{" + "uid=" + uid + ", sid=" + sid + ", name=" + name + ", release=" + release + ", idAlbum=" + idAlbum + ", idArtist=" + idArtist + ", idGenre=" + idGenre + ", mv_path=" + mv_path + ", song_path=" + song_path + ", img_path=" + img_path + '}';
    }

}
