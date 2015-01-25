package com.getuikit.gwt.client.util;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.LinkElement;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by kerby on 1/25/15.
 */
public class CssHelper {

    private static Map<String, LinkElement> styles = new LinkedHashMap<>();

    /** Load CSS file from url */
    public static void loadCss(String url){
        LinkElement link = Document.get().createLinkElement();
        link.setRel("stylesheet");
        link.setHref(url);
        nativeAttachToHead(link);
        styles.put(url, link);
    }

    public static void unloadCss(String url){
        LinkElement scriptElement = styles.get(url);
        if(scriptElement != null){
            scriptElement.removeFromParent();
        }
    }

    /**
     * Attach element to head
     */
    protected static native void nativeAttachToHead(JavaScriptObject scriptElement) /*-{
        $doc.getElementsByTagName("head")[0].appendChild(scriptElement);
    }-*/;

}
