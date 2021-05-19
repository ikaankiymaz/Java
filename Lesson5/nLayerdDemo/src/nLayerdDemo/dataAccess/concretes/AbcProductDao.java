package nLayerdDemo.dataAccess.concretes;

import java.util.List;

import nLayerdDemo.dataAccess.abstracts.IProductDao;
import nLayerdDemo.entities.concretes.Product;

public class AbcProductDao implements IProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Abc ile eklendi : " + product.getName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("Abc ile eklendi : " + product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Abc ile güncelledi : " + product.getName());
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
