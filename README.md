# BSUIR_PPvIS_4sem
Использовать принципы SOLID при проектировании классов:
1) Принцип подстановки Лисков: List<Document> vector = new Vector<>();
2) Принцип инверсии зависимости/ разделения интерфейсов - использование интерфейсов и их реализаций.

При появлении недопустимых ситуаций генерировать исключения
- выбрасываем кастумную ошибку при не прохождении валидации

Предусмотреть работу акторов в разных потоках: 
1) используем Vector вместо ArrayList;
2) используем syncrhonized в методах.

Использовать принцип внедрения зависимостей
- использование интерфейсов и их реализаций

Среди всех каталогов есть один главный, который не содержится нигде - статическое финальное поле rootFolder и геттер для него. 
