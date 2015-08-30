import java.util.Scanner;

public class Teclado {

	Scanner tc=new Scanner(System.in);
	
	public int lerInt(){
		System.out.println("Digite um numero inteiro:");
		int n=tc.nextInt();
		return n;
	}
	
	public int lerInt(int num){
		System.out.println("Digite um numero inteiro:");
	    num=tc.nextInt();
		return num;
	}
	
	public void lerInt(String a,int num){		
		num=tc.nextInt();
		System.out.println(a + num);
	}
	
	public void lerInt(String a){
		//tc.next();
		System.out.println(a);
		tc.nextInt();
	}
	///////Float//////
	public float lerFloat(){
		System.out.println("Digite um numero :");
		float num=tc.nextFloat();
		return num;
	}
	
	public void lerFloat(float num){
		System.out.println("Digite um numero");
	    num=tc.nextFloat();	
	}
	
	public void lerFloat(String a,float num){
		a=tc.nextLine();
		num=tc.nextFloat();
		System.out.println(a + num);
	}
	
	public void lerFloat(String a){
		System.out.println(a);	
		tc.nextFloat();
	}
	///////Float//////
	
	///////Double//////
	public double lerDouble(){
		System.out.println("Digite um numero :");
		double num=tc.nextDouble();
		return num;
	}
	
	public void lerDouble(double num){
		System.out.println("Digite um numero");
	    num=tc.nextDouble();	
	}
	
	public void lerDouble(String a,double num){
		a=tc.nextLine();
		num=tc.nextDouble();
		System.out.println(a + num);
	}
	
	public void lerDouble(String a){
		System.out.println(a);	
		tc.nextDouble();
	}
	//////Double/////
	
	/////Char/////
	public char lerChar(){
		char c=0;
		System.out.println("Digite um caracter :");
		c=tc.next().charAt(0);
		return c;
	}
	
	public void lerChar(char c){
		c=lerChar();
	}
	
	public void lerChar(String a,char c){
		c=tc.next().charAt(0);
		System.out.println(a);
	}
	
	public void lerChar(String a){
		System.out.println(a);			
	}
	///////
	
	/////String/////
	public String lerString(){
		System.out.println("Digite uma string :");
		String a=tc.nextLine();
		return a;
	}
	
	public void lerString(String a){
		System.out.println("Digite uma string");
	    a=tc.nextLine();	
	}
	
	public void lerString(String a,String b){
		b=tc.nextLine();
		System.out.println(a);
	}
	
	public void lerStringImprime(String a){
		System.out.println(a);			
	}
	
}
