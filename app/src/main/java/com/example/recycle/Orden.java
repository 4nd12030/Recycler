package com.example.recycle;

public class Orden {
    private String noOrden;
    private String idEmpleado;
    private String fecha;

    public Orden(String noOrden, String idEmpleado, String fecha) {
        this.noOrden = noOrden;
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
    }

    public String getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(String noOrden) {
        this.noOrden = noOrden;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
