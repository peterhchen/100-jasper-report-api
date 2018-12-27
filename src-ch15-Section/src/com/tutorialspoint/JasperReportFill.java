package com.tutorialspoint;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;

public class JasperReportFill {
   public static void main(String[] args) {
      String sourceFileName = "C://tools/jasperreports-5.0.1/test/" + 
         "jasper_report_template.jasper";

      try {
         JasperFillManager.fillReportToFile(sourceFileName, null,
            new JREmptyDataSource());
      } catch (JRException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }
}