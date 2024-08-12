package Sistema_Cadastro;

public class teste {

    public static void main(String[] args) {

        SistemaCadastroAlunos sistema= new SistemaCadastroAlunos(10);

        Aluno a1= new Aluno("Joao","Ruazinha A","bsifsa01");
        Aluno a2= new Aluno("Lucas","Ruazinha B","bsifsa02");
        Aluno a3= new Aluno("Felipe","Ruazinha C","bsifsa01");

        sistema.cadastrarAluno(a1);
        sistema.cadastrarAluno(a2);
        sistema.cadastrarAluno(a3);


    }
}
