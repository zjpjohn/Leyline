package com.masadora.mall.business.domain;

import javax.persistence.*;

import com.masadora.mall.framework.domain.DO;

/**
 * The persistent class for the discount database table.
 *
 */
@Entity
@NamedQuery(name="Discount.findAll", query="SELECT d FROM Discount d")
public class Discount implements DO {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="coupon_id")
	private long couponId;

	@Column(name="discount_rule_id")
	private long discountRuleId;

	public Discount() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCouponId() {
		return this.couponId;
	}

	public void setCouponId(long couponId) {
		this.couponId = couponId;
	}

	public long getDiscountRuleId() {
		return this.discountRuleId;
	}

	public void setDiscountRuleId(long discountRuleId) {
		this.discountRuleId = discountRuleId;
	}

}