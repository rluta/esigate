/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.esigate.util;

import java.util.*;

/**
 * @author  Alexis Thaveau
 */
public class ParameterCollection extends Parameter<Collection<String>> {

    public ParameterCollection(String name, Collection<String> defaultValue) {
        super(name, defaultValue);
    }


    @Override
    public Collection<String> getValue(Properties properties) {

        Collection<String> defaultValue = getDefaultValue();
        if (defaultValue == null) {
            defaultValue = Collections.EMPTY_LIST;
        }
        Collection<String> value = PropertiesUtil.getPropertyValue(properties, getName(), defaultValue);
        return value;

    }
}
