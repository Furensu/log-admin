package aulainicial;

public class Administrador implements Autenticacao {
    String user;
    int pass;
    String nome;
    boolean logado;
    
    public Administrador(String usr,int pswd,String name) {
    	this.user = usr;
    	this.pass = pswd;
    	this.nome = name;
    }
    @Override
    public boolean realizarLogin(String user, int pass) {
        if(pass == this.pass){
            this.logado = true;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void realizarLogout() {
        this.logado = false;                
    }
   
    public void getLoggedName() {
    	if (logado) {
    		System.out.println(this.nome);
		}else{
			System.out.println("Voce nao pussui acesso a essa informação");
		}
    }
}
