package sample;

public class Sample2 extends Sample1 {
	public Sample2() {
		System.out.println("Child constructor");
	}
	public void m2() {
		System.out.println("m2 from child");
	}
	@Override
	public void m1() {
		super.m1();
		System.out.println("m1 from parent in child");
	}
}
