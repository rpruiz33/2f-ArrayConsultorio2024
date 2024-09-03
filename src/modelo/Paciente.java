package modelo;

public class Paciente {
private String nombre;
private String apellido;
private float estatura;
private float peso;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public float getEstatura() {
	return estatura;
}
public void setEstatura(float estatura) {
	this.estatura = estatura;
}
public float getPeso() {
	return peso;
}
public void setPeso(float peso) {
	if(peso>0) {
	this.peso = peso;
}
}
public Paciente(String nombre, String apellido, float estatura, float peso) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.estatura = estatura;
	setPeso(peso);
}

public Paciente() {
	super();
}
public String traerNombreCompleto() {
	return("el nombre completo es "+ nombre+" "+apellido);
}

}
