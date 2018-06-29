package com.example.ramon.animelist;

public class Anime {

    private String Nombre;
    private String Descripcion;
    private String clasificacion;
    private int num_episodios;
    private String categorias;
    private String estudio;
    private String imagen;

    public Anime(){

    }

    public Anime(String nombre, String descripcion, String clasificacion, int num_episodios, String categorias, String estudio, String imagen) {
        Nombre = nombre;
        Descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.num_episodios = num_episodios;
        this.categorias = categorias;
        this.estudio = estudio;
        this.imagen = imagen;
    }


}
