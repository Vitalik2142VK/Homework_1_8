public class Main
{
    public static int[] generateRandomArray()
    {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void Task1()
    {
        System.out.println("Task1:");
        int[] arr = generateRandomArray();
        int amountPerMonth = 0;
        for (int i = 0; i < arr.length; i++)
        {
            amountPerMonth += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + amountPerMonth + " рублей");
        System.out.println("##########");
    }

    public static void Task2()
    {
        System.out.println("Task2:");
        int[] arr = generateRandomArray();
        int maxAmount = 0;
        int minAmount = 200_000;
        for (int i = 0; i < arr.length; i++)
        {
            if (maxAmount < arr[i])
            {
                maxAmount = arr[i];
            }
            if (minAmount > arr[i])
            {
                minAmount = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minAmount + " рублей. Максимальная сумма трат за день составила " + maxAmount + " рублей");
        System.out.println("##########");
    }

    public static void Task3()
    {
        System.out.println("Task3:");
        //Средняя сумма трат за месяц составила … рублей
        int[] arr = generateRandomArray();
        int averageAmount = 0;
        for (int i = 0; i < arr.length; i++)
        {
            averageAmount += arr[i];
        }
        averageAmount /= arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
        System.out.println("##########");
    }

    public static void Task4()
    {
        System.out.println("Task4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--)
        {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("\n##########");
    }
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
    }
}