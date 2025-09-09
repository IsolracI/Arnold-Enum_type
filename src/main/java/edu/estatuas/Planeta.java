package edu.estatuas;

public enum Planeta {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double masa;
    private final double radio;

    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    };

    public double getMasa() {
        return this.masa;
    }

    public double getRadio() {
        return this.radio;
    }

    private double calcularGravedadSuperficie(Planeta planeta) {
        double g = 6.67300 * Math.pow(10, -11) * (Math.pow(planeta.getRadio(), 3) / planeta.getMasa() * Math.pow(9.8, 2));
        return planeta.
    }

    private double calcularMasa(double pesoTierra) {
        return pesoTierra / (Planeta.EARTH.getMasa() / Planeta.EARTH.getRadio() * Planeta.EARTH.getRadio());
    }

    public double pesoSuperficie(double peso) {
        
    }
    

}
