Программа для удаления строк-дубликатов в файлах .lang сабмодов LOTR. В таких файлах все строки являются строками вида `key=value`. Моя программа считает дубликатами даже те строки, у которых совпадает `key`.

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA. Использование Eclipse IDE не рекомендуется, так как там плохая поддержка языка Kotlin.

| Технология | Версия  | Пояснение                                     |
|------------|---------|-----------------------------------------------|
| Gradle     | 8.4-bin | Версия системы автоматической сборки          |
| Gradle JVM | 17.0.9  | Версия Java, используемая для запуска Gradle  |
| JDK        | 17.0.9  | Версия Java, используемая для запуска проекта |
| Kotlin     | 1.9.20  | Версия Kotlin, используемая в проекте         |

## Установка

Первым делом нужно скачать репозиторий и разархивировать его в любое место на диске. Если всё сделано правильно, вы должны увидеть папку, в которой находятся файлы `build.gradle.kts`, `settings.gradle.kts` и другие. Полученную папку будем называть ***папкой проекта***.

Запустите IntelliJ IDEA и откройте папку проекта: `File -> Open -> [Выбираете папку] -> OK`. Сразу после открытия начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

Если на этом моменте что-то пошло не так и среда не установилась, значит, самое время проверить значения, указанные в таблице из первого раздела. Где их настроить:
* Gradle JVM: `File -> Settings -> Build -> Build Tools -> Gradle -> Gradle JVM`;
* JDK: `File -> Project Structure -> Project -> SDK`;
* Java: `File -> Project Structure -> Project -> Language Level`.

После изменения этих значений необходимо перезагрузить проект Gradle. Это можно сделать в ***меню Gradle***: `View -> Tool Windows -> Gradle`, нажав на значок перезагрузки в появившемся справа меню.

## Основы работы

После установки среды весь необходимый инструментарий готов к работе. Вот самые важные команды, необходимые каждому разработчику:

* Запуск приложения: `Меню Gradle -> Application -> run`.
* Компиляция приложения в файл с расширением .jar: `Меню Gradle -> build -> build`. После компиляции ваше приложение появится в папке `папка_проекта/build/libs`. 

Примечания: 
* Команды запускаются двойным нажатием по ним.
* В IntelliJ IDEA все вышеуказанные команды содержатся в категории Gradle "Tools".

## Использование

* Скомпилировать приложение;
* Положить в папке рядом с ним файл, который нужно обработать;
* Открыть консоль Windows в папке с двумя вышеупомянутыми файлами и выполнить команду `java -jar JarFileName.jar FileName.lang`.
