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
package com.getuikit.gwt.client.resources.css.components;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ComponentsCssResources extends ClientBundle {
    public static final ComponentsCssResources INSTANCE = GWT.create(ComponentsCssResources.class);
    @Source("form-password.css")
    TextResource formPasswordBasic();
    @Source("form-password.almost-flat.css")
    TextResource formPasswordAlmostFlat();
    @Source("form-password.gradient.css")
    TextResource formPasswordGradient();
}
