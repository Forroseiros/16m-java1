package lesson30;

import java.awt.*;
import java.time.LocalDate;  // сегодня
import java.util.Date;  // руки прочь

public class Article {
    int id;
    String title;
    String url;
    String announce;
    String author;
    String articleText;
    Image img;
    // String path;

    // раньше
    Date today;
    // сегодня
    LocalDate day;
}

class ArticleTest{
    public static void main(String[] args) {
        Article lockDownJanuary2021 = new Article();
        lockDownJanuary2021.title = "Локдаун снят, вся планета бухает!";
        lockDownJanuary2021.articleText = "Я памятник себе воздвиг нерукотворный,\n" +
                "К нему не зарастет народная тропа,\n" +
                "Вознесся выше он главою непокорной\n" +
                "Александрийского столпа.\n" +
                "\n" +
                "Нет, весь я не умру — душа в заветной лире\n" +
                "Мой прах переживет и тленья убежит —\n" +
                "И славен буду я, доколь в подлунном мире\n" +
                "Жив будет хоть один пиит.\n" +
                "\n" +
                "Слух обо мне пройдет по всей Руси великой,\n" +
                "И назовет меня всяк сущий в ней язык,\n" +
                "И гордый внук славян, и финн, и ныне дикой\n" +
                "Тунгус, и друг степей калмык.\n" +
                "\n" +
                "И долго буду тем любезен я народу,\n" +
                "Что чувства добрые я лирой пробуждал,\n" +
                "Что в мой жестокий век восславил я Свободу\n" +
                "И милость к падшим призывал.\n" +
                "\n" +
                "Веленью божию, о муза, будь послушна,\n" +
                "Обиды не страшась, не требуя венца,\n" +
                "Хвалу и клевету приемли равнодушно\n" +
                "И не оспоривай глупца.";
        lockDownJanuary2021.announce = "Очень короткий анонс";
        lockDownJanuary2021.day = LocalDate.now();
        System.out.println(lockDownJanuary2021.day);
        System.out.println(lockDownJanuary2021.articleText);
        lockDownJanuary2021.url = "https://andron13.de/school/java/basic-course/010-java-for/";
    }
}