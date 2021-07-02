package com.inforcap.zoopt2;

public class BatTest {

	public static void main(String[] args) {
		
		Bat murcielago = new Bat();
		
		murcielago.attackTown();
		murcielago.attackTown();
		murcielago.attackTown();
		murcielago.displayEnergy();
		
		murcielago.eatHumans();
		murcielago.eatHumans();
		murcielago.displayEnergy();
		
		murcielago.fly();
		murcielago.fly();	
		murcielago.displayEnergy();
	}

}
