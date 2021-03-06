package fr.paris10.pascalpoizat.templates.javaproject;

import fr.paris10.pascalpoizat.templates.javaproject.Principal;
import org.testng.annotations.Test;

import java.lang.reflect.Constructor;

/**
 * template-java-project
 * Copyright 2015 pascalpoizat
 *
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
 */

public class PrincipalTest {

    @Test
    public void testMain() throws Exception {
        String args[] = {};
        Principal.main(args);
    }
}