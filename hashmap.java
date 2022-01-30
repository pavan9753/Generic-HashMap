class hashMap<K,V>
{
     int c;
     keyval<K,V> [] mm;
     boolean b[];
     int s;
    hashMap(int c)
    {
     s=0;
     this.c=c;
     mm=new keyval[c];
     b=new boolean[c];
     for(int i=0;i<c ;i++ )
     {
         mm[i]=null;
         b[i]=true;
     }
    }

public  void insert(K k,V v)
{
    int ff=quadprobing(hash(k));
    if(ff!=-1)
    {
        mm[ff]=new keyval(k,v);
        b[ff]=false;
        s++;
    }
    else{
        System.out.println("Map full\n----------------------");
    }
}
   int  hash(K k)
{
    return k.hashCode()%c;
}
public   int quadprobing(int i)
{
    int a=i;
    do
    {
        if(mm[i]==null)
        {
            return i;
        }
        i=((i+1)*(i+1))%c;
        
    }while(i!=a);
    return -1;
}

public   boolean find(K k)
{
    int i=hash(k);
    int ff=i;
    do{
        if(mm[i]!=null  && (mm[i].k).equals(k))
        {
         return  true;  
        }
        i=((i+1)*(i+1))%c;
        
    }while((b[i]==false) && i!=ff);
    return false;
    
}
public   boolean delete(K k)
{
    int i=hash(k);
    int ff=i;
    do{
        if(mm[i]!=null  && (mm[i].k).equals(k))
        {
            mm[i]=null;
            s--;
            b[i]=true;
         return  true;  
        }
        i=((i+1)*(i+1))%c;
        
    }while((b[i]==false) && i!=ff);
    return false;
    
}
public  void display()
{
    
    if(s<0)
    {
        System.out.println("Hash map is empty\n----------------------");
    }
    else
    {
        for(int i=0;i<c;i++)
        {
            if(mm[i]!=null)
            {
            System.out.println("Key :"+mm[i].k+" Value :"+mm[i].v);
            }
        }
    }
    System.out.println("-----------------------");
}

}
