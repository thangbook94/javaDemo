package java14.textblock;

public class TestTextBlock {

    public static void main(String[] args) {
        String sample = """
                <html>
                    <body>
                        <span>example text</span>
                    </body>
                </html>""";
        System.out.println(sample);
        System.out.println();
        //special char
        String specialChar = """
                "fun" with\n
                whitespace \" /
                asdfsdfs \r  aaa
                and other escapes \"""
                """;
        System.out.println(specialChar);
        //split text easy to see but still a long text
        String longText = """
                This is a long test which looks to \
                have a newline but actually does not""";
        System.out.println(longText);
        //add space
        String longText1 = """
                line 1·······\s\sspace
                line 2·······
                """;
        System.out.println(longText1);
        String parameter = "thangnd";
        String formatText = """
                Some parameter: %s
                """.formatted(parameter);
        System.out.println(formatText);
    }

}
