package com.mycompany.tarea1;

public class Escuela {
    private String Nombre;
    private int NoOficina;
    private int Telefono;
    private String Director;
    private Profesor[] Profesores;

    public Escuela(String Nombre, int NoOficina, int Telefono, String Director) {
        this.Nombre = Nombre;
        this.NoOficina = NoOficina;
        this.Telefono = Telefono;
        this.Director = Director;
        this.Profesores = new Profesor[2];
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNoOficina() {
        return NoOficina;
    }

    public void setNoOficina(int NoOficina) {
        this.NoOficina = NoOficina;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Profesor[] getProfesores() {
        return Profesores;
    }

    public void setProfesores(Profesor[] Profesores) {
        this.Profesores = Profesores;
    }
    
    public void registrarProfesores(int facultad, int escuela){
        if (facultad == 1){
            if(escuela == 1){
                boolean Registrado1 = false;
                boolean Registrado2 = false;
                for(Profesor Profesor : Profesores){
                    if(Profesor == null && !Registrado1){
                        Profesor nuevo = new Profesor("Profe 1", "profe@software.com");
                        Profesor = nuevo;
                        Registrado1 = true;
                        System.out.println("Profe 1 software creado.");
                    }
                    if(Profesor == null && !Registrado2){
                        Profesor nuevo = new Profesor("Profe 2", "profe@software.com");
                        Profesor = nuevo;
                        Registrado2 = true;
                        System.out.println("Profe 2 software creado.");
                    }
                }
            }else{
                boolean Registrado1 = false;
                boolean Registrado2 = false;
                for(Profesor Profesor : Profesores){
                    if(Profesor == null && !Registrado1){
                        Profesor nuevo = new Profesor("Profe 1", "profe@Informatica.com");
                        Profesor = nuevo;
                        Registrado1 = true;
                        System.out.println("Profe 1 Informatica creado.");
                    }
                    if(Profesor == null && !Registrado2){
                        Profesor nuevo = new Profesor("Profe 2", "profe@Informatica.com");
                        Profesor = nuevo;
                        Registrado2 = true;
                        System.out.println("Profe 2 Informatica creado.");
                    }
                }
            }
        }else{
            if(escuela == 1){
                boolean Registrado1 = false;
                boolean Registrado2 = false;
                for(Profesor Profesor : Profesores){
                    if(Profesor == null && !Registrado1){
                        Profesor nuevo = new Profesor("Profe 1", "profe@Leyes.com");
                        Profesor = nuevo;
                        Registrado1 = true;
                        System.out.println("Profe 1 Leyes creado.");
                    }
                    if(Profesor == null && !Registrado2){
                        Profesor nuevo = new Profesor("Profe 2", "profe@Leyes.com");
                        Profesor = nuevo;
                        Registrado2 = true;
                        System.out.println("Profe 2 Leyes creado.");
                    }
                }
            }else{
                boolean Registrado1 = false;
                boolean Registrado2 = false;
                for(Profesor Profesor : Profesores){
                    if(Profesor == null && !Registrado1){
                        Profesor nuevo = new Profesor("Profe 1", "profe@Normas.com");
                        Profesor = nuevo;
                        Registrado1 = true;
                        System.out.println("Profe 1 Normas creado.");
                    }
                    if(Profesor == null && !Registrado2){
                        Profesor nuevo = new Profesor("Profe 2", "profe@Normas.com");
                        Profesor = nuevo;
                        Registrado2 = true;
                        System.out.println("Profe 2 Normas creado.");
                    }
                }
            }
        }
    }

    public String obtenerInformacion(int facultad, int escuela){
        String informacion = "Escuela: "+Nombre+" Director: "+Director+" Oficina: " +NoOficina+ " Tel: " +Telefono+ "\n";
        boolean Registrado1 = false;
        boolean Registrado2 = false;
        boolean Registrado3 = false;
        boolean Registrado4 = false;
        boolean Registrado5 = false;
        boolean Registrado6 = false;
        boolean Registrado7 = false;
        boolean Registrado8 = false;
        for (Profesor Profesor : Profesores) {
            if(Profesor != null){
                informacion += Profesor.obtenerInformacion();
            }else{
                if (facultad == 1){
                    if(escuela == 1){
                        if(Profesor == null && !Registrado1){
                            Profesor nuevo = new Profesor("Profe 1", "profe@software.com");
                            Profesor = nuevo;
                            Registrado1 = true;
                            informacion += nuevo.obtenerInformacion();
                            System.out.println("Profe 1 software creado.");
                        }
                        if(Profesor == null && !Registrado2){
                            Profesor nuevo = new Profesor("Profe 2", "profe@software.com");
                            Profesor = nuevo;
                            Registrado2 = true;
                            informacion += nuevo.obtenerInformacion();
                            System.out.println("Profe 2 software creado.");
                        }
                    }else{
                        if(Profesor == null && !Registrado3){
                            Profesor nuevo = new Profesor("Profe 1", "profe@Informatica.com");
                            Profesor = nuevo;
                            Registrado1 = true;
                            informacion += nuevo.obtenerInformacion();
                            System.out.println("Profe 1 Informatica creado.");
                        }
                        if(Profesor == null && !Registrado4){
                            Profesor nuevo = new Profesor("Profe 2", "profe@Informatica.com");
                            Profesor = nuevo;
                            Registrado2 = true;
                            informacion += nuevo.obtenerInformacion();
                            System.out.println("Profe 2 Informatica creado.");
                        }
                    }
                }else{
                    if(escuela == 1){
                        if(Profesor == null && !Registrado5){
                            Profesor nuevo = new Profesor("Profe 1", "profe@Leyes.com");
                            Profesor = nuevo;
                            Registrado1 = true;
                            informacion += nuevo.obtenerInformacion();
                            System.out.println("Profe 1 Leyes creado.");
                        }
                        if(Profesor == null && !Registrado6){
                            Profesor nuevo = new Profesor("Profe 2", "profe@Leyes.com");
                            Profesor = nuevo;
                            Registrado2 = true;
                            informacion += nuevo.obtenerInformacion();
                            System.out.println("Profe 2 Leyes creado.");
                        }
                    }else{
                        if(Profesor == null && !Registrado7){
                            Profesor nuevo = new Profesor("Profe 1", "profe@Normas.com");
                            Profesor = nuevo;
                            Registrado1 = true;
                            informacion += nuevo.obtenerInformacion();
                            System.out.println("Profe 1 Normas creado.");
                        }
                        if(Profesor == null && !Registrado8){
                            Profesor nuevo = new Profesor("Profe 2", "profe@Normas.com");
                            Profesor = nuevo;
                            Registrado2 = true;
                            informacion += nuevo.obtenerInformacion();
                            System.out.println("Profe 2 Normas creado.");
                        }
                    }
                }
            }
        }
        return informacion;
    }
}
