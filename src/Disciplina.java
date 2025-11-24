import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String titulo;
    private int capacidadeMaxima;
    List<Aluno> inscritos = new ArrayList<Aluno>();

//contrutor que recebe codigo titulo e capacidade maxima
Disciplina(String codigo, String titulo,int capacidadeMaxima){
    this.codigo = codigo;
    this.titulo = titulo;
    this.capacidadeMaxima = capacidadeMaxima;
}

//METODOS SETTERS
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setCapacidadeMaxima(String capacidadeMaxima){this.capacidadeMaxima = capacidadeMaxima;}

//METODOS GETTERS
    public String getCodigo(){return codigo;}
    public String getTitulo(){return titulo;}
    public int getCapacidadeMaxima(){return capacidadeMaxima;}

//verificar se a disciplina atingiu sua capacidade máxima;
boolean isLotada(){
    return true;
}


}//FINAL DA CLASS DISCIPLINA







