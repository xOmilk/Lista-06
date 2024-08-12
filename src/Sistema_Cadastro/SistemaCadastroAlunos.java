package Sistema_Cadastro;

public class SistemaCadastroAlunos {
    private Aluno alunos[];
    private int iAtual;

    public SistemaCadastroAlunos(int capacidade){
        this.alunos=new Aluno[capacidade];
        this.setiAtual(0);
    }

    public void cadastrarAluno(Aluno aluno){
        try {
            for(int i=0;i<getiAtual();i++){
                if(alunos[i].getMatricula().equals(aluno.getMatricula())){
                    throw new MatriculaDuplicadaException("Matricula "+aluno.getMatricula()+" ja existe!");


                }
            }

            if(getiAtual()<alunos.length){
                alunos[getiAtual()]=aluno;
                setiAtual(getiAtual()+1);
                System.out.println("Aluno "+aluno.getNome()+" cadastrado com sucesso");
            }
            else{
                System.out.println("Não foi possivel cadastrar o aluno, capacidade maxima atingida");
            }




        }
        catch (MatriculaDuplicadaException e){
            System.out.println("Erro ao cadastrar aluno "+aluno.getNome()+", "+e.getMessage());
        }



    }



    public int getiAtual() {
        return iAtual;
    }

    public void setiAtual(int iAtual) {
        this.iAtual = iAtual;
    }
}
