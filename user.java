package gawedotcom;

public class user {
    private String name, username, password, passwordTwo, type;

    user(String name, String username, String password, String passwordTwo){
        this.name = name;
        this.username = username;
        this.password = password;
        this.passwordTwo = passwordTwo;
    }

    user(String username, String password, String type){
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public boolean passValidation(String password, String passwordTwo){
        if(password.equals(passwordTwo)){
            return true;
        }else{
            return false;
        }
    }
}