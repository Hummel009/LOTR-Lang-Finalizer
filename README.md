[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=code_smells)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=sqale_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=security_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=bugs)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=vulnerabilities)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=duplicated_lines_density)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=reliability_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=alert_status)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=sqale_index)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-FGen&metric=ncloc)](https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-FGen)

Программа для удаления строк-дубликатов в файлах .lang сабмодов LOTR. В таких файлах все строки являются строками вида `key=value`. Моя программа считает дубликатами даже те строки, у которых совпадает `key`.

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA.

| Технология                             | Версия |
|----------------------------------------|--------|
| Система автоматической сборки Gradle   | 8.5    |
| Java, используемая для запуска Gradle  | 8+     |
| Java, используемая для сборки проекта  | 8+     |
| Java, используемая для запуска проекта | 8+     |
| Kotlin                                 | 1.9.22 |

## Установка

Установка и системные требования всех моих проектов Gradle примерно одинаковы, так что смотрите [общую инструкцию](https://github.com/Hummel009/The-Rings-of-Power#readme). Проект из этого репозитория устанавливается так же, как проект Minecraft 1.18.2 из общей инструкции.

## Использование

* Скомпилировать приложение в файл с расширением .jar;
* Положить в папке рядом с ним файл, который нужно обработать;
* Открыть консоль Windows в папке с двумя вышеупомянутыми файлами и выполнить команду `java -jar JarFileName.jar FileName.lang`.
