package com.example.xyzbackendnew.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int rollnumber;
    private int adnumber;
    private String cname;
    private String dname;
    private String blood;
    private String dob;
    private String pname;
    private String email;
    private String gname;
    private String gaddress;

    public StudentModel(int id, String name, int rollnumber, int adnumber, String cname, String dname, String blood, String dob, String pname, String email, String gname, String gaddress) {
        this.id = id;
        this.name = name;
        this.rollnumber = rollnumber;
        this.adnumber = adnumber;
        this.cname = cname;
        this.dname = dname;
        this.blood = blood;
        this.dob = dob;
        this.pname = pname;
        this.email = email;
        this.gname = gname;
        this.gaddress = gaddress;
    }

    public StudentModel() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public int getAdnumber() {
        return adnumber;
    }

    public String getCname() {
        return cname;
    }

    public String getDname() {
        return dname;
    }

    public String getBlood() {
        return blood;
    }

    public String getDob() {
        return dob;
    }

    public String getPname() {
        return pname;
    }

    public String getEmail() {
        return email;
    }

    public String getGname() {
        return gname;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public void setAdnumber(int adnumber) {
        this.adnumber = adnumber;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress;
    }
}