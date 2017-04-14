import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.File;

/**
 * Created by mitchell on 13/04/17.
 */
public class stepdef {
    String fileName;

    //JSONObject json = new JSONObject(jsonAsString);
//    WireMockServer wm = new WireMockServer();
//
//
//    @Before
//    public void init() {
//        fileName = loadData("test2");
//        WireMock.configureFor("localhost", 8080);
//        wm.start();

//    }

    public String loadData(String fileName) {
        String file;

        file = fileName + ".json";
        File fl = new File(file);
        fileName = fl.getName();

        return fileName;
    }


    @Given("^the loaded data is (\\d+)$")
    public void the_loaded_data_is(int arg1)  {

    }

    @Given("^the endpoint is ready$")
    public void the_endpoint_is_ready()  {

    }

    @When("^the endpoint is called$")
    public void the_endpoint_is_called()  {

    }

    @Then("^stuff happens$")
    public void stuff_happens() throws Throwable {

    }




}
