package com.universityofscience.freshfood.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.universityofscience.freshfood.dto.ProductDTO;
import com.universityofscience.freshfood.service.IProductService;
@CrossOrigin
@RestController
public class ProductAPI {
@Autowired
private IProductService productService;
@PostMapping(value = "/test")
public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
	return productService.save(productDTO);
}
@PutMapping(value = "/test/{id}")
public ProductDTO updateProduct(@RequestBody ProductDTO model, @PathVariable("id") long id) {
	model.setProductId(id);
	return productService.save(model);
}
@DeleteMapping(value = "/test")
public void deleteProduct(@RequestBody long[] ids) {
	productService.delete(ids);;
}
}
