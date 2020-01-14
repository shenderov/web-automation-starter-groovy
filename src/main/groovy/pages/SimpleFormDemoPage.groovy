package pages

import modules.HeaderModule
import modules.SimpleFormDemoModule

class SimpleFormDemoPage extends AbstractPage {

    static at = { simpleFormDemoModule.getHeader() == "This would be your first example to start with Selenium." }

    static content = {
        headerModule { module(HeaderModule) }
        simpleFormDemoModule { module(SimpleFormDemoModule) }
    }

}
