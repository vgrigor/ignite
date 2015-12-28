/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal;

import org.apache.ignite.configuration.IgniteConfiguration;

/**
 * Test secret key.
 */
public class NodeJsSecretKeySelfTest extends NodeJsAbstractTest {
    /**
     * Constructor.
     */
    public NodeJsSecretKeySelfTest() {
        super("test-key.js");
    }

    /** {@inheritDoc} */
    @Override protected IgniteConfiguration getConfiguration(String gridName) throws Exception {
        IgniteConfiguration cfg = super.getConfiguration(gridName);

        cfg.getConnectorConfiguration().setSecretKey("secret-key");

        return cfg;
    }

    /** {@inheritDoc} */
    @Override protected void beforeTestsStarted() throws Exception {
        startGrid(0);
    }

    /** {@inheritDoc} */
    @Override protected void afterTestsStopped() throws Exception {
        stopAllGrids();
    }

    /**
     * @throws Exception If failed.
     */
    public void testStartWithoutKey() throws Exception {
        runJsScript("testStartWithoutKey");
    }

    /**
     * @throws Exception If failed.
     */
    public void testStartWithKey() throws Exception {
        runJsScript("testStartWithKey");
    }

    /**
     * @throws Exception If failed.
     */
    public void testStartWithIncorrectKey() throws Exception {
        runJsScript("testStartWithIncorrectKey");
    }
}
