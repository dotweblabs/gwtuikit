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
import com.getuikit.gwt.client.resources.js.JavascriptResources;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.StyleInjector;

/**
 * Main UIKit GWT Class
 * @author Kerby Martino <email>kerbymart@gmail.com</email>
 */
public class UIKit {

    public static enum STYLE {BASIC, ALMOST_FLAT, GRADIENT};
    public static enum STATUS {INFO("info"), SUCCESS("success"), WARNING("warning"), DANGER("danger");
        private String status = null;
        private STATUS(String status){
            this.status = status;
        }
        public boolean equalsName(String otherName){
            return (otherName == null)? false : status.equals(otherName);
        }
        public String toString(){
            return status;
        }
    }
    public static enum POSITION { TOP_CENTER("top-center"), TOP_LEFT("top-left"), TOP_RIGHT("top-right"),
        BOTTOM_CENTER("bottom-center"), BOTTOM_LEFT("bottom-left"), BOTTOM_RIGHT("bottom-right");
        private String pos = null;
        private POSITION(String pos){
            this.pos = pos;
        }
        public boolean equalsName(String otherName){
            return (otherName == null)? false : pos.equals(otherName);
        }
        public String toString(){
            return pos;
        }
    };

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
        ScriptInjector.fromString(JavascriptResources.INSTANCE.uikitJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW)
                .inject();
        activetStyle = style;
        hasInit = true;
    }

    public static void setActiveStyle(STYLE style){
        activetStyle = style;
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

    public static void notification(String message, STATUS status, int timeout, POSITION pos){
        Components.injectNotify();
        _notify(message, status.name(), timeout, pos.name());
    }

    private static native void _notify(String _message, String _status, int _timeout, String _pos)/*-{
        $wnd.UIkit.notify({
                        message : _message,
                        status  : _status,
                        timeout : _timeout,
                        pos     : _pos
                    });
    }-*/;

}
