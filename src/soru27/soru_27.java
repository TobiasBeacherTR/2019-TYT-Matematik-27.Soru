package soru27;

public class soru_27 {

	public static void main(String[] args) {
		int kcevre=320;
		
		int m=kcevre/2; //m= kartonun k�sa kenar�yla uzun kenar�n�n toplam
		int x=m/40; //x= matematikte uygulanan 15x+25x=40x i�leminden sonra ayrac�n k�sa kenar�
		int y=25*x/10; //y-->25x=10y ba��nt�s�ndan ayrac�n uzun kenar� 
		
		int sonuc=(x+y)*2; //sonuc=ayrac�n �evresi :uzun kenar�yla k�sa kenar�n�n toplam�n�n 2 kat�
		System.out.println("i�lem sonucu : " + sonuc);
		
		
		

	}

}
