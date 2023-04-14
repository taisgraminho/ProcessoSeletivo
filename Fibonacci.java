
import java.util.Scanner;


/*Atividade 2 */
public class Fibonacci{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        int atual = 0;
        int proximo = 1;
        int auxiliar = 0;

        do{
            auxiliar = proximo;
            proximo = atual + proximo;
            atual = auxiliar;
        }while(auxiliar <= numero);
        

        if(numero == auxiliar){
            System.out.println("O numero " + numero + " faz parte da sequencia de fibonacci");
        }else{
            System.out.println("O numero " + numero + " nao faz parte da sequencia de fibonacci");
        }
          
    }
      
 
}
