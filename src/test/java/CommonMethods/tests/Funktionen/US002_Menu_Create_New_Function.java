package CommonMethods.tests.Funktionen;

import CommonMethods.pagefactory.POManager;
import CommonMethods.utils.Config;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US002_Menu_Create_New_Function extends POManager {

    @Test(description = "23048 Functions_Menu_Create new Function")
    public void TC001_Menu_New_Creation() {

        getFunctionPage().openBrowser(Config.getProperty("url"));
        getFunctionPage().writeSearchText("Funktionen");
        getFunctionPage().clickFunctionBtn();
        Assert.assertTrue(getFunctionPage().getBtnHinzufugen().isEnabled());
       // getFunctionPage().selectOrganisation(getFunctionPage().getComboBoxOrganisation());
       // getFunctionPage().selectRole(getFunctionPage().getCbbRoleLesen());
        getFunctionPage().getComboBoxOrganizationEinheit("500");
        getFunctionPage().getSelectOrganization("Mitarbeit");
        //Assert.assertTrue(getFunctionPage().getBtnCreateFunction().getAttribute("class").contains("is-disabled"));
        getFunctionPage().getBtnCreateFunction();
        String[] rows = {"500"};
        getFunctionPage().allRowsInLine(rows);
        Assert.assertTrue(getFunctionPage().getHinzugefügtAm().isDisplayed());
        getFunctionPage().clickHinzugefugtAmSortieren();
        Assert.assertTrue(getFunctionPage().getAscendingAndDescendingPanel().isDisplayed());
        getFunctionPage().functionCheckBoxForCreate();
        getFunctionPage().clickButtonLöschenMainBar();
        getFunctionPage().confirmLöschenButton();






    }
}
