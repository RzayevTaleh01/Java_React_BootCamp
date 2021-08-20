package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {

	DataResult<List<Product>> getAll();

	Result add(Product product);

}

// Business -> iş katmanımızda controller 'imizin kullanacağı servisleri yazıyoruz
// Business katmanında sadece iş kodları yazılır
