/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.Favorites;
import Entity.SongFavorites;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryuu
 */
public class FavoritesDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public String status;

    public void addFavorite(Favorites f) {
        String sql = "INSERT INTO dbo.HE141223_HAILD_FAVORITES VALUES (? , ?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, f.getUid());
            ps.setString(2, f.getSid());
            ps.executeQuery();
        } catch (Exception e) {
            status = " Error at addFavorite fuction" + e.getMessage();
        }
    }

    public List<SongFavorites> listFa(int uid) {
        List<SongFavorites> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_FAVORITES f JOIN dbo.HE141223_HAILD_SONG s\n"
                + "ON f.SongID = s.SongID WHERE uid = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SongFavorites(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (Exception e) {
            status = " Error at listFa fuction" + e.getMessage();
        }
        return list;
    }

    public void deleteFavor(int uid, String favorID) {
        String sql = "DELETE dbo.HE141223_HAILD_FAVORITES WHERE [UID] = ? AND SongID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            ps.setString(2, favorID);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at deleteFavor fuction" + e.getMessage();
        }
    }

    public int getTotalFavor(int uid) {
        String sql = "SELECT COUNT(*) FROM dbo.HE141223_HAILD_FAVORITES WHERE [UID] = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = " Error at getTotalFavor fuction" + e.getMessage();
        }
        return 0;
    }

    public List<SongFavorites> listPagingFa(int uid, int index) {
        List<SongFavorites> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_FAVORITES f JOIN dbo.HE141223_HAILD_SONG s\n"
                + "ON f.SongID = s.SongID WHERE uid = ? ORDER BY f.SongID\n"
                + "OFFSET ? ROWS FETCH NEXT 10 ROW ONLY";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            ps.setInt(2, (index - 1) * 10);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SongFavorites(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (Exception e) {
            status = " Error at listPagingFa fuction" + e.getMessage();
        }
        return list;
    }

    public static void main(String[] args) {
        FavoritesDAO faDAO = new FavoritesDAO();

        int a = faDAO.getTotalFavor(1);
        List<SongFavorites> sF = faDAO.listPagingFa(1, 2);
        for (SongFavorites songFavorites : sF) {
            System.out.println(songFavorites);
        }

//        Favorites f = new Favorites();
//        f.setSid("8");
//        f.setUid("1");
//        
//        faDAO.addFavorite(f);
//        List<SongFavorites> alb = faDAO.listFa(1);
//        for (SongFavorites songFavorites : alb) {
//            System.out.println(songFavorites);
//        }
    }
}
