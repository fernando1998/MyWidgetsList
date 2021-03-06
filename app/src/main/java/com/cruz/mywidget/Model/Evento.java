package com.cruz.mywidget.Model;

/**
 * Created by keving on 3/12/2017.
 */

public class Evento {

    private Integer id;
    private String created_at;
    private String nombre;
    private String mensaje;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", created_at='" + created_at + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
