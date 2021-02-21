package com.mycompany.tarea1;

public class Facultad {
    private String Nombre;
    private String NombreDecano;
    private int Oficina;
    private int Telefono;
    private Escuela[] Escuelas;

    public Facultad(String Nombre, String NombreDecano, int Oficina, int Telefono) {
        this.Nombre = Nombre;
        this.NombreDecano = NombreDecano;
        this.Oficina = Oficina;
        this.Telefono = Telefono;
        this.Escuelas = new Escuela[2];
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreDecano() {
        return NombreDecano;
    }

    public void setNombreDecano(String NombreDecano) {
        this.NombreDecano = NombreDecano;
    }

    public int getOficina() {
        return Oficina;
    }

    public void setOficina(int Oficina) {
        this.Oficina = Oficina;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Escuela[] getEscuelas() {
        return Escuelas;
    }

    public void setEscuelas(Escuela[] Escuelas) {
        this.Escuelas = Escuelas;
    }
    
    public String obtenerInformacion(int facultad){
        String informacion = "Facultad: "+Nombre+" Decano: "+NombreDecano+" Oficina: " +Oficina+ " Tel: " +Telefono+ "\n";
        boolean Registrado1 = false;
        boolean Registrado2 = false;
        boolean Registrado3 = false;
        boolean Registrado4 = false;
        for (Escuela Escuela : Escuelas) {
            if(Escuela != null){
                informacion += Escuela.obtenerInformacion(0,0) + "\n";
            }else{
                if (facultad == 1){
                    if((Escuela == null) && (!Registrado1)){
                        Escuela Esc = new Escuela("Software", 1103, 5890013, "Juanita");
                        System.out.println("Escuela software creada.");
                        informacion += Esc.obtenerInformacion(1,1) + "\n";
                        Escuela = Esc;
                        Registrado1 = true;
                    }
                    if((Escuela == null) && (!Registrado2)){
                        Escuela Esc = new Escuela("Informatica", 1104, 5890014, "Juanita2");
                        System.out.println("Escuela informatica creada.");
                        informacion += Esc.obtenerInformacion(1,2) + "\n";
                        Escuela = Esc;
                        Registrado2 = true;
                    }
                    
                }else if(facultad == 2){
                    if((Escuela == null) && (!Registrado3)){
                        Escuela Esc = new Escuela("Leyes", 1123, 5890023, "Amanda");
                        System.out.println("Escuela leyes creada.");
                        informacion += Esc.obtenerInformacion(2,1) + "\n";
                        Escuela = Esc;
                        Registrado3 = true;
                    }
                    if((Escuela == null) && (!Registrado4)){
                        Escuela Esc = new Escuela("Normas", 1104, 5890014, "Amanda2");
                        System.out.println("Escuela normas creada.");
                        informacion += Esc.obtenerInformacion(2,2) + "\n";
                        Escuela = Esc;
                        Registrado4 = true;
                    }
                }
            }
        }
        return informacion;
    }
}


/* Desarrollado por:
    Juan Diego López Botero
    Hamilton Andrés Echeverri Guzmán
*/
