package modules

class HeaderModule extends AbstractModule {

    static content = {
        header { $("div.row.topper") }
        name { header.find("#site-name") }
        slogan { header.find("#site-slogan") }
    }

    def getSiteName() {
        return name.text()
    }

    def getSiteSlogan() {
        return slogan.text()
    }

}
