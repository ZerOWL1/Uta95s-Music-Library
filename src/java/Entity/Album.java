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
public class Album {

    private String idAlbum;
    private String idArtist;
    private String name;
    private String year;
    private String AImg_path;
    private String date;
    private int idGenre;

    public Album() {
    }

    public Album(String idAlbum, String idArtist, String name, String year, String AImg_path, String date, int idGenre) {
        this.idAlbum = idAlbum;
        this.idArtist = idArtist;
        this.name = name;
        this.year = year;
        this.AImg_path = AImg_path;
        this.date = date;
        this.idGenre = idGenre;
    }


    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAImg_path() {
        return AImg_path;
    }

    public void setAImg_path(String AImg_path) {
        this.AImg_path = AImg_path;
    }

    @Override
    public String toString() {
        return "Album{" + "idAlbum=" + idAlbum + ", idArtist=" + idArtist + ", name=" + name + ", year=" + year + ", AImg_path=" + AImg_path + ", date=" + date + ", idGenre=" + idGenre + '}';
    }
    
}
