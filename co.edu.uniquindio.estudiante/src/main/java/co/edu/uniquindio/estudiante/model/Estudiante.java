package co.edu.uniquindio.estudiante.model;

public class Estudiante {
    public String nombre;
    public int edad;
    public String correo;
    public int semestre;
    public float nota1;
    public float nota2;
    public float nota3;

//Métodos getter.
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getCorreo() {
        return this.correo;
    }
    public int getSemestre() {
        return this.semestre;
    }
    public float getNota1() {
        return this.nota1;
    }
    public float getNota2() {
        return this.nota2;
    }
    public float getNota3() {
        return this.nota3;
    }

//Métodos setter.


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public static void main (String[] args)
    {
        System.out.println ("Vamos a morir");
    }

}
