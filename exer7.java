import java.util.Scanner;
public class exer7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i=0; i < vetorA.length; i++){
            System.out.println("Entre com os valores do vetor A: ");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i < vetorB.length; i++){
            System.out.println("Entre com os valores do vetor B: ");
            vetorB[i] = scan.nextInt();
        }

        System.out.println("Soma vetor A e B (vetor C): ");
        for(int i=0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("Vetor C: ");
            System.out.println(vetorC[i] + " ");
        }

    }
}
