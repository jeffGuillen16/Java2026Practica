import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Empleado>empleado=new ArrayList<>();
        empleado.add(new Desarrollador());
        empleado.add(new Gerente());
        empleado.add(new Diseñador());
        for (Empleado e : empleado ){
            e.trabajar();
        }
    }

}