class StringDemo{
    public static void main(String args[])
    {
        String str1 = "First String";
        String str2 = "second string";
        String str3 = str1;
        System.out.println("this is the first string :  "+ str1);
        System.out.println("This is the second string :  "+ str2);
        if (str1.equals(str2))
        {
            System.out.println("First string == Second string");
        }
        else
        {
            System.out.println("First string != Second string");
        }
    }
}