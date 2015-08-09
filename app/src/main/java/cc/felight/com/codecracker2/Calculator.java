package cc.felight.com.codecracker2;

class Calculator {

	public static double makeDecimal(double num1, double num2){
							//	1 * 10 + 2
		double decimal = ((num1 * 10) + num2)/10;
		return decimal;
	}

	public static int[] quickSort(int[] array){
		int n = array.length;
                int temp = 0;
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                               
                                if(array[j-1] > array[j]){
                                        temp = array[j-1];
                                        array[j-1] = array[j];
                                        array[j] = temp;
                                }
                               
                        }
                }
			return array;
        }

	
	  
	public static int[][] generateRandomTwoDimentionalArray(int row, int col){
		int[][] matrix = new int[row][col];
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				matrix[i][j] = (int) (Math.random() * 1000);
			}
		}
		return matrix;
	}

	public static int[] bubbleSort(int[] array){
		int n = array.length;
                int temp = 0;
               
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                               
                                if(array[j-1] > array[j]){
                                        //swap the elements!
                                        temp = array[j-1];
                                        array[j-1] = array[j];
                                        array[j] = temp;
                                }
                               
                        }
                }
			return array;
        }

	public static int linearSearch(int[] array, int key){
		for(int i=0; i<array.length; i++){
			if(array[i] == key)
				return i;
		}
		return -1;
	}

	public static int[] cloneArray(int[] array){
		int[] clone = new int[array.length];
		for(int i=0; i<array.length; i++){
			clone[i] = array[i];
		}
		return clone;
	}

	//method to print int array to console
	public static void printArray(int[] array){
		//for(int i=0; i<array.length; i+=2)
		//	System.out.println(array[i]);
		for(int num: array){
			System.out.println(num);
		}
	}

	//method which accepts from and to as input and returns
	//an array filled with even numbers 1   10
	public static int[] generateEvenArray(int from, int to){
		int[] array = new int[((to-from) / 2)+1];
		int count = 0;
		for(int i=from; i<=to; i++){
			if(i%2 == 0) {
				array[count] = i;
				count++;
			}
		}
		return array;
	}

	//Max of an array
	public static double getMax(double[] myList){
		double max = myList[0];
		for(int i = 1; i<myList.length; i++){
			if(myList[i] > max){
				max = myList[i];
			}
		}
		return max;
	}
	//Summation of int array
	public static long sumOfArray(int[] array){
		long sum = 0;
		for(int i=0; i<array.length; i++){
			sum = sum + array[i];
		}
		return sum;
	}

	//accepts size as input and returns array of size filled with
	//random double numbers
	public static double[] generateRandomDoubleArray(int size){
		double[] array = new double[size];

		return array;
	}

	//accepts size as input and returns array of size filled with
	//random Integers
	public static int[] generateRandomIntArray(int size){
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++)
			array[i] = (int)(Math.random() * 1000);
			
		return array;
	}
	
	
	
	//accepts size as input and returns array of size filled with
	//natural numbers
	public static int[] generateNaturalArray(int size){
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++)
			array[i] = i + 1;
			
		return array;
	}
	
	
	public static boolean isDivisableBy6(int num){
		if(num%6 == 0)
			return true;
		else 
			return false;
	}

	public static int[] generateFibonacci(int num){
		int[] array = new int[num];
		array[0] = 0;
		array[1] = 1;
		
		for(int i=2; i<num; i++){
			array[i] = array[i-1] + array[i-2];
		}
		return array;
	}

	public static void generateEvenNumbers(int from, int to){
		for(int i=from; i<to; i++)
			if(isEven(i))
				System.out.println(i);
	}

	public static boolean isPalidram(int num){
		int original = num;
		int temp=0;
		int rev=0;
		while(num != 0){
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		if(rev == original)
			return true;
		else 
			return false;
	}
	
	
	public static void printPrime(int from, int to){
		boolean flag = true;
		
		for(int i=from; i<to; i++){
			for(int j=2; j<i; j++){
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(i);
			}
			flag = true;
		}
	}

	public static boolean isPrime(int var){
		int i;
		for(i=2; i < var; i++){
			if(var % i == 0){
				break;
			}
		}
		if(var == i)
			return true;
		else
			return false;
	}
	
	/* //Add method version 1 : With out parameters
	public static void add(){
		int num1 = 10;
		int num2 = 10000;
		
		int sum = num1 + num2;
		System.out.println(sum);
	}
	*/
	
	public static double getSpeed(double distance, double time){
		double speed = distance / time;
		return speed;
	}
	
	
	public static int add(int... array){
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		return sum;
	}
	
	
	public static int add(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public static int add(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}
	
	public static boolean isEven(int num){
		if(num%2 == 0)
			return true;
		else
			return false;
	}

}