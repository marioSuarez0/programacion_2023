package javaucjc.ProgramacionOrientadaObjetos.encapsulacion.ejercicio;

public class Coches {

	public static void main(String[] args) {
	
		Piston piston1 = new Piston(1, "MarcaPistón1");
		Motor motor1 = new Motor("MarcaMotor1", 120, piston1);
		Volante volante1 = new Volante(1, "Tipo1", "Color1");
		Coche coche1 = new Coche("Marca1", "Matrícula1", motor1, volante1, 0);
		
		System.out.println(coche1.getMatrícula());
		System.out.println(coche1.getVolante().getColor());
		System.out.println(coche1.getMotor().getPistones().getIdPiston());
		
		double velocidad = Math.random()*120;
		
		System.out.println(Math.random()*120);
		coche1.setVelocidad(velocidad);
		
		coche1.conducir();
		
		
		Piston piston2 = new Piston(2, "MarcaPistón2");
		Motor motor2 = new Motor("MarcaMotor2", 2, piston2);
		Volante volante2 = new Volante(2, "Tipo2", "Color2");
		Coche coche2 = new Coche("Marca2", "Matrícula2", motor2, volante2, 0);
	}

}
