package model;

import java.util.List;

/**
 * Created by HAMMAX on 18.07.2015.
 */
public class User
{

    protected int id;
    protected String name;
    protected Integer pass;
    protected String login;


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Integer getPass() {
        return pass;
    }

    public String getLogin() {
        return login;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
