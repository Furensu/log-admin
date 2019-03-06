package aulainicial;

public interface Autenticacao {
    
    boolean realizarLogin(String user, int pass);
    
    void realizarLogout();
    
}