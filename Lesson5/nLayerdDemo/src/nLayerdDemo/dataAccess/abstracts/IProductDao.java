package nLayerdDemo.dataAccess.abstracts;
import java.util.List;
import nLayerdDemo.entities.concretes.Product;

public interface IProductDao {

	void add(Product product);

	void delete(Product product);

	void update(Product product);

	Product get(int id);

	List<Product> getAll();

}
