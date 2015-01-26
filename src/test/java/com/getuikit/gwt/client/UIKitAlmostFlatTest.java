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


import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.junit.client.GWTTestCase;

/**
 *
 * Unit tests of {@link com.getuikit.gwt.client.UIKit}
 * with almost flat style
 * @author Kerby Martino <email>kerbymart@gmail.com</email>
 */
public class UIKitAlmostFlatTest extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.getuikit.gwt.UIKit";
	}

	@Override
	protected void gwtSetUp() throws Exception {

	}
	@Override
	protected void gwtTearDown() throws Exception {
	}

	public void testGetVersion(){
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
						assertEquals("2.16.2", UIKit.getVersion());
					}
				}).setWindow(ScriptInjector.TOP_WINDOW).inject();
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
