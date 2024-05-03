using System;
using System.IO;

namespace DirectoryCounter
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = System.Text.Encoding.UTF8;
            // Змінна для зберігання шляху до каталогу
            string directoryPath;

            // Цикл для запиту шляху до каталогу доки не буде введено існуючий каталог
            do
            {
                Console.WriteLine("Введіть шлях до каталогу:");
                directoryPath = Console.ReadLine();

                // Перевірка існування введеного каталогу
                if (!Directory.Exists(directoryPath))
                {
                    Console.WriteLine("Введений каталог не існує. Спробуйте ще раз.");
                }
            } while (!Directory.Exists(directoryPath));

            // Запит шаблону для підрахунку
            Console.WriteLine("Введіть шаблон для підрахунку (наприклад, *.exe):");
            string searchPattern = Console.ReadLine();

            // Запит показу підказок
            bool showHints = false;
            Console.WriteLine("Показувати підказки? (y/n)");
            string hintInput = Console.ReadLine();
            if (hintInput.ToLower() == "y")
            {
                showHints = true;
            }

            // Виклик рекурсивного методу для підрахунку кількості підкаталогів
            int count = CountDirectories(directoryPath, searchPattern, showHints);
            Console.WriteLine($"Кількість підкаталогів, що відповідають шаблону '{searchPattern}': {count}");
            Console.ReadKey();

            // Встановлення коду завершення 0 (успішне завершення)
            Environment.ExitCode = 0;
        }

        // Рекурсивний метод для підрахунку кількості підкаталогів
        static int CountDirectories(string directoryPath, string searchPattern, bool showHints)
        {
            int count = 0;

            try
            {
                // Отримання масиву підкаталогів у поточному каталозі
                string[] directories = Directory.GetDirectories(directoryPath);

                // Цикл для перебору підкаталогів
                foreach (string directory in directories)
                {
                    // Отримання масиву файлів, що відповідають шаблону, у поточному підкаталозі
                    string[] files = Directory.GetFiles(directory, searchPattern);

                    // Якщо знайдено файли, що відповідають шаблону
                    if (files.Length > 0)
                    {
                        count++; // Збільшення лічильника на 1

                        // Якщо ввімкнено режим підказки
                        if (showHints)
                        {
                            Console.WriteLine($"Знайдено відповідні файли в каталозі: {directory}");
                            // Виведення інформації про знайдені файли та їхні атрибути
                            foreach (string file in files)
                            {
                                FileAttributes attributes = File.GetAttributes(file);
                                string attributeString = "";

                                if ((attributes & FileAttributes.Hidden) == FileAttributes.Hidden)
                                    attributeString += "Прихований, ";
                                if ((attributes & FileAttributes.ReadOnly) == FileAttributes.ReadOnly)
                                    attributeString += "Тільки для читання, ";
                                if ((attributes & FileAttributes.Archive) == FileAttributes.Archive)
                                    attributeString += "Архівний, ";

                                Console.WriteLine($"Файл: {Path.GetFileName(file)}, Атрибути: {attributeString.TrimEnd(' ', ',')}");
                            }
                        }
                    }

                    // Рекурсивний виклик методу для підрахунку в підкаталогах
                    count += CountDirectories(directory, searchPattern, showHints);
                }
            }
            catch (UnauthorizedAccessException)
            {
                Console.WriteLine($"Немає доступу до каталогу: {directoryPath}");
                // Встановлення коду завершення 1 (помилка)
                Environment.ExitCode = 1;
            }

            return count;
        }
    }
}