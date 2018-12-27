package com.tutorialspoint;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;


public class MyScriptlet extends JRDefaultScriptlet {

   public void afterReportInit() throws JRScriptletException{
      System.out.println("call afterReportInit()");
      // this.setVariableValue("AllCountries", sbuffer.toString());
      this.setVariableValue("someVar", new String("This variable value swas modified by the scriptlet."));
   }

   public String hello() throws JRScriptletException {
      return "Hello! I'm the report's scriptlet object.";
   }

}