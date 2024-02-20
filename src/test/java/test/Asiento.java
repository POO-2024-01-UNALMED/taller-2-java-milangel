package test;

public class Asiento {
     int numeroAsientos;
     String color;
     int precio;
     int registro;

    public void cambiarColor(String color) {
        if (color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("verde") || color.equalsIgnoreCase("amarillo")
                || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("blanco")) {
            this.color = color;
        }
    }

    // Getters y Setters omitidos para brevedad
}

