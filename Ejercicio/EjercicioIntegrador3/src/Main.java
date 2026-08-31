//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] precios = {12000, 35000, 8000, 50000, 22000};
        double precioFinal;
        boolean esCompraCara ;
        for(int i= 0 ; i < precios.length ; i++){
            precioFinal=calcularDescuento(precios[i]);
            esCompraCara=esCompraCara(precioFinal);
            System.out.println("Precio Original : " + precios[i]);
            System.out.println("Precio Final : " + precioFinal );
            System.out.println(("¿Es compra cara?" + esCompraCara ));
            System.out.println();
        }
    }

    public static double calcularDescuento(double precio){
        if(precio>30000){
            return precio - (precio * 0.20);
        }else {
            return precio;
        }
    }
    public static boolean esCompraCara(double precio){
        if(precio>25000){
            return true;
        }else {return false;}
    }
}