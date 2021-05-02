package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
		//Müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi.");
		//Bir iþ yapan sýnýf, baþka bir iþ yapan sýnýfý kullanacaksa,
		//Asla ve asla somut sýnýftan gidilmez.
		//Somut sýnýf, file, database vs. iþ yapan sýnýflara somut sýnýf denir.
		//Ve bunlarý asla new'leyemeyiz.
		//Eðer bir kodun içerisinde baþka bir iþ yapan sýnýf new'leniyorsa,
		//O koddan ileriye dönük hayýr gelmez, sürdürebilir deðil.
		
		//DatabaseLogger logger = new DatabaseLogger();
		
		logger.log();
	
	}

}
