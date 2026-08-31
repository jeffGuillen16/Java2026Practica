import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] sueldos = {450000, 820000, 1200000, 670000, 1500000, 390000};
        int contador = 0;
        double totalSueldos = 0;
        double sueldoMasAlto = 0;
        for (int i = 0;  i < sueldos.length ; i++){
            totalSueldos += sueldos[i];
            if(sueldos[i]>800000) {
                contador += 1;
            }
            if(esSueldoAlto(sueldos[i])==true)
            {
                sueldoMasAlto=sueldos[i];
            }
        }
        System.out.println("Total Sueldos: " + totalSueldos);
        System.out.println("Cantidad mayores a $800.000 : " + contador );
        System.out.println("Sueldo mas alto: " + sueldoMasAlto );

    }
    static double sueldoMasAlto = 0;
    public static boolean esSueldoAlto(double sueldo) {
        if(sueldo>sueldoMasAlto){
            sueldoMasAlto=sueldo;
            return true;
        }else {
            return false;
        }

    }
}