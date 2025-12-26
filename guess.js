const secret = Math.floor(Math.random() * 100) + 1;
let attempts = 0;

while (true) {
  const input = prompt("Угадайте число от 1 до 100:");
  if (input === null) {
    alert("Игра завершена.");
    break;
  }

  const guess = Number(input);
  if (!Number.isInteger(guess) || guess < 1 || guess > 100) {
    alert("Введите целое число от 1 до 100.");
    continue;
  }

  attempts++;

  if (guess < secret) {
    alert("Слишком мало");
  } else if (guess > secret) {
    alert("Слишком много");
  } else {
    alert(`Вы угадали! Попыток: ${attempts}`);
    break;
  }
}
