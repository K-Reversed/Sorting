import java.util.*;

public class Main {
    public static String[] alphabetSelectionSort (String[] arr){
        if (arr.length < 2){
            return (arr);
        }
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i ++) {
            int mem = i;
            for (int i1 = i + 1; i1 < arr.length; i1++){
                if (arr[i1].toLowerCase(Locale.ROOT).compareTo(arr[mem].toLowerCase(Locale.ROOT)) < 0){
                    mem = i1;
                }
            }
            String temp = arr[i];
            arr[i] = arr[mem];
            arr[mem] = temp;
            swaps++;
        }
        System.out.println("It has done " + swaps + " swaps.");
        return (arr);
    }

    public static String[] alphabetInsertionSort (String[] arr){
        if (arr.length < 2){
            return (arr);
        }
        int swaps = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for (int i1 = i + 1; i1 < arr.length; i1++){
                if (arr[i].toLowerCase(Locale.ROOT).compareTo(arr[i1].toLowerCase(Locale.ROOT)) > 0){
                    String temp = arr[i];
                    arr[i] = arr[i1];
                    arr[i1] = temp;
                    swaps ++;
                }
            }
        }

        System.out.println("It has done " + swaps + " swaps.");
        return (arr);
    }

    public static ArrayList<String> alphabetArrayListSelectionSort (ArrayList<String> arr){
        if (arr.size() < 2){
            return (arr);
        }
        int swaps = 0;
        for (int i = 0; i < arr.size() - 1; i ++) {
            int mem = i;
            for (int i1 = i + 1; i1 < arr.size(); i1++){
                if (arr.get(i1).toLowerCase(Locale.ROOT).compareTo(arr.get(mem).toLowerCase(Locale.ROOT)) < 0){
                    mem = i1;
                }
            }
            String temp = arr.get(i);
            arr.set(i, arr.get(mem));
            arr.set(mem, temp);
            swaps ++;
        }
        System.out.println("It has done " + swaps + " swaps.");
        return (arr);
    }

    public static ArrayList<String> alphabetArrayListInsertionSort (ArrayList<String> arr){
        if (arr.size() < 2){
            return (arr);
        }
        int swaps = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            for (int i1 = i + 1; i1 < arr.size(); i1++){
                if (arr.get(i).toLowerCase(Locale.ROOT).compareTo(arr.get(i1).toLowerCase(Locale.ROOT)) > 0){
                    String temp = arr.get(i);
                    arr.set(i, arr.get(i1));
                    arr.set(i1, temp);
                    swaps ++;
                }
            }
        }

        System.out.println("It has done " + swaps + " swaps.");
        return (arr);
    }

    public static ArrayList<Integer> integerArrayListSelectionSort (ArrayList<Integer> arr){
        if (arr.size() < 2){
            return (arr);
        }
        int swaps = 0;
        for (int i = 0; i < arr.size() - 1; i ++) {
            int mem = i;
            for (int i1 = i + 1; i1 < arr.size(); i1++){
                if (arr.get(i1).compareTo(arr.get(mem)) < 0){
                    mem = i1;
                }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(mem));
            arr.set(mem, temp);
            swaps ++;
        }
        System.out.println("It has done " + swaps + " swaps.");
        return (arr);
    }

    public static ArrayList<Integer> integerArrayListInsertionSort (ArrayList<Integer> arr){
        if (arr.size() < 2){
            return (arr);
        }
        int swaps = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            for (int i1 = i + 1; i1 < arr.size(); i1++){
                if (arr.get(i).compareTo(arr.get(i1)) > 0){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i1));
                    arr.set(i1, temp);
                    swaps ++;
                }
            }
        }
        System.out.println("It has done " + swaps + " swaps.");
        return (arr);
    }

    public static void main(String[] args) {
	 String[] strings1 = {"z", "Y", "X", "w", "V", "U", "t", "s", "R", "q", "P", "o", "N", "M", "l", "K", "j", "I", "h", "G", "f", "e", "D", "c", "b", "A"};
     System.out.println(Arrays.toString(alphabetSelectionSort(strings1.clone())));
	 System.out.println(Arrays.toString(alphabetInsertionSort(strings1.clone())));

     ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(
             "z", "Y", "X", "w", "V", "U", "t", "s", "R", "q", "P", "o", "N", "M", "l", "K", "j", "I", "h", "G", "f", "e", "D", "c", "b", "A")
     );
     System.out.println(alphabetArrayListSelectionSort((ArrayList<String>) stringArrayList.clone()));
     System.out.println(alphabetArrayListInsertionSort((ArrayList<String>) stringArrayList.clone()));
     ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(
                10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
     );
     System.out.println(integerArrayListSelectionSort((ArrayList<Integer>) integerArrayList.clone()));
     System.out.println(integerArrayListInsertionSort((ArrayList<Integer>) integerArrayList.clone()));

    }
}
