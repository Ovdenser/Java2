package Lesson3;

        import java.util.ArrayList;
        import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        taskOne();
        taskTwo();

    }

    public static void taskOne() {

        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        try {
            swapTwoElementsInArray(iArray, 0, 6);
        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
        System.out.println("Swap result in array: " + Arrays.toString(iArray));
    }

    public static void taskTwo() {
        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherBoxWithOranges = new Box<>();
        System.out.println("A box of apples weighs " + boxWithApple.getWeight());
        System.out.println("A box of oranges weight " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(anotherBoxWithOranges.getBox());
    }

    private static void swapTwoElementsInArray(Object[] array, int firstNumPos, int secondNumPos) throws WrongPositionException {
        if (firstNumPos < 0 || firstNumPos > array.length ||
                secondNumPos < 0 || secondNumPos > array.length || firstNumPos == secondNumPos) {
            throw new WrongPositionException("The data is incorrect");
        }
        Object temp = array[firstNumPos];
        array[firstNumPos] = array[secondNumPos];
        array[secondNumPos] = temp;
    }

    private static <T> ArrayList arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}