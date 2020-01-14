import geb.spock.GebSpec

import pages.IndexPage
import pages.SimpleFormDemoPage
import spock.lang.Stepwise

@Stepwise
class FlowSpec extends GebSpec {

    def "Validate Header"() {
        given:
        to IndexPage

        when:
        at IndexPage

        then:
        welcomeModule.welcomeHeader == "WELCOME TO SELENIUM EASY DEMO"
    }

    def "Click on Get Practicing"() {
        given:
        at IndexPage

        when:
        welcomeModule.clickOnStartPracticingButton()

        then:
        welcomeModule.basicHeader == "BASIC EXAMPLES TO START WITH SELENIUM"
    }

    def "Click on Simple Form Demo"() {
        given:
        at IndexPage

        when:
        welcomeModule.clickOnSimpleFormDemoButton()

        then:
        at SimpleFormDemoPage
    }

    def "Validate Single Input Field"() {
        given:
        at SimpleFormDemoPage
        def message = "This is my message"

        when:
        simpleFormDemoModule.setMessage(message)
        simpleFormDemoModule.clickOnShowMessage()

        then:
        simpleFormDemoModule.getMessage() == message
    }

}
