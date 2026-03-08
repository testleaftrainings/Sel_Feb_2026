03:00 to 03:20 ->  Cross Browser testing
03:20 to 04:30 -> ReadExcelIntegration
04:30 to 04:40 -> Break
04:40 to 05:10 -> Common Integration
05:10 to 05:30 -> Screenshot
05:30 to 06:00 -> Breakout


read the values from excel:
---ApachePoi---->.xls and .xlsx
Wb--->ws-->row--->cells
.xlsx--->XSSF
Requirements:
1)plugins
2)dependencies
Steps to do Excel Integration:
Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount
 String[][] data = new String[rowCount][columnCount];


Push=>  stringCellValue to the Array 
data[i-1][j]=stringCellValue;

Close the workbook and return the data 
wBook.close();
 return data;

Change main method to a normal static method
* public static String[][] readExcel(){ }

Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data * * *    @DataProvider(name="fetchData")
 public String[][] sendData() throws IOException { 
	return ReadExcel.readExcel(); 

	return ClassName.method();
	}



Common Integration:

(./data/createLead.xlsx); 
create input args inside method
public static String[][] read(String fileName){
	 (./data/"+fileName+".xlsx) 
	 }

into the BaseClass or PSM and declare a fileName globally
 * public String fileName; ------------ > Global declaration
 
 Cut and paste the DataProvider code from CreateLead Class
 * @DataProvider(name="fetchData") 
  public String[][] sendData() throws IOException { 
	return ReadExcel.readExcel(fileName); }
	
*Create setValues() inside each testcase and annotate with @BeforeTest and
 mention the filename here 
 @BeforeTest
  public void setValues() { 
	fileName="CreateLead"; 
	} 
	
* Finally , run from the xml file

BS
BT
BC
DP
BM
@T
AM
AC
AT
AS