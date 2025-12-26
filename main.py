import random

def main():
    secret = random.randint(1, 100)
    attempts = 0
    print("Угадайте число от 1 до 100")

    while True:
        try:
            guess = int(input("Введите число: "))
        except ValueError:
            print("Некорректный ввод. Завершение.")
            return

        attempts += 1

        if guess < secret:
            print("Слишком мало")
        elif guess > secret:
            print("Слишком много")
        else:
            print("Вы угадали!")
            print(f"Количество попыток: {attempts}")
            break

if __name__ == "__main__":
    main()
