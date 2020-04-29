package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort2750 {


	// 2720 : 수 정렬하기(QuickSort)

	/*
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
        	System.out.println("여기몇번들어오니?");
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
