import java.util.*;


public class Binary {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

        System.out.println("enter the array size!");

                int size = input.nextInt();

                int[] arr = new int[size];

        System.out.println("enter the array elements!");

                for(int a = 0;a<size;a++){

                    arr[a] = input.nextInt();
                }

                int temp;

                for(int a =0;a<size;a++){

                    for(int b =0;b<size;b++){

                        if(arr[a]<arr[b]){
                            temp =arr[b];
                            arr[b] = arr[a];
                            arr[a] = temp;
                        }
                    }


                }

        System.out.println("Array sorted now New Array is: ");
        System.out.println(Arrays.toString(arr) + "\n");

        System.out.println("Please enter the element to find in Array!");

                int x = input.nextInt();


                int start = 0;
                int end = size-1;

                while(start<=end){
                    mid = (start+end)/2;

                    if(x==arr[mid]){

                        System.out.println("Element found at Index: " + mid);
                        break;

                    }
                    else if(x>arr[mid]){

                        start = mid + 1;

                    }
                    else{
                        end = mid-1;

                    }

                    if(flag1 == flag2){

                        System.out.println("Element not found!");
                        break;
                    }




                }


            }
        }
