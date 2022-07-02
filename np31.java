class np31
{
 public static void main(String args[])
{
  for(int i=5;i>=1;i--)
{
   int temp=0;
  for(int j=5 ; j>=i ;j--)
   {
    System.out.println(j +" ");
    temp=j;
   }
  
   for(int k=5-i+1;k<5;k++)
  
   System.out.print(temp +" ");
 
   System.out.println();
}
}
}