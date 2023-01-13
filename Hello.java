// Java Code -- Compiler(Javac) -- Byte code -- JRM(Java Runtime environment) -- JVM (This checks whether your code consists of public static void main string or not)
// class Hello
// {
    // public static void main(String a[])
    // {
        // System.out.println(2+3);
        // System.out.println(8+7); 
        // Here ln means new line 
    // }
// }
// The extension for java file is .java and for the byte code created the extension file is .class 

// Java Code runs in JRE in which JVM is present along with Libraries and responsible for Running the code. 
// Genreally we also have JDK in which we have JRE in further inside we have JVM + Libraries
// Java is known as WORA (Write Once Run Anywhere)
// Java 17 is LTS (Long term support)
// Java is Strongly typed language
// In java first compile the code then run it So after writing code first open terminal then enter "javac.(filename.java)" then enter then "java Filename"

class Hello
{
    public static void main(String a[])
    {
        int num1 =3;
        int num2 =5;
        int result =num1 + num2;
        System.out.println(result);
    }
}