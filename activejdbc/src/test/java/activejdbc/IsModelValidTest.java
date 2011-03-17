/*
Copyright 2009-2010 Igor Polevoy 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*/


package activejdbc;

import activejdbc.test.ActiveJDBCTest;
import activejdbc.test_models.Person;
import org.junit.Test;

/**
 * @author Igor Polevoy
 */
public class IsModelValidTest extends ActiveJDBCTest {

    @Test
    public void test(){
        resetTable("people");
        Person p = (Person)Person.create("name", "Sam", "dob", "2001-01-07");
        a(p).shouldNotBe("valid");
        p.set("last_name", "Johnson");
        a(p).shouldBe("valid");
    }
}