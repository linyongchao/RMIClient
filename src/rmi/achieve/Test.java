package rmi.achieve;

import java.rmi.Naming;

import rmi.service.AppService;

public class Test {
	public static void main(String[] args) {
		try {
			// 调用远程对象，注意RMI路径与接口必须与服务器配置一致
			AppService app = (AppService) Naming
					.lookup("rmi://140.206.208.50:6600/AppService");
			String c = app.run("/home/celloud/lintest");
			System.out.println("---" + c);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
