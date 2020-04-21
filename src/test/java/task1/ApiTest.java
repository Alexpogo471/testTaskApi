package task1;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import task1.pojo.PageRoot;
import task1.pojo.UserPost;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class ApiTest {

    @Test(description = "GET")
    public void getUsers() {
        Response response = get("https://reqres.in/api/users?page=2");
        PageRoot pageRoot = response.as(PageRoot.class);
        Assert.assertNotNull(pageRoot);
        System.out.println("Status code: " + response.getStatusCode() +
                "\n Root object" + ":\n " + pageRoot);
        Assert.assertNotNull(pageRoot.getUsers());
        System.out.println("List users:\n " + pageRoot.getUsers());
    }

    @Test(description = "POST")
    public void sendUser() {
        Map<String,Object> requestParams = new HashMap<>();
        requestParams.put("name","morpheus");
        requestParams.put("job","leader");
        baseURI = "https://reqres.in";
        Response response = given()
                .body(requestParams)
                .header("Content-Type", "application/json")
                .post("/api/users");
        Assert.assertEquals(response.getStatusCode(), 201);
        UserPost user = response.as(UserPost.class);
        Assert.assertEquals(new UserPost("morpheus","leader"),user);
        System.out.println(response.asString());
        System.out.println(user);


    }
}
