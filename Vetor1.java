import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Vetor1{
    public static void main(String[] args){
        List<String> produtos = new ArrayList<>();
        List<Integer> estoque = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 10 produtos novos para estoque:");

        for(int i = 0; i < 10; i++){
            System.out.print(i+1 + "º Produto: ");
            produtos.add(input.nextLine());
            System.out.print("Número de Estoque: ");
            estoque.add(input.nextInt());
            input.nextLine();
            System.out.println("");
        }
        //Limpar o terminal/console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Produtos com estoque maior que 10:");

        for(int i = 0; i < 10; i++){
            if(estoque.get(i) >= 10){
                // Lista.get() retorna o valor naquele espaço
                System.out.println("O estoque de " + produtos.get(i) + " é : " + estoque.get(i));
            }
        }
        input.close();
    }
}