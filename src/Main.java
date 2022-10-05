public class Main {

    public static void main(String[] args) {
        int a = 22;
        String b = "Sometimes";
        String c = "     something wrong";
        String d = "I can't do it any more";
        String str1 = "     Learn   Java Programming ";
        String str2 = "Learn\nJava Programming\n\n   ";
        String str3 = "Ivan Ivanovich";
        String str4 = "ivan ivanov";
        checkUserName(str3, str4);
    }

    //        System.out.println(b.charAt(2));
    public static void checkUserName(String str3, String str4) {

        String copy = str3.replace(" ", "");
        if (str3.equalsIgnoreCase(str4) == true) {
            System.out.println("Change the name");
        } else {
            System.out.println("Your name has " + str3.length() + " symbols");
            System.out.println("Your name has " + copy.length() + " symbols without spaces");
            System.out.println("Toll!");
        }
    }

//        System.out.println(str3.equals(str4));

/*        System.out.println(b.concat(c.trim()));
        System.out.println("Where ".concat("are you from?"));

        System.out.println(c.indexOf("wrong"));
        System.out.println(c.length());
        System.out.println(c.replace('o', 'a').trim());
        System.out.println(c.trim());
        System.out.println(str2.trim());
        String[] result = b.split("\\:");
        System.out.println(Arrays.toString(result));*/

}
