package testrunner;

import controller.CreateListController;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateListTestRunner {
    int listId;
    @Test(priority = 1, description = "Creating a list")
    public void createList() throws IOException, ConfigurationException {
        CreateListController createListController = new CreateListController();
        listId = createListController.doCreateList(1, "Test_List", 1);
    }

    @Test(priority = 2, description = "Deleteting the newly created list")
    public void deleteList() throws IOException, ConfigurationException {
        CreateListController createListController = new CreateListController();
        createListController.doDeleteList(listId);
    }

}
