package com.locationiq.client.api;

import org.junit.Before;
import org.junit.Test;

import LocationIq.ApiClient;

/**
 * API tests for BalanceApi
 */
public class BalanceApiTest {

    private BalanceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BalanceApi.class);
    }

    /**
     * 
     *
     * The Balance API provides a count of request credits left in the user&#39;s account for the day. Balance is reset at midnight UTC everyday (00:00 UTC).
     */
    @Test
    public void balanceTest() {
        // Balance response = api.balance();

        // TODO: test validations
    }
}
