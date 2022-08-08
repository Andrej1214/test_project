package com.it_academy.test.rest_api;

import com.it_academy.rest_api.entity.Product;
import com.it_academy.rest_api.service.ProductsService;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OnlinerApiTest {
    @Test
    public void testApiProducts() {
        List<Product> products = new ProductsService().getProductsItems();
        assertThat(products).as("There is an empty element in the product's list")
                .noneMatch(x -> x.getName().isEmpty());
    }

    @Test
    public void checkNotEmptyNamePrefix() {
        List<String> listNamePrefix = new ProductsService().getProductsNamePrefixItems();
        assertThat(listNamePrefix).as("Not all elements contains name_prefix with value 'Соус'")
                .allMatch(x -> x.contains("Соус"));
    }
}
