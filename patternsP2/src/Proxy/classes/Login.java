package Proxy.classes;

public class Login implements LoginAbstract{
    String user, pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public boolean login(String user, String pass) {
        if(this.user.equals(user) && this.pass.equals(pass)){
            return true;
        }else{
            return false;
        }
    }
}
