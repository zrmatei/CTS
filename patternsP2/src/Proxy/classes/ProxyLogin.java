package Proxy.classes;

public class ProxyLogin implements LoginAbstract{
    LoginAbstract loginAbstract;
    int incercariEsuate = 0;

    public ProxyLogin(LoginAbstract login) {
        this.loginAbstract = login;
    }

    @Override
    public boolean login(String user, String pass) {
        if(incercariEsuate > 2){
            System.out.println("Cont blocat");
            return false;
        }
        else{
            if(loginAbstract.login(user, pass)) {
                System.out.println("Autentificare reusita");
                return true;
            }else{
                incercariEsuate++;
                System.out.println("Mai ai " + (3-incercariEsuate) + " incercari");
                return false;
            }
        }
    }
}
