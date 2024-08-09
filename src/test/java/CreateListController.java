import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;


public class CreateListController extends Setup {
    public CreateListController() throws IOException {
        initConfig();
    }
    public void docreateList(int boardId, String name, int order) throws ConfigurationException {
        RestAssured.baseURI = prop.getProperty("baseURL");
        CreateListModel createListModel =new CreateListModel();
        createListModel.setName(name);
        createListModel.setBoardId(boardId);
        createListModel.setOrder(order);
        Response res = given().contentType("application/json").body(createListModel).when().post("api/lists")
                .then()
                .assertThat().
                statusCode(201).
                extract().response();
       System.out.println(res.asString());

        JsonPath jsonObj = res.jsonPath();
        int id = jsonObj.get("id");
        System.out.println(id);
        Utils.setId(id, id);

    }
    public void deleteList(int id) throws ConfigurationException {

        RestAssured.baseURI = prop.getProperty("baseURL");
        Response res = given()
                .when()
                .delete("api/lists/" + id)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(res.asString());
    }



}
