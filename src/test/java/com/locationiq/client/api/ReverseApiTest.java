package com.locationiq.client.api;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import LocationIq.ApiClient;

/**
 * API tests for ReverseApi
 */
public class ReverseApiTest {

    private ReverseApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReverseApi.class);
    }

    /**
     * Reverse Geocoding
     *
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     */
    @Test
    public void reverseTest() {
        BigDecimal lat = null;
        BigDecimal lon = null;
        String format = null;
        Integer normalizecity = null;
        Integer addressdetails = null;
        String acceptLanguage = null;
        Integer namedetails = null;
        Integer extratags = null;
        Integer statecode = null;
        // Location response = api.reverse(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, statecode);

        // TODO: test validations
    }
}
