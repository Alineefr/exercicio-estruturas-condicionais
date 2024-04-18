import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class exercicio08 {
  public static void main(String[] args) {
    
 
    /*Desenvolva um programa que pede ao usuário para digitar um ano e verifica se é
    bissexto ou não. Um ano é bissexto se for divisível por 4, mas não por 100, a menos
    que também seja divisível por 400.*/

    Scanner scanner = new Scanner (System.in);

    System.out.println("digite o ano");
    int ano =  scanner.nextInt();
    
    if ((ano %4 == 0) &&( ano % 100 != 0) || (ano % 400 ==0)) {

        System.out.println("este ano é bissexto");
    
    }else{

        System.out.println("este ano não é bissexto " + ano);

    }

    scanner.close();
  }

}
