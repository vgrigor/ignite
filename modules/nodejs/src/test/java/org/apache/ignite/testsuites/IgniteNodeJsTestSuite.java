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

package org.apache.ignite.testsuites;

import junit.framework.TestSuite;
import org.apache.ignite.internal.NodeJsCacheApiSelfTest;
import org.apache.ignite.internal.NodeJsComputeSelfTest;
import org.apache.ignite.internal.NodeJsIgniteSelfTest;
import org.apache.ignite.internal.NodeJsIgnitionSelfTest;
import org.apache.ignite.internal.NodeJsSecretKeySelfTest;
import org.apache.ignite.internal.NodeJsSqlQuerySelfTest;

/**
 * Node JS test suite.
 */
public class IgniteNodeJsTestSuite extends TestSuite {
    /**
     * @return Suite.
     * @throws Exception If failed.
     */
    public static TestSuite suite() throws Exception {
        TestSuite suite = new TestSuite("Ignite Node JS Test Suite");

        suite.addTest(new TestSuite(NodeJsIgnitionSelfTest.class));
        suite.addTest(new TestSuite(NodeJsCacheApiSelfTest.class));
        suite.addTest(new TestSuite(NodeJsSecretKeySelfTest.class));
        suite.addTest(new TestSuite(NodeJsComputeSelfTest.class));
        suite.addTest(new TestSuite(NodeJsIgniteSelfTest.class));
        suite.addTest(new TestSuite(NodeJsSqlQuerySelfTest.class));

        return suite;
    }
}
