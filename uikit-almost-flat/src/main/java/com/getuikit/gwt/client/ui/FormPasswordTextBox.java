package com.getuikit.gwt.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.TextBoxBase;

public class FormPasswordTextBox extends TextBoxBase {

    Element input = DOM.createInputPassword();
    Element a = DOM.createAnchor();

    protected FormPasswordTextBox(Element elem) {
        super(elem);
    }
    public FormPasswordTextBox(){
        this(Document.get().createDivElement(), "uk-form-password");
    }

    public FormPasswordTextBox(Element element, String styleName) {
        super(element);

        a.addClassName("uk-form-password-toggle");
        a.setAttribute("data-uk-form-password", "");
        a.setInnerText("Show");
        element.appendChild(input);
        element.appendChild(a);
        if(styleName != null) {
            this.setStyleName(styleName);
        }
    }

    @Override
    public String getText() {
        return input.getPropertyString("value");
    }

    @Override
    public void setText(String text) {
        input.setPropertyString("value", text);
    }
}
