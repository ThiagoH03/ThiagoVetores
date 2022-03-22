import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Vetor6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int coluna = 2;
        List<List<Integer>> sala = new ArrayList<List<Integer>>(coluna);
        
        int soma1 = 0;
        int soma2 = 0;

        for(int i = 0; i < 2; i++){
            sala.add(new ArrayList<Integer>());
            System.out.println(i+1 + "º sala:");
            for(int p = 0; p < 6; p++){
                System.out.println(p+1 + " Aluno:");
                sala.get(i).add(input.nextInt());
                if(i == 0){
                    soma1 += sala.get(i).get(p);
                }else{
                    soma2 += sala.get(i).get(p);
                }
            }
            System.out.println("");
        }
        System.out.println(sala.get(0));
        System.out.println("A soma de idades da 1ºa sala é: " + soma1);
        
        System.out.println("");
        
        System.out.println(sala.get(1));
        System.out.println("A soma de idades da 2ºa sala é: " + soma2);

        input.close();
    }
}
