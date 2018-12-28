package com.tutorialspoint;

import java.util.ArrayList;

public class DataBeanList {
   public ArrayList<DataBean> getDataBeanList() {
      ArrayList<DataBean> dataBeanList = new ArrayList<DataBean>();

      dataBeanList.add(produce("English", 58));
      dataBeanList.add(produce("SocialStudies", 68));
      dataBeanList.add(produce("Maths", 38));
      dataBeanList.add(produce("Hindi", 88));
      dataBeanList.add(produce("Scince", 78));
      
      return dataBeanList;
   }

   /*
    * This method returns a DataBean object, with subjectName ,
    * and marks set in it.
    */
   private DataBean produce(String subjectName, Integer marks) {
      DataBean dataBean = new DataBean();

      dataBean.setSubjectName(subjectName);
      dataBean.setMarks(marks);

      return dataBean;
   }
}