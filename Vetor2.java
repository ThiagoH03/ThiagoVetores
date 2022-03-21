import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Vetor2 {
    public static void main(String[] args){
        List<String> funcionarios = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a quantidade de funcionários?");
        int quantidade = input.nextInt();
        
        System.out.println("");
        //Necessário para "pular uma linha" do nextInt, senão não conseguimos receber valor do nextLine
        input.nextLine();

        System.out.println("Digite os nomes dos funcionários:");
        for (int i = 1; i < quantidade+1; i++){
            System.out.print(i + "º Funcionário: ");
            funcionarios.add(input.nextLine());
        }
        
        //Limpar o terminal/console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Para saber o tamanho da lista
        int tamLista = funcionarios.size();

        System.out.println("Nome dos empregados:");
        for(int i = 0; i < tamLista; i++){
            System.out.println("Funcionário(a): " + funcionarios.get(i) + ".");
        }
    }
}
