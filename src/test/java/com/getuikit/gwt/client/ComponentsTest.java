package com.getuikit.gwt.client;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.junit.client.GWTTestCase;

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
        ScriptInjector.fromUrl("js/jquery-2.1.3.min.js").setCallback(new Callback<Void, Exception>() {
            @Override
            public void onFailure(Exception e) {
                fail();
            }
            @Override
            public void onSuccess(Void aVoid) {
                ScriptInjector.fromUrl("js/uikit.js").setCallback(new Callback<Void, Exception>() {
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
}
