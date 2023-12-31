package hu.okrim.productratingapp.service;

import hu.okrim.productratingapp.entity.Flavour;
import hu.okrim.productratingapp.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {

    Product getProductById(Integer id);
    void addProduct(Product product);
    List<Product> getAllProducts();
    void deleteProduct(Product product);
    List<Product> findTop3ProductsWithMostRatings();
    List<Double> getRatingAverageForTop3ProductsWithBestRatings();
    Page<Product> findAllByName(String name, Pageable request);
}