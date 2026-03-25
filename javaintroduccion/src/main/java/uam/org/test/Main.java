package uam.org.test;

import uam.org.model.Estudiante;
import uam.org.model.EstudianteBecado;
import uam.org.servicio.ClaseBecaA;
import uam.org.servicio.ClaseBecaB;
import uam.org.servicio.ServicioEstudiante;
import uam.org.servicio.ServicioEstudianteDB;

public class Main {


    public static void main(String[] args) {

        Estudiante estudiante = new EstudianteBecado("24014111",
                "Jose", "Carvallo", "jcherrera@uamv.edu.ni", 90.00);

        Double beca = estudiante.calcularBeca();

        /*Estudiante estudiante = new Estudiante("2401411","jose","carvallo","jcherra@uamv.edu.ni",90.00);
        ServicioEstudianteDB.insertarEstudiante(estudiante);

        Estudiante estudiante1 = new Estudiante("2501211","rene","marcelo","rene@uamv.edu.ni",80.00);
        ServicioEstudianteDB.insertarEstudiante(estudiante1);
        ServicioEstudianteDB.listarEstudiante();

        calcularBeca(estudiante);
        EstudianteBecado becado = (EstudianteBecado) new Estudiante();
        becado.calcularBeca();*/

    }

    public static void calcularBeca(Estudiante estudiante){
        if(estudiante.getPromedio() >= 90){
            System.out.println("Su beca es: " + ServicioEstudiante.calcularBeca
                    (new ClaseBecaA(),estudiante));
        }

        if(estudiante.getPromedio() >= 80){
            System.out.println("Su beca es: " + ServicioEstudiante.calcularBeca
                    (new ClaseBecaB(),estudiante));
        }


    }



}
