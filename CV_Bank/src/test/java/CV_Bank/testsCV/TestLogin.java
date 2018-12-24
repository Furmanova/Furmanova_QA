package CV_Bank.testsCV;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {
    @Test
    public void loginTest() {
        app.getSessionHelper().loginClick();
        app.getSessionHelper().login("ivanov@mail.ru", "123456");
    }

    @Test
    public void negativePasswordLoginTest() { // негативный тест на проверку не правильного ввода пароля
        app.getSessionHelper().loginClick();
        app.getSessionHelper().login("ivanov@mail.ru", "12345");
    }

    @Test
    public void negativeMailLoginTest() { //негативный тест на не зарегистированный в базе mail
        app.getSessionHelper().loginClick();
        app.getSessionHelper().login("ivanova@mail.ru", "12345");


    }
}
