package entities;

import entities.Customer;
import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-24T10:08:18")
@StaticMetamodel(Rating.class)
public class Rating_ { 

    public static volatile SingularAttribute<Rating, String> id;
    public static volatile SingularAttribute<Rating, Customer> customerId;
    public static volatile SingularAttribute<Rating, Integer> star;
    public static volatile SingularAttribute<Rating, String> comment;
    public static volatile SingularAttribute<Rating, Product> productId;

}