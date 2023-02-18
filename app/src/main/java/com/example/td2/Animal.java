package com.example.td2;

import java.io.Serializable;

public class Animal implements Serializable {
    private String nom, race, pays;
    private int image;
    public Animal(){
    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public Animal(String nom, String race, String pays, int image) {
        this.nom = nom;
        this.race = race;
        this.pays = pays;
        this.image = image;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
}
