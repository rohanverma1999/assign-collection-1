import java.io.*;
class cpyfile
{
      public static void main(String args[])
      {
        File fi = new File("C:/Users/hp/Desktop/abc.txt");
        File gi = new File("C:/Users/hp/Desktop/xyz.txt");
        char c[]=new char[10000];
          int i,k=0;
          try
          {
          FileInputStream fin=new FileInputStream(fi);
                      i=fin.read();
                     while(i!=-1)
                     {
                      c[k]=(char)i;
                     k++;
                     i=fin.read();
                   }
                  }
                 catch(IOException e)
                 {
                   System.out.println(e);
                 }
                  try{
                   FileOutputStream fout=new FileOutputStream(gi);
                   for(i=0;i<k;i++)
                    fout.write(c[i]);
                   System.out.println("File is copied");
                 }
                 catch(IOException e)
                 {
                   System.out.println(e);
                  }
                 try
                 {
            FileInputStream fin=new FileInputStream(gi);
        int i1;
        i1 = fin.read();
        while(i1 != -1)
        {
            c[k++] = (char)i1;
            System.out.print((char)i1);
            i1 = fin.read();
        }
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
      }
}