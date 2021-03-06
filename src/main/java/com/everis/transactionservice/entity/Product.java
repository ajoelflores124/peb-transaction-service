package com.everis.transactionservice.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5938977990071940558L;
	
	@Field(name = "id_product")
	private String idProduct;
	@Field(name = "name_product")
    private String nameProduct;
	@Field(name = "type_product")
    private String typeProduct;


}
