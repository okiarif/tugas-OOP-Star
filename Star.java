
import java.util.Scanner;

class Star {
	
		int nilai;
		int a;
		String karakter;
		public void tampil () {
		Scanner input = new Scanner (System.in);
		System.out.print("Masukan karakter :");
		karakter = input.nextLine();
		System.out.println("");	
		System.out.print("Masukan Nilai  :");
		nilai = input.nextInt();	

		for (a=0;a<=nilai;a++){
			System.out.println();
			for (int b=1;b<=nilai;b++){
			System.out.print(karakter);
			}		
		
		}
}
}