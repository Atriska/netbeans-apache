/*
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
package org.netbeans.modules.web.jsf.impl.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.netbeans.modules.web.jsf.api.facesmodel.FacesConfig;
import org.netbeans.modules.web.jsf.api.facesmodel.JSFConfigComponent;
import org.netbeans.modules.web.jsf.api.metamodel.Component;


/**
 * @author ads
 *
 */
class ComponentFinder implements ElementFinder<Component> {

    /* (non-Javadoc)
     * @see org.netbeans.modules.web.jsf.impl.metamodel.ElementFinder#getAnnotations(org.netbeans.modules.web.jsf.impl.metamodel.JsfModelImpl)
     */
    public List<Component> getAnnotations( JsfModelImpl model  ) {
        Collection<ComponentImpl> collection = model.getComponentManager().getObjects();
        return new ArrayList<Component>( collection );
    }

    /* (non-Javadoc)
     * @see org.netbeans.modules.web.jsf.impl.metamodel.ElementFinder#getConfigType()
     */
    public Class<? extends JSFConfigComponent> getConfigType() {
        return FacesConfig.class;
    }

}
