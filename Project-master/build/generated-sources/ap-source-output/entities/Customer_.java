package entities;

import entities.ProductOrder;
import entities.Rating;
import entities.Role;
import entities.Wishlist;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-24T10:08:18")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> id;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile CollectionAttribute<Customer, Wishlist> wishlistCollection;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile CollectionAttribute<Customer, ProductOrder> productOrderCollection;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile CollectionAttribute<Customer, Rating> ratingCollection;
    public static volatile SingularAttribute<Customer, Role> roleId;

}