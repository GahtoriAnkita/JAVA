public class StrDemo {
    public static void main(String[] args) {
        // create string
        String s1 = "A book on java";
        String s2 = new String(" I like it");
        char arr[] = { 'D', 'r', 'e', 'a', 'm', 't', 'e', 'C', 'h' };
        String s3 = new String(arr);

        // display
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // find length of first string
        System.out.println("Length of s1= " + s1.length());

        // concatenate two strings
        System.out.println("s1 and s2 joined= " + s1.concat(s2));

        // concatenate three strings with +
        System.out.println(s1 + " from " + s3);

        // test if string S1 starts with A
        boolean x = s1.startsWith("A");
        if (x) {
            System.out.println("s1 starts with \'A\'");
        } else
            System.out.println("s1 does not starts with \'A\'");
 
        //extract substring from s2 starting from 0th char to 7th char
        String p = s2.substring(0,8);
        System.out.println(p);
 
        //extract substring from s3 starting from 0th char to 8th char
        String q = s3.substring(0,9);
        System.out.println(q);

        System.out.println(p + q);

        //Convert s1 into upper case nad lower case
        System.out.println("Upper s1= "+s1.toUpperCase());
        System.out.println("Upper s1= "+s1.toLowerCase());
    }
}
