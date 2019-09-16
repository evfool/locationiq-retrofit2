package com.locationiq.client.api;

import org.junit.Before;
import org.junit.Test;

import LocationIq.ApiClient;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SearchApi.class);
    }

    /**
     * Forward Geocoding
     *
     * The Search API allows converting addresses, such as a street address, into geographic coordinates (latitude and longitude). These coordinates can serve various use-cases, from placing markers on a map to helping algorithms determine nearby bus stops. This process is also known as Forward Geocoding.
     */
    @Test
    public void searchTest() {
        String q = null;
        String format = null;
        Integer normalizecity = null;
        Integer addressdetails = null;
        String viewbox = null;
        Integer bounded = null;
        Integer limit = null;
        String acceptLanguage = null;
        String countrycodes = null;
        Integer namedetails = null;
        Integer dedupe = null;
        Integer extratags = null;
        Integer statecode = null;
        // List<Location> response = api.search(q, format, normalizecity, addressdetails, viewbox, bounded, limit, acceptLanguage, countrycodes, namedetails, dedupe, extratags, statecode);

        // TODO: test validations
    }
}
