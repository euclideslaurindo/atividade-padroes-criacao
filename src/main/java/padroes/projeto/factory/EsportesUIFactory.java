package padroes.projeto.factory;

public interface EsportesUIFactory {

    ProdutoUI fabricarTenis();
    ProdutoUI fabricarCamisa();

    static EsportesUIFactory getFactory(String marca){
        return switch (marca.toLowerCase()){
            case "adidas" -> new Adidas();
            case "nike" -> new Nike();
            default -> throw new IllegalArgumentException("Marca Informada Incorreta: " + marca);
        };
    }
    
}
