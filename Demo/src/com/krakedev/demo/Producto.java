package com.krakedev.demo;

public class Producto {
private int Codigo;
private String Nombre;
private String Descripcion;
private double Peso;

public Producto(int Codigo, String Nombre) {
	this.Codigo = Codigo;
	this.Nombre = Nombre;	
}

public int getCodigo() {
	return Codigo;
}
public void setCodigo (int Codigo) {
	this.Codigo = Codigo;
}

public String getNombre () {
	return Nombre;
}
public void setNombre(String Nombre) {
	this.Nombre = Nombre;
}

public String getDescripcion () {
	return Descripcion;
}
public void setDescripcion(String Descripcion) {
	this.Descripcion = Descripcion;
}

public double getPeso () {
	return Peso;
}
public void setPeso (double Peso) {
	this.Peso = Peso;
}


}
