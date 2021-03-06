/**
 *  Copyright 2011-2015 Bill Dortch / RunningReds.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.runningreds.horatio.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class CompositeType extends Type {

    protected final List<TypeRef> elemTypes;
    
    protected CompositeType(String name, Category category, TypeRef... elemTypes) {
        super(name, category);
        this.elemTypes = Collections.unmodifiableList(Arrays.asList(elemTypes));
    }

    public List<Type> getElementTypes() {
        List<Type> result = new  ArrayList<Type>(elemTypes.size());
        for (TypeRef ref : elemTypes) {
            result.add(ref.getType());
        }
        return result;
    }
}
