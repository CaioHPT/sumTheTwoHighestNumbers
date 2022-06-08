public class Main {

    public static void largestSumBetweenTwoNumbers(Integer[] list) {
        Integer trocaDePosicao = 0;
        Integer index = 0;

        if (list.length < 2) {
            System.out.println("O array precisa de pelo menos dois valores");
        } else {
            while (index < list.length - 1) {
                if (list[index] < list[index + 1]) {
                    trocaDePosicao = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = trocaDePosicao;
                    index = 0;
                    continue;
                }
                index++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(list[0]).append(" + ").append(list[1]).append(" = ").append(list[0] + list[1]);

            System.out.println(stringBuilder);

        }
    }

    public static void largestSumBetweenTwoNumbersVersionTwo(Integer[] list) {
        Integer num1 = list[0];
        Integer num2 = list[1];
        Integer sum = num1 + num2;

        if (list.length < 2) {
            System.out.println("O array precisa de pelo menos dois valores");
        } else {
            for (int i = 0; i < list.length; i++) {
                for (int index = i + 1; index < list.length; index++) {
                    if (list[i] + list[index] > sum) {
                        if (list[i] > list[index]) {
                            num1 = list[i];
                            num2 = list[index];
                        } else {
                            num2 = list[i];
                            num1 = list[index];
                        }
                        sum = num1 + num2;
                    }
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num1).append(" + ").append(num2).append(" = ").append(sum);

        System.out.println(stringBuilder);
    }

    public static void sumTheTwoHighestNumbers(Integer[] numberList) {

        int stHighestNumber = 0;
        int ndHighestNumber = 0;

        for (int number : numberList) {
            if (stHighestNumber == 0) {
                if (number > stHighestNumber) {
                    stHighestNumber = number;
                }
            } else {
                if (number > stHighestNumber) {
                    ndHighestNumber = stHighestNumber;
                    stHighestNumber = number;
                } else if (number > ndHighestNumber) {
                    ndHighestNumber = number;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stHighestNumber).append(" + ").append(ndHighestNumber).append(" = ").append(stHighestNumber + ndHighestNumber);

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        Integer[] list = {90, 10, 3, 5, 21, -100, 85};
        Integer[] listTwo = {-2, 1, -1, 0};

        Main.sumTheTwoHighestNumbers(list);
        Main.sumTheTwoHighestNumbers(listTwo);

        Main.largestSumBetweenTwoNumbersVersionTwo(list);
        Main.largestSumBetweenTwoNumbersVersionTwo(listTwo);

        Main.largestSumBetweenTwoNumbers(list);
        Main.largestSumBetweenTwoNumbers(listTwo);
    }
}
