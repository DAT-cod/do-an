package com.universityofscience.freshfood.convert;

import org.springframework.stereotype.Component;

import com.universityofscience.freshfood.dto.ProductDTO;
import com.universityofscience.freshfood.entity.Product;

@Component
public class ProductConvert {
	
	public Product toEntity(ProductDTO productDTO)
	{
		Product productentity=new Product();
		productentity.setProductName(productDTO.getProductName());
		productentity.setAmount(productDTO.getAmount());
		productentity.setDayIn(productDTO.getImportDate());
		productentity.setExpiryDay(productDTO.getExpiryDate());
		productentity.setPrice(productDTO.getPrice());
		return productentity;
	}
	public ProductDTO toDTO(Product product)
	{
		ProductDTO productDTO=new ProductDTO();
		productDTO.setProductName(product.getProductName());
		productDTO.setAmount(product.getAmount());
		productDTO.setImportDate(product.getDayIn());
		productDTO.setExpiryDate(product.getExpiryDay());
		productDTO.setPrice(product.getPrice());
		
		return productDTO;
	}
	public Product toEntity(ProductDTO dto,Product product)
	{
		product.setId(dto.getProductId());
		product.setDayIn(dto.getImportDate());
		product.setExpiryDay(dto.getExpiryDate());
		product.setPrice(dto.getPrice());
		product.setProductName(dto.getProductName());
		product.setAmount(dto.getAmount());
		return product;
	}
}
