package web.testjendemo.devrabbittest.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomePageScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://www.devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"TestJenDemo\",\"project_description\":\"\",\"project_id\":209,\"module_name\":\"DevrabbitTest\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":352,\"testcase_name\":\"Tc2_test\",\"testcase_id\":422,\"testset_id\":0,\"executed_timestamp\":-1725564676,\"browser_type\":\"chrome\"}";

	public static String projectName = "testjendemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomePageScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_293913A;
	public String clkAContact_293913() {
		waitForExpectedElement(driver, Contact_293913A);		
		String text = Contact_293913A.getText();
		Contact_293913A.click();
		return text;
	}

}