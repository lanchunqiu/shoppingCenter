package com.tools;

public class ChStr {

	public String chStr(String str)
	{
		if(str==null)
		{
			str="";
			
		}
		else
		{
			try
			{
				str=(new String(str.getBytes("iso-8859-1"),"GB2312")).trim();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return str;
	}
	public String convertStr(String str)
	{
		if(str==null)
		{
			str="";
			
		}
		else
		{
			try
			{
				str=str.replaceAll("<", "&lt;");
				str=str.replaceAll(">", "&gt;");
				str=str.replaceAll(" ", "&nbsp;");
				str=str.replaceAll("\r\n", "<br>;");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return str;
	}
}
