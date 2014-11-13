package rmi.achieve;

import java.rmi.Naming;

import rmi.sdo.Person;
import rmi.service.PersonService;

public class Test {
	public static void main(String[] args) {
		try {
			// 调用远程对象，注意RMI路径与接口必须与服务器配置一致
			PersonService personService = (PersonService) Naming
					.lookup("rmi://127.0.0.1:6600/PersonService");
			Person person = personService.get();
			System.out.println("ID:" + person.getId() + " Age:"
					+ person.getAge() + " Name:" + person.getName());
			Integer c = personService.add(1, 2);
			System.out.println(c);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
