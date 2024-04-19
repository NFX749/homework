@echo off
chcp 65001
setlocal enabledelayedexpansion

mkdir "Неприхована папка"
mkdir "Прихована папка"

rem Робимо "Прихована папка" прихованою
attrib +h "Прихована папка"

rem Виводимо довідку по команді xcopy у файл
xcopy /? > "Неприхована папка\copyhelp.txt"

rem Копіюємо файл copyhelp.txt у "Прихована папка" 
rem та перейменовуємо його
xcopy "Неприхована папка\copyhelp.txt" "Прихована папка\copied_copyhelp.txt"

pause