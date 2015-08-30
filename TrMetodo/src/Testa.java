
public class Testa {

	public static void main(String[] args){

		Teclado tc=new Teclado();
		
		tc.lerInt();
		tc.lerInt(5);
		tc.lerInt("palavra", 2);
		tc.lerInt("palavra2");
		
		tc.lerFloat();
		tc.lerFloat(10);
		tc.lerFloat("palavra3", 11);
		tc.lerFloat("palavra");
		
		tc.lerDouble();
		tc.lerDouble(12.5);
		tc.lerDouble("palavra4", 21);
		tc.lerDouble("palavra15");

		tc.lerChar();
		tc.lerChar("e");
		tc.lerChar("ppp");
		char k=0;
		tc.lerChar("l", k);
		
		tc.lerString();
		tc.lerString("aa");
		tc.lerString("ff", "dd");
		tc.lerStringImprime("Bye");
		
}
}
