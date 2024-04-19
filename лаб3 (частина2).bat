@echo off
chcp 65001
setlocal enabledelayedexpansion

REM Запит на введення цільового каталогу
set /p "target_dir=Введіть шлях до вашого каталогу: "

REM Підраховуємо кількість підкаталогів
set subdir_count=0
for /d %%i in ("%target_dir%\*") do (
    set /a subdir_count+=1
)

REM Генеруємо випадкові коди завершення
set "exit_codes="
for /l %%i in (1,1,%subdir_count%) do (
    set /a "random_code=!random! %% 900 + 100"
    set "exit_codes=!exit_codes!,!random_code!"
)
set "exit_codes=!exit_codes:~1!"

echo Кількість підкаталогів в "%target_dir%": %subdir_count%
echo Згенеровані коди завершення: %exit_codes%

echo Програма завершила роботу. Натисніть будь-яку клавішу для виходу...
pause > nul