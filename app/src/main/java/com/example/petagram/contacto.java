package com.example.petagram;

import java.util.Date;

public class contacto {
    private  String nombre;
    private  String phone;
    private  String email;
    private  String detalles;
    private  Date   fecha;

    public contacto(String nombre, String phone) {
        this.nombre = nombre;
        this.phone = phone;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
