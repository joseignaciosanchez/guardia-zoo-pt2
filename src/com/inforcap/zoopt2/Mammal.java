package com.inforcap.zoopt2;

public class Mammal {
	
	private Integer energyLevel = 300;
	private Integer decremEnergia = -50;
	private Integer aumentEnergia = 25;
	
	public void displayEnergy() {
		System.out.println("Energía Total: "+energyLevel);
	}

	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}

	public Integer getDecremEnergia() {
		return decremEnergia;
	}

	public void setDecremEnergia(Integer decremEnergia) {
		this.decremEnergia = decremEnergia;
	}

	public Integer getAumentEnergia() {
		return aumentEnergia;
	}

	public void setAumentEnergia(Integer aumentEnergia) {
		this.aumentEnergia = aumentEnergia;
	}

}
