package padroes.projeto.adapter;

public class AdaptadorIngles implements AtendentePT {
    
    private AtendenteIngles atendenteIngles;

    public AdaptadorIngles(AtendenteIngles atendenteIngles) {
        this.atendenteIngles = atendenteIngles;
    }

    @Override
    public void cumprimentar() {
        this.atendenteIngles.cumprimentar();
    }

    @Override
    public void responderDuvida(String duvida) {
        this.atendenteIngles.responderDuvida(duvida);
    }

    @Override
    public void encerrarAtendimento() {
        this.atendenteIngles.encerrarAtendimento();
    }
}