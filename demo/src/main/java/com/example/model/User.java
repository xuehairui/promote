package com.example.model;

import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/** 
 * <Description> <br> 
 *  
 * @author xue.hairui<br>
 * @version 1.0<br>
 * @CreateDate 2019/7/9 15:15 <br>
 * @since 1.0<br>
 */
@Entity
@Table(name = "user")
public class User {
    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    @Id
    @GeneratedValue
    @Field("user_id")
    private int userId;

    @Field("user_name")
    private String userName;

    private int credits;
    
    private String password;

    @Field("last_visit_date")
    private Date lastVisitDate;

    @Field("last_ip")
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
