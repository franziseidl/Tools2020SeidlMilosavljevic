
public class Umrechnung {
	
	public void thisIsANewMethod() { 
	
		boolean conflict = true // creating a conflict here..
	
	}


	public static void main(String[] args) {
		// Done Auto-generated method stub
		
		int note5000 = 5000;
		int note1000 = 1000;
		int note500 = 500;
		int note100 = 100;
		int note50 = 50;
		int note20 = 20;

		
		int coin20 = 20;
		int coin10 = 10;
		int coin5 = 5;
		int coin1 = 1;
		
		int count = 0;
		int result = 0;
		
		int euroRate = 1376;
		int franzi= 1996;
		
		
		Out.print("5000 Schilling-Scheine: ");
		//count = In.readInt();
		//result = note5000 * count;
		result = note500 * In.readInt();
		
		Out.print("1000 Schilling-Scheine: ");
		count = In.readInt();
		result = result + note1000 * count;
		
		Out.print("500 Schilling-Scheine: ");
		count = In.readInt();
		result = result + note500 * count;
		
		Out.print("100 Schilling-Scheine: ");
		count = In.readInt();
		result = result + note100 * count;
		
		Out.print("50 Euro-Scheine: ");
		count = In.readInt();
		result = result + note50 * count;
		
		Out.print("20 Schilling-Scheine: ");
		count = In.readInt();
		result = result + note20 * count;
		
		Out.print("20 Schilling-Münze: ");
		count = In.readInt();
		result = result + coin20 * count;
		
		Out.print("10 Schilling-Münze: ");
		count = In.readInt();
		result = result + coin10 * count;
		
		Out.print("5 Schilling-Münze: ");
		count = In.readInt();
		result = result + coin5 * count;
		
		Out.print("1 Schilling-Münze: ");
		count = In.readInt();
		result = result + coin1 * count;
		
		Out.println();
		Out.print("Gesamtbetrag Schilling: ");
		Out.print(result);
		Out.println(" Schilling");
		
		int cent = 0;
		
		result = result * 10000; // Mal 10-Tausend
		result = result / euroRate;
		
		cent = result;
		result = result / 100;
		
		
		Out.print("Gesamtbetrag Euro: ");
		Out.print(result);
		Out.print(" Euro ");
		
		cent = cent % 100;
		
		Out.print(cent);
		Out.println(" Cent ");
		
		
		
		Out.println();
		
		int euro = result;
		int output = 0;
		
		// euro
		
		Out.print("500 Euro-Scheine: ");
		output = euro / 500;
		Out.println(output);
		euro = euro - (500 * output);
		
		Out.print("200 Euro-Scheine: ");
		output = euro / 200;
		Out.println(output);
		euro = euro - (200 * output);
		
		Out.print("100 Euro-Scheine: ");
		output = euro / 100;
		Out.println(output);
		euro = euro - (100 * output);
		
		Out.print("50 Euro-Scheine: ");
		output = euro / 50;
		Out.println(output);
		euro = euro - (50 * output);
		
		Out.print("20 Euro-Scheine: ");
		output = euro / 20;
		Out.println(output);
		euro = euro - (20 * output);
		
		Out.print("10 Euro-Scheine: ");
		output = euro / 10;
		Out.println(output);
		euro = euro - (10 * output);
		
		Out.print("5 Euro-Scheine: ");
		output = euro / 5;
		Out.println(output);
		euro = euro - (5 * output);
		
		Out.print("2 Euro-Münze: ");
		output = euro / 2;
		Out.println(output);
		euro = euro - (2 * output);
		
		Out.print("1 Euro-Münze: ");
		output = euro / 1;
		Out.println(output);
		euro = euro - (1 * output);
		
		// cent

		Out.print("50 Cent-Münze: ");
		output = cent / 50;
		Out.println(output);
		cent = cent - (50 * output);
		
		Out.print("20 Cent-Münze: ");
		output = cent / 20;
		Out.println(output);
		cent = cent - (20 * output);
		
		Out.print("10 Cent-Münze: ");
		output = cent / 10;
		Out.println(output);
		cent = cent - (10 * output);
		
		Out.print("5 Cent-Münze: ");
		output = cent / 5;
		Out.println(output);
		cent = cent - (5 * output);
		
		Out.print("2 Cent-Münze: ");
		output = cent / 2;
		Out.println(output);
		cent = cent - (2 * output);
		
		Out.print("1 Cent-Münze: ");
		output = cent / 1;
		Out.println(output);
		cent = cent - (1 * output);
		
	}

}
