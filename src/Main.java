import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        Ejercicio1 c = new Ejercicio1(5, 23);
        Ejercicio1 objetoCalculadora = new Ejercicio1();
        objetoCalculadora.numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero;    "));
        objetoCalculadora.numero2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero:    "));

        JOptionPane.showMessageDialog(null, objetoCalculadora.toString());
    }
}
