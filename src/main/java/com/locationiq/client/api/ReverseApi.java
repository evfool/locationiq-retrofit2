package com.locationiq.client.api;

import java.math.BigDecimal;

import com.locationiq.client.model.Location;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ReverseApi {
  /**
   * Reverse Geocoding
   * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
   * @param lat Latitude of the location to generate an address for. (required)
   * @param lon Longitude of the location to generate an address for. (required)
   * @param format Format to geocode. Only JSON supported for SDKs (required)
   * @param normalizecity Normalizes village to city level data to city (required)
   * @param addressdetails Include a breakdown of the address into elements. Defaults to 1. (optional, default to 1)
   * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
   * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
   * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
   * @param statecode Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 (optional)
   * @return Call&lt;Location&gt;
   */
  @GET("reverse.php")
  Call<Location> reverse(
    @retrofit2.http.Query("lat") BigDecimal lat, @retrofit2.http.Query("lon") BigDecimal lon, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("normalizecity") Integer normalizecity, @retrofit2.http.Query("addressdetails") Integer addressdetails, @retrofit2.http.Query("accept-language") String acceptLanguage, @retrofit2.http.Query("namedetails") Integer namedetails, @retrofit2.http.Query("extratags") Integer extratags, @retrofit2.http.Query("statecode") Integer statecode
  );

}
