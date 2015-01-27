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
package com.getuikit.gwt.client.ui;

public enum Width {
        UK_WIDTH_1_1("uk-width-1-1"),
        UK_WIDTH_SMALL_1_1("uk-small-1-1"), UK_WIDTH_SMALL_1_2("uk-small-1-2"), UK_WIDTH_SMALL_1_3("uk-small-1-3"),
        UK_WIDTH_SMALL_1_4("uk-small-1-4"), UK_WIDTH_SMALL_1_5("uk-small-1-5"), UK_WIDTH_SMALL_1_6("uk-small-1-6"),
        UK_WIDTH_SMALL_1_7("uk-small-1-7"), UK_WIDTH_SMALL_1_8("uk-small-1-8"), UK_WIDTH_SMALL_1_9("uk-small-1-9");
    private String width = null;
    private Width(String status){
        this.width = status;
    }
    public boolean equalsName(String width){
        return (width == null)? false : this.width.equals(width);
    }
    public String toString(){
        return width;
    }
}
