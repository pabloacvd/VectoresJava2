package ar.com.xeven;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Materia java = new Materia();

        List<Alumna> alumnasJava = java.getAlumnas();

        System.out.println("Cantidad de alumnas en java: "+alumnasJava.size());

        for(int contador = 0; contador < alumnasJava.size(); contador++){
            Alumna alumna = alumnasJava.get(contador);
            System.out.println("El promedio de "+alumna.getNombre()+" es "+alumna.getPromedio());
        }
    }
}
