package programmers;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/92341
public class programmers92341 {
	public static void main(String[] args) throws Exception {
		System.out.println(Arrays.toString(new programmers92341().solution(new int[] { 180, 5000, 10, 600 },
				new String[] { "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
						"18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT" })));
		System.out.println(Arrays.toString(new programmers92341().solution(new int[] { 120, 0, 60, 591 }, new String[] {
				"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN" })));
		System.out.println(Arrays.toString(
				new programmers92341().solution(new int[] { 1, 461, 1, 10 }, new String[] { "00:00 1234 IN" })));
		System.out.println(Arrays.toString(new programmers92341().solution(new int[] { 180, 5000, 10, 600 },
				new String[] { "05:34 5961 IN", "06:34 5961 OUT", "07:34 5961 IN", "08:34 5961 OUT", "09:34 5961 IN",
						"10:34 5961 OUT", "11:34 5961 IN", "12:34 5961 OUT" })));
	}

	public int[] solution(int[] fees, String[] records) {
		Map<String, Integer> times = new HashMap<>();
		Map<String, Integer> car_in = new HashMap<>();
		List<String> cars = new ArrayList<>();
		int max_time = 23 * 60 + 59;

		for (int i = 0; i < records.length; i++) {
			String[] car_Info = records[i].split(" ");
			String[] timeArr = car_Info[0].split(":");

			int time = (Integer.parseInt(timeArr[0]) * 60) + Integer.parseInt(timeArr[1]);

			if ("IN".equals(car_Info[2])) {
				car_in.put(car_Info[1], time);

				if (!cars.contains(car_Info[1])) {
					cars.add(car_Info[1]);
				}
			} else {
				if (car_in.get(car_Info[1]) != null) {
					int parking_time = time - car_in.get(car_Info[1]);
					times.put(car_Info[1],
							(times.get(car_Info[1]) != null ? times.get(car_Info[1]) : 0) + parking_time);
					car_in.put(car_Info[1], null);
				}
			}
		}
		int[] answer = new int[cars.size()];
		Collections.sort(cars);
		for (int i = 0; i < cars.size(); i++) {
			int feesTime = times.get(cars.get(i)) != null ? times.get(cars.get(i)) : 0;
			if (car_in.get(cars.get(i)) != null) {
				feesTime += max_time - car_in.get(cars.get(i));
			}
			if (feesTime < fees[0]) {
				answer[i] = fees[1];
			} else {
				answer[i] = (int) (fees[1] + Math.ceil((double) (feesTime - fees[0]) / fees[2]) * fees[3]);
			}
		}
		return answer;
	}
}