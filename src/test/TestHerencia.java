package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author lreye
 */
public class TestHerencia {
    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Luis", 5000.0);
//        System.out.println("empleado1 = " + empleado1);

        Cliente cliente = new Cliente(new Date(), true, "Fernando", 'M', 31, "Guatemala");
        System.out.println("cliente = " + cliente);
    }
    
}
