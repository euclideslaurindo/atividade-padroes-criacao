package padroes.projeto.adapter;

public class Main {
    public static void main(String[] args) {
        CentralAtendimento central = new CentralAtendimento();
        String duvida = "Como funciona o padrão Adapter?";

        System.out.println("--- Atendimento em Português ---");
        AtendentePT atendenteBR = new AtendenteBrasileiro();
        central.realizarAtendimento(atendenteBR, duvida);

        System.out.println("\n--- Atendimento em Inglês ---");
        AtendenteIngles atendenteEN = new AtendenteIngles();
        AtendentePT adaptadorEN = new AdaptadorIngles(atendenteEN);
        central.realizarAtendimento(adaptadorEN, duvida);

        System.out.println("\n--- Atendimento em Espanhol ---");
        AtendenteEspanhol atendenteES = new AtendenteEspanhol();
        AtendentePT adaptadorES = new AdaptadorEspanhol(atendenteES);
        central.realizarAtendimento(adaptadorES, duvida);
    }
}