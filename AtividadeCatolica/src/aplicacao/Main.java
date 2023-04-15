package aplicacao;
import java.util.Scanner;
import entidade.Funcionario;
public class Main {
    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        Funcionario[] funcionario = new Funcionario[100];
        int i=0;
        int num=0;
        do {
            System.out.println("Informe o nome do funcionario ");
            String nomeFunc = new Scanner(System.in).nextLine();
            System.out.println("Informe o salario do funcionario "+nomeFunc);
            float salFunc = recebe.nextFloat();
            funcionario[i]= new Funcionario(nomeFunc, salFunc);
            i++;
            System.out.println("Digite -1 para sair ou 0 para continuar");
            num=recebe.nextInt();
        }while(num!=-1);
        int j;
        System.out.println("Os funcionarios lidos com seus salarios foram");
        for(j=0;j<i;j++) {
            System.out.printf("\n %s - %.2f ", funcionario[j].getNome(), funcionario[j].getSalario());
        }
        System.out.println("\nInforme o valor do reajuste ");
        float ajuste = recebe.nextFloat();
        float novosal;
        for(j=0;j<i;j++) {
            novosal = funcionario[j].getSalario();
            novosal = novosal+(novosal*(ajuste/100));
            funcionario[j].setSalario(novosal);
        }   
        System.out.println("Os funcionarios com seus novos salario ");
            for(j=0;j<i;j++) {
                System.out.printf("\n %s - %.2f ", funcionario[j].getNome(), funcionario[j].getSalario());
            }
        }
}