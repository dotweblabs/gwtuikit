package com.getuikit.gwt.client.ui;

import com.getuikit.gwt.client.util.CssHelper;
import com.google.gwt.junit.client.GWTTestCase;


public class FormPasswordTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.getuikit.gwt.UIKit";
    }

    @Override
    protected void gwtSetUp() throws Exception {
    }

    public void testFormPasswordTextBox(){
        FormPasswordTextBox textbox = new FormPasswordTextBox();
        textbox.setText("This is a password");
        assertNotNull(textbox);
        assertEquals("This is a password", textbox.getText());
    }

}
