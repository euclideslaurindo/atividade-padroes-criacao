package padroes.projeto.factory;

public class Main {
    public static void main(String[] args){

        EsportesUIFactory adidasFactory = EsportesUIFactory.getFactory("adidas");
        EsportesUIFactory nikeFactory = EsportesUIFactory.getFactory("nike");

        ProdutoUI tenisAdidas = adidasFactory.fabricarTenis();
        ProdutoUI camisaAdidas = adidasFactory.fabricarCamisa();
        ProdutoUI tenisNike = nikeFactory.fabricarTenis();
        ProdutoUI camisaNike = nikeFactory.fabricarCamisa();

        System.out.println("--- Produtos Adidas ---");
        printDetalhes(tenisAdidas);
        printDetalhes(camisaAdidas);

        System.out.println("\n--- Produtos Nike ---");
        printDetalhes(tenisNike);
        printDetalhes(camisaNike);
    }

    static void printDetalhes(ProdutoUI s){
        System.out.println("Logo: " + s.getLogo());
        System.out.println("Tamanho: " + s.getTamanho());
    }
}