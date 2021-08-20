package azcoder.northwind.business.abstracts;
import azcoder.northwind.entities.concretes.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
