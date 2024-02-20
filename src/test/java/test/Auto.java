package test;

public class Auto {
     String modelo;
     int precio;
     String color;
     int registro;
     Motor motor;
     Asiento [] asientos;
    public static int cantidadCreados;
    
    int cantidadAsientos()
    {
    	int numAsientos = 0;
    	for (int i = 0; i < asientos.length; i++)
    	{
    		if (asientos[i] != null)
    		{
    			numAsientos++;
    		}
    	}
    	return numAsientos;
    }
    

    public Auto(String modelo, int precio, String color, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.registro = registro;
        this.motor = new Motor();
        cantidadCreados++;
    }

    public void cambiarColor(String color) {
        if (color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("verde") || color.equalsIgnoreCase("amarillo")
                || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("blanco")) {
            this.color = color;
        }
    }

    public int cantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public String verificarIntegridad() {
        String mensaje = "Auto original";
        if (this.registro != this.motor.getRegistro()) {
            mensaje = "Las piezas no son originales";
        } else {
            for (Asiento asiento : asientos) {
                if (asiento != null && asiento.getRegistro() != this.registro) {
                    mensaje = "Las piezas no son originales";
                    break;
                }
            }
        }
        return mensaje;
    }

    // Getters y Setters omitidos para brevedad
}



