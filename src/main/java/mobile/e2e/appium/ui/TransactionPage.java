package mobile.e2e.appium.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransactionPage {
    private TransactionPage() {
    }

    public static final Target CMB_CATEGORY = Target.the("Combo box for choosing the category").located(By.xpath("//android.widget.LinearLayout/android.widget.ImageView[2]"));
    public static final Target LBL_TYPE = Target.the("Label with the type of transaction expense/income").locatedBy("//*[contains(@text, '{0}')]");
    public static final Target LBL_CATEGORY = Target.the("Label with the category to add").locatedBy("//*[contains(@text, '{0}')]");
    public static final Target TXT_VALUE_TRANSACTION = Target.the("Text for adding value of expense/income").located(By.id("expense_setAmount"));
    public static final Target BTN_CONFIRM_TRANSACTION = Target.the("Button to confirm the new expense/income").located(By.id("addExpense_FAB"));

}
