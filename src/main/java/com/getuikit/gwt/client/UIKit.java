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
package com.getuikit.gwt.client;

import com.getuikit.gwt.client.resources.css.CssResources;
import com.getuikit.gwt.client.resources.css.components.ComponentsCssResources;
import com.getuikit.gwt.client.resources.js.JavascriptResources;
import com.getuikit.gwt.client.util.CssHelper;
import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.StyleInjector;

/**
 * Main UIKit GWT Class
 * @author Kerby Martino <email>kerbymart@gmail.com</email>
 */
public class UIKit {

    public static enum STYLE {BASIC, ALMOST_FLAT, GRADIENT};

    private static STYLE activetStyle;

    private static boolean hasInit = false;

    public static void init(){
        init(STYLE.BASIC);
    }

    public static void init(STYLE style){
        if(style.equals(STYLE.BASIC)){
            StyleInjector.inject(CssResources.INSTANCE.uikitCSS().getText());
        }else if(style.equals(STYLE.ALMOST_FLAT)){
            StyleInjector.inject(CssResources.INSTANCE.uikitAlmostFlatCSS().getText());
        }else if(style.equals(STYLE.GRADIENT)){
            StyleInjector.inject(CssResources.INSTANCE.uikitGradientCSS().getText());
        }
        JQuery jquery = GWT.create(JQuery.class);
        jquery.load();
        ScriptInjector.fromString(JavascriptResources.INSTANCE.uikitJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW)
                .inject();
        activetStyle = style;
        hasInit = true;
    }

    public static boolean hasInit() {
        return hasInit;
    }

    public static STYLE getActivetStyle() {
        return activetStyle;
    }

    public static String getVersion(){
        return uikitVersion();
    }
    public static native String uikitVersion()/*-{
        return $wnd.UIkit.version;
    }-*/;

}
