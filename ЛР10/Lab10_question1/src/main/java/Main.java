import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class Main {
    public static void main(String[] args) {
        // Создание сессии Spark
        SparkSession spark = SparkSession.builder()
                .appName("KaggleDataset")
                .master("local")
                .getOrCreate();

        // Загрузка данных из выбранного датасета
        Dataset<Row> dataset = spark.read()
                .option("header", true)
                .option("inferSchema", true)
                .csv("C:\\Users\\Ruslan\\YandexDisk\\Sem2_M\\russian_air_service_CARGO_AND_PARCELS.csv");

        // Выполнение 10 выборок данных
        // Примеры запросов:

        // 1. Вывести первые 10 строк датасета
        dataset.createOrReplaceTempView("data");
        Dataset<Row> result1 = spark.sql("SELECT * FROM data LIMIT 10");
        result1.show();

        // 2. Вывести схему датасета
        dataset.printSchema();

        // 3. Подсчитать количество строк в датасете
        Dataset<Row> result3 = spark.sql("SELECT COUNT(*) AS row_count FROM data");
        result3.show();

        // 4. Выбрать определенные столбцы и вывести первые 5 строк
        Dataset<Row> result4 = spark.sql("SELECT AirportName, Year FROM data LIMIT 5");
        result4.show();

        // 5. Отфильтровать данные по определенному условию
        Dataset<Row> result5 = spark.sql("SELECT * FROM data WHERE January > 10");
        result5.show();

        // 6. Сгруппировать данные по определенному столбцу и посчитать сумму другого столбца
        Dataset<Row> result6 = spark.sql("SELECT Year, SUM(January) AS total FROM data GROUP BY Year");
        result6.show();

        // 7. Отсортировать данные по определенному столбцу
        Dataset<Row> result7 = spark.sql("SELECT * FROM data ORDER BY January");
        result7.show();

        // 8. Применить агрегатную функцию к столбцу
        Dataset<Row> result8 = spark.sql("SELECT AVG(January) AS average, MAX(January) AS maximum FROM data");
        result8.show();

        // 9. Вывести количество уникальных аэропортов
        Dataset<Row> result9 = spark.sql("SELECT COUNT(DISTINCT AirportName) AS unique_airports FROM data");
        result9.show();


        // 11. Вывести топ-5 самых загруженных аэропортов по суммарной загруженности
        Dataset<Row> result11 = spark.sql("SELECT AirportName, SUM(January) AS total_load FROM data GROUP BY AirportName ORDER BY total_load DESC LIMIT 5");
        result11.show();

        spark.stop();
    }
}
