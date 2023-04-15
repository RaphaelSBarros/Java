package entidade;
public class Aluno {
    private String nome;
    private float nota;
    public Aluno(String nm, float nt) {
        this.nome = nm;
        this.nota = nt; 
    }
    public String getNome() {
        return nome;
    }
    public float getNota() {
        return nota;
    }
    public void setNome(String nm) {
        this.nome = nm;
    }
    public void setNota(float nt) {
        this.nota=nt;
    }
}