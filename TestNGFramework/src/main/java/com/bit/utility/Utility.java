package com.bit.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility 
{
	public static Properties readPropertyFile(String path) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		Properties p=new Properties();
		p.load(f);
		return p;
	}

}
