class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message); // Pass error message to Exception class
    }
}


class Father {
    protected int age;
     public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative.");
        }
        this.age = age;
    }
}

class Son extends Father {
    private int sonAge;
	public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge); 
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative.");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
    }

    public void displayAges() {
        System.out.println("Father's Age: " + age);
        System.out.println("Son's Age: " + sonAge);
    }
}

public class InheritanceExceptionDemo {
    public static void main(String[] args) {
        try {
            
            int fatherAge = 45;
            int sonAge = -5;

           Son son = new Son(fatherAge, sonAge);
           son.displayAges();

        } catch (WrongAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
