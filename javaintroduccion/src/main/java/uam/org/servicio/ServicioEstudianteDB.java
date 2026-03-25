package uam.org.servicio;

import uam.org.config.Global;
import uam.org.model.Estudiante;

public class ServicioEstudianteDB {
    public static Estudiante insertarEstudiante(Estudiante estudiante)
    {
        Global.listaEstudiante.add(estudiante);
        return estudiante;
    }
    public static void listarEstudiante (){
        for(Estudiante estudiante : Global.listaEstudiante){
            System.out.println(estudiante);
        }
    }

    public static void actualizarEstudiante(Estudiante estudiante){
        for (int i=0; i < Global.listaEstudiante.size();i++){
            Estudiante estudiante1 = Global.listaEstudiante.get(i);

            if(estudiante.equals(estudiante)){
                estudiante1.setNombre(estudiante.getNombre());
                estudiante1.setApellido(estudiante.getApellido());
                estudiante1.setCif( estudiante.getCif());
                estudiante1.setCorreo(estudiante.getCorreo());

            }
        }
    }
}
