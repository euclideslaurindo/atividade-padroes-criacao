package padroes.projeto.strategy;

public class RotaDeOnibus implements EstrategiaRota {

    private static final double VELOCIDADE_KMH = 30.0;
    private static final double TARIFA_FIXA = 4.50;

    @Override
    public int calcularTempo(double distanciaKm) {
        return (int) ((distanciaKm / VELOCIDADE_KMH) * 60);
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        return TARIFA_FIXA;
    }

    @Override
    public String descricao() {
        return "onibus (30 km/h, tarifa fixa R$4,50)";
    }
}