package padroes.projeto.adapter;

public class AtendenteEspanhol {
    
    public void cumprimentar(){
        System.out.println("Agente: ¡Hola! Bienvenido a nuestro soporte. ¿En qué puedo ayudarte?");
    }

    public void responderDuvida(String duvida){
        System.out.println("Agente: Entendí tu pregunta sobre \"" + duvida + "\". ¡Te ayudaré ahora!");
    }

    public void encerrarAtendimento(){
        System.out.println("Agente: Gracias por contactarnos. ¡Que tengas un excelente día!");
    }
}
