/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import moe.src.leyline.infrastructure.persistence.tables.DiscountRule;
import com.masadora.shop.infrastructure.persistence.tables.records.DiscountRuleRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class DiscountRuleDao extends DAOImpl<DiscountRuleRecord, moe.src.leyline.infrastructure.persistence.tables.pojos.DiscountRule, Integer> {

    /**
     * Create a new DiscountRuleDao without any configuration
     */
    public DiscountRuleDao() {
        super(DiscountRule.DISCOUNT_RULE, moe.src.leyline.infrastructure.persistence.tables.pojos.DiscountRule.class);
    }

    /**
     * Create a new DiscountRuleDao with an attached configuration
     */
    @Autowired
    public DiscountRuleDao(Configuration configuration) {
        super(DiscountRule.DISCOUNT_RULE, moe.src.leyline.infrastructure.persistence.tables.pojos.DiscountRule.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(moe.src.leyline.infrastructure.persistence.tables.pojos.DiscountRule object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.DiscountRule> fetchById(Integer... values) {
        return fetch(DiscountRule.DISCOUNT_RULE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public moe.src.leyline.infrastructure.persistence.tables.pojos.DiscountRule fetchOneById(Integer value) {
        return fetchOne(DiscountRule.DISCOUNT_RULE.ID, value);
    }

    /**
     * Fetch records that have <code>price IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.DiscountRule> fetchByPrice(Integer... values) {
        return fetch(DiscountRule.DISCOUNT_RULE.PRICE, values);
    }

    /**
     * Fetch records that have <code>rate IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.DiscountRule> fetchByRate(Integer... values) {
        return fetch(DiscountRule.DISCOUNT_RULE.RATE, values);
    }
}
