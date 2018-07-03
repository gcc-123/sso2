package com.bdqn.sso2.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Entity
@Table(name = "tb_local_auth", schema = "o2o", catalog = "")
public class LocalAuth {
    private int localAuthId;
    private int userId;
    private String username;
    private String password;
    private Timestamp createTime;
    private Timestamp lastEditTime;

    @Id
    @Column(name = "local_auth_id")
    public int getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(int localAuthId) {
        this.localAuthId = localAuthId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "last_edit_time")
    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalAuth that = (LocalAuth) o;
        return localAuthId == that.localAuthId &&
                userId == that.userId &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(lastEditTime, that.lastEditTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(localAuthId, userId, username, password, createTime, lastEditTime);
    }
}
