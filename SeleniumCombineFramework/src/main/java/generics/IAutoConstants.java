package generics;

import java.time.LocalDateTime;

public interface IAutoConstants {
String EXCELPATH= "./src/test/resources/testdata.xlsx";
String JDBCURL = "jdbc:mysql://localhost:3306/advselenium";
String JDBCUN= "root";
String JDBCPWD = "root";
String PROPERTYFILEPATH = "./src/test/resources/commondata.properties";
String SCREENSHOT ="./errorshots/";
String TIME = LocalDateTime.now().toString().replace(":", "-");
String DIRECTORY = System.getProperty("user.dir");
}
