/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryuu
 */
public class UserDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public String status;

    public void deleteUser(String uid) {
        String sql = "DELETE FROM dbo.HE141223_HAILD_USER WHERE UID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, uid);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at deleteGenre fuction" + e.getMessage();
        }
    }

    public Account checkUserExistName(String name) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_USER WHERE  Name = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
            status = " Error at checkUserExistName fuction" + e.getMessage();
        }
        return null;
    }

    public Account checkUserExistMail(String mail) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_USER WHERE Mail = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, mail);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
            status = " Error at checkUserExistMail fuction" + e.getMessage();
        }
        return null;
    }

    public Account getUserByID(String uid) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_USER WHERE UID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
            status = " Error at getUserByID fuction" + e.getMessage();
        }
        return null;
    }

    public Account getUserByIDINT(int uid) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_USER WHERE UID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
            status = " Error at getUserByIDINT fuction" + e.getMessage();
        }
        return null;
    }

    public Account editAccountByID(String uName, int isAdmin, int isUser, String mail, String uid) {
        String sql = "UPDATE dbo.HE141223_HAILD_USER SET Name = '" + uName + "', isAdmin = " + isAdmin + ", isUser = " + isUser + "";
        if (mail.isEmpty()) {
            sql += "WHERE UID = " + uid + "";
        } else {
            sql += ", Mail = '" + mail + "' WHERE UID = " + uid + "";
        }
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            status = " Error at editAccountByID fuction" + e.getMessage();
        }
        return null;
    }

    public Account editAccountByPassword(String name, String pass, String mail, String path, int uid, String repass) {
        String sql = "UPDATE dbo.HE141223_HAILD_USER SET Name = '" + name + "', [Password] = '" + pass + "'";
        if (mail.isEmpty()) {
            sql += ", UImg_path = '" + path + "' WHERE UID = " + uid + " AND Password = '" + repass + "'";
        } else {
            sql += ", Mail = '" + mail + "', UImg_path = '" + path + "' WHERE UID = " + uid + " AND Password = '" + repass + "'";
        }

        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            status = " Error at editAccountByPassword fuction" + e.getMessage();
        }
        return null;
    }

    public String getMailByID(int uid) {
        String sql = "SELECT Mail FROM dbo.HE141223_HAILD_USER WHERE UID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            status = " Error at getMailByID fuction" + e.getMessage();
        }
        return null;
    }

    public String getPassByIDMail(int uid, String mail) {
        String sql = "SELECT Password FROM dbo.HE141223_HAILD_USER WHERE UID = ? AND Mail = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, uid);
            ps.setString(2, mail);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            status = " Error at getPassByIDMail fuction" + e.getMessage();
        }
        return null;
    }

    public int getTotalAccount() {
        String sql = "SELECT COUNT(*) FROM dbo.HE141223_HAILD_USER";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = " Error at getTotalAccount fuction" + e.getMessage();
        }
        return 0;
    }

    public List<Account> pagingAccount(int index) {
        List<Account> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_USER\n"
                + "ORDER BY UID\n"
                + "OFFSET ? ROWS FETCH NEXT 10 ROW ONLY";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 10);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
            status = " Error at pagingAccount fuction" + e.getMessage();
        }
        return list;
    }

    public static void main(String[] args) {
        UserDAO uDAO = new UserDAO();
        String ac = uDAO.getPassByIDMail(1, "pokemonlol123478kid@gmail.com");
        int a = uDAO.getTotalAccount();
        List<Account> acc = uDAO.pagingAccount(1);
        for (Account account : acc) {
            System.out.println(account);
        }
    }
}
