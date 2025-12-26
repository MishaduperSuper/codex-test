#include <iostream>
#include <random>

int main() {
    std::random_device rd;
    std::mt19937 gen(rd());
    std::uniform_int_distribution<int> dist(1, 100);

    int secret = dist(gen);
    int guess = 0;
    int attempts = 0;

    std::cout << "Угадайте число от 1 до 100\n";

    while (true) {
        std::cout << "Введите число: ";
        if (!(std::cin >> guess)) {
            std::cout << "Некорректный ввод. Завершение.\n";
            return 0;
        }
        attempts++;

        if (guess < secret) {
            std::cout << "Слишком мало\n";
        } else if (guess > secret) {
            std::cout << "Слишком много\n";
        } else {
            std::cout << "Вы угадали!\n";
            std::cout << "Количество попыток: " << attempts << "\n";
            break;
        }
    }

    return 0;
}
