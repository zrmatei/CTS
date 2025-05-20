package Proxy.main;

import Proxy.classes.Login;
import Proxy.classes.ProxyLogin;

// Folosit atunci cand vreau sa restrictionez/controlez accesul prin anumite lucruri
public class Main {
    public static void main(String[] args) {
        Login login = new Login("admin", "admin");
        System.out.println(login.login("admin", "admin"));
        System.out.println();

        ProxyLogin proxyLogin = new ProxyLogin(login);
        proxyLogin.login("admin", "22");
        proxyLogin.login("admin", "22");
        proxyLogin.login("admin", "22");
        proxyLogin.login("admin", "22");

    }
}
