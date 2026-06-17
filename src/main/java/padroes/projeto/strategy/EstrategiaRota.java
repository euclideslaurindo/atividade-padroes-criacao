package padroes.projeto.strategy;

public interface EstrategiaRota {
    int calcularTempo(double distanciaKm);
    double calcularCusto(double distanciaKm);
    String descricao();    
}
