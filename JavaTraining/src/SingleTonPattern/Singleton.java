package SingleTonPattern;

public class Singleton {

	// In oop , Singleton class is Class that can have only one object.(instance of
	// the
	// class)
	// How to Design Singleton Class.
	// 1. Make Constuctor is Private
	// 2. write Static method that has Return type of object of this Singleton
	// Class(Lazy Initialization).
	// for nomal class we use Constructor whereas for Singleton Class we use
	// GetInstance() Method for instantial

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "Hey I am using Singleton Class Pattern";
	}

	public static Singleton getInstance() {

		if (singleton_instance == null) {
			singleton_instance = new Singleton();

		}
		return singleton_instance;
	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
