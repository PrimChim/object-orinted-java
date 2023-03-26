package uk.ac.wlv;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

public class WordCount {

	static class SplitFunction implements FlatMapFunction<String, String>
	{
		public Iterator<String> call(String s){
			return (Iterator<String>) Arrays.asList(s.split(" "));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkConf sparkConf = new SparkConf();
		sparkConf.setAppName("Spark WordCount example using Java");
		sparkConf.setMaster("local");
		JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);
		JavaRDD<String> textFile = sparkContext.textFile("input.txt");
		JavaRDD<String> words = textFile.flatMap(new SplitFunction());
		JavaPairRDD<String, Integer> pairs = words.mapToPair(new PairFunction<String, String, Integer>(){
			public Tuple2<String, Integer> call(String s){
				return new Tuple2<String, Integer>(s,1);
			}
		});
		JavaPairRDD<String, Integer> counts = pairs.reduceByKey(
			new Function2<Integer, Integer, Integer>(){
				public Integer call(Integer a, Integer b) {
					return a+b;
				}
			});
		counts.saveAsTextFile("output");
		sparkContext.stop();
		sparkContext.close();
	}

}
