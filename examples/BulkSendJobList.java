import com.dropbox.sign.ApiException;
import com.dropbox.sign.Configuration;
import com.dropbox.sign.api.*;
import com.dropbox.sign.auth.*;
import com.dropbox.sign.model.*;

public class Example {
    public static void main(String[] args) {
        var apiClient = Configuration.getDefaultApiClient()
            .setApiKey("YOUR_API_KEY");

        // or, configure Bearer (JWT) authorization: oauth2
        /*
        var oauth2 = (HttpBearerAuth) apiClient
            .getAuthentication("oauth2");
        oauth2.setBearerToken("YOUR_ACCESS_TOKEN");
        */

        var bulkSendJobApi = new BulkSendJobApi(apiClient);

        var page = 1;
        var pageSize = 20;

        try {
            BulkSendJobListResponse result = bulkSendJobApi.bulkSendJobList(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
