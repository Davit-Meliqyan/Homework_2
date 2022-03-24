package homework_24;

import java.util.HashMap;
import java.util.Map;


public class TestMap {
    //2
    static <T> void onlyOnceElements(T[] arr) {
        Map<T, Integer> map = new HashMap<>();
        int count = 0;
        for (T e : arr) {
            map.put(e, count);
        }
        for (T e : arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            }
        }
        for (T e : map.keySet()) {
            if (map.get(e) == 1) {
                System.out.print(e + " ");
            }
        }
    }

    //3
    static <T> int duplicateCount(T[] arr) {
        Map<T, Integer> map = new HashMap<>();
        int count = 0;
        int ret = 0;
        for (T e : arr) {
            map.put(e, count);
        }
        for (T e : arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            }
        }
        for (T e : map.keySet()) {
            if (map.get(e) > 1) {
                ret++;
            }
        }
        return ret;
    }

    //4
    static <T> T onlyOnceFirstElements(T[] arr) {
        Map<T, Integer> map = new HashMap<>();
        int count = 0;
        for (T e : arr) {
            map.put(e, count);
        }
        for (T e : arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            }
        }
        for (T e : arr) {
            if (map.get(e) == 1) {
                return e;
            }
        }
        return null;
    }

    //5
//    static <T> int lengthLongestSubstringWithoutRepeatingCharacters(T[] arr) {
//        Map<T, Integer> map = new HashMap<>();
//        int count = 0;
//        int max = 0;
//        int index = 0;
//        for (int i = 0 ; i< arr.length; i++) {
//            if (!map.containsKey(arr[i])) {
//                map.put(arr[i], i);
//
//            } else {
//                map.get(arr[i])
//                count++;
//            }
//            if (count > max) {
//                max = count;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,1,5,6,1,7,8};
//        onlyOnceElements(arr);
//        System.out.println();
//        System.out.println(duplicateCount(arr));
//        System.out.println(onlyOnceFirstElements(arr));
//        System.out.println(lengthLongestSubstringWithoutRepeatingCharacters(arr));
    }
}
