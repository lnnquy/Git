package entities;

import entities.Category;
import entities.OrderDetail;
import entities.Rating;
import entities.Wishlist;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-24T10:08:18")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> id;
    public static volatile SingularAttribute<Product, String> author;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile CollectionAttribute<Product, Wishlist> wishlistCollection;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile CollectionAttribute<Product, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<Product, Category> categoryId;
    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, Integer> quantity;
    public static volatile CollectionAttribute<Product, Rating> ratingCollection;

}