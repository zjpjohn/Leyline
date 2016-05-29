/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence.tables.records;


import javax.annotation.Generated;

import moe.src.leyline.infrastructure.persistence.tables.Coupon;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CouponRecord extends UpdatableRecordImpl<CouponRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -443727166;

    /**
     * Setter for <code>leyline.coupon.id</code>.
     */
    public CouponRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>leyline.coupon.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>leyline.coupon.name</code>.
     */
    public CouponRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>leyline.coupon.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>leyline.coupon.discount_rule_id</code>.
     */
    public CouponRecord setDiscountRuleId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>leyline.coupon.discount_rule_id</code>.
     */
    public Integer getDiscountRuleId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Coupon.COUPON.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Coupon.COUPON.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Coupon.COUPON.DISCOUNT_RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDiscountRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponRecord value3(Integer value) {
        setDiscountRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CouponRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CouponRecord
     */
    public CouponRecord() {
        super(Coupon.COUPON);
    }

    /**
     * Create a detached, initialised CouponRecord
     */
    public CouponRecord(Integer id, String name, Integer discountRuleId) {
        super(Coupon.COUPON);

        set(0, id);
        set(1, name);
        set(2, discountRuleId);
    }
}