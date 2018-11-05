package CV_Bank.testsCV;

import org.testng.annotations.Test;

public class TestLogin extends TestBase {
    @Test
    public void loginTest() {
        app.getSessionHelper().clickToLogin();
        app.getSessionHelper().login("ivanova@mail.ru", "12345.com");
        app.getSessionHelper().clickOnProceedButton();
        app.getSessionHelper().clickCloseSuccessLogin();
    }

    @Test
    public void negativePasswordLoginTest() { // негативный тест на проверку не правильного ввода пароля
        app.getSessionHelper().clickToLogin();
        app.getSessionHelper().login("ivanova@mail.ru", "12345");
        app.getSessionHelper().clickOnProceedButton();
        app.getSessionHelper().clickCloseSuccessLogin();

    }
    @Test
    public void negativeMailLoginTest() { //негативный тест на не зарегистированный в базе mail
        app.getSessionHelper().clickToLogin();
        app.getSessionHelper().login("ivanov@mail.ru", "12345");
        app.getSessionHelper().clickOnProceedButton();
        app.getSessionHelper().clickCloseSuccessLogin();

    }
}
