package io.mattea.recommendation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.mattea.recommendation.Dao.OrderBasedRecommProdDao;
import io.mattea.recommendation.service.OrderBasedRecommProdService;

@RestController
@RequestMapping("/user")
public class OrderBasedRecommProdController {
	private static final Logger logger = LoggerFactory.getLogger(OrderBasedRecommProdController.class);
	
	@Autowired
	OrderBasedRecommProdService orderBasedRecommProdService;

	@GetMapping(value = "/userIds", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderBasedRecommProdDao getProductBasedOrderHistory(@RequestParam("userId") String userId) {
		logger.info("Get Data");
		
		return orderBasedRecommProdService.getProductBasedOrderHistory(userId);
	}
}
