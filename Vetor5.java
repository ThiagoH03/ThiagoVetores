import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Vetor5 {
    public static void main(String[] args){
        List<Integer> codigo = new ArrayList<>();
        List<String> produto = new ArrayList<>();
        List<Double> preco = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Cadastre 5 produtos novos: \n");
        for(int i = 0; i < 5; i++){
            System.out.println(i+1 + "º Produto");
            System.out.print("Código do Produto: ");
            codigo.add(input.nextInt());
            input.nextLine();

            System.out.print("Nome do Produto: ");
            produto.add(input.nextLine());

            System.out.print("Preço do Produto: ");
            preco.add(input.nextDouble());
            input.nextLine();
            System.out.println("");            
        }

        //Limpar o terminal/console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Produtos Cadastrados: \n");
        
        for(int i = 0; i < 5; i++){
            System.out.println(codigo.get(i) + " - " + produto.get(i) + " - R$" + preco.get(i));
            if(preco.get(i) > 120){            
                preco.set(i, preco.get(i) + 20 );
            }
        }

        System.out.println("\nApós o reajuste de preços, estes são os novos valores: ");
        for(int i = 0; i < 5; i++){
                System.out.println(codigo.get(i) + " - " + produto.get(i) + " - R$" + preco.get(i));
            
        }

        input.close();
    }

}    

