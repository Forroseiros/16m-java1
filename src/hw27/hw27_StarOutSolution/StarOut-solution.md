# Разбор задачи starOut

## Условие задачи

Return a version of the given string, where for every star () in the string the star and the chars immediately to its left and right are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".
```code
starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly" <<< -----
starOut("a*sm*eilly*") → "silly"
```       

## Алгоритмический разбор

1. В цикле просмотреть все внутренние символы. Кроме первого и последнего символа.
2. Посмотреть что на первом символе. Разобраться с ним

3. Последний символ. разобраться с ним


## Try 2

```Java
private static String starOut(String str) {
    //работает только с заданными условиями. поломается например, на  "sm*eil*ly" → "siy" (a выдаст sy)
    String newWord = "";
    newWord = str.substring(0, str.indexOf('*') - 1) + str.substring(str.lastIndexOf('*') + 2);
    return newWord;
}
```

## Try 1

```Java
public static String starOut(String str) {
    String result = "";
    char[] temp = str.toCharArray();
    for (int i = 0; i < temp.length; i++) {
        if (temp[i] == '*') {
            temp[i] = '!';
            if (Character.isLetter(str.charAt(i - 1))) {
                temp[i - 1] = '!';
            }
            if (Character.isLetter(str.charAt(i + 1))) {
                temp[i + 1] = '!';
            }
        }
    }
    for (int i = 0; i < temp.length; i++) {
        if (temp[i] != '!') {
            result += temp[i];
        }
    }
    return result;
}
```



## Try 3

```Java
private static String starOut(String input) {
    char star = '*';
    //   String doubleStar="**";
    String output = "";
    for (int i = 1; i < input.length() - 1; i++) {
        if (input.charAt(i) == star && input.charAt(i + 1) == star) {
            return input.substring(0, i - 1) + input.substring(i + 3);
        } else if (input.charAt(i) == star) {
            return input.substring(0, i - 1) + input.substring(i + 2);
        }
    }
    return output;
}
```

## Try 4

```Java
public String starOut(String str) {
    int len = str.length();
    int[] indexes = new int[len];
    char ch;
    StringBuilder stbuild = new StringBuilder(len);  // String result = "";
    for (int i = 0; i < len; i++) {
        if (str.charAt(i) == '*') {
            indexes[i] = 1;
            if (i >= 1)
                indexes[i - 1] = 1;
            if (i < (len - 1))
                indexes[i + 1] = 1;
        }
    }
    for (int i = 0; i < len; i++) {
        if (indexes[i] == 0)
            stbuild.append(str.charAt(i));  // result+=str.charAt(i)
    }
    return stbuild.toString(); // result
}
```
        
## Один из вариантов решения

```Java
public class StarOut {
public static void main(String[] args) {
System.out.println(starOut("ab*cd")); //→ "ad"
System.out.println(starOut("ab**cd")); //→ "ad"
System.out.println(starOut("sm*eilly")); //→ "silly"
}

    private static String starOut(String input) {
        String output = "";
        char star = '*';
        if (input.charAt(0) != star && input.charAt(1) != star) {
            output += input.charAt(0);
        }
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) != star && 
                    input.charAt(i - 1) != star &&
                    input.charAt(i + 1) != star){
                output += input.charAt(i);
            }
        }
        if (input.charAt(input.length() - 1) != star && input.charAt(input.length() - 2) != star) {
            output += input.charAt(input.length() - 1);
        }
        return output;
    }
}
```