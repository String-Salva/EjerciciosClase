package unidad6.ejercicio2.Garajes;

import unidad6.ejercicio2.Vehiculos.Vehiculo;

public class Garaje {
    double precio;
    int capacidadMax;
    Vehiculo[] vehiculos;

    public Garaje(int capacidadMax, double precio) {
        this.capacidadMax = capacidadMax;
        this.precio = precio;
        this.vehiculos = new Vehiculo[capacidadMax];
    }

    public int calcularPlazas() {
        int contador = 0;
        for (int i = 0; i < vehiculos.length; i++) {

            if (vehiculos[i] == null) {
                contador++;
            }
        }
        return contador;
    }

    public void introducir(Vehiculo vehiculo) {
        int i = 0;

        while (i < vehiculos.length && vehiculos[i] != null) {
            i++;

        }
        if (i < vehiculos.length) {
            vehiculos[i] = vehiculo;
        } else {
            System.out.println("Garaje lleno, bro");
        }
    }

    public void retirar(Vehiculo vehiculo) {
        int contador = 0;
        for (int i = 0; i < vehiculos.length; i++) {

            if (vehiculo == vehiculos[i]) {
                vehiculos[i] = null;
                System.out.println("El vehículo ha sido retirado");
                contador++;
            }
            if (contador == 0) {
                System.out.println("Éste vehículo no está en este garaje");
            }
        }
    }

    public double precioTotal() {
        double totalRuedas = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                totalRuedas += vehiculo.getRuedas();
            }
        }
        return totalRuedas * this.precio;
    }

    public double kmMedio() {
        double totalKm = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                totalKm += vehiculo.getKm();
            }
        }
        return totalKm / (double) (this.capacidadMax - calcularPlazas());
    }

    public String infoVehiculos() {
        String s = "";
        for (Vehiculo a : vehiculos) {
            if (a != null) {
                s += a.toString();
            }
        }
        return s;
    }

    public String mostrarInfo() {
        return "Este garaje dispone de una capacidad de: " + capacidadMax + " plazas\n" +
                "Cambiamos las ruedas por el precio de: " + precio + " por rueda\n" +
                "Quedan " + calcularPlazas() + " plazas disponibles" + "\n" +
                (calcularPlazas() < vehiculos.length ? infoVehiculos() : "");
    }


}

