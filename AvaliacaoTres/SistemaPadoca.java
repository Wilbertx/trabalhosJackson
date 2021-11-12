package AvaliacaoTres;

public class SistemaPadoca {

    public static void main(String[] args) {
        
        Chef chefSj = new Chef("1","Matheus","113.683.544-12","23/05/2001", "Brownie");
        Chef chefMd = new Chef("2","Taize","451.782.312-45","12/01/1995", "Xineque");
        Chef chefDc = new Chef("3","Ivanir","222.222.22-22","13/08/1970", "Pudim");

        Cliente clienteUm = new Cliente("4","Ivan","478.154.741-69","23/05/1987", "47 99941-8140");
        Cliente clienteDois = new Cliente("5","Douglas","326.485.632-65","14/02/1999", "47 3466-1510");
        Cliente clienteTres = new Cliente("6","Clarice","365.458.741-48","05/04/1998", "47 3433-8945");

        Padaria padariaSj = new Padaria("100","Padaria São João","06/07/2003","1000","89211-450","Rua João Woehl",94,"Vila Nova","Joinville", "6:00 AM até 18:00 PM");
        Padaria padariaMd = new Padaria("200","Padaria Milagre de Deus","05/04/2007","2000","89204-060","Rua XV de Novembro",108,"Floresta","Joinville", "5:30 AM até 19:30 PM");
        Padaria padariaDc = new Padaria("300","Padaria Doce do Céu","08/01/2011","3000","89224-403","Rua Raimundo Semlombo",509,"Boa Vista","Joinville","7:00 AM até 20:00 PM");

        Mercados mercadoUm = new Mercados("400","Mercado Dos Amigos","01/04/2000","4000","78541-450","Rua Messias Jair",879,"Boa Vista","Joinville", "Um pacote de picolé por 5 reais.");
        Mercados mercadoDois = new Mercados("500","Mercado Ixpindula","04/07/2001","5000","63216-415","Rua Raimundo Colombo",897,"Aventureiro","Joinville", "Banana nanica por apenas 60 centavos a unidade");
        Mercados mercadoTres = new Mercados("600","Mercado Weber","23/10/1991","6000","45682-254","Rua XV de Novembro",541,"Centro","Joinville", "Nutella de 500 gramas, por apenas 4 reais o pote");

        Receita receitaUm = new Receita("454","Xineque","Comece fazendo a messa e logo após o recheio.", 3, 2.0);
        Receita receitaDois = new Receita("20","Coxinha","Colocar a coxinha pré-frita na fritadeira.", 4, 3.5);
        Receita receitaTres = new Receita("30","Pudim","Use leite condensado e açucar queimado.", 2, 6.0);
        Receita receitaQuatro = new Receita("40","Bolinho de Carne","Coloque a carne em formato de bolinhas.", 5, 4.0);
        Receita receitaCinco = new Receita("50","Pão de Queijo","Colocar o pão de queijo pré-pronto no forno.", 1, 2.5);
        Receita receitaSeis = new Receita("60","Sanduiche","Coloque presunto e queijo passados na chapa e alface.", 2, 5.0);
        Receita receitaSete = new Receita("70","Pastel","Prepare a massa e o recheio, e coloque na fritadeira.", 6, 4.75);
        Receita receitaOito = new Receita("80","Enrolado de Salsicha","Empane a salsicha usando farinha de rosca.", 9, 3.0);
        Receita receitaNove = new Receita("90","Brownie","Prepare a massa e 30m no forno em 250 graus.", 3, 4.0);
        Receita receitaDez = new Receita("100","Croassonho","Preparado com massa de folhado e pode ser feito doce ou salgado.", 11, 6.0);
        Receita receitaOnze = new Receita("110","Cuca de bana","Preparado com três ovos, farinha de trigo, fermeto, banana, canela a gosto e açucar.", 15, 10.0);
        Receita receitaDoze = new Receita("120","Misto Quente","Preparado com um pão frânces, duas fatias de presunto e duas fatias de queijo.", 12, 12.0);
        Receita receitaTreze = new Receita("130","Kibe","Kibe feito a base de carne de primeira e trigo.", 13, 4.0);
        Receita receitaQuatorze = new Receita("140","Sonho","Massa assada em 250 graus no forno e adicionada creme de baunilha.", 14, 2.50);
        Receita receitaQuinze = new Receita("150","Risóles","Junte a semente de erva doce e em seguida a calabresa e o requeijão cremoso.", 15, 5.0);

        chefSj.adicionarReceita(receitaUm);
        chefSj.adicionarReceita(receitaDois);
        chefSj.adicionarReceita(receitaTres);
        chefSj.adicionarReceita(receitaDez);
        chefSj.adicionarReceita(receitaOnze);

        chefMd.adicionarReceita(receitaQuatro);
        chefMd.adicionarReceita(receitaCinco);
        chefMd.adicionarReceita(receitaSeis);
        chefMd.adicionarReceita(receitaDoze);
        chefMd.adicionarReceita(receitaTreze);

        chefDc.adicionarReceita(receitaSete);
        chefDc.adicionarReceita(receitaOito);
        chefDc.adicionarReceita(receitaNove);
        chefDc.adicionarReceita(receitaQuatorze);
        chefDc.adicionarReceita(receitaQuinze);

        padariaSj.adicionarReceita(receitaUm);
        padariaSj.adicionarReceita(receitaDois);
        padariaSj.adicionarReceita(receitaTres);
        padariaSj.adicionarReceita(receitaQuatro);
        padariaSj.adicionarReceita(receitaCinco);

        padariaMd.adicionarReceita(receitaQuatorze);
        padariaMd.adicionarReceita(receitaQuinze);
        padariaMd.adicionarReceita(receitaSeis);
        padariaMd.adicionarReceita(receitaSete);
        padariaMd.adicionarReceita(receitaOito);

        padariaDc.adicionarReceita(receitaNove);
        padariaDc.adicionarReceita(receitaDez);
        padariaDc.adicionarReceita(receitaOnze);
        padariaDc.adicionarReceita(receitaDoze);
        padariaDc.adicionarReceita(receitaTreze);

        clienteUm.adicionarReceita(receitaDoze);
        clienteUm.adicionarReceita(receitaTreze);
        clienteUm.adicionarReceita(receitaQuatorze);
        clienteUm.adicionarReceita(receitaQuinze);
        clienteUm.adicionarReceita(receitaQuatorze);
        clienteUm.adicionarReceita(receitaUm);
        clienteUm.adicionarReceita(receitaDois);
        clienteUm.adicionarReceita(receitaTres);
        clienteUm.adicionarReceita(receitaDez);
        clienteUm.adicionarReceita(receitaOnze);

        clienteDois.adicionarReceita(receitaQuinze);
        clienteDois.adicionarReceita(receitaUm);
        clienteDois.adicionarReceita(receitaDois);
        clienteDois.adicionarReceita(receitaTres);
        clienteDois.adicionarReceita(receitaQuatro);
        clienteDois.adicionarReceita(receitaQuatorze);
        clienteDois.adicionarReceita(receitaCinco);
        clienteDois.adicionarReceita(receitaSeis);
        clienteDois.adicionarReceita(receitaDoze);
        clienteDois.adicionarReceita(receitaTreze);

        clienteTres.adicionarReceita(receitaSete);
        clienteTres.adicionarReceita(receitaOito);
        clienteTres.adicionarReceita(receitaNove);
        clienteTres.adicionarReceita(receitaDez);
        clienteTres.adicionarReceita(receitaOnze);
        clienteTres.adicionarReceita(receitaDoze);
        clienteTres.adicionarReceita(receitaTreze);
        clienteTres.adicionarReceita(receitaQuatorze);
        clienteTres.adicionarReceita(receitaUm);
        clienteTres.adicionarReceita(receitaQuinze);

        mercadoUm.adicionarReceita(receitaUm);
        mercadoUm.adicionarReceita(receitaDois);
        mercadoUm.adicionarReceita(receitaTres);
        mercadoUm.adicionarReceita(receitaQuatro);
        mercadoUm.adicionarReceita(receitaCinco);

        mercadoDois.adicionarReceita(receitaQuatorze);
        mercadoDois.adicionarReceita(receitaQuinze);
        mercadoDois.adicionarReceita(receitaSeis);
        mercadoDois.adicionarReceita(receitaSete);
        mercadoDois.adicionarReceita(receitaOito);

        mercadoTres.adicionarReceita(receitaNove);
        mercadoTres.adicionarReceita(receitaDez);
        mercadoTres.adicionarReceita(receitaOnze);
        mercadoTres.adicionarReceita(receitaDoze);
        mercadoTres.adicionarReceita(receitaTreze);

        //Printando os Chefs

        System.out.println("\n" + chefSj);
            System.out.println("Receitas do 1°chef - Matheus:");

        for (Receita receita : chefSj.getReceita()) {
            System.out.println(receita.getNome());
        }
        System.out.println("\n");

        System.out.println("\n" + chefMd);
            System.out.println("Receitas da 2°chef - Taize:");

        for (Receita receita : chefMd.getReceita()) {
            System.out.println(receita.getNome());
        }
        System.out.println("\n");

        System.out.println("\n" + chefDc);
            System.out.println("Receitas da 3°chef - Ivanir:");

        for (Receita receita : chefDc.getReceita()) {
            System.out.println(receita.getNome());
        }
        System.out.println("\n");

        //Printando os Cliente

        System.out.println("\n" + padariaSj);
        System.out.println("Padaria São João");

        for (Receita receita : padariaSj.getReceita()) {
            System.out.println(receita.getNome() + " R$" + receita.getValor());
        }

        System.out.println("\n" + padariaMd);
        System.out.println("Padaria Milagre de Deus");

        for (Receita receita : padariaMd.getReceita()) {
            System.out.println(receita.getNome() + " R$" + receita.getValor());
        }

        System.out.println("\n" + padariaDc);
        System.out.println("Padaria Doce do Céu");

        for (Receita receita : padariaDc.getReceita()) {
            System.out.println(receita.getNome() + " R$" + receita.getValor());
        }

        System.out.println("\n" + mercadoUm);
        System.out.println("Mercado Dos Amigos");

        for (Receita receita : mercadoUm.getReceita()) {
            System.out.println(receita.getNome() + " R$" + receita.getValor());
        }

        System.out.println("\n" + mercadoDois);
        System.out.println("Mercado Ixpindula");

        for (Receita receita : mercadoDois.getReceita()) {
            System.out.println(receita.getNome() + " R$" + receita.getValor());
        }

        System.out.println("\n" + mercadoTres);
        System.out.println("Mercado Weber");
                
        for (Receita receita : mercadoTres.getReceita()) {
            System.out.println(receita.getNome() + " R$" + receita.getValor());
        }

    }

}
