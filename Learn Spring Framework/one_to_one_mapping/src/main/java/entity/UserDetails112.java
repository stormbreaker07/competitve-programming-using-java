package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails112 {

    @Id
    @Column
    private int userId;
    @Column
    private String full_name;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", full_name='" + full_name + '\'' +
                '}';
    }
}
