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
public class Artist {
    private String idArtist;
    private String nameArtist;
    private String band;
    private String spellName;

    public Artist() {
    }

    public Artist(String idArtist, String nameArtist, String band, String spellName) {
        this.idArtist = idArtist;
        this.nameArtist = nameArtist;
        this.band = band;
        this.spellName = spellName;
    }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    @Override
    public String toString() {
        return "Artist{" + "idArtist=" + idArtist + ", nameArtist=" + nameArtist + ", band=" + band + ", spellName=" + spellName + '}';
    }
    
    
    
}
