package week5_BigData;

public class test {

    public static void main(String[] args) {
        
        BigData bigData = new BigData();
        int choice = 0;
        while(choice != 3){
            System.out.println("\n1. Add");
            System.out.println("2. Multiply");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = bigData.inputPositiveInt();
            switch(choice){
                
            
            case 1 ->{
              
                System.out.print("Number 1: ");
                String num1 = bigData.inputString().trim();
                System.out.print("Number 2: ");
                 String num2 = bigData.inputString().trim();
                BigData addResult = new BigData(num1, num2);
                String result = addResult.add();
                System.out.println("the result is: "+result.trim());
                System.out.print("Checking result: ");
                addResult.checkAdd(result, num1, num2);
                
             
                
    break;        
        }
        }
        
        }
        
    }

}
