package com.mycompany.tarea1;

public class Profesor {
    private String Nombre;
    private String Correo;

    public Profesor(String Nombre, String Correo) {
        this.Nombre = Nombre;
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public String obtenerInformacion(){
        String informacion = "Nombre: "+Nombre+" Correo: "+Correo+"\n";
        return informacion;
    }
}
