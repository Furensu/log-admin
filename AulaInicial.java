package aulainicial;

public class AulaInicial {

    public static void main(String[] args) {
       
        Administrador humbertoDoisberto = new Administrador("humb",12345,"Humberto Doisberto");
        humbertoDoisberto.realizarLogin("humb",12345);
        humbertoDoisberto.getLoggedName();
        humbertoDoisberto.realizarLogin("humb",12345);
        humbertoDoisberto.getLoggedName();
    }
    
}