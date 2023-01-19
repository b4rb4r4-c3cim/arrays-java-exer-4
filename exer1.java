//armazenar a temperatura media diaria por 1 ano
public class exer1{
    public static void main(String[] args){
    
        //é muito trabalhoso digitar 365 temperaturas para cada dia do ano, essa é uma utilização de arrays
        
        double [] temperaturas = new double[365];
         temperaturas[0] = 31.3;
         temperaturas[1] = 32;
         temperaturas[2] = 33.7;
         temperaturas[3] = 34;
         temperaturas[4] = 33.1;


         for(int i = 0; i < temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " eh: " + temperaturas[i]);
         }

         //for melhorado 
         //a variavel temp pega as posições na ordem 00,01,02,03,04...

         for(double temp : temperaturas){ 

            System.out.println(temp);
         }

    }
}