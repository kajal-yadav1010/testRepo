package com.cal.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  


public class Test {

	public static void main(String[] args) {
	Resource resource =new ClassPathResource("NewFile.XML");
    BeanFactory factory=new XmlBeanFactory(resource);
    Student st=(Student)factory.getBean("a");
   st.displayInfo();

	}

}
