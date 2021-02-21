package com.mycompany.tarea1;

public class Universidad {
    private String Nombre;
    private String Direccion;
    private String Tipo;
    private int Telefono;
    private double Extension;
    private Facultad[] Facultades;

    public Universidad(String Nombre, String Direccion, String Tipo, int Telefono, double Extension) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Tipo = Tipo;
        this.Telefono = Telefono;
        this.Extension = Extension;
        this.Facultades = new Facultad[2];
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public double getExtension() {
        return Extension;
    }

    public void setExtension(double Extension) {
        this.Extension = Extension;
    }

    public Facultad[] getFacultades() {
        return Facultades;
    }

    public void setFacultades(Facultad[] Facultades) {
        this.Facultades = Facultades;
    }

    public String obtenerInformacion(){
        int facultad = 1;
        String informacion = "Universidad: "+Nombre+" Direccion: "+Direccion+" Tipo: " +Tipo+ " Tel: " +Telefono+ " Ext: " +Extension+ "\n";
        int contador = 1;
        for (Facultad Facultad : Facultades) {
            if(Facultad != null){
                System.out.println("Info de "+Facultad+"-----------------------------");
                informacion += Facultad.obtenerInformacion(0);
            }else{
                if (facultad == 1){
                    boolean Registrado = false;
                    if((Facultad == null) && (!Registrado)){
                        Facultad Una = new Facultad("Ingeniería", "Pepito 1", 1101, 5890011);
                        System.out.println("Facultad Ingeniería creada.");
                        Una.registrarEscuelas(1);
                        Facultad = Una;
                        Registrado = true;
                        informacion += Una.obtenerInformacion(1);
                        facultad = facultad +1;
                    }
                }else{
                    boolean Registrado = false;
                    if((Facultad == null) && (!Registrado)){
                        Facultad Dos = new Facultad("Derecho", "Pepito 2", 1121, 5890021);
                        System.out.println("Facultad Derecho creada.");
                        Dos.registrarEscuelas(2);
                        Facultad = Dos;
                        Registrado = true;
                        informacion += Dos.obtenerInformacion(2);
                    }
                }
            }
        }
        return informacion;
    }
}

