package com.universityofscience.freshfood.service;

import com.universityofscience.freshfood.dto.ProductDTO;

public interface IProductService {
	ProductDTO save(ProductDTO productDTO);
	void delete(long []ids);

}
