package padroes.projeto.adapter;

public class AdaptadorEspanhol implements AtendentePT {
    
    private AtendenteEspanhol atendenteEspanhol;

    public AdaptadorEspanhol(AtendenteEspanhol atendenteEspanhol) {
        this.atendenteEspanhol = atendenteEspanhol;
    }

    @Override
    public void cumprimentar() {
        this.atendenteEspanhol.cumprimentar();
    }

    @Override
    public void responderDuvida(String duvida) {
        this.atendenteEspanhol.responderDuvida(duvida);
    }

    @Override
    public void encerrarAtendimento() {
        this.atendenteEspanhol.encerrarAtendimento();
    }
}