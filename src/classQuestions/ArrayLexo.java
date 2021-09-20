package classQuestions;

class ArrayLexo {

    public static void
    sortLexicographically(String[] strArr)
    {
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareToIgnoreCase(strArr[j])
                        > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
    }
    public static void printArray(String[] strArr)
    {
        for (String string : strArr)
            System.out.print(string + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {

        String stringArray[]
                = { "Nidhi", "Yatharth", "Tripti",
                "Rajat", "Aakash", "Titiksha", "Shitiz", "Bhavya", "Chaitanya", "Aayush" };

        sortLexicographically(stringArray);

        printArray(stringArray);
    }
}
