package RESTAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class PayPalOauth2 {
        String accessToken;

        @Test(priority = '1')
        public void GetAccessToekn() {
                String clientID = "jrx8hJmyehSZOHdoe-CsdxBH";
                String clinetsecret = "Of3X5jsed7QedOICC682xhDLcUA-H2zX_rbhNeD-IKqQA2SA";

                Response res = RestAssured.given()
                        .baseUri("https://api-m.sandbox.paypal.com")
                        .basePath("/v1/oauth2/token")
                        .auth().preemptive().basic(clientID, clinetsecret)
                        .param("grant_type", "client_credentials")
                        .when().post();
                Assert.assertEquals(res.statusCode(), 200);
                accessToken = res.getBody().path("access_token");

                System.out.println(accessToken);

        }

        @Test(priority = '2')
        public void paypalTestAPI() {
                Response res = RestAssured.given()
                        .baseUri("https://api-m.sandbox.paypal.com")
                        .basePath("/v1/invoicing/invoices")
                        .queryParam("page", "3")
                        .queryParam("page_size", "4")
                        .queryParam("total_count_required", true)
                        .auth().oauth2(accessToken)
                        .when().get();

                res.prettyPrint();

        }
}