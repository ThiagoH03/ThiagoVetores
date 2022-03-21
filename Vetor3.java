import java.util.List;
import java.util.ArrayList;

public class Vetor3 {
    public static void main(String[] args){
    
        List<String> meses = new ArrayList<>();
        // Lista.add adiciona valores no vetor.
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");

        System.out.println("Meses do ano:");
        // Pular uma linha no terminal.
        System.out.println("\n");

        System.out.println("2º Semestre");
        
        for(int i = 0; i < 6; i++){
            System.out.print("[" + meses.get(i+6)+ "]");
        }
        System.out.println("\n");

        System.out.println("1º Semestre");
        for(int i = 0; i < 6; i++){
            System.out.print("[" + meses.get(i)+ "]");
        }
        System.out.println("");


    }
}
