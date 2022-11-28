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
	Product productNewID=new Product();
	if(productDTO.getProductId() != null)
	{
		Product productOldID= productRepository.findOneById(productDTO.getProductId());
		productNewID=productConvert.toEntity(productDTO, productOldID);
		
	}
	else {
	productNewID=productConvert.toEntity(productDTO);
	}
	Categories categories= categoryStoreRepositery.findOneBycategoryName(productDTO.getProductTypeName());
	Store store=storeRespository.findOneById(productDTO.getStoreId());
	productNewID.setCategories(categories);
	productNewID.setStore(store);
	productNewID= productRepository.save(productNewID);
	return productConvert.toDTO(productNewID);
	
}
	
}

@Override
public void delete(long[] ids) {
	for (long i : ids) {
		productRepository.deleteById(i);
	}
}

}
