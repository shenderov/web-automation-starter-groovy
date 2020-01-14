package pages

import modules.HeaderModule
import modules.WelcomeModule

class IndexPage extends AbstractPage {

    static content = {
        headerModule { module(HeaderModule) }
        welcomeModule { module(WelcomeModule) }
    }

}
