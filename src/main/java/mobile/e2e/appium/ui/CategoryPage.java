package mobile.e2e.appium.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoryPage {

    private CategoryPage() {
    }

    public static final Target BTN_ADD_CATEGORY = Target.the("Button add new category").located(By.id("fab"));
    public static final Target TXT_NAME_CATEGORY = Target.the("Text box to add the name of the new category").located(By.id("editCategoryName"));
    public static final Target TXT_ENTER_COLOR = Target.the("Text box to enter the color category").located(By.id("cpv_hex"));
    public static final Target IMG_CATEGORY = Target.the("Image to select the icon of the new category").locatedBy("//android.widget.RelativeLayout[{0}]");
    public static final Target BTN_CONFIRM_CATEGORY = Target.the("Button to confirm the new category").located(By.id("confirm"));
    public static final Target BTN_SEARCH_CATEGORY = Target.the("Button to search a category").located(By.id("menuItem_search"));
    public static final Target TXT_SEARCH_CATEGORY = Target.the("Text box to search a category").located(By.id("search_src_text"));

}
