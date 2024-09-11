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

Программа для актуализации и удаления строк-дубликатов в файлах .lang сабмодов LOTR.

В переводах мода LOTR все строки являются строками вида `key=value`. И часто при разработке сабмода бывает так, что
перевод нового контента пишется хаотично, его строки набрасываются прямо внутри перевода основного мода, а основной мод
ещё и обновляется, так что перевод ванильного лотра в сабмоде стремительно теряет актуальность — какие-то строки не
имеют перевода вовсе, а какие-то переводы остаются старыми. Это фиксится добавлением актуального перевода мода LOTR в
начало или в конец файла сабмода, из-за чего он распухает в два раза, зато все строки переведены.

Эта программа позволяет актуализировать перевод, удалить дубликаты и разделить отдельно строчки сабмода и отдельно
строчки LOTR, которые будут идти отдельными цельными блоками. Программа считает дубликатами строки, у которых совпадает
`key`, так что проблема с устаревшим и неодинаковым `value` исчезает.

Если есть необходимость, чтобы изменённые или устаревшие строчки перевода ванильного лотра остались в сабмоде (то есть
имели приоритет над актуальным переводом оригинала), нужно снять галочку в третьей строке окна. В таком
случае, в начале файла будет идти перевод сабмода, в конце — перевод лотра, который будет содержать лишь недостающие
строки. Если же галочку оставить, перевод основы будет сверху, а перевод сабмода снизу, и перевод сабмода будет
содержать лишь строки, касающиеся нового контента.

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
