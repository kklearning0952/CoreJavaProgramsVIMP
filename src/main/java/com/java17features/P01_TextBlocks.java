package main.java.com.java17features;

public class P01_TextBlocks {

    public static void main(String[] args) {
        String normalQuery = "select * " +
                "from User " +
                "where id=103;";

        System.out.println("normalQuery : " + normalQuery);

        String textBlockQuery = """
                select *
                from User
                where id=103;
                """;
        System.out.println("textBlockQuery : " + textBlockQuery);
    }
}
