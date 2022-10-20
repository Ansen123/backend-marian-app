package com.example.xyzbackendnew.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty")
public class FacultyModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dName;
    private String desName;
    private String dob;
    private String education;
    private String address;
    private int mob;
    private String Joining;

    public FacultyModel(int id, String name, String dName, String desName, String dob, String education, String address, int mob, String joining) {
        this.id = id;
        this.name = name;
        this.dName = dName;
        this.desName = desName;
        this.dob = dob;
        this.education = education;
        this.address = address;
        this.mob = mob;
        Joining = joining;
    }

    public FacultyModel() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getdName() {
        return dName;
    }

    public String getDesName() {
        return desName;
    }

    public String getDob() {
        return dob;
    }

    public String getEducation() {
        return education;
    }

    public String getAddress() {
        return address;
    }

    public int getMob() {
        return mob;
    }

    public String getJoining() {
        return Joining;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void setDesName(String desName) {
        this.desName = desName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public void setJoining(String joining) {
        Joining = joining;
    }
}
