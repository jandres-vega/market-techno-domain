package com.store.marketTechno.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "id_cliente")
    private String idCliente;
    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;
}
