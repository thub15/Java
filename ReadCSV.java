import java.io.*;
class ListFiles
{
   public static void main(String[] args) {
   
   // The below works to get the contents of the folder "data" which lives in the same directory as the class file
   //File dir = new File("data");

    // This works to get the contents of the c:\temp folder
    File dir = new File("c:/temp/");
    if (dir.exists() )
    {
       String[] files = dir.list();
       System.out.println(files.length + " files found...");
       for (int i = 0; i < files.length ; i++)
       {
          System.out.println( files[i]);
       }

    }   
    else{
       System.out.println( "Folder not found.");
    }
   }
}