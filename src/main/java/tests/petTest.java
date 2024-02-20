package tests;

import com.github.dockerjava.transport.DockerHttpClient;
import org.junit.Test;
 import io.restassured.RestAssured.*;
 import static org.hamcrest.Matcher.*;

import static io.restassured.RestAssured.when;

public class petTest {
    @Test
    public void apiPetTest(){
   //when().get("https://petstore.swagger.io/v2/pet/61502").then().assertThat().statusCode(200).and().body("category.name" is "/Bedlington Terrier/");

    }
    @Test
    public void petAdd(){

    }
}

