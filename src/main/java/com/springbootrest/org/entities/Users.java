package com.springbootrest.org.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.apache.commons.codec.digest.DigestUtils;

@Entity
public class Users {

    @Id
    @GeneratedValue
    private Long id;
    private String customId;
    private String fname;
    private String lname;
    private String password;

    public Users() {
    }

    public Users(String fname, String lname, String password) {
        this.fname = fname;
        this.lname = lname;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(password.length()>16){
            this.password=password;
        }else {
            this.password =DigestUtils.sha1Hex( password);
        }

    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId.toUpperCase().trim();
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
