package aplicacao;
import java.util.Scanner;
import entidade.Aluno;
public class Principal {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int num=1;
        int i=0;
        float maior=0;
        float menor=0;
        String maiorA="";
        String menorA="";
        Aluno[] vetnota = new Aluno[3];
        do {
            System.out.println("Informe o nome do aluno ");
            String nome= new Scanner(System.in).nextLine();
            System.out.println("Informe a nota do aluno "+nome);
            float nota= ler.nextFloat();
            if(i==0) {
                maior=nota;
                menor=nota;
                maiorA=nome;
                menorA=nome;}
            if(maior<nota) {
                maior=nota;
                maiorA=nome;}
            if(menor>nota) {
                menor=nota;
                menorA=nome;}
            vetnota[i]= new Aluno(nome, nota);
            i++;
            System.out.println("Digite 0 se desejar sair"); 
            num=ler.nextInt();
        }while(num!=0);
        System.out.println("Foram lidos "+i+" alunos");
        System.out.printf("\nA maior nota informada foi do aluno %s que teve a media final %.1f ",
                maiorA, maior);
        System.out.printf("\nA menor nota informada foi do aluno %s que teve a media final %.1f ",
                menorA, menor);
        System.out.println("\nO nome dos alunos lidos foram:");
        int j=0;
        for(j=0;j<i;j++) {
            System.out.println("\n" + vetnota[j].getNome());
            System.out.print("com a nota " + vetnota[j].getNota());
            System.out.println("\n");
        }
    }
}