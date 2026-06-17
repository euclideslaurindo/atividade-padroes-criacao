package padroes.projeto.factory;

public abstract class Produto implements ProdutoUI {
    private String logo;
    private int tamanho;

    public Produto(String logo, int tamanho){
        this.logo = logo;
        this.tamanho = tamanho;
    }
    
    @Override 
    public void setLogo(String logo){
        this.logo = logo;
    }

    @Override 
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    @Override 
    public String getLogo(){
        return logo;
    }

    @Override
    public int getTamanho(){
        return tamanho;
    }
}
