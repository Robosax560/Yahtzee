package yahtzee;

public enum DieFace {
    ONES (
    "_ _ _\n" +
   "|     |\n" +
   "|  •  |\n" +
   "|_ _ _|\n"
    ),
    TWOS(
    "_ _ _\n" +
   "| •   |\n" +
   "|     |\n" +
   "|_ _•_|\n"
    ), 
    THREES(
    "_ _ _\n" +
   "| •   |\n" +
   "|  •  |\n" +
   "|_ _•_|\n"
    ),
    FOURS(
    "_ _ _\n" +
   "| • • |\n" +
   "|     |\n" +
   "|_•_•_|\n"
    ),
    FIVES(
    "_ _ _\n" +
   "| • • |\n" +
   "|  •  |\n" +
   "|_•_•_|\n"
    ),
    SIXES(
    "_ _ _\n" +
   "| • • |\n" +
   "| • • |\n" +
   "|_•_•_|\n"
    );

    private String aSCII;
    DieFace(String s) {
    	this.aSCII = s;
    }
    String getASCII() {
    	return this.aSCII;
    }
}