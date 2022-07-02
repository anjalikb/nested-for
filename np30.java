class np30
{
  public static void main(String args[])
{
  for(int i=1 ;  i<=5 ; i++)
{
   int n=i;
  for (int j=1 ;j<=i ; j++)
   {
    if(j%2==0)
     System.out.print((5*(j))+i+1) +" ");
     else
     System.out.print((5*(j+1))-i) + " ");
    }
    System.out.println();
  }
}
}
