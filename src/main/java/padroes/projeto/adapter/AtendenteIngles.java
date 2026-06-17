package padroes.projeto.adapter;

public class AtendenteIngles {

    public void cumprimentar(){
        System.out.println("Agent: Hello! Welcome to our support. How can I help you?");
    }

    public void responderDuvida(String duvida){
        System.out.println("Agent: I understood your question about \"" + duvida + "\". Let me help you!");
    }
    
    public void encerrarAtendimento(){
        System.out.println("Agent: Thank you for contacting us. Have a great day!");
    }
}
