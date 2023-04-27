package com.PeluqueriaWeb.Master.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(schema = "ClientesPeluqueria")
public class Clientes {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Getter @Setter
    private String nombre;

    @Column
    @Getter @Setter
    private String apellido;


    public Clientes() {
    }

    public Clientes(Long id, String nombre, String apellido, Date subscripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;

    }

    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }


}
