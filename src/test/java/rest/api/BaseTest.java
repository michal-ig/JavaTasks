package rest.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public abstract class BaseTest {

   private static final String URL = "https://jsonplaceholder.typicode.com/";
   public static RequestSpecification REQUEST_SPEC = new RequestSpecBuilder()
      .setBaseUri(URL)
      .log(LogDetail.ALL)
      .setContentType(ContentType.JSON)
      .build();

   public RequestSpecification given() {
      return RestAssured.given()
                        .spec(REQUEST_SPEC)
                        .log().all();

   }
}
