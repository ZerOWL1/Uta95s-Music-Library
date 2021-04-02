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
public class Categories {
    private int idGenre;
    private String name;

    public Categories() {
    }

    public Categories(int idGenre, String name) {
        this.idGenre = idGenre;
        this.name = name;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Categories{" + "idGenre=" + idGenre + ", name=" + name + '}';
    }
    
    
    
}
