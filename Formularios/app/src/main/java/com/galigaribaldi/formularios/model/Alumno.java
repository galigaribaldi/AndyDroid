package com.galigaribaldi.formularios.model;

public class Alumno {
    private String nombre;
    private String matricula;

    private boolean status;
    private int edad;
    private String sexo;

    private String carrera;
    private String lugarNacimiento;
    private String fechaNacimiento;

    public Alumno(String nombre, String matricula, boolean status, int edad, String carrera, String lugarNacimiento, String fechaNacimiento) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.status = status;
        this.edad = edad;
        this.carrera = carrera;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }


    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

}
