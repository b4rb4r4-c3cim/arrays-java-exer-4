import java.util.Scanner;
public class exer11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i=0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da  posicao: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }

        System.out.print("Vetor A = ");
        for(int i=0; i <vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B multiplicado por 2 = ");
        for(int i=0; i <vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();

    }
}
