package oop;

import java.util.ArrayList;

public class Arr {

	public static void main(String[] args) {
		// 내장 어레이
		String[] student = {"이준영","이지산","서영철","배현주","변동"};
		int [] myNum = {10,20,30,40};
		//개별로 접근할땐 index[0]접근합니다
		System.out.println(student[0]);
		System.out.println(student[3]);
		//바꿀경우에는 색인을 호출하고 변경내용을 대입한 다음 출력한다
		student[4] = "송예지";
		System.out.println(student[4]);
		
		//배열의 총수량을 나타낼때 length
		System.out.println(student.length);
		System.out.println(myNum.length);
		
		//배열을 총출력 할때
		String[] cl = {"이준영","송예지"};
		for (int i = 1; i < cl.length; i++) {//start index, last index(미포함), 개별++			
			System.out.println(cl[i]);{
			}
		//수학이 싫을때
			String[] rating = {"이준영","송예지"};
			for (String q : rating) {
				System.out.println(q);
			}
			//배열로 4,5,4,8lse,만들고 4.8만 출력
			double[] score = {4,5,4.8};
			System.out.println(score[2]);
			
			//2차원 배열
			int [][] twodepth = {{1,2,3,4},{5,6,7}};
			//{[0[0][1][2][3]},[1[0][1][2]}
			System.out.println(twodepth[1][2]);
			
			//javaarraylist
			ArrayList<String> score2 = new ArrayList<String>();
			//비워진 리스트 객체를 만들고 하나씩 추가
			score2.add("이준영");
			score2.add("송예지");
			System.out.println(score2);
			
			
			ArrayList<Integer> Nums = new ArrayList<Integer>();
			Nums.add(1);
			System.out.println(Nums);
			
		}
	}
}

