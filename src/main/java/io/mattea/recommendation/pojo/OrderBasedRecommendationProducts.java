package io.mattea.recommendation.pojo;

import java.io.Serializable;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(value = "product_order_recommended")
public class OrderBasedRecommendationProducts implements Serializable {

	private static final long serialVersionUID = 1L;
	@PrimaryKey(value = "product_id")
	private String productId;
	@Column(value = "user_login_id")
	private String userLoginId;
	@Column(value = "rating")
	private String rating;

	public OrderBasedRecommendationProducts() {
		// TODO Auto-generated constructor stub
	}

	public OrderBasedRecommendationProducts(String product_id, String user_login_id, String rating) {
		super();
		this.productId = product_id;
		this.userLoginId = user_login_id;
		this.rating = rating;
	}

}
