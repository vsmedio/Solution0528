/*
Вывести на экран сегодняшнюю дату
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".


Требования:
1. Дата должна содержать день, месяц и год, разделенные пробелом.
2. День должен соответствовать текущему.
3. Месяц должен соответствовать текущему.
4. Год должен соответствовать текущему.
5. Вся дата должна быть выведена в одной строке
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat ("dd MM yyyy");

        System.out.println(format.format(date));

    }
}
