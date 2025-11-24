public class Aluno {
    private String nome = "Jhon";
    private String email;
    private int matricula;

    //CRIANDO OS SETTERS
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }

    //CRIANDO OS GETTERS
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public int getMatricula() {
        return matricula;
    }
}

