package com.hfutlzy.entity.user;
/**
 * ClassName:    UserEntity
 * Description:  [一句话描述该类的功能]
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
public class UserEntity {

    private String userid;
    private String username;
    private String password;
    private String authority;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
