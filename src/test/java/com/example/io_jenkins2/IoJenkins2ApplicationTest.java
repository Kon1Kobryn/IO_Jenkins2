package com.example.io_jenkins2;

import static org.junit.Assert.*;

public class IoJenkins2ApplicationTest {

	@org.junit.Test
	public void added() {
		IoJenkins2Application jenkinsTestApplication = new IoJenkins2Application();
		assertEquals(15, jenkinsTestApplication.added(10,5));
	}
}