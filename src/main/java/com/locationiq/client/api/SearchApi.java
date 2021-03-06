package com.locationiq.client.api;

import java.util.List;

import com.locationiq.client.model.Location;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SearchApi {
  /**
   * Forward Geocoding
   * The Search API allows converting addresses, such as a street address, into geographic coordinates (latitude and longitude). These coordinates can serve various use-cases, from placing markers on a map to helping algorithms determine nearby bus stops. This process is also known as Forward Geocoding.
   * @param q Address to geocode (required)
   * @param format Format to geocode. Only JSON supported for SDKs (required)
   * @param normalizecity For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. (required)
   * @param addressdetails Include a breakdown of the address into elements. Defaults to 0. (optional)
   * @param viewbox The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  (optional)
   * @param bounded Restrict the results to only items contained with the viewbox (optional)
   * @param limit Limit the number of returned results. Default is 10. (optional, default to 10)
   * @param acceptLanguage Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native (optional)
   * @param countrycodes Limit search to a list of countries. (optional)
   * @param namedetails Include a list of alternative names in the results. These may include language variants, references, operator and brand. (optional)
   * @param dedupe Sometimes you have several objects in OSM identifying the same place or object in reality. The simplest case is a street being split in many different OSM ways due to different characteristics. Nominatim will attempt to detect such duplicates and only return one match; this is controlled by the dedupe parameter which defaults to 1. Since the limit is, for reasons of efficiency, enforced before and not after de-duplicating, it is possible that de-duplicating leaves you with less results than requested. (optional)
   * @param extratags Include additional information in the result if available, e.g. wikipedia link, opening hours. (optional)
   * @param statecode Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 (optional)
   * @return Call&lt;List&lt;Location&gt;&gt;
   */
  @GET("search.php")
  Call<List<Location>> search(
    @retrofit2.http.Query("q") String q, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("normalizecity") Integer normalizecity, @retrofit2.http.Query("addressdetails") Integer addressdetails, @retrofit2.http.Query("viewbox") String viewbox, @retrofit2.http.Query("bounded") Integer bounded, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("accept-language") String acceptLanguage, @retrofit2.http.Query("countrycodes") String countrycodes, @retrofit2.http.Query("namedetails") Integer namedetails, @retrofit2.http.Query("dedupe") Integer dedupe, @retrofit2.http.Query("extratags") Integer extratags, @retrofit2.http.Query("statecode") Integer statecode
  );

}
