package com.pleira;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.apache.deltaspike.core.api.config.ConfigResolver;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class MyConfigFileTest {
	
	@Inject 
	MyConfigFile cut;
	
	@Test
	public void testGetPropertyFileName() {
		String path=cut.getPropertyFileName();
		assertEquals("file:///D:/EMOS.web/cfg/myconfig.properties", path);
        String result = ConfigResolver.getPropertyValue("some.propertykey");
   		assertEquals("somevalue", result);
	}

}
