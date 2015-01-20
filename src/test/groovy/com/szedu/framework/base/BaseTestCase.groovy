package com.szedu.framework.base

import static org.junit.Assert.*
import static org.mockito.Mockito.mock
import static org.mockito.Mockito.when

import org.apache.log4j.BasicConfigurator
import org.apache.log4j.Logger
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.validation.BindingResult

import com.szedu.framework.repository.AdminDao


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=[ "file:src/main/resources/applicationContext.xml",
                                   "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml",
                                    "file:src/test/resources/test-resource.xml"])
abstract class BaseTestCase {

    static {
       BasicConfigurator.configure()
    }

    protected final Logger log = Logger.getLogger(this.class)

    @Autowired
    AdminDao adminDao

    BindingResult passBindingResult() {
        BindingResult result = mock(BindingResult.class);
        when(result.hasErrors()).thenReturn(false);
        return result
    }

    BindingResult failBindingResult() {
        BindingResult result = mock(BindingResult.class);
        when(result.hasErrors()).thenReturn(true);
        return result
    }


}
