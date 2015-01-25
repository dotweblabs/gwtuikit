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

import com.getuikit.gwt.client.resources.css.components.ComponentsCssResources;
import com.getuikit.gwt.client.resources.js.components.ComponentsJavascriptResources;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.StyleInjector;

public class Components {

    private static boolean formPasswordInjected;
    private static boolean notifyInjected;

    static {
        formPasswordInjected = false;
        notifyInjected = false;
        // If user did not init(),
        // init the with the basic style
//        if(!UIKit.hasInit()){
//            UIKit.init();
//        }
    }

    /**
     * Injects JS and CSS for Form Password add-on
     */
    public static void injectFormPassword(){
        if(!formPasswordInjected){
            if(UIKit.getActivetStyle().equals(UIKit.STYLE.BASIC)){
                StyleInjector.inject(ComponentsCssResources.INSTANCE.formPasswordBasic().getText());
            } else if(UIKit.getActivetStyle().equals(UIKit.STYLE.ALMOST_FLAT)){
                StyleInjector.inject(ComponentsCssResources.INSTANCE.formPasswordBasic().getText());
            } else if(UIKit.getActivetStyle().equals(UIKit.STYLE.GRADIENT)){
                StyleInjector.inject(ComponentsCssResources.INSTANCE.formPasswordBasic().getText());
            }
            String script = ComponentsJavascriptResources.INSTANCE.formPasswordJS().getText();
            new ScriptInjector.FromString(script)
                    .setWindow(ScriptInjector.TOP_WINDOW)
                    .inject();
            formPasswordInjected = true;
        }
    }

    /**
     * Injects JS and CSS for Notify add-on
     */
    public static void injectNotify(){
        if(!notifyInjected){
            if(UIKit.getActivetStyle().equals(UIKit.STYLE.BASIC)){
                StyleInjector.inject(ComponentsCssResources.INSTANCE.notifyBasic().getText());
            } else if(UIKit.getActivetStyle().equals(UIKit.STYLE.ALMOST_FLAT)){
                StyleInjector.inject(ComponentsCssResources.INSTANCE.notifyAlmostFlat().getText());
            } else if(UIKit.getActivetStyle().equals(UIKit.STYLE.GRADIENT)){
                StyleInjector.inject(ComponentsCssResources.INSTANCE.notifyGradient().getText());
            }
            String script = ComponentsJavascriptResources.INSTANCE.notifyJS().getText();
            new ScriptInjector.FromString(script)
                    .setWindow(ScriptInjector.TOP_WINDOW)
                    .inject();
            notifyInjected = true;
        }
    }
}
