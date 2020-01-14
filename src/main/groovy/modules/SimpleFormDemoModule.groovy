package modules

class SimpleFormDemoModule extends AbstractModule {

    static content = {
        container { $("#easycont") }
        pageHeader { container.find("div.col-md-6.text-left > h3") }
        messageField { container.find("input#user-message") }
        showMessageButton { container.find("#get-input > button") }
    }

    def getHeader() {
        return pageHeader.text()
    }

    void setMessage(def message) {
        messageField = message
    }

    void clickOnShowMessage() {
        showMessageButton.click()
    }

    def getMessage() {
        return messageField
    }

}
