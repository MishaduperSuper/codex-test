using System;

class Program
{
    static void Main()
    {
        var random = new Random();
        int secret = random.Next(1, 101);
        int attempts = 0;

        Console.WriteLine("Угадайте число от 1 до 100");

        while (true)
        {
            Console.Write("Введите число: ");
            string? input = Console.ReadLine();
            if (!int.TryParse(input, out int guess))
            {
                Console.WriteLine("Некорректный ввод. Завершение.");
                return;
            }

            attempts++;

            if (guess < secret)
            {
                Console.WriteLine("Слишком мало");
            }
            else if (guess > secret)
            {
                Console.WriteLine("Слишком много");
            }
            else
            {
                Console.WriteLine("Вы угадали!");
                Console.WriteLine($"Количество попыток: {attempts}");
                break;
            }
        }
    }
}
