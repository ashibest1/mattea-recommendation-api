package io.mattea.recommendation.Dao;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderBasedRecommProdDao {
	private String userLoginId;
	private List<String> productIdList;
}
