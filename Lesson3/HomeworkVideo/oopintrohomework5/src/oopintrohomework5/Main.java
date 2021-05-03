package oopintrohomework5;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1001,"Laptop","Lenovo L340 Gaming Laptop",9000,7,"Very Big deal");
		Product product2 = new Product(1002,"Telephone","Apple Iphone 12 128GB",7000,3,"Big deal");
	
//		Product product1 = new Product();
//		product1.id= 1001;
//		product1.name = "Laptop";
//		product1.description = "Lenovo L340 Gaming Laptop";
//		product1.price = 9000;
//		product1.stockAmount = 7;
		
		Product product3 = new Product();
		product3.setId(1003);
		product3.setName("Television");
		product3.setDescription("Samsung");
		product3.setPrice(2000);
		product3.setStockAmount(15);
		product3.setNewFeature("This is a bigtelevision");
		
//		Product product2 = new Product();
//		product2.id= 1002;
//		product2.name = "Telephone";
//		product2.description = "Apple Iphone 12 128GB";
//		product2.price = 7000;
//		product2.stockAmount = 3;
//		product2.newFeature = "Big deal";

		Product product4 = new Product();
		product4.setId(1004);
		product4.setName("Printer");
		product4.setDescription("Hp");
		product4.setPrice(100);
		product4.setStockAmount(2);
		product4.setNewFeature("This is a big printer");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		productManager.Add(product2);
		productManager.Add(product3);
		productManager.Add(product4);
		
		//SOLID KAVRAMI
		
		//(S)Single Responsibility, siniflarimizin iyi tanimlanmis tek bir 
		//								sorumlulugu olmali.
		//(O)Open/Closed, siniflarimiz degisiklige kapali ancak yeni davranislarin
		//							eklenmesine acik olmali.
		//(L)Liskov Substitution, kodumuzda herhangi bir degisiklik yapmaya gerek kalmadan turetilmis 
		//							sýnýflarý(sub,class) turedikleri ata sinifin(base class) yerine kullanabilmeliyiz.
		//(I)Interface Segregation, genel kullanim amacli tek bir kontrat yerine daha ozellesmis
		//								birden cok  kontrat olusturmayi tercih etmeliyiz.
		//(D)Dependency Inversion, katmali mimarilerde ust seviye moduller alt seviyedeki 
		//							modullere dogrudan bagimli olmamalidir.
		
		//Product nesnesi, urun tutar. Bir class sadece bir is yapar. Bir if blogu sadece bir is yapar. 

		//Encapsulation, kullaniciyi, herhangi bir alani kullanmak icin kisitlar.
	
	
//		productManager.Add2(1, "Stone", "Heavy Stone", 2, 0,"Very Heavy Stone");
		
	}

}
