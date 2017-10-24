package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-24T10:08:18")
@StaticMetamodel(Coupon.class)
public class Coupon_ { 

    public static volatile SingularAttribute<Coupon, String> id;
    public static volatile SingularAttribute<Coupon, Double> amount;
    public static volatile SingularAttribute<Coupon, Date> fromDate;
    public static volatile SingularAttribute<Coupon, String> eventName;
    public static volatile SingularAttribute<Coupon, String> code;
    public static volatile SingularAttribute<Coupon, Date> toDate;
    public static volatile SingularAttribute<Coupon, Double> minimumCartValue;

}