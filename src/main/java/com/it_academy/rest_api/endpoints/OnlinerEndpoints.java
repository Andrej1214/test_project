package com.it_academy.rest_api.endpoints;

import com.it_academy.rest_api.property_reader.PropertiesReader;

public class OnlinerEndpoints {
    public static String getCatalogProductsEndPoint() {
        return PropertiesReader.getEndpointProperty("products");
    }

    public static String getNamePrefixProductsEndPoint() {
        return PropertiesReader.getEndpointProperty("name_prefix");
    }
}
