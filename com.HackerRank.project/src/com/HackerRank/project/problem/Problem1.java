package com.HackerRank.project.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Given an array A of N elements. Find the majority element in the array. A
 * majority element in an array A of size N is an element that appears more than
 * N/2 times in the array.
 * 
 * Example 1:
 * 
 * Input: N = 3 A[] = {1,2,3} Output: -1 Explanation: Since, each element in
 * {1,2,3} appears only once so there is no majority element.
 * 
 * Example 2:
 * 
 * Input: N = 5 A[] = {3,1,3,3,2} Output: 3 Explanation: Since, 3 is present
 * more than N/2 times, so it is the majority element.
 * 
 * Your Task: The task is to complete the function majorityElement() which
 * returns the majority element in the array. If no majority exists, return -1.
 * 
 * Expected Time Complexity: O(N). Expected Auxiliary Space: O(1).
 * 
 * 
 * Constraints: 1 <= N <= 107 0 <= Ai <= 106
 * 
 * @author 05946N744
 *
 */
public class Problem1 {

	public static void main(String[] args) {

		List<Integer> grades = Arrays.asList(22, 86, 30, 0, 16, 51, 53, 42, 48, 22, 69, 12, 27, 34, 24, 95, 16, 32, 22,
				52, 56, 71, 95);

		gradingStudents(grades);

	}

	public static List<Integer> gradingStudents(List<Integer> grades) {

		List<Integer> newGrades = new ArrayList<Integer>();
		for (Integer grade : grades) {

			if (grade < 100 && grade > 0) {
				if (grade <= 33) {
					newGrades.add(grade);
				} else {
					int gradeR = grade % 5;
					if (gradeR == 3) {
						grade = grade + 2;
						newGrades.add(grade);
					} else if (gradeR == 4) {
						grade = grade + 1;
						newGrades.add(grade);
					} else {
						newGrades.add(grade);
					}
				}
			} else {
				newGrades.add(grade);
			}
		}
		System.out.println(newGrades.toString());
		return newGrades;

	}
}
