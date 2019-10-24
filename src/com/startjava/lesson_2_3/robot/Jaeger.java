package com.startjava.lesson_2_3.robot;

public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;
	
	Jaeger(float height, float weight, int speed, int strength) {
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		modelName = "unnamed";
		mark = "unknown";
		origin = "unknown";
		armor = 0;
	}

	Jaeger(String modelName, float height, float weight, int speed) {
		this.modelName = modelName;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		mark = "unknown";
		origin = "unknown";
		strength = 0;
		armor = 0;
	}


	Jaeger(String modelName, float height, float weight, int speed, int strength) {
		this.modelName = modelName;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		mark = "unknown";
		origin = "unknown";
		armor = 0;
	}

	Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("Weight cannot be 0 or lower");	
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		if (strength > 0) {
			this.strength = strength;
		} else {
			System.out.println("Strength cannot be 0 or lower");
		}
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		if (armor >= 0) {
			this.armor = armor;
		} else {
			System.out.println("Armor cannot be lower than 0");
		}
	}

	public boolean drift() {
		System.out.println(modelName + " is drifting...");
		return true;
	}

	public void move() {
		System.out.println(modelName + "is moving somewhere...");
	}

	public String scanKaiju() {
		System.out.println(modelName + ": nothing around");
		return "Nothing";
	}

	public void useVortexCannon() {
		System.out.println(modelName + ": BOOM!");
	}
}