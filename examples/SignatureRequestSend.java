import com.dropbox.sign.ApiException;
import com.dropbox.sign.Configuration;
import com.dropbox.sign.api.*;
import com.dropbox.sign.auth.*;
import com.dropbox.sign.model.*;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        var apiClient = Configuration.getDefaultApiClient()
            .setApiKey("YOUR_API_KEY");

        // or, configure Bearer (JWT) authorization: oauth2
        /*
        var apiClient = Configuration.getDefaultApiClient()
            .setBearerToken("YOUR_ACCESS_TOKEN");
        */

        var signatureRequestApi = new SignatureRequestApi(apiClient);

        var signer1 = new SubSignatureRequestSigner()
            .emailAddress("jack@example.com")
            .name("Jack")
            .order(0);

        var signer2 = new SubSignatureRequestSigner()
            .emailAddress("jill@example.com")
            .name("Jill")
            .order(1);

        var signingOptions = new SubSigningOptions()
            .draw(true)
            .type(true)
            .upload(true)
            .phone(true)
            .defaultType(SubSigningOptions.DefaultTypeEnum.DRAW);

        var subFieldOptions = new SubFieldOptions()
            .dateFormat(SubFieldOptions.DateFormatEnum.DDMMYYYY);

        var data = new SignatureRequestSendRequest()
            .title("NDA with Acme Co.")
            .subject("The NDA we talked about")
            .message("Please sign this NDA and then we can discuss more. Let me know if you have any questions.")
            .signers(List.of(signer1, signer2))
            .ccEmailAddresses(List.of("lawyer1@dropboxsign.com", "lawyer2@dropboxsign.com"))
            .addFilesItem(new File("example_signature_request.pdf"))
            .metadata(Map.of("custom_id", 1234, "custom_text", "NDA #9"))
            .signingOptions(signingOptions)
            .fieldOptions(subFieldOptions)
            .testMode(true);

        try {
            SignatureRequestGetResponse result = signatureRequestApi.signatureRequestSend(data);
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
