package match;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MatchSteps {
    private MatchScreenModel matchScreenModel;
    @Given("Отваряме екран на който да разглеждаме потребители")
    public void openMatchScreen() {
        matchScreenModel = new MatchScreenModel();
    }
    @When("Имаме статичен потребител {string}")
    public void setOurUser(String swiper) {
        matchScreenModel.setSwiper();
    }
    @And("Получаваме потребител на който да реагираме {string}")
    public void hasUser(String user2) {
        matchScreenModel.setUser2();
    }
    @When("Плъзнете\\/преместваме на {string}")
    @When("Получаваме отговор за {string}")
    public void swipeInformation(String swipeDirection, String swipeDirectionUser2) {
        matchScreenModel.swipeCheck(swipeDirection,swipeDirectionUser2);
    }
    @Then("Проверяваме дали съвпадат и получаваме {string}")
    public void matchMessageCheck(String matchMessage) { 
    }

}
