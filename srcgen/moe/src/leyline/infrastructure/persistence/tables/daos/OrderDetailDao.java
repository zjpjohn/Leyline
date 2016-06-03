/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import moe.src.leyline.infrastructure.persistence.tables.OrderDetail;
import com.masadora.shop.infrastructure.persistence.tables.records.OrderDetailRecord;

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
public class OrderDetailDao extends DAOImpl<OrderDetailRecord, moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail, Integer> {

    /**
     * Create a new OrderDetailDao without any configuration
     */
    public OrderDetailDao() {
        super(OrderDetail.ORDER_DETAIL, moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail.class);
    }

    /**
     * Create a new OrderDetailDao with an attached configuration
     */
    @Autowired
    public OrderDetailDao(Configuration configuration) {
        super(OrderDetail.ORDER_DETAIL, moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail> fetchById(Integer... values) {
        return fetch(OrderDetail.ORDER_DETAIL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail fetchOneById(Integer value) {
        return fetchOne(OrderDetail.ORDER_DETAIL.ID, value);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail> fetchByProductId(Integer... values) {
        return fetch(OrderDetail.ORDER_DETAIL.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail> fetchByCustomerId(Integer... values) {
        return fetch(OrderDetail.ORDER_DETAIL.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>quantity IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail> fetchByQuantity(String... values) {
        return fetch(OrderDetail.ORDER_DETAIL.QUANTITY, values);
    }

    /**
     * Fetch records that have <code>parent_order_id IN (values)</code>
     */
    public List<moe.src.leyline.infrastructure.persistence.tables.pojos.OrderDetail> fetchByParentOrderId(Integer... values) {
        return fetch(OrderDetail.ORDER_DETAIL.PARENT_ORDER_ID, values);
    }
}
