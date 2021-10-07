package Modul11;

public class OuterDemoMain {
	public static void main(String[] args) {
		OuterDemo2 ot = new OuterDemo2();
		OuterDemo2.Inner_Demo in = ot.new Inner_Demo();
		System.out.println(in.getNum());
	}

}
