package com.jspiders.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.jspiders.beans")
// For Multiple Component Scans
//@ComponentScan({"com.jspiders.beans", "",""})
@ComponentScan(basePackages = {"com.jspiders.beans", "",""})
public class SpringConfigFile 
{

}
