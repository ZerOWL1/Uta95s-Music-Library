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
public class Account {
    private int uid;
    private String name;
    private String pass;
    private int isAdmin;
    private int isUser;
    private String email;
    private String UImg_path;

    public Account() {
    }

    public Account(int uid, String name, String pass, int isAdmin, int isUser, String email, String UImg_path) {
        this.uid = uid;
        this.name = name;
        this.pass = pass;
        this.isAdmin = isAdmin;
        this.isUser = isUser;
        this.email = email;
        this.UImg_path = UImg_path;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsUser() {
        return isUser;
    }

    public void setIsUser(int isUser) {
        this.isUser = isUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUImg_path() {
        return UImg_path;
    }

    public void setUImg_path(String UImg_path) {
        this.UImg_path = UImg_path;
    }

    @Override
    public String toString() {
        return "Account{" + "uid=" + uid + ", name=" + name + ", pass=" + pass + ", isAdmin=" + isAdmin + ", isUser=" + isUser + ", email=" + email + ", UImg_path=" + UImg_path + '}';
    }

    
}
