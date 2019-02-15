package cn.spicis.adoption.VO;

import cn.spicis.adoption.utils.MD5Util;

public class VerifyVO {
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return MD5Util.MD5(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
