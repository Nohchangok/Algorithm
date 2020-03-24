package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort2750 {


	// 2720 : 수 정렬하기(QuickSort)

	/*
	 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오. 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤
	 * 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지
	 * 않는다. 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다. ex 입력 : 5 5 2 3 4 1 ex
	 * 출력 : 1 2 3 4 5
	 *
	 */
	
	static int i=0;
    static int size;
    public static int partition(int[] a, int begin, int end) {
        int pivot, temp, L, R;
        i++; //연산 횟수
        L = begin;
        R = end;
        pivot = (int)((begin+end)/2);
        System.out.println(i+"단계: pivot="+a[pivot]);
         //1. while(L<R)인경우
        while(L<R) {
        	//69, 10, 30, 11, 5, 8, 31, 22
            while((a[L]<=a[pivot]) && (L<R)) L++; //L=0
            while((a[R]>a[pivot]) && (L<=R)) R--; //R=5
            if(L<=R) { 
                temp = a[L];
                a[L] = a[R];
                a[R] = temp;
                if(R == pivot) { // L과 R 원소를 교환하여 결과적으로 pivot 원소의 위치가 변경된 경우
                    for(int t=0;t<size;t++) {
                        System.out.print(a[t]+" ");
                    }
                    System.out.println();
                    return L; // L은 확정된 pivot의 위치
                }
            }
        }
        System.out.println(":::");
        //2. while(L>R)인 경우
        temp = a[pivot];
        a[pivot] = a[R];
        a[R] = temp;
        for(int t=0;t<size;t++) {
            System.out.print(a[t]+" ");
        }
        System.out.println();
        return R;//R은 확
    }
    
    public static void quickSort(int[] a, int begin, int end) {
        if(begin<end) {
            int p = partition(a, begin, end); 
            quickSort(a, begin, p-1);// pivot의 왼쪽 부분집합에 대해 퀵 정렬 재귀호출
            quickSort(a, p+1, end);//pivot의 오른쪽 부분집합에 대해 퀵 정렬 재귀호출
        }
    }
    
    public static void main(String[] args) {
        int[] list = {69, 10, 30, 11, 5, 8, 31, 22};
        size = list.length;
        quickSort(list, 0, size-1);
    }

}
