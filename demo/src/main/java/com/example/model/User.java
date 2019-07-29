package com.example.model;

import java.util.Date;

/** 
 * <Description> <br> 
 *  
 * @author xue.hairui<br>
 * @version 1.0<br>
 * @CreateDate 2019/7/9 15:15 <br>
 * @since 1.0<br>
 */
public class User {
    
    private int userId;
    
    private String userName;
    
    private int credits;
    
    private String password;
    
    private Date lastVisitDate;
    
    private String lastIp;

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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }
}
