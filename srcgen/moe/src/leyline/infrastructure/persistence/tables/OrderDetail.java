/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import moe.src.leyline.infrastructure.persistence.Keys;
import moe.src.leyline.infrastructure.persistence.Leyline;
import com.masadora.shop.infrastructure.persistence.tables.records.OrderDetailRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class OrderDetail extends TableImpl<OrderDetailRecord> {

    private static final long serialVersionUID = -474940622;

    /**
     * The reference instance of <code>leyline.order_detail</code>
     */
    public static final OrderDetail ORDER_DETAIL = new OrderDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderDetailRecord> getRecordType() {
        return OrderDetailRecord.class;
    }

    /**
     * The column <code>leyline.order_detail.id</code>.
     */
    public final TableField<OrderDetailRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>leyline.order_detail.product_id</code>.
     */
    public final TableField<OrderDetailRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>leyline.order_detail.customer_id</code>.
     */
    public final TableField<OrderDetailRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>leyline.order_detail.quantity</code>.
     */
    public final TableField<OrderDetailRecord, String> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>leyline.order_detail.parent_order_id</code>.
     */
    public final TableField<OrderDetailRecord, Integer> PARENT_ORDER_ID = createField("parent_order_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>leyline.order_detail</code> table reference
     */
    public OrderDetail() {
        this("order_detail", null);
    }

    /**
     * Create an aliased <code>leyline.order_detail</code> table reference
     */
    public OrderDetail(String alias) {
        this(alias, ORDER_DETAIL);
    }

    private OrderDetail(String alias, Table<OrderDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderDetail(String alias, Table<OrderDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Leyline.LEYLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderDetailRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORDER_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderDetailRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_DETAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderDetailRecord>>asList(Keys.KEY_ORDER_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OrderDetailRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderDetailRecord, ?>>asList(Keys.ID, Keys.ORDER_DETAIL_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderDetail as(String alias) {
        return new OrderDetail(alias, this);
    }

    /**
     * Rename this table
     */
    public OrderDetail rename(String name) {
        return new OrderDetail(name, null);
    }
}
