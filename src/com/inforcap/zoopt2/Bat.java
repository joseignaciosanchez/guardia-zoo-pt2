package com.inforcap.zoopt2;

public class Bat extends Mammal{
	
	public Bat() {
		super();
	}

	public void fly() {
		if(getEnergyLevel() >= 50) {
			System.out.println("Muciélago vuela...");
			System.out.println("Slip! Slip! Slip!");
			System.out.println("Energía "+getDecremEnergia());
			setEnergyLevel(getEnergyLevel()+getDecremEnergia());
		}else {
			System.out.println("Murcielago no cuenta con suficiente energía para volver a volar");
		}
	}
	
	public void eatHumans() {
		System.out.println("Muciélago come humano y dice: 'Bueno, no importa'...");
		System.out.println("Energía +"+getAumentEnergia());
		getEnergyLevel();
		setEnergyLevel(getEnergyLevel()+getAumentEnergia());
	}
	
	public void attackTown() {
		System.out.println("Murciélago ataca ciudad...");
		System.out.println("Bloom Classhhhhh! ssshhhhh! Classhhhhh!");
		System.out.println("Energía "+getDecremEnergia()*2);
		getEnergyLevel();
		setEnergyLevel(getEnergyLevel()+getDecremEnergia()*2);
	}
}
