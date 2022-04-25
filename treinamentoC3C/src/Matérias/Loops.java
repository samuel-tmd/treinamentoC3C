package Matérias;

public class Loops 
{
    public static void main(String[] args) 
    {
        
    }

    public static void exemploFor() 
    {
        for(int i = 1; i <= 10; i++) 
        {  
            System.out.println(i);  
        }  
    }

    public static void exemploForEach() 
    {
        int arr[] = {12, 23, 44, 56, 78};  
        //Imprimindo array usando loop for-each  
        for(int i : arr) 
        {  
            System.out.println(i); 
        }  
    }

    public static void exemploForMarcado() 
    {
        aa:  
        for(int i = 1; i <= 3; i++) 
        {   
            for(int j = 1; j <= 3; j++) 
            {  
                if(i == 2 && j == 2) 
                {  
                    break aa;  
                }  
                System.out.println(i + " " + j);  
            }  
        }
    }

    public static void exemploForInfinito() 
    {
        for(;;) 
        {  
            //código que será executado  
        }  
    }

    public static void exemploWhile() 
    {
        int i = 1;  
        while(i <= 10) 
        {  
            System.out.println(i);  
            i++;  
        }  
    }

    public static void exemploWhileInfinito () 
    {
        while(true) 
        {  
            System.out.println("loop while infinito");  
        }  
    }
    
    public static void exemploDoWhile() 
    {
        int i = 1;  
        do 
        {  
            System.out.println(i);  
            i++;

        } while (i <= 10);  
    
    }
}