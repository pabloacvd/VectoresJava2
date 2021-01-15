package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private List<Alumna> alumnas;

    public Materia(){
        alumnas = new ArrayList<>();
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(4);
        notas.add(6);
        notas.add(1);
        Alumna alumna1 = new Alumna("Alba",notas);
        alumnas.add(alumna1);
        ArrayList<Integer> notas2 = new ArrayList<>();
        notas2.add(8);
        notas2.add(10);
        notas2.add(5);
        Alumna alumna2 = new Alumna("Caro", notas2);
        alumnas.add(alumna2);
    }

    public List<Alumna> getAlumnas(){
        return alumnas;
    }
}
