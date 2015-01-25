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
package com.getuikit.gwt.client.resources.css;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface CssResources extends ClientBundle {
    public static final CssResources INSTANCE = GWT.create(CssResources.class);
    @Source("uikit.css")
    TextResource uikitCSS();
    @Source("uikit.almost-flat.css")
    TextResource uikitAlmostFlatCSS();
    @Source("uikit.gradient.css")
    TextResource uikitGradientCSS();
}
