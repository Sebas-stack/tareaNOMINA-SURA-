package org.example;

import org.example.MODELOS.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("SEGUROS SURA");
        System.out.println("***********************************");
        System.out.println("\n BIENVENIDO!!!");

        Scanner lea = new Scanner(System.in);

        Empleado empleado1 = new Empleado();
        Empleado empleado = new Empleado(1L,"sebastian","Gutierez",LocalDate.of(2000,9,26),"1001660099","Asistente Software",LocalDate.of(2024,6,10),"Sin Experiencia","Backend","soltero",false,"piso 2","hermana","minimo","del riO");
        System.out.println(empleado);

        Area area = new Area();
        Area areaDos= new Area(1L,"piso 2","Sebastian","Parque del rio","minimo","cra 35 58 40",80,"Lunes a viernes","Backend","app");
        System.out.println(areaDos);

        Beneficiario beneficiario = new Beneficiario();
        Beneficiario beneficiarioDos = new Beneficiario(5L,"daniela","1001660022",LocalDate.of(2024,2,26),"femenino","31112655410","sebasgut@gmail.com","carrera 32","hermana","1");
        System.out.println(beneficiarioDos);

        Sucursal surcursal = new Sucursal();
        Sucursal sucursalDos = new Sucursal(4L,"Del rio","Avenida 80","colombia","3112555401","sura@gmail.com","lunes a viernes","54110","sebastian","minimo");
        System.out.println(sucursalDos);

        Nomina nomina = new Nomina();
        Nomina nominaDos = new Nomina(10L,"Area de pagos",100000,"sebastian","parque del rio","cuarto piso",LocalDate.of(2024,4,30),"paga","Asistente de software","prima");
        System.out.println(nominaDos);

        System.out.println("\n \n ************************* Datos del empleado *****************************");

        System.out.println("Digite el id: ");
        empleado.setId(lea.nextLong());

        System.out.println("Digite el nombre del empleado: ");
        empleado.setNombre(lea.next());

        System.out.println("Digite el apellido del empleado: ");
        empleado.setApellido(lea.next());

        System.out.println("Digite el cargo del empleado: ");
        empleado.setCargo(lea.next());

        System.out.println("Digite las habilidades del empleado: ");
        empleado.setHabilidades(lea.next());

        System.out.println("Digite el estado cicil del empleado: ");
        empleado.setEstadoCilvil(lea.next());

        System.out.println("Digite el area del empleado: ");
        empleado.setArea(lea.next());

        System.out.println("Digite el beneficiario del empleado: ");
        empleado.setBeneficiario(lea.next());

        System.out.println("Digite la nomina del empleado: ");
        empleado.setNomina(lea.next());

        System.out.println("Digite la fecha de ingreso");
        LocalDate.now();




    }
}