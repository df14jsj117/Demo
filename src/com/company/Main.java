package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void print(int index,Object object) {
        System.out.println(String.format("{%d},%s",index,object));
    }

    public static void demoOperation(){
        print(1,5+2);
        print(1,5-2);
        print(1,5*2);
        print(1,5/2);
        print(1,5%2);
        print(1,5<<2);
        print(1,5>>2);
        print(1,5|2);
        print(1,5^2);
        print(1,5==2);
        print(1,5!=2);

    }
    public  static void demoString(){
        String str = "hello world";
        print(1,str.indexOf('e'));
        print(2,str.charAt(0));
    }
    public static void demoList(){
        List<String> strList = new ArrayList<String>(10);
        for (int i = 0;i<4;i++)
            strList.add(String.valueOf(i));
        List<String> strListB = new ArrayList<String>();
        for (int i=0;i<4;i++)
            strListB.add(String.valueOf(i*i));
        strList.addAll(strListB);
        print(1,strList);
        strList.remove(2);
        print(2,strList);
        Collections.reverse(strList);
        print(3,strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        print(4,strList);

        for(String obj:strList)
            print(5,obj);
    }

    public static void demoMap(){
        Map<String,String>map = new HashMap<String,String>();
        for(int i=0;i<4;i++)
            map.put(String.valueOf(i),String.valueOf(i*i));
        print(1,map);
        for(Map.Entry<String,String>entry:map.entrySet()) {
            print(2,entry.getKey()+"|"+entry.getValue());
        }
        print(3,map.keySet());
        print(4,map.values());
    }
    public static  void demoSet(){
        Set<String>set = new HashSet<String>();
        for (int i=0;i<4;i++)
            set.add(String.valueOf(i*i));
        print(1,set);
        print(2,set.contains(String.valueOf(0)));
        set.addAll(Arrays.asList(new String[]{"A","B","C"}));
        print(3,set);

    }
    public static void demoException(){
        try {
            int k;
            k=1/0;
        }catch (Exception e) {
            print(2,e.getMessage());

        }finally {
            print(3,"finally");
        }
    }

    public  static  void demoOO(){
        Animal animal = new Animal("dog",11);
        animal.say();
        Animal human = new Human("java",12,"china");
        human.say();
    }
    public static void demoFunction(){
        Random random = new Random();
        print(1,random.nextInt());
        print(2,random.nextFloat());
    }

    public static void main(String[] args) {
	// write your code
//        demoOperation();
//        demoList();
//        demoMap();
//        demoSet();
//        demoOO();
        demoFunction();

    }

}
