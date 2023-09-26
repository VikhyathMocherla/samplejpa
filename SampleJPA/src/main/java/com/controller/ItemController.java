package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Item;
import com.repository.ItemRepository;

@RestController
public class ItemController {

	@Autowired
	private ItemRepository itemrepository;
	
	@GetMapping("/getitems")
	public ResponseEntity<?> getItems()
	{
		List<Item> itemlist=itemrepository.findAll();
		return new ResponseEntity<List<Item>>(itemlist,HttpStatus.OK);
	}
}
