//   Copyright 2011 Anaplan Inc.
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.anaplan.client;

import java.util.List;

import com.anaplan.client.serialization.TypeWrapper;

/**
 * A view of a module.
 * 
 * @since 1.1
 */
public class View extends NamedObject {

    /**
     * Data passed over the wire
     */
    static final class Data extends NamedObject.Data {
    }

    static TypeWrapper<Data> DATA_TYPE = new TypeWrapper<Data>() {
    };
    static TypeWrapper<List<Data>> DATA_LIST_TYPE = new TypeWrapper<List<Data>>() {
    };

    View(Module module, Data data) {
        super(module.getModel(), data);
    }

    @Override
    String getPath() {
        throw new UnsupportedOperationException();
    }
}
