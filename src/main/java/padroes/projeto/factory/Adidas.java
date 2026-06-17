package padroes.projeto.factory;

public class Adidas implements EsportesUIFactory{
        
    @Override
    public ProdutoUI fabricarTenis(){
        return new TenisAdidas("Adidas", 38);
    }

    @Override
    public ProdutoUI fabricarCamisa(){
        return new CamisaAdidas("Adidas",36);
    }
    
}

