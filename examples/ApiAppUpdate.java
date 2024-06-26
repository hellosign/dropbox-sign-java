import com.dropbox.sign.ApiException;
import com.dropbox.sign.Configuration;
import com.dropbox.sign.api.*;
import com.dropbox.sign.auth.*;
import com.dropbox.sign.model.*;

import java.io.File;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        var apiClient = Configuration.getDefaultApiClient()
            .setApiKey("YOUR_API_KEY");

        // or, configure Bearer (JWT) authorization: oauth2
        /*
        var apiClient = Configuration.getDefaultApiClient()
            .setBearerToken("YOUR_ACCESS_TOKEN");
        */

        var apiAppApi = new ApiAppApi(apiClient);

        var oauth = new SubOAuth()
            .callbackUrl("https://example.com/oauth")
            .scopes(List.of(SubOAuth.ScopesEnum.BASIC_ACCOUNT_INFO, SubOAuth.ScopesEnum.REQUEST_SIGNATURE));

        var whiteLabelingOptions = new SubWhiteLabelingOptions()
            .primaryButtonColor("#00b3e6")
            .primaryButtonTextColor("#ffffff");

        var customLogoFile = new File("CustomLogoFile.png");

        var data = new ApiAppUpdateRequest()
            .name("My Production App")
            .domains(List.of("example.com"))
            .oauth(oauth)
            .whiteLabelingOptions(whiteLabelingOptions)
            .customLogoFile(customLogoFile);

        var clientId = "0dd3b823a682527788c4e40cb7b6f7e9";

        try {
            ApiAppGetResponse result = apiAppApi.apiAppUpdate(clientId, data);
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
