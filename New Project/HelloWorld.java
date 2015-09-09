import java.util.*;


public class HelloWorld{
       
       String name;
       HelloWorld next;
       
       public HelloWorld(String name)
       {
           this.name=name;
       }
       
       
     public static void main(String []args)
     {
         Linklist list= new Linklist();
         
         list.insertLink("mahantesh");
           list.insertLink("sayantan");
             list.insertLink("mahantesh");
               list.insertLink("Mahantesh");
                 list.insertLink("sayantan");
         
         //list.display(list);
         list.removeDupsWithoutBuffer(list);
         //list.removeDups(list);
          list.display(list);
     }
}

class Linklist{
    HelloWorld Firstlink;
    
    
    public void insertLink(String name)
    {
        HelloWorld newLink = new HelloWorld(name);
        newLink.next=Firstlink;
        Firstlink=newLink;
    }
    
    public void display(Linklist list)
    {
       HelloWorld head=list.Firstlink;
         
         while(head!=null)
         {
        
        
            System.out.println(head.name);
            head=head.next;
         }
        
    }
    
    public void removeDups(Linklist list)
    {
        HelloWorld head=list.Firstlink;
        HelloWorld current=head;
        HelloWorld previous=null;
        Hashtable table = new Hashtable();
        
        while(current.next!=null)
        {
            if(table.containsKey(head.name))
             previous.next=current.next;
             
             else
             {
             table.put(head.name , true);
             previous=current;
             }
             
             current=current.next;
            
        }
        
    }
    
    
    public void removeDupsWithoutBuffer(Linklist list)
    {
        HelloWorld head=list.Firstlink;
        
        HelloWorld previous=head;
        HelloWorld current=previous.next;
        while(current.next!=null)
        {
            HelloWorld runner=head;
            while(runner!=current)
            {
                if(runner.name==current.name)
                {
                    HelloWorld temp=current.next;
                    previous.next=temp;
                    current=temp;
                    break;
                }
                current=current.next;
            }
            
            if(runner==current)
            {
               previous=current;
               current=current.next;
            }
            
        }
    }
    
    
    
   
   
   
   
   
   
   
   
   
   
    
    
}
