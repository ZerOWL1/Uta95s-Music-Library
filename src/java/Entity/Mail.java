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
public class Mail {

    private String img;
    private String name;
    private String mail;
    private String pass;
    private String repass;
    private String code;

    public Mail() {
    }

    public Mail(String img, String name, String mail, String pass, String repass, String code) {
        this.img = img;
        this.name = name;
        this.mail = mail;
        this.pass = pass;
        this.repass = repass;
        this.code = code;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Mail{" + "img=" + img + ", name=" + name + ", mail=" + mail + ", pass=" + pass + ", repass=" + repass + ", code=" + code + '}';
    }
    
}
