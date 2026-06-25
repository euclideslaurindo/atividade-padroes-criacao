package padroes.projeto.strategy;

public class RotaAPe implements EstrategiaRota {

    private static final double VELOCIDADE_KMH = 5.0;

    @Override
    public int calcularTempo(double distanciaKm) {
        return (int) ((distanciaKm / VELOCIDADE_KMH) * 60);
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        return 0.0;
    }

    @Override
    public String descricao() {
        return "A pé (5 km/h, Grátis)";
    }
}