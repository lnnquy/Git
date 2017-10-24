package entities;

import entities.Coupon;
import entities.Customer;
import entities.OrderDetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-24T10:08:18")
@StaticMetamodel(ProductOrder.class)
public class ProductOrder_ { 

    public static volatile SingularAttribute<ProductOrder, String> id;
    public static volatile SingularAttribute<ProductOrder, Customer> customerId;
    public static volatile SingularAttribute<ProductOrder, String> status;
    public static volatile CollectionAttribute<ProductOrder, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<ProductOrder, Coupon> couponId;
    public static volatile SingularAttribute<ProductOrder, Date> date;

}