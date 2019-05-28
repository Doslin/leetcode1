import java.util.HashMap;

public  class Test{

    public static void main(String args[]) {
        String s = "new Hello World! ";
        System.out.println(sulotion(s));
        String ss = "";
        System.out.println(ss.length());

    }
    public static String sulotion(String nums ){

        if (nums == null ||nums.length() ==0 )
            return " ";

        //按照空格切分s
        String[] array = nums.split(" ");
        StringBuilder builder = new StringBuilder();
        //在builder中插入单词
        for (int i = 0; i<array.length;i++){
            if (!array[i].equals("")){
                if (builder.length() > 0){
                    builder.insert(0," ");
                }
                builder.insert(0,array[i]);
            }
        }

        return builder.toString();
    }

}