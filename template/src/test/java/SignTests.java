import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TitlePage;

public class SignTests extends BaseTest {

    @Test
    public void sign_gender_return() throws InterruptedException {
        HomePage h = new HomePage(driver);
        h.go_to_sign_page();
        TitlePage t = new TitlePage(driver);
        t.should_be_title_page();
        t.go_to_back();
    }


    @Test
    public void signFailed() throws InterruptedException {



    }
}
