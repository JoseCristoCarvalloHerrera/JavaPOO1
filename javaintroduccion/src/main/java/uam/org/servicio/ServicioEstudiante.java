package uam.org.servicio;

import uam.org.model.Estudiante;

public class ServicioEstudiante {

    private String calificacion;

    public static Double calcularBeca(InterfaceEstrategiaBeca estrategia, Estudiante estudiante) {

        return estrategia.calcularBeca(estudiante);



    }
}
