package com.pleira;

import org.apache.deltaspike.core.api.config.PropertyFileConfig;

public class MyConfigFile implements PropertyFileConfig {
	
	public static final String DEFAULT_CONFIG_FILENAME = "file:///D:/EMOS.web/cfg/myconfig.properties";


	@Override
	public String getPropertyFileName() {
		return DEFAULT_CONFIG_FILENAME;
	}

}
