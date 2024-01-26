[![Code Smells][code_smells_badge]][code_smells_link]
[![Maintainability Rating][maintainability_rating_badge]][maintainability_rating_link]
[![Security Rating][security_rating_badge]][security_rating_link]
[![Bugs][bugs_badge]][bugs_link]
[![Vulnerabilities][vulnerabilities_badge]][vulnerabilities_link]
[![Duplicated Lines (%)][duplicated_lines_density_badge]][duplicated_lines_density_link]
[![Reliability Rating][reliability_rating_badge]][reliability_rating_link]
[![Quality Gate Status][quality_gate_status_badge]][quality_gate_status_link]
[![Technical Debt][technical_debt_badge]][technical_debt_link]
[![Lines of Code][lines_of_code_badge]][lines_of_code_link]

Программа для удаления строк-дубликатов в файлах .lang сабмодов LOTR. В таких файлах все строки являются строками
вида `key=value`. Программа считает дубликатами строки, у которых совпадает `key`. Таким образом, если в начале файла с
переводами вставить полный актуальный перевод мода "Властелин колец", а затем использовать эту программу, то перевод
стандартных лотровских вещей в сабмоде будет восполнен (если чего-то не хватало) и актуализирован.

<!----------------------------------------------------------------------------->

[code_smells_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=code_smells

[code_smells_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[maintainability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=sqale_rating

[maintainability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[security_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=security_rating

[security_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[bugs_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=bugs

[bugs_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[vulnerabilities_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=vulnerabilities

[vulnerabilities_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[duplicated_lines_density_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=duplicated_lines_density

[duplicated_lines_density_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[reliability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=reliability_rating

[reliability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[quality_gate_status_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=alert_status

[quality_gate_status_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[technical_debt_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=sqale_index

[technical_debt_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer

[lines_of_code_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_LOTR-Lang-Finalizer&metric=ncloc

[lines_of_code_link]: https://sonarcloud.io/summary/overall?id=Hummel009_LOTR-Lang-Finalizer
