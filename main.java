public class Main
{
	public static void main(String[] args) throws Exception {
		//Scanner sc=new Scanner(System.in);
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of hash map");
		int n=Integer.parseInt(sc.readLine());
		System.out.println("Enter the type of hash Map to be created  :\n1.(Integer,Integer)\n2.(String,Integer)");
        int ch = Integer.parseInt(sc.readLine());
        if (ch == 1)
        {
            hashMap<Integer,Integer> ll = new hashMap<Integer,Integer>(n);
        do {
                
                System.out.println("1.Insertion\n2.Deletion\n3.Find\n4.Display\n5.Exit\nEnter your choice\n--------------");
                int chh = Integer.parseInt(sc.readLine());
                switch (chh) {
                    case 1:
                        System.out.print("Enter the Key(Integer) : ");
                        int kk = Integer.parseInt(sc.readLine());
                        System.out.print("Enter the Value(Integer): ");
                        int vv = Integer.parseInt(sc.readLine());
                        ll.insert(kk,vv);
                        break;
                    case 2:
                        System.out.println("Enter the key to be Deleted");
                        int kl = Integer.parseInt(sc.readLine());
                        if (ll.delete(kl)) 
                            System.out.println("Successfully Deleted\n-----------------------");
                         else 
                            System.out.println("Element not present in hashtable\n-----------------------");
                        break;
                    
                    case 3:
                        System.out.println("Enter the key : ");
                        boolean jk = ll.find(Integer.parseInt(sc.readLine()));
                        if (jk == false) {
                            System.out.println("Key not found\n-----------------------");
                        } else {
                            System.out.println("Key found\n-----------------------");
                        }
                        break;
                    case 4:

                        ll.display();
                        break;
                        
                    case 5:
                        System.exit(0);
                        break;
                }
                
            } while (true);
            
        } 
        else if (ch == 2) 
        {
            hashMap<String,Integer> ll = new hashMap<>(n);
            do {
                
                System.out.println("1.Insertion\n2.Deletion\n3.Find\n4.Display\n5.Exit\nEnter your choice\n-----------------------");
                int chh = Integer.parseInt(sc.readLine());
                switch (chh) {
                    case 1:
                        System.out.print("Enter the Key(String) : ");
                        String kk = (sc.readLine());
                        System.out.print("Enter the Value(Integer): ");
                        int vv = Integer.parseInt(sc.readLine());
                        ll.insert(kk,vv);
                        break;
                    case 2:
                        System.out.println("Enter the key to be Deleted");
                        String kl = (sc.readLine());
                        if (ll.delete(kl)) 
                            System.out.println("Successfully Deleted\n-----------------------");
                         else 
                            System.out.println("Element not present in hashtable\n-----------------------");
                        
                        break;
                    
                    case 3:
                        System.out.println("Enter the key : ");
                        boolean  jk = ll.find((sc.readLine()));
                        if (jk == false) {
                            System.out.println("Key not found\n-----------------------");
                        } else {
                            System.out.println("Key found\n-----------------------");
                        }
                        break;
                    case 4:

                        ll.display();
                        break;
                        
                    case 5:
                        System.exit(0);
                        break;
                }
                
            } while (true);
            
            
            
        }
        
        
		
	}
}
