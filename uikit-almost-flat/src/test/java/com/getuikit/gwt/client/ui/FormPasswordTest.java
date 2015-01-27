package com.getuikit.gwt.client.ui;

import com.getuikit.gwt.client.UIKit;
import com.getuikit.gwt.client.util.CssHelper;
import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
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
        String moduleBase = GWT.getModuleBaseURL();
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "js/jquery-2.1.3.min.js").setCallback(new Callback<Void, Exception>() {
            @Override
            public void onFailure(Exception e) {
                fail();
            }
            @Override
            public void onSuccess(Void aVoid) {
                ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "js/uikit.js").setCallback(new Callback<Void, Exception>() {
                    @Override
                    public void onFailure(Exception e) {
                        fail();
                    }
                    @Override
                    public void onSuccess(Void aVoid) {
                        FormPasswordTextBox textbox = new FormPasswordTextBox();
                        textbox.setText("This is a password");
                        assertNotNull(textbox);
                        assertEquals("This is a password", textbox.getText());
                    }
                }).setWindow(ScriptInjector.TOP_WINDOW).inject();
            }
        }).setWindow(ScriptInjector.TOP_WINDOW).inject();

    }

}
