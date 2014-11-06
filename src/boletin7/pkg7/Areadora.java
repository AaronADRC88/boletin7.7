
package boletin7.pkg7;
import javax.swing.JOptionPane;

public class Areadora {
    private double area;
    private double lado;
    private double base;
    private double altura;
    private double radio;
    final static double PI = 3.14;
    
    public Areadora(){
        
    }
    public Areadora(double l,double b,double h,double r){
        this.lado=l;
        this.base=b;
        this.altura=h;
        this.radio=r;  
        }
        public void seleccionOpcion(){
        String opcion; 
        opcion=JOptionPane.showInputDialog("Selecciona figura:\n cadrado\n triángulo\n circulo");
        switch(opcion){
        case "cadrado":
            String dato=JOptionPane.showInputDialog("introduce lado");
            double lado= Double.parseDouble(dato);
            JOptionPane.showMessageDialog(null, "area ="+(lado*lado));
            break;
        case "triángulo": 
            String dato1=JOptionPane.showInputDialog("introduce base");
            double base= Double.parseDouble(dato1);
            String dato2=JOptionPane.showInputDialog("introduce altura");
            double altura= Double.parseDouble(dato2);
            JOptionPane.showMessageDialog(null, "area="+((base*altura)/2));
            break;
        case "circulo":
            String dato3=JOptionPane.showInputDialog("introduce radio");
            double radio= Double.parseDouble(dato3);
            JOptionPane.showMessageDialog(null, "area="+(PI*(radio*radio)));
            break;
        default :JOptionPane.showMessageDialog(null, "opción incorrecta");
        }
}
}


