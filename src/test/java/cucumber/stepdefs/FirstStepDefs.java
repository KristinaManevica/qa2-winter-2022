package cucumber.stepdefs;

import io.cucumber.java.en.When;

public class FirstStepDefs {
    @When("user prints welcome text")
    public void print_welcome_text(){                    //vsegda public, zapuskajetsja junit izvne, prinjato underscore
        System.out.println("Hello World!");
    }
}
