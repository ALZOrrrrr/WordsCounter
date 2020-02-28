package gitlab.foxminded.task5;

public class Main {
    public static void main(String[] args) {

        WordsCounter counter = new WordsCounter();
        Formatter formatter = new Formatter();
        System.out.println(formatter.format(counter.count("acdc")));
    }


}
