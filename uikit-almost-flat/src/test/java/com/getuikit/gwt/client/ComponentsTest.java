package com.getuikit.gwt.client;

import com.getuikit.gwt.client.util.CssHelper;
import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.Button;

/**
 * Created by kerby on 1/26/15.
 */
public class ComponentsTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.getuikit.gwt.UIKit";
    }

    @Override
    protected void gwtSetUp() throws Exception {
    }

    public void testNotifyComponent(){
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
                        UIKit.notification("test", UIKit.STATUS.SUCCESS, 1, UIKit.POSITION.TOP_RIGHT);
                    }
                }).setWindow(ScriptInjector.TOP_WINDOW).inject();
            }
        }).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

    public void testStickyComponent(){
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
                        Button button = new Button("Test");
                        //UIKit.sticky(button.getElement());
                    }
                }).setWindow(ScriptInjector.TOP_WINDOW).inject();
            }
        }).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }
}
