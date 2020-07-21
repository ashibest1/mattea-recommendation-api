package io.mattea.recommendation.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import io.mattea.recommendation.pojo.OrderBasedRecommendationProducts;

public interface CassandraConnector extends CassandraRepository<OrderBasedRecommendationProducts, String> {

	
	@AllowFiltering
	List<OrderBasedRecommendationProducts> findAllByUserLoginId(String userLoginId);
}
