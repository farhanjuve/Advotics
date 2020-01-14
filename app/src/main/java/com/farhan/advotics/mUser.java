package com.farhan.advotics;

import android.text.TextUtils;
import android.util.Patterns;

import java.io.Serializable;


public class mUser implements Serializable {

    public mUser(String email, String gender, String phone) {
        this.email = email;
        this.gender = gender;
        this.phone = phone;
    }

    private String email;
    private String gender;
    private String phone;


    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getGender()
    {
        return this.gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
