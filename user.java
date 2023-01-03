package gawedotcom;

public class user {
    private String name, username, password;

    public user(String name, String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setusername(String username){
        this.username = username;
    }
    
    public void setpassword(String password){
        this.password = password;
    }
    
    public String getname(){
        return name;
    }

    public String getusername(){
        return username;
    }

    public String getpassword(){
        return password;
    }
}
