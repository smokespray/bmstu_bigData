package org.example;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class Main {
    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder()
                .appName("RandomSplitExample")
                .master("local[*]")
                .getOrCreate();

        Dataset<Row> dataset = spark.read().format("csv")
                .option("header", "true")
                .load("/home/user/Lab10/src/best-selling video games of all time.csv");
        dataset.createOrReplaceTempView("games");

        spark.sql("select * from games").show();
        spark.sql("select * from games where Rank <= 5").show();
        spark.sql("select * from games where Rank%5=0").show();
        spark.sql("select * from games where Sales >= 100000000").show();
        spark.sql("select * from games where Title like '%Grand Theft Auto%'").show();
        spark.sql("select * from games where Series = 'Wii' and Sales >= 40000000").show();
        spark.sql("select * from games where Series like '%ario%'").show();
        spark.sql("select * from games where Publisher = 'Nintendo' and Series = 'None'").show();
        spark.sql("select * from games where Date like '%2017%' and Sales >= 30000000").show();
        spark.sql("select * from games where Platform = 'Multi-platform' and Series like '%itcher%'" +
                "and Sales >= 20000000").show();
        spark.stop();
    }
}