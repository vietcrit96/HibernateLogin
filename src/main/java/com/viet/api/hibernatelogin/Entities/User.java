package com.viet.api.hibernatelogin.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USERMAIN")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private int userId;
    @Column(name = "USER_USERNAME")
    private String userName;
    @Column(name = "USER_PASSWORD")
    private String userPass;
    @Column(name = "USER_EMAIL")
    private String userEmail;
    @Column(name = "USER_DISPLAYNAME")
    private String userDisplayName;
    @Column(name = "USER_BIRTHDAY")
    private String userBirthday;
    @Column(name = "USER_GENDER")
    private boolean userGender;
    @Column(name = "USER_ADDRESS")
    private String userAddress;
    @Column(name = "USER_PHONENUMBER")
    private String userPhoneNumber;
    @Column(name = "USER_ROLE")
    private int userRole;

    public User() { }

    public User(String userName, String userPass, String userEmail, String userDisplayName, String userBirthday,
                boolean userGender, String userAddress, String userPhoneNumber, int userRole) {
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
        this.userDisplayName = userDisplayName;
        this.userBirthday = userBirthday;
        this.userGender = userGender;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;
        this.userRole = userRole;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public boolean isUserGender() {
        return userGender;
    }

    public void setUserGender(boolean userGender) {
        this.userGender = userGender;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }
}