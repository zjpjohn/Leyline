/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence;


import javax.annotation.Generated;

import moe.src.leyline.infrastructure.persistence.tables.Coupon;
import moe.src.leyline.infrastructure.persistence.tables.Discount;
import moe.src.leyline.infrastructure.persistence.tables.DiscountRule;
import moe.src.leyline.infrastructure.persistence.tables.OrderDetail;
import moe.src.leyline.infrastructure.persistence.tables.OrderParent;
import moe.src.leyline.infrastructure.persistence.tables.Product;
import moe.src.leyline.infrastructure.persistence.tables.User;


/**
 * Convenience access to all tables in leyline
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>leyline.coupon</code>.
     */
    public static final Coupon COUPON = moe.src.leyline.infrastructure.persistence.tables.Coupon.COUPON;

    /**
     * The table <code>leyline.discount</code>.
     */
    public static final Discount DISCOUNT = moe.src.leyline.infrastructure.persistence.tables.Discount.DISCOUNT;

    /**
     * The table <code>leyline.discount_rule</code>.
     */
    public static final DiscountRule DISCOUNT_RULE = moe.src.leyline.infrastructure.persistence.tables.DiscountRule.DISCOUNT_RULE;

    /**
     * The table <code>leyline.order_detail</code>.
     */
    public static final OrderDetail ORDER_DETAIL = moe.src.leyline.infrastructure.persistence.tables.OrderDetail.ORDER_DETAIL;

    /**
     * The table <code>leyline.order_parent</code>.
     */
    public static final OrderParent ORDER_PARENT = moe.src.leyline.infrastructure.persistence.tables.OrderParent.ORDER_PARENT;

    /**
     * The table <code>leyline.product</code>.
     */
    public static final Product PRODUCT = moe.src.leyline.infrastructure.persistence.tables.Product.PRODUCT;

    /**
     * The table <code>leyline.user</code>.
     */
    public static final User USER = moe.src.leyline.infrastructure.persistence.tables.User.USER;
}