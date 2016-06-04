package Medmyne.sandbox;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class Read_In {
	
	ArrayList<ArrayList<String>> file_strings = new ArrayList<ArrayList<String>>();
	public Read_In()
	{
		File rep_directory = new File("/Users/myles/Medmyne/sandbox/documents-export-2016-05-31");	
		File [] report_files = rep_directory.listFiles(new FilenameFilter() {
			public boolean accept(File file, String filename)
			{
				return (filename.endsWith(".txt"));
			}
		});
		for (int i = 0; i < report_files.length; i++)
		{
			To_Text(report_files[i]);
		}
	}
	private void To_Text(File file)
	{
		byte[] report_bytes = 
	}
}
