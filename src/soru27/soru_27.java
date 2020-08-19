package soru27;

public class soru_27 {

	public static void main(String[] args) {
		int kcevre=320;
		
		int m=kcevre/2; //m= kartonun kýsa kenarýyla uzun kenarýnýn toplam
		int x=m/40; //x= matematikte uygulanan 15x+25x=40x iþleminden sonra ayracýn kýsa kenarý
		int y=25*x/10; //y-->25x=10y baðýntýsýndan ayracýn uzun kenarý 
		
		int sonuc=(x+y)*2; //sonuc=ayracýn çevresi :uzun kenarýyla kýsa kenarýnýn toplamýnýn 2 katý
		System.out.println("iþlem sonucu : " + sonuc);
		
		
		

	}

}
