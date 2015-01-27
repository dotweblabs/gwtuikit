/**
 *
 * Copyright (c) 2015 Kerby Martino and others. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.getuikit.gwt.client.ui;

import com.getuikit.gwt.client.UIKit;
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
        UIKit.injectFormPassword();
    }

    public FormPasswordTextBox(Element element, String styleName) {
        super(element);
        a.addClassName("uk-form-password-toggle");
        a.setAttribute("data-uk-form-password", "");
        a.setInnerText("Show");
        element.appendChild(input);
        element.appendChild(a);
        if(styleName != null) {
            element.addClassName(styleName);
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

    /**
     * Add class like, 'uk-width-1-1', 'uk-small-1-1', etc.
     *
     * @param className
     */
    public void addClass(String className){
        getElement().addClassName(className);
    }

    public void setWidth(Width sizing){
        input.addClassName(sizing.toString());
    }

    public void setWidth(Width... sizings){
        for(Width w : sizings){
            input.addClassName(w.toString());
        }
    }

}
