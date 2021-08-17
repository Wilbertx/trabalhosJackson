public class ExercicioUm {
    public static void main(String args[]) {
      System.out.println("Ex. 1");
      int nota1 = 8;
      int nota2 = 3;
      int nota3 = 10;
      
      int media = (nota1 + nota2 + nota3) / 3;
      
      System.out.println(media);
      
      System.out.println("Ex. 2");
      
      double lado1 = 1.80;
      double lado2 = 1.30;
      
      double media_area = (lado1 * lado2);
      
      System.out.println(media_area);
      
      System.out.println("Ex. 3");
      
      double largura = 1.60;
      double altura = 2.00;
      double profundidade = 3.00;
      
      double tamanho = (largura * altura * profundidade);
      
      System.out.println(tamanho);
      
      System.out.println("Ex. 4");
      
      int valor1 = 2;
      int valor2 = 5;
      
      String message = valor2 >= valor1 * 2 ? "É maior ou igual ao valor 1" : "Não é maior ou igual ao valor 1";
      
      System.out.println(message);
      
      System.out.println("Ex. 5");
      
      import java.util.*;
 
        public class Delta {
 
    Scanner read = new Scanner(System.in);
 
    int a, b, c;
    double delta, x1, x2;
 
    public Delta() {
        deltaCalculo();
    }
 
    private void deltaCalculo() {
 
        System.out.println("Digite o valor de A, B e C respectivamente: ");
        a = Integer.parseInt(read.next());
        b = Integer.parseInt(read.next());
        c = Integer.parseInt(read.next());
 
        delta = (b * b) + (-4 * (a * c));
 
        System.out.println("Delta: " + delta);
 
        if (delta >= 0) {
            calculaX();
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }
 
    }
 
    private void calculaX() {
 
        x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
        x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
 
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
 
    }
 
    public static void main(String[] args) {
        new Delta();
    }
 
}
      
      
      System.out.println("Ex. 6");
      
      int distancia_km = 100;
      int tempo = 3;
      
      int velocidade_media = (distancia_km / tempo);
      
      System.out.println(velocidade_media + "km/h");
      
      System.out.println("Ex. 7");
      
      double faturamento = 12.000;
      double imposto = 3.000;
      
      double percentual = (faturamento / imposto);
      
      System.out.println(percentual + "%");
    
    }
}