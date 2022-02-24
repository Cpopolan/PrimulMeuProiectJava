import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] array = {1,2,3,4,5};
        // int[] x = new int[5]; -sau asa cu una noua

        for (var i:array) {
            System.out.println(i);

            // *************  sau  ****************
       // for (int i=0;i< array.length;i++){
        //} System.out.println(i);
            // *************  end  ******************



            // declarare o lista
            List<Integer> nume_lista = new ArrayList<>();

            //***************   Citite de la tastatura
            Scanner scanner = new Scanner(System.in);

            int var = scanner.nextInt();
        // ****************  END

            // transformare din String in INt

            Integer.parseInt("Parametru string");

            // *************** end
    }

}
