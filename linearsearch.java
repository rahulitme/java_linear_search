=class linearsearch{
    public static void main(String args[])
    {
        int a[] ={0,0,0,6,656};
        int item=5;
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == item)
            {
                System.out.println("the item are parsent in"+i+"found in array");
                temp=temp+1;
               
            }
            if(temp==0)
            {
                System.out.println("the element not found");
            }
        }
        
    }
}
