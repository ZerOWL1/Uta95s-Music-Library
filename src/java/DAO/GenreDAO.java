/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.Categories;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryuu
 */
public class GenreDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public String status;

    public void insertGenre(String gid, String name) {
        String sql = "INSERT INTO dbo.HE141223_HAILD_GENRE VALUES (?,?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, gid);
            ps.setString(2, name);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at insertGenre fuction" + e.getMessage();
        }
    }

    public Categories checkIDGenreE(String gid) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_GENRE WHERE idGenre = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, gid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Categories(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
            status = " Error at checkIDGenreE fuction" + e.getMessage();
        }
        return null;
    }

    public Categories checkNameGenreE(String gid) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_GENRE WHERE Name = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, gid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Categories(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
            status = " Error at checkNameGenreE fuction" + e.getMessage();
        }
        return null;
    }

    public Categories editGenreByID(String gName, String gIdInput) {
        String sql = "UPDATE dbo.HE141223_HAILD_GENRE SET Name = ? WHERE idGenre = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, gName);
            ps.setString(2, gIdInput);
            rs = ps.executeQuery();
        } catch (Exception e) {
            status = " Error at checkNameGenreE fuction" + e.getMessage();
        }
        return null;
    }

    public int getTotalGenre() {
        String sql = "SELECT COUNT(*) FROM dbo.HE141223_HAILD_Genre";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = " Error at getTotalGenre fuction" + e.getMessage();
        }
        return 0;
    }

    public List<Categories> pagingGenre(int index) {
        List<Categories> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_GENRE\n"
                + "ORDER BY idGenre \n"
                + "OFFSET ? ROWS FETCH NEXT 10 ROW ONLY";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 10);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Categories(
                        rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
            status = " Error at pagingGenre fuction" + e.getMessage();
        }
        return list;
    }

    public static void main(String[] args) {
        GenreDAO genDAO = new GenreDAO();
//        String abc = "J-pop";
//        Categories ab = genDAO.checkNameGenreE(abc);
        List<Categories> abc = genDAO.pagingGenre(2);
        for (Categories categories : abc) {
            System.out.println(categories);
        }
    }
}
