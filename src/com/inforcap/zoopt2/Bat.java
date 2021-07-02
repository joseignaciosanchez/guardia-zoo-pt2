package com.inforcap.zoopt2;

public class Bat extends Mammal{
	
	public Bat() {
		super();
	}

	public void fly() {
		if(getEnergyLevel() >= 50) {
			System.out.println("Muci�lago vuela...");
			System.out.println("Slip! Slip! Slip!");
			System.out.println("Energ�a "+getDecremEnergia());
			setEnergyLevel(getEnergyLevel()+getDecremEnergia());
		}else {
			System.out.println("Murcielago no cuenta con suficiente energ�a para volver a volar");
		}
	}
	
	public void eatHumans() {
		System.out.println("Muci�lago come humano y dice: 'Bueno, no importa'...");
		System.out.println("Energ�a +"+getAumentEnergia());
		getEnergyLevel();
		setEnergyLevel(getEnergyLevel()+getAumentEnergia());
	}
	
	public void attackTown() {
		System.out.println("Murci�lago ataca ciudad...");
		System.out.println("Bloom Classhhhhh! ssshhhhh! Classhhhhh!");
		System.out.println("Energ�a "+getDecremEnergia()*2);
		getEnergyLevel();
		setEnergyLevel(getEnergyLevel()+getDecremEnergia()*2);
	}
}
