package padroes.projeto.strategy;

public class RotaDeCarro implements EstrategiaRota {
    
    private static final double VELOCIDADE_KMH = 60.0;
    private static final double CUSTO_POR_KM   = 0.50;

    @Override
    public int calcularTempo(double distanciaKm) {
        return (int) ((distanciaKm / VELOCIDADE_KMH) * 60);
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        return distanciaKm * CUSTO_POR_KM;
    }

    @Override
    public String descricao() {
        return "Carro (60 km/h, R$0,50/km)";
    }      
}
