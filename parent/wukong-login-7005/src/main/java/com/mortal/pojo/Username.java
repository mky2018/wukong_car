package com.mortal.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/*@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = false)*/
public class Username {

    private int uid;
    private String name;
    private String password;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Username() {
    }

    public Username(int uid, String name, String password) {
        this.uid = uid;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
