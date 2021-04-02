/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.Album;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryuu
 */
public class AlbumDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public String status;

    public void deleteAlbum(String albID) {
        String sql = "DELETE dbo.HE141223_HAILD_ALBUM WHERE idAlbum = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, albID);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at deleteGenre fuction" + e.getMessage();
        }
    }

    public Album checkAlbumByID(String albID) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_ALBUM WHERE idAlbum = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, albID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Album(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {
            status = " Error at checkAlbumByID fuction" + e.getMessage();
        }
        return null;
    }

    public void insertAlbum(String albID, String artID, String name, String year, String path, String idGen) {
        String sql = "INSERT dbo.HE141223_HAILD_ALBUM VALUES  ( ?, ?, ?, ?, ?, GETDATE(), ?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, albID);
            ps.setString(2, artID);
            ps.setString(3, name);
            ps.setString(4, year);
            ps.setString(5, path);
            ps.setString(6, idGen);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at insertAlbum fuction" + e.getMessage();
        }
    }

    public Album editAlbumByID(String idArtist, String name, String year, String AImg_path,
            String idGenre, String inputAlbID) {
        String sql = "UPDATE dbo.HE141223_HAILD_ALBUM \n"
                + "SET idArtist = ?, Name = ?, [Year] = ?, AImg_path = ?, idGenre = ? WHERE idAlbum = ?   ";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, idArtist);
            ps.setString(2, name);
            ps.setString(3, year);
            ps.setString(4, AImg_path);
            ps.setString(5, idGenre);
            ps.setString(6, inputAlbID);
            rs = ps.executeQuery();
        } catch (Exception e) {
            status = " Error at editAlbumByID fuction" + e.getMessage();
        }
        return null;
    }

    public List<Album> getAlbumByIDCate(int cateID, int index, int size) {
        List<Album> list = new ArrayList<>();
        String query;
        if (cateID == -1) {
            query = "WITH x AS (SELECT ROW_NUMBER() OVER (ORDER BY DATE_UPDATE DESC, idAlbum) AS r, * FROM dbo.HE141223_HAILD_ALBUM)\n"
                    + "SELECT * FROM x WHERE r BETWEEN (? * ? - (? - 1)) AND (? * ?)";
        } else {
            query = "WITH x AS (SELECT ROW_NUMBER() OVER (ORDER BY DATE_UPDATE DESC, idAlbum) AS r , * FROM dbo.HE141223_HAILD_ALBUM WHERE idGenre = '" + cateID + "') \n"
                    + "SELECT * FROM x WHERE r BETWEEN (? * ? - (? - 1)) AND (? * ?)";
        }
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, index);
            ps.setInt(2, size);
            ps.setInt(3, size);
            ps.setInt(4, index);
            ps.setInt(5, size);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Album(
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int getNumberAlbum(int cateID) {
        String sql = "SELECT COUNT(*) FROM dbo.HE141223_HAILD_ALBUM";
        if (cateID != -1) {
            sql = "SELECT COUNT(*) FROM dbo.HE141223_HAILD_ALBUM WHERE idGenre = '" + cateID + "'";
        }
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = " Error in getNumberAlbum functions " + e.getMessage();
        }
        return 0;
    }

    public int getTotalAlbum() {
        String sql = "SELECT COUNT(*) FROM dbo.HE141223_HAILD_ALBUM";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = " Error at getTotalAlbum fuction" + e.getMessage();
        }
        return 0;
    }

    public List<Album> pagingAlbum(int index) {
        List<Album> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_ALBUM\n"
                + "ORDER BY DATE_UPDATE DESC, Name\n"
                + "OFFSET ? ROWS FETCH NEXT 10 ROW ONLY";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 10);
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
            status = " Error at pagingAlbum fuction" + e.getMessage();
        }
        return list;
    }

    public static void main(String[] args) {
        AlbumDAO albDAO = new AlbumDAO();
        List<Album> alb = albDAO.pagingAlbum(1);
        for (Album album : alb) {
            System.out.println(album);
        }

    }
}
