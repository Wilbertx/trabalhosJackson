package Teste.Alou;

public class Sistema {
    public static void main(String[] args) {
        
        Chef chefSj = new Chef("1","Matheus","113.683.544-12","23/05/2001");
        Chef chefMd = new Chef("2","Taize","451.782.312-45","12/01/1995");
        Chef chefDc = new Chef("3","Ivanir","222.222.22-22","13/08/1970");

        Padaria padariaSj = new Padaria("100","Padaria São João","06/07/2003","1000","89211-450","Rua João Woehl",94,"Vila Nova","Joinville");
        Padaria padariaMd = new Padaria("200","Padaria Milagre de Deus","05/04/2007","2000","89204-060","Rua XV de Novembro",108,"Floresta","Joinville");
        Padaria padariaDc = new Padaria("300","Padaria Doce do Céu","08/01/2011","3000","89224-403","Rua Raimundo Semlombo",509,"Boa Vista","Joinville");

        Receita receitaUm = new Receita("10","Xineque","Comece fazendo a messa e logo após o recheio.",3);
        Receita receitaDois = new Receita("20","Coxinha","Colocar a coxinha pré-frita na fritadeira.",4);
        Receita receitaTres = new Receita("30","Pudim","Use leite condensado e açucar queimado.",2);
        Receita receitaQuatro = new Receita("40","Bolinho de Carne","Coloque a carne em formato de bolinhas.",5);
        Receita receitaCinco = new Receita("50","Pão de Queijo","Colocar o pão de queijo pré-pronto no forno.",1);
        Receita receitaSeis = new Receita("60","Sanduiche","Coloque presunto e queijo passados na chapa e alface.",2);
        Receita receitaSete = new Receita("70","Pastel","Prepare a massa e o recheio, e coloque na fritadeira",6);
        Receita receitaOito = new Receita("80","Enrolado de Salsicha","Empane a salsicha usando farinha de rosca",9);
        Receita receitaNove = new Receita("90","Brownie","Prepare a massa e 30m no forno em 250 graus",3);

        chefSj.adicionarReceita(receitaUm);
        chefSj.adicionarReceita(receitaDois);
        chefSj.adicionarReceita(receitaTres);

        chefMd.adicionarReceita(receitaQuatro);
        chefMd.adicionarReceita(receitaCinco);
        chefMd.adicionarReceita(receitaSeis);

        chefDc.adicionarReceita(receitaSete);
        chefDc.adicionarReceita(receitaOito);
        chefDc.adicionarReceita(receitaNove);

        System.out.println("Receitas do 1°chef - Matheus:");
        for (Receita receita : chefSj.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        System.out.println("Receitas da 2°chef - Taize:");
        for (Receita receita : chefMd.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        System.out.println("Receitas da 3°chef - Ivanir:");
        for (Receita receita : chefDc.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        padariaSj.adicionarReceita(receitaUm);
        padariaSj.adicionarReceita(receitaDois);
        padariaSj.adicionarReceita(receitaTres);
        padariaSj.adicionarReceita(receitaQuatro);
        padariaSj.adicionarReceita(receitaCinco);

        padariaMd.adicionarReceita(receitaQuatro);
        padariaMd.adicionarReceita(receitaCinco);
        padariaMd.adicionarReceita(receitaSeis);
        padariaMd.adicionarReceita(receitaSete);
        padariaMd.adicionarReceita(receitaOito);

        padariaDc.adicionarReceita(receitaOito);
        padariaDc.adicionarReceita(receitaNove);
        padariaDc.adicionarReceita(receitaUm);
        padariaDc.adicionarReceita(receitaDois);
        padariaDc.adicionarReceita(receitaTres);

        System.out.println("***********************************************************************************************************************");
        System.out.println("CEP:" + padariaSj.endereco.cep + "\nRua: " + padariaSj.endereco.rua + "\nNúmero: " + padariaSj.endereco.numero + "\nBairro: " + padariaSj.endereco.bairro + "\nCidade: " + padariaSj.endereco.cidade);
        System.out.println("\nReceitas da 1°padaria - Padaria São João:");
        for (Receita receita : padariaSj.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        System.out.println("***********************************************************************************************************************");
        System.out.println("CEP:" + padariaMd.endereco.cep + "\nRua: " + padariaMd.endereco.rua + "\nNúmero: " + padariaMd.endereco.numero + "\nBairro: " + padariaMd.endereco.bairro + "\nCidade: " + padariaMd.endereco.cidade);
        System.out.println("\nReceitas da 2°padaria - Padaria Milagre de Deus:");
        for (Receita receita : padariaMd.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");

        System.out.println("***********************************************************************************************************************");
        System.out.println("CEP:" + padariaDc.endereco.cep + "\nRua: " + padariaDc.endereco.rua + "\nNúmero: " + padariaDc.endereco.numero + "\nBairro: " + padariaDc.endereco.bairro + "\nCidade: " + padariaDc.endereco.cidade);
        System.out.println("\nReceitas da 3°padaria - Padaria Doce do Céu:");
        for (Receita receita : padariaDc.receitas) {
            System.out.println(receita.nome);
        }
        System.out.println("\n");
    }
}
