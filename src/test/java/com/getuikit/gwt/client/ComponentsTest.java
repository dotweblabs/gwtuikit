package com.getuikit.gwt.client;

import com.google.gwt.core.client.GWT;
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
        JQuery jquery = GWT.create(JQuery.class);
        jquery.load();
        UIKit.init(UIKit.STYLE.ALMOST_FLAT);
        UIKit.notification("test", UIKit.STATUS.SUCCESS, 1, UIKit.POSITION.TOP_RIGHT);
    }
}
