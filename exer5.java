import java.util.Scanner;
public class exer5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for(int i=0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da  posicao: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for(int i=0; i <vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for(int i=0; i <vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();




    }
}