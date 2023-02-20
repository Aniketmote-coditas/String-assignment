package fifth_week;

import java.nio.charset.StandardCharsets;

class StringWays{
    public void display()
    {
        String name="Aarti";
        String name2="aarti";
        String  name3="Kriti";
        String name4="Aarti";
        System.out.println("Name is::"+name);
        name.concat("Tare");    //only Krati bcz string is immutable
        // name=name.concat(" Tare");
        System.out.println(name);
        String name1= new String("How are you?");
        System.out.println("Message is"+name1);
        System.out.println("*************LITERALS*****************");
        System.out.println(name.equals(name2));//name:Krati Tare!=Krati->false
        System.out.println(name.equals(name3));
        System.out.println(name2.equals(name4));
        System.out.println("*****************************************");
        System.out.println(name==name2);//name:Krati Tare!=Krati->false
        System.out.println(name==name3);
        System.out.println(name==name4);
        System.out.println("*****************************************");
        System.out.println(name.compareTo(name2));  //65-92
        System.out.println(name.compareTo(name3));
        System.out.println(name.compareTo(name4));
        System.out.println("************OBJECTS*********");
        String n1=new String("Aarti");
        String n2=new String("aarti");
        String n3=new String("Kriti");
        String n4=new String("Aarti");

        System.out.println(n1.equals(n2));//name:Krati Tare!=Krati->false
        System.out.println(n1.equals(n3));
        System.out.println(n1.equals(n4));
        System.out.println("*****************************************");
        System.out.println(n1==n2);//name:Krati Tare!=Krati->false
        System.out.println(n1==n3);
        System.out.println(n1==n4);
        System.out.println("*****************************************");
        System.out.println(n1.compareTo(n2));  //65-92
        System.out.println(n1.compareTo(n3));
        System.out.println(n1.compareTo(n4));


        System.out.println("****************************");
        System.out.println("***********OBJECT WITH LITERALS******");
        System.out.println(name.equals(n1));
        System.out.println(name==n1);  //important.
        System.out.println(name.compareTo(n1));   //lexigographical-length+spelling should be same
        System.out.println(name.compareTo(n2));
        ///triple === will look for data type,like string literal or object



        // Assignment:all the string method:intern()
        //name.codePointAt()-evaluation
        String temp="aniket";
        String demo = "mote";
        System.out.println(temp.replace('a','A'));
        System.out.println(temp.replace("ani","ANI"));
        System.out.println(temp.toUpperCase());
        System.out.println(temp.getBytes());
        System.out.println(temp.getBytes(StandardCharsets.UTF_8));
        System.out.println(temp.charAt(4));
        System.out.println(temp.length());
        System.out.println(temp.codePointAt(1));
        System.out.println(temp.concat("mote"));
        System.out.println(temp.compareTo("aniket"));
        System.out.println(temp.equals("aniket"));
        System.out.println(temp.codePointBefore(1));
        System.out.println(temp.indexOf('t'));
        System.out.println(temp.isEmpty());
        System.out.println(temp.lastIndexOf('e'));
        System.out.println(temp.substring(0));
        System.out.println(temp.substring(1,4));
        System.out.println(temp.hashCode());
        System.out.println(temp.trim());
        System.out.println(temp.endsWith("z"));
        System.out.println(temp.startsWith("e"));



    }
}

public class Stringdemo {
    public static void main(String[] args) {
        StringWays stringWays=new StringWays();
        stringWays.display();

    }
}