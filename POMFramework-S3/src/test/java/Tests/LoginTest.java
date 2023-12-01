package Tests;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.LoginPage;
import Utilities.ExcelUtilities;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @Test(priority = 1, dataProvider = "testdata")
    public void testLogin(String email, String pass, String thirdParameter) {
        driver.get("https://demowebshop.tricentis.com/");
        loginPage = new LoginPage(driver);
        loginPage.login(email, pass);
      

    }

    @DataProvider(name = "testdata")
    public Object[][] datasupplier() throws Exception {
        Object[][] input = ExcelUtilities.getTestData("Sheet1");

        for (Object[] row : input) {
            System.out.println(Arrays.toString(row));
        }

        return input;
    }


}
