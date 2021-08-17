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

      System.out.println("Ex. 8");

        int valor = 12;
        
        String msg = (valor%2)==0? "É par" : "É impar";
        
        System.out.println(msg);

        System.out.println("Ex. 10");

        String valora = "matheus";
        String valorb = "matheus";

        boolean comparar = valora.equals(valorb);

        System.out.println(comparar);

        System.out.println("Ex. 11");
         
        String bom = "3.2";
        int ruim = (int) Double.parseDouble(bom);
        
        System.out.println(ruim);

        System.out.println("Ex. 12");

        double salario = 3580;
        
        String aliquota = salario <= 1903.98 ? "Isento" : salario <= 2826.65 ? "7.5%" : salario <= 3751.05 ? "15%" : salario <= 4664.68 ? "22.5%" : "27.5%";
        
        System.out.println(aliquota);
        
        System.out.println("Finalizando exercicio");
    }
}
