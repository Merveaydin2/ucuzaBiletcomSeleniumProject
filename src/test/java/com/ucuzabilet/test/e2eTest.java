package com.ucuzabilet.test;

import com.ucuzabilet.driver.BaseTest;
import com.ucuzabilet.page.e2e;
import org.junit.Before;
import org.junit.Test;

public class e2eTest extends BaseTest {
    e2e e2eTest;

    @Before
    public void forStartScenario() {
        e2eTest = new e2e();
    }
        @Test
    public void endtoendTest(){
            e2eTest.senaryoTest();

        }

    }




