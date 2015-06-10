/*
 * Copyright(c) Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.odlab.impl.rev141210;

import org.opendaylight.odlab.impl.OdlabProvider;

public class OdlabModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.odlab.impl.rev141210.AbstractOdlabModule {
    public OdlabModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public OdlabModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.odlab.impl.rev141210.OdlabModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        OdlabProvider provider = new OdlabProvider();
        getBrokerDependency().registerProvider(provider);
        return provider;
    }

}
