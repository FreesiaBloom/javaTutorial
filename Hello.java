import java.util.Arrays;

class Hello 
{
    public static void main(String args[]) throws ClassNotFoundException 
    {

        // Variables

        int num = 9;
        short sh = 558;
        long lg = 564334l;
        boolean bool = true;
        char c = '9'; //literals

        System.out.println("num1: " + num);
        System.out.println("sh: " + sh);
        System.out.println("l: " + lg);
        System.out.println("b: " + bool);

        byte by= 127;
        int n = 257;
        byte m = (byte) n;
        System.out.println(by);
        System.out.println(m);

        float f = 5.6f;
        int t = (int) f;

        System.out.println(t);

        byte a = 10;
        byte b = 30;

        int res = a*b;

        System.out.println(res); // type promotion 

        int num1 = 7;
        int result = num1++;

        System.out.println(result);

        for(int i=1; i<=4; i++) {
            System.out.println("Hi " + i);
        }

        Boolean k = true;
        Boolean l = false;
        
        System.out.println(k^l);

        String first = "0";
        String second = "22";

        // functions

        System.out.println(solution(first, second));

        System.out.println(MakeUpperCase("HELLLO"));

        obfuscate("agata.jasinska215@gmail.com");

        // Objects
        
        Computer obj = new Computer();

        obj.playMusic();

        String str = obj.getMeAPen(2);
        System.out.println(str);

        Calculator calc = new Calculator();
        int addResult = calc.add(1,23);
        System.out.println(addResult);

        // Arrays

        int nums[] = new int[4];
        nums[0] = 6;
        nums[1] = 6;
        nums[2] = 6;
        nums[3] = 6;
        System.out.println(nums[0]);
        System.out.println(Arrays.toString(nums));

        int numsArray[][] = new int[3][4];
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                numsArray[i][j] = (int)(Math.random() * 10);
                System.out.print(numsArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        printArray(numsArray);

        // jagged arrays

        int jaggedNums[][] = new int[3][]; // 2d jagged array
        jaggedNums[0] = new int[3];
        jaggedNums[1] = new int[4];
        jaggedNums[2] = new int[2];

        for(int i=0; i<jaggedNums.length; i++) {
            for(int j=0; j<jaggedNums[i].length; j++) {
                jaggedNums[i][j] = (int)(Math.random() * 10);
            }
        }

        printArray(jaggedNums);

        // int newArray[][][] = new int[3][3][4];

        // size of arrays in Java is fixed so if it needs to change you need to copy to a new array
        // alternative solutions are collections


        // obj ion arrays

        Student s1 = populateStudent(1, "Wade", 88);
        Student s2 = populateStudent(2, "Mark", 25);
        Student s3 = populateStudent(3, "Bob", 70);

        Student[] students = {s1, s2, s3};
        printStudents(students);

        // StringBuffer
        // gives you buffer size
        // StringBuffer is threads save and StringBuilder is nort
        StringBuffer sb = new StringBuffer("Agata");
        
        sb.append(" Jasinska");
        sb.insert(6, "Java " );

        System.out.println(sb.capacity() + " " + sb);

        sb.setLength(30);
        System.out.println(sb.capacity() + " " + sb);

        sb.ensureCapacity(100);
        System.out.println(sb.capacity() + " " + sb);

        // static

        // calling static class without creating new object
        // Class.forName("Mobile");

        Mobile mobile = new Mobile();
        mobile.brand = "Apple";
        mobile.price = 1500;
        Mobile.name = "mobile";
        
        Mobile smartphone = new Mobile();
        smartphone.brand = "Samsung";
        smartphone.price = 1700;
        Mobile.name = "Smartphone";

        Mobile flipphone = new Mobile();

        mobile.show();
        smartphone.show();
        flipphone.show();
        Mobile.show1(smartphone);
    }

    private static Student populateStudent(int id, String name, int marks) {
        Student student = new Student();
        student.id = id;
        student.name = name;
        student.marks = marks;
        return student;
    }

    private static void printStudents(Student[] students) {
        for(Student student : students)
        {
            System.out.print(student.name + " ");
        }
        System.out.println();
    }

    private static String solution(String a, String b) {
        if (a.length() < b.length()) {
            return (a == "0") ? b : a+b+a;
        } else {
            return (b == "0") ? a : b+a+b;
        }
    }

    private static String MakeUpperCase(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length()).toLowerCase();
    }

    private static String obfuscate(String email) {
        email.replaceAll("\\@", "at");
      System.out.println(email);

        return email;
    }

    private static void printArray(int[][] array) {
        for(int nu[] : array)
        {
            for(int nm : nu)
            {
                System.out.print(nm + " ");
            }
            System.out.println();
        }
    }
}

class Student {
    int id;
    String name;
    int marks;
}

class Mobile
{
    // instance variables
    String brand;
    int price;
    static String name;

    public Mobile()
    {
        brand = "none";
        price = 200;
        System.out.println("in constructor");
    }

    static
    {
        name = "Phone";
        System.out.println("in static block");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // static methods can only access static values or provided arguments
    public static void show1(Mobile obj)
    {
        System.out.println("show1 " + obj.brand + " : " + obj.price + " : " + name);
    }
}

class Computer 
{
    public void playMusic()
    {
        System.out.println("Playing music");
    }

    public String getMeAPen(int cost)
    {
        if (cost >= 10) return "Blue Pen";
        return "No Available Pens";
    }
}

class Calculator
{
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}