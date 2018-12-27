package com.tutorialspoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class JasperReportPrint {
   @SuppressWarnings("unchecked")
   public static void main(String[] args) {
      String sourceFileName = "c://tools/jasperreports-5.0.1/" +
         "test/jasper_report_template.jasper";
      String printFileName = null;
      DataBeanList DataBeanList = new DataBeanList();
      ArrayList<DataBean> dataList = DataBeanList.getDataBeanList();

      JRBeanCollectionDataSource beanColDataSource = new 
         JRBeanCollectionDataSource(dataList);

      Map parameters = new HashMap();
      try {
    	   printFileName = JasperFillManager.fillReportToFile( 
            sourceFileName, parameters, beanColDataSource);
         if(printFileName != null){
            JasperPrintManager.printReport( printFileName, true);
         }
      } catch (JRException e) {
         e.printStackTrace();
      }
   }
}