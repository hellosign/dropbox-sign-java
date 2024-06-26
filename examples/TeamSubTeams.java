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
        var apiClient = Configuration.getDefaultApiClient()
            .setBearerToken("YOUR_ACCESS_TOKEN");
        */

        var teamApi = new TeamApi(apiClient);

        var teamId = "4fea99bfcf2b26bfccf6cea3e127fb8bb74d8d9c";
        var page = 1;
        var pageSize = 20;

        try {
            TeamSubTeamsResponse result = teamApi.teamSubTeams(teamId, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamApi#teamSubTeams");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
