package com.esh.j2se.jmx;

import java.lang.management.*;
import javax.management.*;

public class Main {
	public static void main(String[] args) throws MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException {
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName name = new ObjectName("com.esh.j2se.jmx:type=Student");
		Student student = new Student();
		mbs.registerMBean(student, name);
		while(true);
	}
}
