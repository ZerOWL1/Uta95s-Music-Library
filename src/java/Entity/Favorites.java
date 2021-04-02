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
public class Favorites {
    private int uid;
    private String sid;

    public Favorites() {
    }

    public Favorites(int uid, String sid) {
        this.uid = uid;
        this.sid = sid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Favorites{" + "uid=" + uid + ", sid=" + sid + '}';
    }

    
}
