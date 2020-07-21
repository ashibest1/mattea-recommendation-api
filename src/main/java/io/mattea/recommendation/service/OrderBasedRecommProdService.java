package io.mattea.recommendation.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mattea.recommendation.Dao.OrderBasedRecommProdDao;
import io.mattea.recommendation.pojo.OrderBasedRecommendationProducts;
import io.mattea.recommendation.repository.CassandraConnector;

@Service
public class OrderBasedRecommProdService {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderBasedRecommProdService.class);
	
	@Autowired
	CassandraConnector cassandraConnector;
	
	public OrderBasedRecommProdDao getProductBasedOrderHistory(String userLoginId) {
		logger.info("Service");
		
		List<OrderBasedRecommendationProducts> productList = cassandraConnector.findAllByUserLoginId(userLoginId);
		List<String> productIdList = new ArrayList<>();
		for (OrderBasedRecommendationProducts productIds : productList) {
			productIdList.add(productIds.getProductId());
		}
		OrderBasedRecommProdDao basedRecommProdDao = new OrderBasedRecommProdDao();
		basedRecommProdDao.setUserLoginId(userLoginId);
		basedRecommProdDao.setProductIdList(productIdList);
		return basedRecommProdDao;
	}
}
