package hashmapsss;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Sample_TestMaps extends ReadGuru99ExcelFile{
	 static Map<String, List<String>> map = new HashMap<String, List<String>>();
	
  public static void main(String[] args) throws IOException{
    /*Map<String, String> objMap = new HashMap<String, String>();
    objMap.put("Name", "Suzuki");
    objMap.put("Name", "Suzuki1");
    objMap.put("Power", "220");
    objMap.put("Type", "2-wheeler");
    objMap.put("Price", "85000");
    System.out.println("Elements of the Map:");
    System.out.println(objMap);
    System.out.println(objMap.keySet());
    System.out.println(objMap.containsKey("Name"));
   
    List<String> valSetOne = new ArrayList<String>();
    valSetOne.add("Apple");
    valSetOne.add("Aeroplane");
    // create list two and store values
    List<String> valSetTwo = new ArrayList<String>();
    valSetTwo.add("Bat");
    valSetTwo.add("Banana");
    // create list three and store values
    List<String> valSetThree = new ArrayList<String>();
    valSetThree.add("cat");
    valSetThree.add("Car");
    // put values into map
    map.put("A", valSetOne);
    map.put("B", valSetTwo);
    map.put("C", valSetThree);
    
    System.out.println("map"+map);
    System.out.println("mapvalue==>"+map.get("C").get(0));
    System.out.println("mapvaluesize==>"+map.get("A").size());
   //String value= valuekey("C",0);
  // System.err.println("Value===>"+value);
  
  */
   
   String dd1=valuekey("DAT",11);
   System.out.println("keyvalue====>"+dd1);
   
   
   
   
  }
  public static String valuekey(String data,int data2) throws IOException
  { ReadGuru99ExcelFile dd=new ReadGuru99ExcelFile();
  
  
  ReadGuru99ExcelFile objExcelFile1 = new ReadGuru99ExcelFile();

	//Prepare the path of excel file

	String filePath = "D:\\AutomationFramework\\ABMSmartScript\\framework\\excelreader\\EIP";

	//Call read file method of the class to read data

	objExcelFile1.readExcel(filePath,"EIP_Add_Link_Data.xlsx","EIP_Add_Link_Data");
  System.err.println("===================================================");
  System.err.println("value==================================================="+dd.map1);
  	  String s=dd.map1.get(data).get(data2);
	 
	  return s;
  }
  
  
  
  
}