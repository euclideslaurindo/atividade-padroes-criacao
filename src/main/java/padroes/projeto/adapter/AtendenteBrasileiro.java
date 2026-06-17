package padroes.projeto.adapter;

public class AtendenteBrasileiro implements AtendentePT {
    
    @Override    
    public void cumprimentar(){
        System.out.println("Atendente: Olá! Bem-vindo ao nosso suporte. Como posso ajudar?");
    }

    @Override
    public void responderDuvida(String duvida){
        System.out.println("Atendente: Entendi sua dúvida sobre \"" + duvida + "\". Vou te ajudar agora!");
    }

    @Override
    public void encerrarAtendimento(){
        System.out.println("Atendente: Obrigado pelo contato. Tenha um ótimo dia!");
    }
}
