package com.universityofscience.freshfood.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityofscience.freshfood.convert.ProductConvert;
import com.universityofscience.freshfood.dto.ProductDTO;
import com.universityofscience.freshfood.entity.Categories;
import com.universityofscience.freshfood.entity.Product;
import com.universityofscience.freshfood.entity.Store;
import com.universityofscience.freshfood.repositery.CategoryProductRepositery;
import com.universityofscience.freshfood.repositery.SanPhamRepository;
import com.universityofscience.freshfood.repositery.StoreRespository;
import com.universityofscience.freshfood.service.IProductService;
@Service
public class ProductService implements IProductService {
@Autowired
private StoreRespository storeRespository;
@Autowired
private SanPhamRepository productRepository;
@Autowired
private CategoryProductRepositery categoryStoreRepositery;
@Autowired
private ProductConvert productConvert;

@Override
public ProductDTO save(ProductDTO productDTO) {
	if(productDTO.getProductId()!=null)
	{
		Product productOldID= productRepository.findOneById(productDTO.getProductId());
		Product productNewID= new Product();
		productNewID.setId(productOldID.getId());
		productNewID=productConvert.toEntity(productDTO, productNewID);
		return productConvert.toDTO(productNewID);
		
	}
	else {
	Categories categories= categoryStoreRepositery.findOneBycategoryName(productDTO.getProductTypeName());
	Store store=storeRespository.findOneById(productDTO.getStoreId());
	Product product = productConvert.toEntity(productDTO);
	product.setCategories(categories);
	product.setStore(store);
	product= productRepository.save(product);
	return productConvert.toDTO(product);
	}
	
}

@Override
public void delete(long[] ids) {
	for (long i : ids) {
		productRepository.deleteById(i);
	}
}

}
