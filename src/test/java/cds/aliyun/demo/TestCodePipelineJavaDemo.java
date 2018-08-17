package cds.aliyun.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCodePipelineJavaDemo {

	private CodePipelineJavaDemo codePipelineJavaDemo;

	@Before
	public void setUp() throws Exception {
		codePipelineJavaDemo = new CodePipelineJavaDemo();
	}
	
	@Test
	public void testNameEmpty() {
		Assert.assertEquals(codePipelineJavaDemo.getName(),"CodePipeline");
		Assert.assertEquals(codePipelineJavaDemo.getMessage(),"Hello CodePipeline!");
	}

	@Test
	public void testNameJava() {
		codePipelineJavaDemo.setName("Java");
		Assert.assertEquals(codePipelineJavaDemo.getName(),"Java");
		Assert.assertEquals(codePipelineJavaDemo.getMessage(),"Hello Java!");
	}
}
