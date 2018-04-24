package com.example.nfame.realm_example.Model;

import java.time.LocalDate;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

public class Persona extends RealmObject {


    @PrimaryKey private String dni;
    @Index private String nom;
    @Index private String cognom;
    private Date dataNaix;
    private String genre;
    private String tel;
    private String email;

    public Persona(String dni, String nom, String cognom, Date dataNaix, String genre, String tel, String email) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.dataNaix = dataNaix;
        this.genre = genre;
        this.tel = tel;
        this.email = email;
    }

    public Persona(String nom, String cognom, String dni) {
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
    }

    public Persona(){
        this.dni = null;
        this.nom = null;
        this.cognom = null;
        this.dataNaix = null;
        this.genre = null;
        this.tel = null;
        this.email = null;
    }



    public Date getDataNaix() {
        return dataNaix;
    }

    public void setDataNaix(Date dataNaix) {
        this.dataNaix = dataNaix;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Persona: " + '\n' +
                            "Nom: " + getNom() + '\n' +
                            "Cognom: " + getCognom() + '\n' +
                            "Dni: " + getDni() + '\n' +
                            "Telefon: " + getTel() + '\n' +
                            "Email: " + getEmail() + '\n' +
                            "------------------------------" + '\n';
    }
}
