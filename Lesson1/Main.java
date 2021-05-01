package intro;

public class Main 
	{

	public static void main(String[] args) 
		{
			//camelCase
			//Don't repeat yourself
			String internetSubeButonu = "Ýnternet Þubesi";
			double dolarDun = 8.18;
			double dolarBugun = 8.18;
			int vade = 36;
			boolean dolarOk; 
		
			System.out.println(internetSubeButonu);
		
			if(dolarBugun<dolarDun)
				{
					dolarOk = false;
					System.out.println("Dolar Düþtü Resmi");
				}
			else if(dolarBugun>dolarDun)
				{
					dolarOk = true;
					System.out.println("Dolar Yükseldi Resmi");
				}
			else
				{
					System.out.println("Dolar Eþittir Resmi");
				}
		
			String[] krediler= 
				{	"Hýzlý Kredi",
					"Mutlu Emekli Kredisi",
					"Konut Kredisi",
					"Çiftçi Kredisi",
					"Milli Savunma Bakanlýðý Kredisi",
					"Milli Eðitim Bakanlýðý Kredisi",
					"Kültür Bakanlýðý Kredisi"
				};
			//foreach
			for(String kredi : krediler)
				{
					System.out.println(kredi);
				}
			//Klasik for döngüsü
			for(int i=0;i<krediler.length;i++)
				{
					System.out.println(krediler[i]);
				}
			int sayi1 = 10;
			int sayi2 = 20;
			sayi1 = sayi2;
			sayi2 = 100;
			System.out.println(sayi1);
			
			int[] sayilar1 = {1,2,3,4,5};
			int[] sayilar2 = {10,20,30,40,50};
			sayilar1 = sayilar2;
			sayilar2[0] = 100;
			System.out.println(sayilar1[0]);
			
			//Stringlere özel bir istisnai durum cevap=Ýstanbul
			String sehir1 = "Ankara";
			String sehir2 = "Ýstanbul";
			sehir1 = sehir2;
			sehir2 = "Ýzmir";
			System.out.println(sehir1);
			
		}
	}
