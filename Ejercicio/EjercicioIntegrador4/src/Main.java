//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int totalEstudiante = 0;
        int cantAlumDestacados = 0;
        double[] notasEstudiante = {7.5, 4.0, 8.5, 2.5, 6.0, 9.5, 5.5, 3.0, 10.0, 7.0};
        int cantAprobados = 0 ;
        int cantDesaprobados = 0;
        double notaMasAlta =  notasEstudiante[0];
        double notaMasBaja = notasEstudiante[0];
        double sumaNotas = 0;
        int cantEstudianteNotaSuperior =  0 ;
        for (int i = 0; i < notasEstudiante.length; i++) {
            System.out.println("----- UNIVERSIDAD -----");
            System.out.println("Estudiante : " + (i + 1));
            System.out.println("Nota : " + notasEstudiante[i]);
            System.out.println("Estado : " + estudianteAprobado(notasEstudiante[i]));

            System.out.println("---");

            totalEstudiante += 1;
            cantAlumDestacados +=  alumnosDestacados(notasEstudiante[i]);
            if(notasEstudiante[i]>=6){
                cantAprobados +=1;
            }else{
                cantDesaprobados +=1;
            }
            if(notasEstudiante[i]>notaMasAlta){
                notaMasAlta=notasEstudiante[i];
            }
            if(notasEstudiante[i]<notaMasBaja){
                notaMasBaja=notasEstudiante[i];
            }

            if (notasEstudiante[i]>=8){
                cantEstudianteNotaSuperior +=1;
            }
            double promedioGeneral = sumaNotas / notasEstudiante.length;
            sumaNotas += notasEstudiante[i];
            if (notasEstudiante[i] > promedioGeneral) {
                cantEstudianteNotaSuperior++;
            }
        }

        System.out.println("----- RESUMEN DEL CURSO -----\n");
        System.out.println("Total estudiantes: " + totalEstudiante);
        System.out.println("Aprobados: " + cantAprobados);
        System.out.println("Desaprobado: " + cantDesaprobados);
        System.out.println("Alumnos Destacados: " + cantAlumDestacados);
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja " + notaMasBaja);
        System.out.println("Estudiantes por encima del promedio:" + cantEstudianteNotaSuperior);

    }

    public static String estudianteAprobado( double nota){
        if (nota >= 6) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }

    public static int alumnosDestacados (double nota){
        int cantDestacados = 0;
        if (nota >= 8){
            cantDestacados += 1;
        }
        return cantDestacados;
    }
}