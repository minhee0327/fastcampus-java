package chapter04.ch03;

public class StringTextBlock {
    public static void main(String[] args) {
        String textBlocks = """
                    Hello,
                    hi,
                    how r u
                """;
        System.out.println(textBlocks);
        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml() {
        return """
		            <html>

		                <body>
		                    <span>example text</span>
		                </body>
		            </html>""";

    }

}
