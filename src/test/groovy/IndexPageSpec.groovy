import geb.spock.GebSpec
import pages.IndexPage
import spock.lang.Stepwise

@Stepwise
class IndexPageSpec extends GebSpec {

    def "Validate Site Name and Logo"() {
        when:
        to IndexPage

        then:
        at IndexPage

        and:
        headerModule.siteName == "Selenium Easy"

        and:
        headerModule.siteSlogan == "Complete Automation Testing Tutorials"
    }

}
