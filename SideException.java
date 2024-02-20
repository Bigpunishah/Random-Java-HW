import java.util.Scanner;

    class InvalidSideException{
            void InvalidSideError(){
                System.out.print("Side length must be greater than 0.");
            }
    }
    class Square{
        int length;
        Square(int length){
            this.length = length;
        if(length <= 0){
            InvalidSideException Exception = new InvalidSideException();
            Exception.InvalidSideError();
        }
        else{
            getArea(length);
        }
        }

        public void getArea(int Area){
             System.out.println(Area * Area); 
        }
        
        
        }

public class SideException{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length of square:");
            int length = input.nextInt();
    
        new Square(length);

        input.close();
    }
}