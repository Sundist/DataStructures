package sorting;

public class HeapSort implements Sort {


    @Override
    public void sort(int[] array) {
        Heap heap = new Heap();
        for (int element : array) {
            heap.add(element);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = heap.remove();
        }
    }

    @Override
    public String name() {
        return "HeapSort";
    }
}
