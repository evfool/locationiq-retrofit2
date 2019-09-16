package com.locationiq.client.api;

import com.locationiq.client.model.Balance;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BalanceApi {
    /**
     * 
     * The Balance API provides a count of request credits left in the user&#39;s account for the day. Balance
     * is reset at midnight UTC everyday (00:00 UTC).
     * @return Call&lt;Balance&gt;
     */
    @GET("balance.php")
    Call<Balance> balance();

}
