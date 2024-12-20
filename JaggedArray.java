import java.util.Scanner;
class JaggedArray
{
    public static void  main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Organizations:");
        int m=sc.nextInt();
        System.out.println("Enter the number of Companies:");
        int n=sc.nextInt();
        String arr[][][]=new String[m][n][];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
            System.out.println("Enter the number of employees in organization no:"+(i+1)+" company no:"+(j+1));
            arr[i][j]=new String[sc.nextInt()];
            }
        }
        //storing
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Inside Organization no:"+(i+1));
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Inside Company no:"+(j+1));
                for(int k=0;k<arr[i][j].length;k++)
                {
                System.out.println("Enter the name of employee no:"+(k+1));
                arr[i][j][k]=sc.next();
                }
            }
        }
        //retival
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("The name of employee no:"+(j+1)+"from company no:"+(i+1)+" is:"+arr[i][j]);
            }
        }
    }
}
