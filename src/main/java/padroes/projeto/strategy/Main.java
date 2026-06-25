package padroes.projeto.strategy;

public class Main {
    public static void main(String[] args) {

        AplicativoNavegacao app = new AplicativoNavegacao();
        String origem  = "Centro";
        String destino = "Aeroporto";
        double distancia = 18.0;

        System.out.println(" opção 1");
        app.setEstrategia(new RotaDeCarro());
        app.calcularRota(origem, destino, distancia);

        System.out.println();

        System.out.println(" opção 2");
        app.setEstrategia(new RotaDeOnibus());
        app.calcularRota(origem, destino, distancia);

        System.out.println();

        System.out.println("opção 3 ");
        app.setEstrategia(new RotaAPe());
        app.calcularRota(origem, destino, distancia);
    }
}