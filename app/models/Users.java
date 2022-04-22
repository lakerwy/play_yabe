package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Users extends Model {

    public String email;
    public String password;
    public String fullname;
    public boolean isAdmin;

    public Users(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }

    public static Users connect(String email, String password) {
        return find("byEmailAndPassword", email, password).first();
    }

}