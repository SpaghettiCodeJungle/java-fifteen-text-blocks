package com.spaghetticodejungle;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        normalTextBlock();
        indentationTextBlock();
        escapingTextBlocks();
        formattedTextBlock();
    }

    public static void normalTextBlock() {
        String textBlock = """
            <html>
            <body>
            <h1>Hello World</h1>
            </body>
            </html>
            """;
        System.out.println("Text  Block");
        System.out.println(textBlock);
    }

    public static void indentationTextBlock() {
        String textBlock = """
            <html>
                <body>
                    <h1>Hello World</h1>
                </body>
            </html>
            """;
        System.out.println("Indentation Text  Block");
        System.out.println(textBlock);
    }

    public static void escapingTextBlocks() {
        String escapeTextBlock1 = """
            This is "fake" news \"""
            """;
        System.out.println("Escaping Double Quotes Text  Block");
        System.out.println(escapeTextBlock1);

        String escapeTextBlock2 =  """
                                   The true sign of intelligence \r
                                    is not knowledge but imagination
                                   """;
        System.out.println("Escaping Line Terminator Text  Block");
        System.out.println(escapeTextBlock2);
    }

    public static void formattedTextBlock() {
       String word = "beautiful";
        String textBlock = """
            Hello %s World!
            """.formatted(word);
        System.out.println("Formatted Text  Block");
        System.out.println(textBlock);
    }
}
