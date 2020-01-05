package lesson4;

public class Person {
	private String name;
	private int age;
	private int ID;
	private String gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person(String name, int age, int ID, String gender) {
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.gender = gender;
	}
}
