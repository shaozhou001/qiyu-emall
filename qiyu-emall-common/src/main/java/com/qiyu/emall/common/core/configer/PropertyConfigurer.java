package com.qiyu.emall.common.core.configer;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class PropertyConfigurer extends PropertyPlaceholderConfigurer {

	private Properties props;

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		this.props = props;
	}

	public String getProperty(String key) {
		return props.getProperty(key);
	}
	
	public String getProperty(String key, String defaultValue) {
		return props.getProperty(key, defaultValue);
	}
	
	public Object setProperty(String key, String value) {
		return props.setProperty(key, value);
	}

}
