# BalanceApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**balance**](BalanceApi.md#balance) | **GET** balance.php | 



## balance

> Balance balance()



The Balance API provides a count of request credits left in the user&#39;s account for the day. Balance is reset at midnight UTC everyday (00:00 UTC).

### Example

```java
// Import classes:
import LocationIq.ApiClient;
import LocationIq.ApiException;
import LocationIq.Configuration;
import LocationIq.auth.*;
import LocationIq.models.*;
import com.locationiq.client.api.BalanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://eu1.locationiq.com/v1");
        
        // Configure API key authorization: key
        ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
        key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //key.setApiKeyPrefix("Token");

        BalanceApi apiInstance = new BalanceApi(defaultClient);
        try {
            Balance result = apiInstance.balance();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceApi#balance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Balance**](Balance.md)

### Authorization

[key](../README.md#key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

