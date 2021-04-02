/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBContext;
import Entity.Artist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryuu
 */
public class ArtistDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public String status;

    public void deleteArtist(String artID) {
        String sql = "DELETE dbo.HE141223_HAILD_ARTIST WHERE idArtist = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, artID);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at deleteGenre fuction" + e.getMessage();
        }
    }

    public Artist cheArtistByID(String artID) {
        String sql = "SELECT * FROM dbo.HE141223_HAILD_ARTIST WHERE idArtist = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, artID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Artist(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }
        } catch (Exception e) {
            status = " Error at cheArtistByID fuction" + e.getMessage();
        }
        return null;
    }

    public void insertArtist(String artID, String artName, String artBand, String artSName) {
        String sql = "INSERT INTO dbo.HE141223_HAILD_ARTIST VALUES (?,?,?,?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, artID);
            ps.setString(2, artName);
            ps.setString(3, artBand);
            ps.setString(4, artSName);
            ps.executeUpdate();
        } catch (Exception e) {
            status = " Error at insertArtist fuction" + e.getMessage();
        }
    }

    public Artist editArtistByID(String name, String band, String sName, String inputArtID) {
        String sql = "UPDATE dbo.HE141223_HAILD_ARTIST SET Name = ?, Band = ?, SpellName = ? WHERE idArtist = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, band);
            ps.setString(3, sName);
            ps.setString(4, inputArtID);
            rs = ps.executeQuery();
        } catch (Exception e) {
            status = " Error at editAlbumByID fuction" + e.getMessage();
        }
        return null;
    }

    public int getTotalArtist() {
        String sql = "SELECT COUNT(*) FROM dbo.HE141223_HAILD_ARTIST";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            status = " Error at getTotalArtist fuction" + e.getMessage();
        }
        return 0;
    }

    public List<Artist> pagingArtist(int index) {
        List<Artist> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.HE141223_HAILD_ARTIST\n"
                + "ORDER BY Name \n"
                + "OFFSET ? ROWS FETCH NEXT 10 ROW ONLY";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 10);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Artist(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
            status = " Error at pagingArtist fuction" + e.getMessage();
        }
        return list;
    }

    public static void main(String[] args) {
        ArtistDAO artDAO = new ArtistDAO();
        List<Artist> art = artDAO.pagingArtist(2);
        for (Artist artist : art) {
            System.out.println(artist);
        }
    }
}
