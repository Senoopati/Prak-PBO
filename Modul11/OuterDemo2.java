package Modul11;

public class OuterDemo2 {
	private int num = 175;
	public class Inner_Demo{
	public int getNum(){
		System.out.println("Ini adalah nilai dari variable private outerDemo");
		return num;
		}
	}
}
