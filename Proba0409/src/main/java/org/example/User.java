package org.example;

import javax.persistence.*;

@Entity
public class User {
    private String vnev;

    @Basic
    public String getVnev() {
        return vnev;
    }

    public void setVnev(String vnev) {
        this.vnev = vnev;
    }

    private String knev;

    @Basic
    public String getKnev() {
        return knev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }

    private String username;

    @Basic
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String email;

    @Basic
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    private String password;

    @Basic
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private GenderType gender;

    @Basic
    @Enumerated(EnumType.STRING)
    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    private SzemSzin szem;

    @Basic
    @Enumerated(EnumType.STRING)
    public SzemSzin getSzem() {
        return szem;
    }

    public void setSzem(SzemSzin szem) {
        this.szem = szem;
    }

    private Hajszin hajszin;

    @Basic
    @Enumerated(EnumType.STRING)
    public Hajszin getHajszin() {
        return hajszin;
    }

    public void setHajszin(Hajszin hajszin) {
        this.hajszin = hajszin;
    }

    private String datum;

    @Basic
    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    private int id;

    @GeneratedValue
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int nyereseg;

    @Basic
    public int getNyereseg() {
        return nyereseg;
    }

    public void setNyereseg(int nyereseg) {
        this.nyereseg = nyereseg;
    }

    private int veszteseg;

    @Basic
    public int getVeszteseg() {
        return veszteseg;
    }

    public void setVeszteseg(int veszteseg) {
        this.veszteseg = veszteseg;
    }

    private String CreditCardNumber;

    @Basic
    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }
}
