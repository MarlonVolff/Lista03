package Exercicio02;

public class Automovel {

    public Double distanciaP;
    public Double combustivelGasto;

    // public Automovel(String distanciaP, String combustivelGasto) {
    //     this.distanciaP = distanciaP;
    //     this.combustivelGasto = combustivelGasto;
    // }

    public double ConsumoMedio() {
        double distancia = distanciaP;
        double combustivel = combustivelGasto;
        return (distancia / combustivel);
    }
}
