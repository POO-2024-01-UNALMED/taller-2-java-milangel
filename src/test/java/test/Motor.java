package test;

public class Motor {
     String marca;
     String tipo;
     int numeroCilindros;
     int registro;

    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    public void asignarTipo(String tipo) {
        if (tipo.equalsIgnoreCase("electrico") || tipo.equalsIgnoreCase("gasolina")) {
            this.tipo = tipo;
        }
    }

    // Getters y Setters omitidos para brevedad
}
