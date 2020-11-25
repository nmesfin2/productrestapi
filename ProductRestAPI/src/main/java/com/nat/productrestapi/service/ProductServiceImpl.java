package com.nat.productrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nat.productrestapi.model.Product;
import com.nat.productrestapi.repository.ProductRepository;



@Service
public class ProductServiceImpl implements ProductService {
	


	@Autowired
//	private ProductDAO productDAO;
	ProductRepository productRepository;
	
	@Override
	public String createProduct(Product product) {
		// TODO Auto-generated method stub
		//return productDAO.createProduct(product);
		Product product2= null;
		try {
			product2 = productRepository.save(product);
			return "success";
		}catch(Exception e) {
			e.printStackTrace();
			return "fail";
		}
		
	}

	@Override
	public Optional<Product> getProductById(int id) {
		// TODO Auto-generated method stub
		//return productDAO.getProductById(id);
		return productRepository.findById(id);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		
	}

	@Override
	public Optional<List<Product>> getProducts() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(productRepository.findAll());
	}

	@Override
	public Optional<List<Product>> getProductsByCategory(String cat) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(productRepository.findByCategory(cat));
	
	}

}
