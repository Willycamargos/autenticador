package autenticador.model;

public class Usuario {

    private int iD;
    private String name;
    private String senha;
    private String email;

    public Usuario(String name, String senha, String email) {
        //this.iD = iD;
        this.name = name;
        this.senha = senha;
        this.email = email;
    }

    public Usuario() {

    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
