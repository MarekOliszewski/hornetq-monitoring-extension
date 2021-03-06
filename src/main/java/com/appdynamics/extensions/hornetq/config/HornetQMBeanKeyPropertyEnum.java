/**
 * Copyright 2015 AppDynamics
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.appdynamics.extensions.hornetq.config;

/**
 * Created by balakrishnav on 2/4/15.
 */
public enum HornetQMBeanKeyPropertyEnum {
    TYPE("type"),
    ADDRESS("address"),
    MODULE("module"),
    NAME("name");

    private String name;

    private HornetQMBeanKeyPropertyEnum(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
