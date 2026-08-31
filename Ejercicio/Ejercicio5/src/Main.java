//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] sueldos = {450000, 780000, 1200000, 350000, 950000, 1500000};
        double sueldoMasAlto = sueldos[0];
        double totalBonos = 0;
        int cantCategoria = 0;
        int contador=1;
        double bono;
        double sueldoFinal;
        String tipoCategoria = "";
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] >= sueldoMasAlto) {
                sueldoMasAlto = sueldos[i];
            }
            tipoCategoria = obtenerCategoria(sueldos[i]);
            if (tipoCategoria.equals("ALTO")) {
                cantCategoria++;
            }
            bono=calcularBono(sueldos[i]);
            totalBonos += calcularBono(sueldos[i]);
            sueldoFinal=calcularSueldoFinal(sueldos[i],calcularBono(sueldos[i]));
            mostrarEmpleado(
                    contador++,
                    sueldos[i],
                    bono,
                    sueldoFinal,
                    tipoCategoria,
                    esSueldoAlto(sueldoFinal)
            );
            System.out.println();
        }
        System.out.println();
        System.out.println("Resumen");
        System.out.println("Mayor sueldoFinal:" + "$" + sueldoMasAlto);
        System.out.println("Total pagado en bonos: " + "$" + totalBonos);
        System.out.println("Cantidad Categoria ALTO: " + cantCategoria);
    }

    //1
    public static double calcularBono(double sueldo) {
        double bono = 0;
        if (sueldo <= 500000) {
            return bono = (sueldo * 0.15);
        } else if (sueldo <= 1000000) {
            return bono = (sueldo * 0.10);
        } else  {
           return bono = (sueldo * 0.05);
        }
    }

    //2
    public static double calcularSueldoFinal(double sueldo, double bono) {
        return sueldo+bono;
    }

    //3
    public static boolean esSueldoAlto(double sueldFinal) {
        boolean estado = false;
        if(sueldFinal>=1000000){
        estado = true;}
        return  estado;
    }

    //4
    public static String obtenerCategoria(double sueldo) {
        if (sueldo < 600000) {
            return "BAJO";
        } else if (sueldo <= 1000000) {
            return "MEDIO";
        } else {
            return "ALTO";
        }
    }

    //5
    public static void mostrarEmpleado(
            int numero,
            double sueldoBase,
            double bono,
            double sueldoFinal,
            String categoria,
            boolean sueldoAlto) {

        System.out.println("Empleado #" + numero);
        System.out.println("Sueldo base: $" + sueldoBase);
        System.out.println("Bono: $" + bono);
        System.out.println("Sueldo final: $" + sueldoFinal);
        System.out.println("Categoría: " + categoria);
        System.out.println("Sueldo Alto: " + sueldoAlto);
        System.out.println();
    }
}