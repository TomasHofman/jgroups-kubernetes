/**
 *  Copyright 2014 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package org.openshift.ping.kube.test;

import org.openshift.ping.common.server.JBossServerFactory;
import org.openshift.ping.kube.KubePing;

/**
 * @author <a href="mailto:ales.justin@jboss.org">Ales Justin</a>
 */
public class JBossServerTest extends ServerTestBase {
    protected void applyConfig(KubePing ping) {
        ping.setServerFactory(new JBossServerFactory());
    }
}