package hackethon;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DataGenerator {

	public static final int base = 100;
	public static final Map<String, Double> role_value_map = new HashMap<>();
	public static final Map<String, Double> time_diff_role_value_map = new HashMap<>();
	public static final double[] time_diff_role_values = { 0.56, 0.57, 0.58, 0.59, 0.6 };
	public static final int[] complexity = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };
	public static final double complexity_base = 0.2;
	private static int numberOfLoops = 20;

	public static void main(String[] args) {
		DataGenerator dataGenerator = new DataGenerator();
		dataGenerator.populateRolesMap();
		dataGenerator.populateTimeDiffRolesMap();
		// dataGenerator.percentage(0.6, complexity, timeDifference, timeDiffRoleValue,
		// positiveFeedback, negativeFeedback)

		role_value_map.forEach((k, v) -> {

			for (int i = 0; i < numberOfLoops; i++) {
				role_value_map.put("Associate", 0.6);
				role_value_map.put("Analyst", 0.59);
				role_value_map.put("Senior Analyst", 0.58);
				role_value_map.put("Lead Analyst", 0.57);
				role_value_map.put("Staff Analyst", 0.56);
				String flags = "";
				switch (k) {
				case "Associate":
					flags = "TRUE,FALSE,FALSE,FALSE,FALSE";
					break;
				case "Analyst":
					flags = "FALSE,TRUE,FALSE,FALSE,FALSE";
					break;
				case "Senior Analyst":
					flags = "FALSE,FALSE,TRUE,FALSE,FALSE";
					break;
				case "Lead Analyst":
					flags = "FALSE,FALSE,FALSE,TRUE,FALSE";
					break;
				case "Staff Analyst":
					flags = "FALSE,FALSE,FALSE,FALSE,TRUE";
					break;
				default:
					flags = "Give correct designation";
					break;
				}
				boolean positiveFeedback = dataGenerator.generateRandom(2) == 1 ? true : false;
				boolean negativeFeedback = dataGenerator.generateRandom(2) == 1 ? true : false;
				int complexityIndex = dataGenerator.generateRandom(11);
				Random randomNum = new Random();
				double timeDifference = randomNum.nextInt(41) + randomNum.nextDouble();
				double result = dataGenerator.percentage(role_value_map.get(k), complexity[complexityIndex],
						timeDifference, time_diff_role_value_map.get(k), positiveFeedback, negativeFeedback);
				/*
				 * System.out.println(k + "," + v + "," + complexity[complexityIndex] + "," +
				 * timeDifference + "," + time_diff_role_value_map.get(k) + "," +
				 * positiveFeedback + "," + negativeFeedback + "," + result);
				 */

				System.out.println(complexity[complexityIndex] + "," + timeDifference + "," + flags + ","
						+ positiveFeedback + "," + negativeFeedback + "," + result);

			}
		});

	}

	public int generateRandom(int max) {
		Random randomNum = new Random();
		return randomNum.nextInt(max);
	}

	public double percentage(double roleValue, int complexity, double timeDifference, double timeDiffRoleValue,
			boolean positiveFeedback, boolean negativeFeedback) {

		double performance = (base * roleValue) + (complexity > 55 ? 14 : complexity * complexity_base)
				+ (timeDifference > 20 ? 25 : timeDifference * timeDiffRoleValue) + (positiveFeedback ? 1 : 0)
				+ (negativeFeedback ? -2 : 0);
		if (complexity > 100) {
			performance += 2;
		}
		if (timeDifference >= 40) {
			performance += 2;
		}

		return performance;

	}

	public void populateRolesMap() {
		role_value_map.put("Associate", 0.6);
		role_value_map.put("Analyst", 0.59);
		role_value_map.put("Senior Analyst", 0.58);
		role_value_map.put("Lead Analyst", 0.57);
		role_value_map.put("Staff Analyst", 0.56);
	}

	public void populateTimeDiffRolesMap() {
		time_diff_role_value_map.put("Staff Analyst", 0.6);
		time_diff_role_value_map.put("Lead Analyst", 0.59);
		time_diff_role_value_map.put("Senior Analyst", 0.58);
		time_diff_role_value_map.put("Analyst", 0.57);
		time_diff_role_value_map.put("Associate", 0.56);
	}

}
