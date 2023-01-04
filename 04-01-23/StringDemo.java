package arrayexamples;

public class StringDemo {

	public static void main(String[] args) {
		char[] ch= {'p', 'r', 'i', 'y', 'a'};
		String s=new String(ch);
		System.out.println(ch);
		
		String name="priya";
		System.out.println(name);
		
		//concept of String literal
		//we mainly use it to save memory so that new memories are not created for the same string
		String name1="Rahul";
		String name2="Rahul";//it does not created a new instance
		System.out.println(name1==name2);
		String str="Dutta";
		System.out.println(name==str);//return false as both of them are different
		name= name.concat(str);//joins the string
		System.out.println(name.length());
		
		
		String msg="Good Morning";
		char c=msg.charAt(5);//6-->index
		System.out.println(c);
		
		String s1=new String("Amrita");//65 get from ascii word and code list
		String s2=new String("Amrita");//65
		String s3=new String("Lokesh");//76
		String s4=new String("Pritam");//80
		String s5=new String("Priya");
		System.out.println(s1.compareTo(s2));//-->0
		System.out.println(s1.compareTo(s3));//65<76 -->negative value -11
		System.out.println(s4.compareTo(s3));//80>76-->positive value 4
		System.out.println(s4.compareTo(s5));
		
		
		String a="Hello Java";
		System.out.println(a.contains("java"));//return true false
		System.out.println(a.endsWith("e"));//return true or false
		
		//Student stu1=new Student(1,"Rahul","Dutta");//roll no,fitstname,lastname
		//Student stu2=new Student(2,"Rahul","Das");
				
		//string builder
		StringBuilder builder=new StringBuilder("Hello world");
		builder.append("i am learning java");  //append used to join strings
        System.out.println(builder);
        builder.insert(11, ",");
        System.out.println(builder);
        builder.replace(13, 17, "I love");
        System.out.println(builder);
        builder.reverse(); //reversing the string
        System.out.println(builder);
        StringBuilder hello=new StringBuilder("Hello");
        hello.delete(1, 3);
        System.out.println(hello);
        
        //String buffer
        StringBuffer buffer=new StringBuffer("hello");//default capacity ->16
        System.out.println(buffer);   //-->capacity- 16+5=21
        buffer.append("java i love programming");//(old capacity*2)+2 ->(21*2)+2=44
        System.out.println(buffer);
       System.out.println(buffer.capacity());
       buffer.insert(10, ",");
       System.out.println(buffer);
       System.out.println(buffer.indexOf("love")); //index of the word
       
       //buffer substring done in two ways
       System.out.println(buffer.substring(14));//start index
       System.out.println(buffer.substring(6, 10));//start or end index
       buffer.delete(6, 10)	;
       System.out.println(buffer);
       
		
	}

}
