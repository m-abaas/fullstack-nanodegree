package com.udacity.store;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StoreApplication  implements CommandLineRunner {

    public static void main(String[] args) {
            SpringApplication.run(StoreApplication.class, args);
        }

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(
                "Summer Bag",
                1199.99D,
                "https://cdn.shopify.com/s/files/1/0580/1361/4238/products/printed-tote-bag-childrens-2000_1680x.jpg?v=1636729344",
                "An overpriced bag that people will end up buying anyways because it's 'trendy'")
        );
        productRepository.save(new Product(
                "Xbox Series S - Bundle",
                249.99D,
                "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE5cygy?ver=77ca&q=90&m=6&h=705&w=1253&b=%23FFFFFFFF&f=jpg&o=f&p=140&aim=true",
                "The tiny, powerful, cool-looking next-gen console")
        );
        productRepository.save(new Product(
                "YOYO Stroller",
                599.99D,
                "http://cdn.shopify.com/s/files/1/0690/1977/products/BABYZEN-YOYO_-Stroller---Aqua---Black.jpg?v=1601766770",
                "Fully collapsible YOYO stroller - approved in flight cabin")
        );
    }
}
