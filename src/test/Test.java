package test;

import modelo.Medico;
import modelo.Paciente;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente p1=new Paciente("rigoberto", "Manzanero", 178.5f, 121.2f);
		Paciente p2=new Paciente("Filiberto", "Juanez", 164.4f, 88.2f);
		Paciente p3=new Paciente("Margarita", "Rosales", 0.4f,  0.2f);
		Paciente p4=new Paciente("ESteban ","Quito", 0.1f,  0.1f);
		
		Paciente[] pacientesFrecuentes={p1,p2,p3,p4};
		Medico m=new Medico("Jorge", "Araujo", "psiquiatria", pacientesFrecuentes);
		System.out.println("\n---------------calulando IMC del paciete x------------");
		System.out.println(m.calcularImc(p1));
		System.out.println("\n----trayedo peso promedio de todos los pacientes------");
		System.out.println(m.traerPromedioPeso());
		System.out.println("\n----trayedo paciente mayor estatura ------------------");
		System.out.println(m.traerMayorEstatura().traerNombreCompleto());
		System.out.println("\n----trayedo menor IMC de todos los pacientes ---------");
		System.out.println(m.traerMenorIMC().traerNombreCompleto());
	}

}
