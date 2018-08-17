package cds.aliyun.demo;

public class CodePipelineJavaDemo {

	private String name = "CodePipeline";

	public String getName()
	   {
	      return this.name;
	   }

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMessage() {
		return "Hello " + name + "!";
	}
}
