package homework_24;

import java.util.*;

public class Test {
    //1
    static <T> boolean checkDuplicate(T[] arr) {
        Set<T> set = new HashSet<>(Arrays.asList(arr));
        return !(arr.length == set.size());
    }

    //2
    static <T> int onlyOnceCount(T[] arr) {
        Set<T> set1 = new HashSet<>();
        Set<T> set2 = new HashSet<>();
        for (T e : arr) {
            if (!set1.add(e)) {
                set2.add(e);
            }
        }
        return set1.size() - set2.size();
    }

    static <T> Set<T> onlyOnceElements(T[] arr) {
        Set<T> set1 = new HashSet<>();
        Set<T> set2 = new HashSet<>();
        for (T e : arr) {
            if (!set1.add(e)) {
                set2.add(e);
            }
        }
        return complement(set1, set2);
    }

    static <T> Set<T> complement(Set<T> set1, Set<T> set2) {
        Set<T> set3 = new HashSet<>();
        for (T e : set1) {
            boolean bool = true;
            for (T l : set2) {
                if (e.equals(l)) {
                    bool = false;
                    break;
                }
            }
            if (bool) set3.add(e);
        }
        return set3;
    }

    //3
    static <T> int duplicateCount(T[] arr) {
        Set<T> set1 = new HashSet<>();
        Set<T> set2 = new HashSet<>();
        for (T e : arr) {
            if (!set1.add(e)) {
                set2.add(e);
            }
        }
        return set2.size();
    }

    //4
    static <T> T onlyOnceFirstElements(T[] arr) {
        Set<T> set1 = new HashSet<>();
        Set<T> set2 = new HashSet<>();
        for (T e : arr) {
            if (!set1.add(e)) {
                set2.add(e);
            }
        }
        for (T e : arr) {
            boolean bool = true;
            for (T l : set2) {
                if (e.equals(l)) {
                    bool = false;
                    break;
                }
            }
            if (bool) return e;
        }
        return null;
    }

    //5
    static <T> int longestSubstringWithoutRepeating(T[] arr) {
        Set<T> set = new HashSet<>();
        int count = 0;
        for (T e : arr) {
            if (set.add(e)) {
                count++;
            }
        }
        return count;
    }

    static Character[] toCharList(String str) {
        if (str == null) {
            return null;
        }
        Character[] chars = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    static <T> void print(Set<T> set) {
        for (T e : set) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {

        Integer[] arr = {0, 1, 5, 0, 7, 1, 5};
//       System.out.println(checkDuplicate(arr));
//        System.out.println(dup(arr));
//        System.out.println(onlyOnce(arr));

        String str = "bbjklccgaj";
        System.out.println(checkDuplicate(toCharList(str)));
        System.out.println(duplicateCount(toCharList(str)));
        System.out.println(onlyOnceCount(toCharList(str)));
        System.out.println(longestSubstringWithoutRepeating(toCharList(str)));
        print(onlyOnceElements(toCharList(str)));
        System.out.println();
        System.out.println(onlyOnceFirstElements(toCharList(str)));

    }
}
