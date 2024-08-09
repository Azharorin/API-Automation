package testrunner;

import controller.CreateListController;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateListTestRunner {
    @Test(priority = 1,description = "Creating a list")
    public void doCreateList() throws IOException, ConfigurationException {
        CreateListController createListController=new CreateListController();
        createListController.docreateList(1,"Test_List",1);

    }

    @Test(priority = 2, description = "Deleteting the newly created list")
    public void dodeleteList() throws IOException, ConfigurationException {
        CreateListController createListController=new CreateListController();
        createListController.deleteList(32);

    }


}
