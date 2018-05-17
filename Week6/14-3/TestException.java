
public class TestException extends Exception{
    
    //Constructor without parameter
    public TestException(){
        
    }
    
    //constructor that accepts string as parameter
    public TestException(String message){
        super(message);
    }
    //constructor that accepts a Throwable object as a parameter.
    public TestException(Throwable exObj){
        super(exObj);
        
    }
}
