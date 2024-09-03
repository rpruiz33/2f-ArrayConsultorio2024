package modelo;

import modelo.Paciente;

public class Medico {
private String nombre;
private String apellido;
private String especialidad;
private Paciente[] pacienteFrecuente;


public String getNombre() {
	return nombre;
}

public String getApellido() {
	return apellido;
}

public String getEspecialidad() {
	return especialidad;
}

public Paciente[] getPacienteFrecuente() {
	return pacienteFrecuente;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}

public void setPacienteFrecuente(Paciente[] pacienteFrecuente) {
	this.pacienteFrecuente = pacienteFrecuente;
}


public Medico(String nombre, String apellido, String especialidad, Paciente[] pacienteFrecuente) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.especialidad = especialidad;
	this.pacienteFrecuente = pacienteFrecuente;
}

public float calcularImc(Paciente paciente) {
	
	return (float) (paciente.getPeso()/(Math.pow(paciente.getEstatura(),2)));
}

public double traerPromedioPeso() {
	double promedio=0;
	for (int i=0;i<pacienteFrecuente.length;i++) {
		promedio+=pacienteFrecuente[i].getPeso();
	}
	return promedio/pacienteFrecuente.length;
}

public Paciente traerMayorEstatura() {
	Paciente max=new Paciente();
 max=pacienteFrecuente[0];

	for (int i=1;i<pacienteFrecuente.length;i++) {
	if(pacienteFrecuente[i].getEstatura()>max.getEstatura()) {
		max=pacienteFrecuente[i];
	}
	
	}
	return max;
}

public Paciente traerMenorIMC() {
	double IMC=0;
	Paciente menore=new Paciente();
	double menor=calcularImc(pacienteFrecuente[0]);
	for (int i=0;i<pacienteFrecuente.length;i++) {
	    IMC=calcularImc(pacienteFrecuente[i]);
	if(menor<IMC) {
	menor=IMC;
	menore=pacienteFrecuente[i];
	}
	}
	
	return menore;
	}
}


