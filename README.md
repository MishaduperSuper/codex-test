# Угадай число — инструкции для Termux

Этот репозиторий содержит несколько версий игры «Угадай число» на разных языках:

- `main.cpp` — C++17 (консоль)
- `main.py` — Python (консоль)
- `Main.java` — Java (консоль)
- `Program.cs` — C# (консоль)
- `guess.js` — JavaScript (через `prompt/alert`, браузер)
- `index.html` — HTML + CSS + JS (браузерная страница)

Ниже — подробная пошаговая инструкция, как запускать каждую версию в **Termux**.

---

## 0. Подготовка Termux

### 0.1. Обновление пакетов

Откройте Termux и выполните:

```bash
pkg update -y && pkg upgrade -y
```

### 0.2. Базовые утилиты

Установим git и другие полезные пакеты:

```bash
pkg install -y git curl
```

---

## 1. Клонирование репозитория

Если репозиторий уже в Termux — пропустите этот шаг.

```bash
git clone <URL_ВАШЕГО_РЕПОЗИТОРИЯ> codex-test
cd codex-test
```

Проверьте файлы:

```bash
ls
```

Вы должны увидеть:

```
Main.java
Program.cs
README.md
guess.js
index.html
main.cpp
main.py
```

---

## 2. Версия на C++ (main.cpp)

### 2.1. Установка компилятора

В Termux:

```bash
pkg install -y clang
```

### 2.2. Компиляция

```bash
clang++ -std=c++17 -O2 -o guess_cpp main.cpp
```

### 2.3. Запуск

```bash
./guess_cpp
```

---

## 3. Версия на Python (main.py)

### 3.1. Установка Python

```bash
pkg install -y python
```

### 3.2. Запуск

```bash
python main.py
```

или

```bash
python3 main.py
```

---

## 4. Версия на Java (Main.java)

### 4.1. Установка JDK

В Termux используем пакет `openjdk-17`:

```bash
pkg install -y openjdk-17
```

Проверьте, что Java доступна:

```bash
java -version
```

### 4.2. Компиляция

```bash
javac Main.java
```

После компиляции появится `Main.class`.

### 4.3. Запуск

```bash
java Main
```

---

## 5. Версия на C# (Program.cs)

В Termux удобно использовать **.NET SDK** через пакет `dotnet`.

### 5.1. Установка .NET

```bash
pkg install -y dotnet
```

Проверьте версию:

```bash
dotnet --version
```

### 5.2. Быстрый запуск без проекта

В .NET можно запустить одиночный файл через `dotnet-script`, но в Termux его может не быть.
Надёжный способ — создать маленький проект.

#### 5.2.1. Создание проекта

```bash
mkdir cs-game
cd cs-game
dotnet new console
```

#### 5.2.2. Замена файла Program.cs

Скопируйте файл из репозитория:

```bash
cp ../Program.cs ./Program.cs
```

#### 5.2.3. Сборка и запуск

```bash
dotnet run
```

После запуска вводите числа в консоль.

---

## 6. Версия на JavaScript (guess.js)

Эта версия использует `prompt/alert`, поэтому запускать её нужно в браузере.
В Termux можно открыть файл через браузер Android.

### 6.1. Открытие файла в браузере

```bash
termux-open guess.js
```

Но браузер напрямую не выполнит `.js` файл.
Поэтому проще создать HTML-обёртку.

### 6.2. Быстрый способ: открыть консоль браузера

1. Откройте браузер (Chrome/Firefox).
2. Откройте любую страницу.
3. Включите **DevTools** (если доступно) и вставьте содержимое `guess.js` в консоль.

### 6.3. Рекомендованный способ: локальный HTML

Создайте файл `run_guess.html`:

```bash
cat <<'EOF' > run_guess.html
<!DOCTYPE html>
<html lang="ru">
<head>
  <meta charset="UTF-8" />
  <title>Guess JS</title>
</head>
<body>
  <script src="guess.js"></script>
</body>
</html>
EOF
```

Откройте его в браузере:

```bash
termux-open run_guess.html
```

---

## 7. Версия на HTML (index.html)

Это полноценная браузерная версия.

### 7.1. Открытие в браузере

```bash
termux-open index.html
```

Откроется браузер Android, где можно играть.

---

## 8. Возможные проблемы и решения

### 8.1. `termux-open` не работает

Убедитесь, что установлен пакет:

```bash
pkg install -y termux-tools
```

### 8.2. Ошибки компиляции C++

Если `clang++` не найден:

```bash
pkg install -y clang
```

### 8.3. Ошибки Java

Если `javac` не найден:

```bash
pkg install -y openjdk-17
```

### 8.4. Ошибки .NET

Если `dotnet` не найден:

```bash
pkg install -y dotnet
```

---

## 9. Быстрый чек-лист команд

```bash
# C++
clang++ -std=c++17 -O2 -o guess_cpp main.cpp
./guess_cpp

# Python
python main.py

# Java
javac Main.java
java Main

# C#
mkdir cs-game && cd cs-game
dotnet new console
cp ../Program.cs ./Program.cs
dotnet run

# HTML
termux-open index.html
```

---

Готово! Теперь можно запускать все версии игры в Termux.
