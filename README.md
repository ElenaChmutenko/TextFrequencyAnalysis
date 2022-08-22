# TextFrequencyAnalysis

Дан классический текст для графического дизайна  [Lorem Ipsum - generator](https://loremipsum.io/):

"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

Программа определяет, какая **буква** встречалась чаще всего и какая реже всего

## Начало работы
* Класс `Main` содержит статическое поле со строкой из текста выше
* В `main` заводится пустой ассоциативный массив (мапа), 
```java
Map<Character, Integer> map = new HashMap<>();
```
в которой для каждого символа будет храниться количество его повторений в тексте. При этом заглавные буквы преобразуются в строчные и учитываются как один символ. Знаки препинания и пробелы отбрасываются
* После прохода циклом по тексту мапа заполнится парами ключ - значение (буква - частота)

### Статичный метод `letterMaxCount` 
проходит циклом по коллекции из пар - ключей
```java
for (Map.Entry<Character, Integer> kv : map.entrySet()) { ... }
``` 
и возвращает символ с максимумом повторений 

### Метод `letterMinCount`
аналогично возвращает букву с минимальной частотой повторений в тексте 

## Окончание работы
В консоль выводятся результаты вызовов методов *letterMaxCount* и *letterMinCount*

