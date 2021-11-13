package com.company;

import java.io.Serializable;

public class Person implements Serializable {

    private String id;
    private String navn;
    private String efternavn;
    private int tal1;
    private int tal2;
    private int tal3;
    private int tal4;

    public Person(){
    }

    public Person(String id, String navn, String efternavn, int tal1, int tal2, int tal3, int tal4) {
        this.id = id;
        this.navn = navn;
        this.efternavn = efternavn;
        this.tal1 = tal1;
        this.tal2 = tal2;
        this.tal3 = tal3;
        this.tal4 = tal4;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", navn='" + navn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                ", tal1=" + tal1 +
                ", tal2=" + tal2 +
                ", tal3=" + tal3 +
                ", tal4=" + tal4 +
                '}';
    }

    //Getters og setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getTal1() {
        return tal1;
    }

    public void setTal1(int tal1) {
        this.tal1 = tal1;
    }

    public int getTal2() {
        return tal2;
    }

    public void setTal2(int tal2) {
        this.tal2 = tal2;
    }

    public int getTal3() {
        return tal3;
    }

    public void setTal3(int tal3) {
        this.tal3 = tal3;
    }

    public int getTal4() {
        return tal4;
    }

    public void setTal4(int tal4) {
        this.tal4 = tal4;
    }
}
