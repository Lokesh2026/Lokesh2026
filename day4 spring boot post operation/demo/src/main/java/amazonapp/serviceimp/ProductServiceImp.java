package amazonapp.serviceimp;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amazonapp.bean.Product;
import amazonapp.repository.MyLocalRepository;
import amazonapp.service.ProductService;




@Service
public class ProductServiceImp implements ProductService {
	
	
	
	@Autowired
	MyLocalRepository mylocalrepository;

	@Override
	public Product addProduct(Product product) {
		Product productadded = mylocalrepository.save(product);
		
		return productadded;
	}
 
}
