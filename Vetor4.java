import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Vetor4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite 5 números:");
        
        for(int i = 0; i < 5; i++){
            numeros.add(input.nextInt());
            if (numeros.get(i) % 2 != 0) {
                impares.add(numeros.get(i));
            }else{
                pares.add(numeros.get(i));
            }
        }

        System.out.println("\nOs números pares são:");
        int tamPares = pares.size();
        for(int i = 0; i < tamPares; i++){
            System.out.println(pares.get(i));
        }

        System.out.println("\nOs números impares são:");
        int tamImpares = impares.size();
        for(int i = 0; i < tamImpares; i++){
            System.out.println(impares.get(i));
        }


    }
}
