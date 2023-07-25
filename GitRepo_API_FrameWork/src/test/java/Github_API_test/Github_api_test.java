package Github_API_test;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Github_api_test {
	
String baseurl="https://api.github.com";

	@Test
	public void get_test() {
		JSONObject jon=new JSONObject();
        jon.put("name", "jagan");
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")
       .body(jon)
       .when()
       .post("/user/repos")
       .then()
       .statusCode(201)
       .log()
       .all();
	}
	@Test
	public void git_update_repository() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")
       .when()
       .patch("/repos/rajesh8188/jagan")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void Get_Repo() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")
       .when()
       .get("/repos/rajesh8188/jagan")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test(enabled = false)
	public void Delete_Repo() {
		JSONObject jon=new JSONObject();
        jon.put("name", "jagan1");
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")
       .body(jon)
       .when()
       .delete("/repos/rajesh8188/jagan")
       .then()
       .statusCode(204)
       .log()
       .all();
	}
	@Test
	public void Create_Fork() {
		
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")     
       .when()
       .post("/repos/kanwarchalotra/AppiumFramework/forks")
       .then()
       .statusCode(202)
       .log()
       .all();
	}
	@Test
	public void List_of_Fork() {
				
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")      
       .when()
       .get("/repos/kanwarchalotra/AppiumFramework/forks")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void List_of_repo_for_users() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")     
       .when()
       .get("/users/Rajesh1/repos")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void List_Repo_Languages() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")     
       .when()
       .get("/repos/kanwarchalotra/AppiumFramework/languages")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void List_Public_Repos() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")      
       .when()
       .get("/repositories")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void List_Reposatory_tags() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")    
       .when()
       .get("/repos/rajesh8188/Rajesh1/tags")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void Create_an_AutoLink_Reference_for_an_repos() {
		JSONObject jon=new JSONObject();
        jon.put("name", "jagan1");
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")
       .body(jon)
       .when()
       .get("/repos/rajesh8188/Rajesh1/autolinks")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void Get_all_repos_topics() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")    
       .when()
       .get("/repos/rajesh8188/Rajesh1/topics")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void Get_an_auto_link_reference_of_repos() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")     
       .when()
       .get("/repos/rajesh8188/Rajesh1/autolinks/1881222")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test(enabled = false)
	public void Delete_an_auto_link_from_a_repos() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")     
       .when()
       .delete("/repos/rajesh8188/Rajesh1/autolinks/1881222")
       .then()
       .statusCode(204)
       .log()
       .all();
	}
	@Test
	public void Get_a_repos() {
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")      
       .when()
       .get("/repos/rajesh8188/Rajesh1")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
	@Test
	public void Replace_all_repos_topics() {
		JSONObject jon=new JSONObject();
        jon.put("name", "jagan1");
		
		given().baseUri(baseurl)
		.header("Authorization","Bearer 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")
        .header("Content-Type","application/json")
       .body(jon)
       .when()
       .get("/repos/rajesh8188/Rajesh1/topics")
       .then()
       .statusCode(200)
       .log()
       .all();
	}
}
