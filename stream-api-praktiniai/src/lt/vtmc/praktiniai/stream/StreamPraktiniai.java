package lt.vtmc.praktiniai.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPraktiniai {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 9);
		System.out.println(returnSquareRoot(num));

	}

	public static List<Integer> returnSquareRoot(List<Integer> numbers) {

		return numbers.stream().map(p -> (int) Math.sqrt(p)).collect(Collectors.toList());
//		.mapToDouble(p -> (double) p).

	}

	public static List<Integer> getAgeFromUsers(List<User> users) {
		return users.stream().map(age -> age.getAge()).collect(Collectors.toList());

	}

	public static List<Integer> getDistinctAges(List<User> users) {
		return users.stream().map(age -> age.getAge()).distinct().collect(Collectors.toList());
	}

	public static List<User> getLimitedUserList(List<User> users, int limit) {
		return (List<User>) users.stream().limit(limit).collect(Collectors.toList());

	}

	public static Integer countUsersOlderThen25(List<User> users) {
		return (int) users.stream().filter(age -> age.getAge() > 25).count();

	}

	public static List<String> mapToUpperCase(List<String> strings) {
		return strings.stream().map(letters -> letters.toUpperCase()).collect(Collectors.toList());
	}

	public static Integer sum(List<Integer> integers) {
		int sum = integers.stream().reduce(0, (acc, element) -> acc + element);
		return sum;
	}

	public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
		return integers.stream().skip(toSkip).collect(Collectors.toList());
	}

	public static List<String> getFirstNames(List<String> names) {
		return names.stream().map(name -> name.replaceAll("\\s.*", "")).collect(Collectors.toList());

	}

	public static List<String> getDistinctLetters(List<String> names) {
		return names.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList());

	}

	public static String separateNamesByComma(List<User> users) {
		return users.stream().map(name -> name.getName()).collect(Collectors.joining(", "));

	}

	public static double getAverageAge(List<User> users) {

		return users.stream().mapToDouble(age -> age.getAge()).average().getAsDouble();
	}

	public static Integer getMaxAge(List<User> users) {

		return users.stream().mapToInt(age -> age.getAge()).max().getAsInt();
	}

	public static Integer getMinAge(List<User> users) {
		return users.stream().mapToInt(age -> age.getAge()).min().getAsInt();
	}

	public static boolean anyMatch(List<User> users, int age) {
		return users.stream().anyMatch(a -> a.getAge().equals(age));

	}

	public static boolean noneMatch(List<User> users, int age) {
		return users.stream().noneMatch(a -> a.getAge().equals(age));
	}

	public static Optional<User> findAny(List<User> users, String name) {
		return users.stream().filter(n -> n.getName().equals(name)).findAny();

	}

	public static List<User> sortByAge(List<User> users) {
		return users.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
	}

	public static Stream<Integer> getBoxedStream(IntStream stream) {
		return stream.boxed();
	}

	public static List<Integer> generateFirst10PrimeNumbers() {
		return IntStream.rangeClosed(2, Integer.MAX_VALUE).filter(number -> isPrime(number)).limit(10).boxed()
				.collect(Collectors.toList());
	}

	public static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(num -> number % num == 0);
	}

	public static List<Integer> generate10RandomNumbers() {
		return new Random().ints().limit(10).boxed().collect(Collectors.toList());

	}

	public static User findOldest(List<User> users) {
		return Collections.max(users, Comparator.comparingInt(s -> s.getAge()));

	}

	public static int sumAge(List<User> users) {
		return users.stream().map(a -> a.getAge()).reduce(0, (acc, element) -> acc + element);
	}

	// Pvz.:
	// Java 8 Streams API: Grouping and Partitioning a Stream
	// https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

	// Map?
	public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
		return users.stream().collect(Collectors.partitioningBy(part -> part.isMale()));

	}

	public static Map<Integer, List<User>> groupByAge(List<User> users) {
		return users.stream().collect(Collectors.groupingBy(User::getAge));
	}

	public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
		return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));

	}

	public static Map<Boolean, Long> countGender(List<User> users) {
		return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.counting()));
	}

	public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
		return (IntSummaryStatistics) users.stream().mapToInt(User::getAge).summaryStatistics();

	}

}
