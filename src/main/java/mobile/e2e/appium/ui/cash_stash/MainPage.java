package mobile.e2e.appium.ui.cash_stash;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    private MainPage() {
    }

    public static final Target BTN_ADD_EXPENSE_INCOME = Target.the("Button for adding new expense or income").located(By.id("fab"));
    public static final Target LBL_INFO_BALANCE_TOTAL = Target.the("Label with the total balance general information").located(By.id("txtTEst"));
    public static final Target LBL_INFO_BALANCE_DAILY = Target.the("Label with the daily balance general information").located(By.id("listMainRecycler_total"));

}
