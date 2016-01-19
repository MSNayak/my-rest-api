package com.tbs.ecm.util;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class PropertyReaderUtil extends PropertyPlaceholderConfigurer {
	  // private static Map<String, String> propertiesMap;
	   private static Properties allProps;
	   
	   @Override
	   protected void processProperties(ConfigurableListableBeanFactory beanFactory,
	             Properties props) throws BeansException {
	        super.processProperties(beanFactory, props);
	        allProps=props;
	 
	        /*propertiesMap = new HashMap<String, String>();
	        for (Object key : props.keySet()) {
	            String keyStr = key.toString();
	            propertiesMap.put(keyStr, props.getProperty(keyStr));
	        }*/
	    }
	 
	   /*public static String getProperty(String key) {
	        return propertiesMap.get(key);
	    }*/
	   
	    public static String getProperty(String key) {
	        return allProps.getProperty(key);
	    }
}
