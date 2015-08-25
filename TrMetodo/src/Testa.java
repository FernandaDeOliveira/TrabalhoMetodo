
public class Testa {

	public static void main(String[] args){

		Teclado tc=new Teclado();

		int n=0;
		float num=0;
		double num2=0;
		String palavra=null;
		
		tc.lerInt();
		tc.lerInt(n);
		tc.lerInt(palavra, 2);
		tc.lerInt(palavra);
		
		tc.lerFloat();
		tc.lerFloat(num);
		tc.lerFloat(palavra, num);
		tc.lerFloat(palavra);
		
		
}
}
