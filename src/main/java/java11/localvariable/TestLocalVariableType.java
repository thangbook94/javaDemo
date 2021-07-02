package java11.localvariable;

import java.util.HashMap;
import java.util.Map;

public class TestLocalVariableType {
    // error: 'var' is not allowed here
    //public var n = "hello";

    public static void main(String[] args) {
        var idToNameMap = new HashMap<Integer, String>();
        System.out.println(idToNameMap.getClass());
        System.out.println(idToNameMap instanceof Map);


        // error: cannot use 'var' on variable without initializer
        //var n;
        // error: variable initializer is 'null'
        //var emptyList = null;
        // error: lambda expression needs an explicit target-type
        //var p = (String s) -> s.length() > 10;
        // error: array initializer needs an explicit target-type
        //var arr = { 1, 2, 3 };

        var obj = new Object() {};
        System.out.println(obj.getClass());
        //obj = new Object();
    }
}
