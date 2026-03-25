package uam.org.model;

public class EstudianteBecado extends Estudiante {
    public EstudianteBecado(String cif, String nombre, String apellido, String correo, Double promedio) {
        super(cif, nombre, apellido, correo, promedio);
    }

    public EstudianteBecado(Double promedio){
        super(promedio);
    }

    @Override
    public Double calcularBeca() {
        return 0.5;
    }


}

