package Sistema_Cadastro;

public class Aluno {

    private String nome;
    private String endereco;
    private String matricula;

    public Aluno(String nome, String endereco, String matricula) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setMatricula(matricula);
    }
    public void imprimirAluno(){
        System.out.println("Aluno: "+this.getMatricula());
        System.out.println("Endereço: "+this.getEndereco());
        System.out.println("Matricula: "+this.getMatricula());



    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
