package TestingPackage;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
/** add tests to check for this unit test **/
}
public void testNegative(){
	int[] arr = new int[7];
	arr[0] = -18;
	arr[1] = -9;
	arr[2] = -5;
	arr[3] = -3;
	arr[4] = -1;
	arr[5] = -65;
	arr[6] = -7;
	int[] Sortedarr = new int[5];
	Sortedarr[0] = -65;
	Sortedarr[1] = -18;
	Sortedarr[2] = -9;
	Sortedarr[3] = -7;
	Sortedarr[4] = -5;
	Sortedarr[5] = -3;
	Sortedarr[6] = -1;
}
public void testMixed(){
	int[] arr = new int[4];
	arr[0] = -18;
	arr[1] = 9;
	arr[2] = 5;
	arr[3] = -3;
	
	int[] Sortedarr = new int[4];
	Sortedarr[0] = -18;
	Sortedarr[1] = -3;
	Sortedarr[2] = 5;
	Sortedarr[3] = 9;
	
public void testDuplicates(){
	int[] arr = new int[5];
	arr[0] = 7;
	arr[1] = 7;
	arr[2] = 5;
	arr[3] = 4;
	arr[4] = 4;
	
	int[] Sortedarr = new int[5];
	Sortedarr[0] = 4;
	Sortedarr[1] = 4;
	Sortedarr[2] = 5;
	Sortedarr[3] = 7;
	Sortedarr[4] = 7;
}
