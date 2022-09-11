package fileio;

import java.lang.*;
import java.io.*;

public class FileReadWriteDemo
{
	File file;
	FileWriter writer;
	FileReader reader;
	BufferedReader buffer;
	
	
	public void writeInFile(String s)
	{
		try
		{
			file = new File("fileio/History.txt");
			file.createNewFile();
			writer = new FileWriter(file, true);
			writer.write(s+"\r"+"\n");
			writer.flush();
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		try
		{
			reader = new FileReader(file);
			buffer = new BufferedReader(reader);
			String text="", temp;	
			while((temp=buffer.readLine())!=null)
			{
				text=text+temp+"\n"+"\r";
			}
			System.out.println(text);
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
