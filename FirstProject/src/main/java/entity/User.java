package entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class User {

	private int id;
	
	@Pattern(regexp="[A-Za-z]{4,15}+", message="Klaidingai ivesta grupe!")
	private String grupe;
	
	@Pattern(regexp="[A-Za-z]{4,15}+", message="Klaidingai ivestas pavadinimas!")
	private String pavadinimas;
	
	@Max(value = 9999, message = "Kalorijos negali virsyti 9999!")
	private int kalorijos;
	private double kaina;
	
//	@Pattern(regexp="[A-Za-z]{5,15}+", message="Klaidingai ivestas pavadinimas!")
//	private String name;
//
//	@Min(value = 1900, message = "Metai turi buti ne mazesni kaip 1900-ieji")
//	@Max(value = 2019, message = "Metai turi buti ne didesni kaip 2019-ieji")
//	private int year;
//	
//	@Pattern(regexp="[A-Za-z]{5,15}+", message="Klaidingai ivestas modelis!")
//	private String model;
//	
//	@Pattern(regexp="[A-Za-z]+", message="Klaidingai ivestas tipas!")
//	private String type;
//	
//	@Pattern(regexp="[A-Za-z]+", message="Klaidingai ivestas pavaru dezes tipas!")
//	private String transmission;

	
	public User () {
	}

	public User(int id, String grupe, String pavadinimas, int kalorijos, double kaina) {
		this.id = id;
		this.grupe = grupe;
		this.pavadinimas = pavadinimas;
		this.kalorijos = kalorijos;
		this.kaina = kaina;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrupe() {
		return grupe;
	}

	public void setGrupe(String grupe) {
		this.grupe = grupe;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public int getKalorijos() {
		return kalorijos;
	}

	public void setKalorijos(int kalorijos) {
		this.kalorijos = kalorijos;
	}

	public double getKaina() {
		return kaina;
	}

	public void setKaina(double kaina) {
		this.kaina = kaina;
	}


}






//package entity;
//
//import javax.validation.constraints.Min;
//import javax.validation.constraints.Pattern;
//
//public class User {
//	
//	private int id;
//
//	@Pattern(regexp="[A-Za-z]{5,15}+", message="Klaidingai ivestas vardas!")
//	private String name;
//
//	@Pattern(regexp=".+@.+\\..+", message="Klaidingai ivestas el. pastas!")
//	private String email;
//	
//	@Min(value = 18, message = "Amzius turi buti ne mazesnis kaip 18m.")
//	private int age;
//
//	public User() {
//	}
//
//	public User(int id, String name, String email, int age) {
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.age = age;
//	}
//
//	public int getId() {
//		return id;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//}
