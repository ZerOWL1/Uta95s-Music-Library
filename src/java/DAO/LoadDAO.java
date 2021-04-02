/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Account;
import Entity.Song;
import Entity.Album;
import Entity.Categories;
import Context.DBContext;
import Entity.Artist;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryuu
 */
public class LoadDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public String status;

//    get all song
    public List<Song> getAllSong() {
        List<Song> list = new ArrayList<>();
        String query = "SELECT * FROM HE141223_HAILD_SONG";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Song(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

//    get top 10 latest album
    public List<Album> getLatestSong() {
        List<Album> albList = new ArrayList<>();
        String query = "SELECT TOP 10 * FROM dbo.HE141223_HAILD_ALBUM ORDER BY DATE_UPDATE DESC";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                albList.add(new Album(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)
                ));
            }
        } catch (Exception e) {
        }
        return albList;
    }

//    get all album
    public List<Album> getAllAlbum() {
        List<Album> allAl = new ArrayList<>();
        String query = "SELECT * FROM dbo.HE141223_HAILD_ALBUM ORDER BY DATE_UPDATE DESC";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                allAl.add(new Album(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)
                ));
            }
        } catch (Exception e) {
        }
        return allAl;
    }

// get album with genre
    public List<Album> getAlbumByGenre(String idGenre) {
        List<Album> allAl = new ArrayList<>();
        String query = "SELECT  * FROM dbo.HE141223_HAILD_ALBUM WHERE idGenre = ? ORDER BY DATE_UPDATE DESC";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, idGenre);
            rs = ps.executeQuery();
            while (rs.next()) {
                allAl.add(new Album(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)
                ));
            }
        } catch (Exception e) {
        }
        return allAl;
    }

//get album by ID
    public Album getAlbumByID(String id) {
        String query = "SELECT * FROM dbo.HE141223_HAILD_ALBUM WHERE idAlbum = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Album(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

//get all genre
    public List<Categories> getGenre() {
        List<Categories> genre = new ArrayList<>();
        String query = "SELECT * FROM dbo.HE141223_HAILD_GENRE";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                genre.add(new Categories(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return genre;
    }

// seach by name
    public List<Album> searchAlbumByName(String searchNa) {
        List<Album> searchName = new ArrayList<>();
        String query = "SELECT * FROM dbo.HE141223_HAILD_ALBUM WHERE Name LIKE ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + searchNa + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                searchName.add(new Album(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)
                ));
            }
        } catch (Exception e) {
        }
        return searchName;
    }

//account login
    public Account login(String user, String pass) {
        String query = "SELECT * FROM dbo.HE141223_HAILD_USER WHERE Mail = ? AND [Password] = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

//account signup
    public void signup(String user, String pass) {
        String query = "INSERT INTO dbo.HE141223_HAILD_USER VALUES (N'', ?, 0, 1, ?, '')";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, pass);
            ps.setString(2, user);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Account checkExist(String user) {
        String query = "SELECT * FROM dbo.HE141223_HAILD_USER WHERE Mail = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

//get Artist Name by id
    public String getNameByID(String artid) {
        String sql = "SELECT Name FROM dbo.HE141223_HAILD_ARTIST WHERE idArtist = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, artid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
        }
        return null;
    }

//    get all song
    public List<String> getIdArt() {
        List<String> art = new ArrayList<>();
        String query = "SELECT idArtist FROM dbo.HE141223_HAILD_ARTIST";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                art.add(new String(
                        rs.getString(1)
                ));
            }
        } catch (Exception e) {
        }
        return art;
    }

//Get all artist
    public List<Artist> getAllArtist() {
        List<Artist> art = new ArrayList<>();
        String query = "SELECT * FROM dbo.HE141223_HAILD_ARTIST";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                art.add(new Artist(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return art;
    }
//Count album in database

    
//off set 12 value in database

    public List<Album> pagAlbum(int index) {
        List<Album> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_ALBUM ORDER BY DATE_UPDATE DESC, idAlbum\n"
                + "OFFSET ? ROWS FETCH NEXT 12 ROWS ONLY;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 12);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Album(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
            status = " Error in pagAlbum functions " + e.getMessage();
        }
        return list;
    }

//get music list by id album
    public List<Song> getMusicByIDAL(String idAl) {
        List<Song> searchSong = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_SONG WHERE idAlbum = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, idAl);
            rs = ps.executeQuery();
            while (rs.next()) {
                searchSong.add(new Song(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)
                ));
            }
        } catch (Exception e) {
            status = " Error at getMusicByIDAL fuction" + e.getMessage();
        }
        return searchSong;
    }

    //get allUser 
    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_USER WHERE isUser = '1'";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)
                ));
            }
        } catch (Exception e) {
            status = " Error at getAllAccount fuction" + e.getMessage();
        }
        return list;
    }

    //load view
    public int getViewPage() {
        int count = 0;
        String sql = "SELECT * FROM dbo.HE141223_HAILD_VIEW";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            status = " Error at getViewPage fuction" + e.getMessage();
        }
        return count;
    }

    //update view
    public void updateView() {
        String sql = "UPDATE dbo.HE141223_HAILD_VIEW SET VIEWED = VIEWED + 1";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at updateView fuction" + e.getMessage();
        }
    }

    //Display img by user
    public String displayImgByUID(int uid) {
        String sql = "SELECT UImg_path FROM dbo.HE141223_HAILD_USER WHERE UID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            status = " Error at displayImgByUID fuction" + e.getMessage();
        }
        return null;
    }

    //delete cate
    public void deleteGenre(String gid) {
        String sql = "DELETE FROM dbo.HE141223_HAILD_GENRE WHERE idGenre = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, gid);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at deleteGenre fuction" + e.getMessage();
        }
    }

    //pagination with categories 


    public static void main(String[] args) {
        LoadDAO dao = new LoadDAO();
//        List<Album> album = dao.getLatestSong();
//        for (Album alb : album) {
//            System.out.println(alb);
//        }
//        dao.deleteGenre("14");
//        List<Categories> cate = dao.getGenre();
//        for (Categories cat : cate) {
//            System.out.println(cat);
//        }
        

    }
}
