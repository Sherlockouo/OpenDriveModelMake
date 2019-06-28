//总体设计：先写各个模板的功能函数，最后写gui进行调用
//读取模板，写入stringBuffer，检索参数位置，追加key值
package Xodr_Make;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

//直线xodr生成
public class Mode1 {
	public static void main(String[] args) {
		int Place_Length = 0;
//		读入模板文件
		String Source_Path = "/home/admin233/eclipse-workspace/OpenDrive/src/Road_Model.xodr";
//		写入stringBuffer&对Stringbuffer进行调整&保存stringBuffer为新文件并储存
		StringBuffer  lengthBuffer = new StringBuffer();
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(Source_Path));
			String string;
			while ((string = bufferedReader.readLine()) != null) {
				lengthBuffer.append(string);
				lengthBuffer.append("\r\n");				
			}
			bufferedReader.close();
			System.out.println(lengthBuffer);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
