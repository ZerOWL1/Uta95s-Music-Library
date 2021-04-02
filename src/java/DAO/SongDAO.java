/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.Song;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryuu
 */
public class SongDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public String status;

    public void deleteSong(String sid) {
        String sql = "DELETE dbo.HE141223_HAILD_SONG WHERE SongID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, sid);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at deleteSong fuction" + e.getMessage();
        }
    }

    public Song checkSongByID(String sid) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_SONG WHERE SongID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, sid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Song(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9));
            }
        } catch (Exception e) {
            status = " Error at checkSongByID fuction" + e.getMessage();
        }
        return null;
    }

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

    public void insertSong(String sid, String name, String release, String idAlb, String idArt, String idGen,
            String mv_path, String song_path, String img_path) {
        String sql = "INSERT INTO dbo.HE141223_HAILD_SONG VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, sid);
            ps.setString(2, name);
            ps.setString(3, release);
            ps.setString(4, idAlb);
            ps.setString(5, idArt);
            ps.setString(6, idGen);
            ps.setString(7, mv_path);
            ps.setString(8, song_path);
            ps.setString(9, img_path);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at insertSong fuction" + e.getMessage();
        }
    }

    public Song editSongByID(String name, String rel, String idAlb, String idArt,
            String idGenre, String MV_path, String Song_path,
            String Img_path, String inputSID) {
        String sql = "UPDATE dbo.HE141223_HAILD_SONG \n"
                + "		  SET Name = ?, \n"
                + "		  Release = ?, \n"
                + "		  idAlbum = ?, \n"
                + "		  idArtist = ?, \n"
                + "		  idGenre = ?, \n"
                + "		  MV_path = ?, \n"
                + "		  Song_path = ?, \n"
                + "		  Img_path = ? WHERE SongID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, rel);
            ps.setString(3, idAlb);
            ps.setString(4, idArt);
            ps.setString(5, idGenre);
            ps.setString(6, MV_path);
            ps.setString(7, Song_path);
            ps.setString(8, Img_path);
            ps.setString(9, inputSID);
            rs = ps.executeQuery();
        } catch (Exception e) {
            status = " Error at editSongByID fuction" + e.getMessage();
        }
        return null;
    }

    public int getTotalSong() {
        String sql = "SELECT COUNT(*) FROM dbo.HE141223_HAILD_SONG";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = " Error at getTotalSong fuction" + e.getMessage();
        }
        return 0;
    }

    public List<Song> pagingSong(int index) {
        List<Song> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_SONG\n"
                + "ORDER BY SongID \n"
                + "OFFSET ? ROWS FETCH NEXT 10 ROW ONLY";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (index-1)*10);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Song(rs.getInt(1), 
                        rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5), 
                        rs.getInt(6), rs.getString(7), 
                        rs.getString(8), rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public String getMV_Path(String albID) {
        String sql = "SELECT MV_path FROM dbo.HE141223_HAILD_SONG WHERE idAlbum = '"+albID+"'";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            status = " Error at getTotalSong fuction" + e.getMessage();
        }
        return null;
    }

    public static void main(String[] args) {
        SongDAO sDAO = new SongDAO();
//        Song abc = sDAO.checkSongByID("1");
//        System.out.println(abc);
        String abc = "CHi2018";
        String hello = sDAO.getMV_Path(abc);
        System.out.println(hello);
        
        
        List<Song> l = sDAO.pagingSong(3);
        for (Song song : l) {
            System.out.println(song);
        }
    }
}
