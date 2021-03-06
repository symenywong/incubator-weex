/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.weex.dom.binding;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by furture on 2018/5/8.
 */

public class JSONUtils {


    public static boolean isJSON(Object json){
        if(json instanceof JSONObject){
            return true;
        }
        if(json instanceof String){
            return ((String) json).startsWith("{");
        }
        return false;
    }

    public static JSONObject toJSON(Object json){
        if(json instanceof JSONObject){
            return (JSONObject) json;
        }
        return JSONObject.parseObject(json.toString());
    }


    public static boolean isJSON(String json){
        return json.startsWith("{");
    }
}
