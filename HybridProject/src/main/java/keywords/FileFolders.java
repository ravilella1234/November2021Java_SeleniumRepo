package keywords;

import java.io.File;

public class FileFolders 
{

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\ravi\\Desktop\\abc\\xyz\\pqr";
		File f = new File(path);
		f.mkdirs();
	}

}
