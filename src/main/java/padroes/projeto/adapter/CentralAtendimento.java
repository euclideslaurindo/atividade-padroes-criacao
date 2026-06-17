package padroes.projeto.adapter;

public class CentralAtendimento {

    public void realizarAtendimento(AtendentePT atendente, String duvida){
        atendente.cumprimentar();
        atendente.responderDuvida(duvida);
        atendente.encerrarAtendimento();
    }
}
