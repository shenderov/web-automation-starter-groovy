package modules

class WelcomeModule extends AbstractModule {

    static content = {
        container { $("#easycont") }
        homeContainer { container.find("#home") }
        basicContainer { container.find("#basic") }
        welcomeHeaderElement { homeContainer.find("h3") }
        basicHeaderElement { basicContainer.find("h3") }
        startPracticingButton { homeContainer.find("#btn_basic_example") }
        simpleFormDemoButton { basicContainer.find("#basic > div > a:nth-child(1)") }
    }

    def getWelcomeHeader() {
        return welcomeHeaderElement.text()
    }

    def getBasicHeader() {
        return basicHeaderElement.text()
    }

    void clickOnStartPracticingButton() {
        startPracticingButton.click()
        sleep(500)
    }

    void clickOnSimpleFormDemoButton() {
        simpleFormDemoButton.click()
    }

}
