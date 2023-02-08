//Se requiere un programa en Java para calcular el resultado de la suma,
// diferencia, producto, módulo y cociente de dos números decimales
// de cualquier longitud.
public class Ejercicio1 {
    double numero1, numero2;

    public Ejercicio1() {
    }

    public Ejercicio1(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double suma() {
        return (this.numero1 + this.numero2);
    }

    public double resta() {
        return (this.numero1 - this.numero2);
    }

    public double multiplicacion() {
        return (this.numero1 * this.numero2);
    }

    public double division() {
        return (this.numero1 / this.numero2);
    }
    public double resto(){
        return (this.numero1%this.numero2);
    }
    @Override
    public String toString() {
        return "Realiza operaciones basicas con 2 numeros cuales quiera" +
                "\n numero1:" + this.numero1
                + "\n numero2:" + this.numero2
                + "\n LA SUMA ES:   " + suma()
                + "\n LA RESTA ES:    " + resta()
                + "\n LA MULTIPLICACION ES:    " + multiplicacion()
                + "\n LA DIVISION ES:    " + division()
                + "\n EL RESTO ES:      "+ resto();


    }
}