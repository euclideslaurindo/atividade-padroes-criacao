package padroes.projeto.strategy;

public class AplicativoNavegacao {

    private EstrategiaRota estrategia;

    public void setEstrategia(EstrategiaRota estrategia){
        this.estrategia = estrategia;
    }

    public void calcularRota(String origem, String destino, double distanciaKm) {
        System.out.println("Rota: " + origem + " → " + destino
                + " (" + distanciaKm + " km)");
        System.out.println("Modal: " + estrategia.descricao());
        System.out.println("Tempo estimado: " + estrategia.calcularTempo(distanciaKm) + " minutos");
        System.out.printf("Custo estimado: R$%.2f%n", estrategia.calcularCusto(distanciaKm));
    }  
}
