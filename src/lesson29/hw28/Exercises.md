# Домашка в 28ом уроке

##1
For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
    Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
```
roundSum(16, 17, 18) → 60
roundSum(12, 13, 14) → 30
roundSum(6, 4, 4) → 10
```

### Перевод

Для этой задачи мы округлим значение int до следующего кратного числа 10, если его крайняя правая цифра равна 5 и более, к примеру 15 округляется до 20.

В ином случае округляем до предыдущего кратного числа 10, если его правая крайняя цифра меньше 5, к примеру 12 округляется до 10.

Получив 3 инта, a b c возвращает сумму их округлённых значений. Чтобы избежать повторения кода, напишите отдельный помощник "public int round10(int num) {" и вызовите его 3 раза. Напишите помощник полностью ниже и на том же уровне отступов, что и roundSum().

##2

Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
```
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
```

### Перевод

Получив две строки, верните true, если одна из них появляется в самом конце другой строки, игнорируя разницу в верхнем/нижнем регистре (другими словами, вычисление не должно быть "чувствительным к регистру"). Замечание: str.toLowerCase() возвращает строку в нижнем регистре.

##3

Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
```makePi() → [3, 1, 4]```

### Перевод

Возвращает массив int длиной 3, содержащий первые 3 цифры pi, {3, 1, 4}.
makePi() → [3, 1, 4].