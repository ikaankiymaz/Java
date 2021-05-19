package nLayerdDemo.business.concretes;

import java.util.List;

import nLayerdDemo.business.abstracts.IProductService;
import nLayerdDemo.core.ILoggerService;
import nLayerdDemo.dataAccess.abstracts.IProductDao;
import nLayerdDemo.entities.concretes.Product;

public class ProductManager implements IProductService {

	private IProductDao productDao;
	private ILoggerService loggerService;

	public ProductManager(IProductDao productDao, ILoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}


	@Override
	public void add(Product product) {
		// Is kodlari yazilir.
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride urun kabul edilmiyor.");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Urun eklendi : " + product.getName());

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
