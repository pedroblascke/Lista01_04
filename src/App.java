import java.util.Scanner;
public class App {

    public static void main (String[] args){
    
    //4- Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    
    double nota1, nota2, nota3, nota4, media;
    Scanner teclado;

    System.out.println("Por favor, insira sua primeira nota bimestral ");
    teclado = new Scanner(System.in);
    nota1 = teclado.nextDouble();
    
    System.out.println("Agora, sua segunda nota ");
    nota2 = teclado.nextDouble();

    System.out.println("Terceira nota ");
    nota3 = teclado.nextDouble();

    System.out.println("Por fim, sua quarta nota ");
    nota4 = teclado.nextDouble();

    teclado.close();

    media = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.println("Sua média é de " + media);

    }
}
