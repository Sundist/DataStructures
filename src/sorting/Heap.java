package sorting;

import list.ArrayListInt;
import list.ListInt;

public class Heap {

    private ArrayListInt list = new ArrayListInt();

    public void add(int element) {
        list.add(element);
        int index = list.size() - 1;

        while (true) {
            int parentIndex = (index - 1) / 2;
            if (parentIndex >= 0 && list.get(parentIndex) < list.get(index)) {
                int temp = list.get(parentIndex);
                list.set(parentIndex, list.get(index));
                list.set(index, temp);
                index = parentIndex;
            } else break;
        }
    }

    public int remove() {
        int first = list.get(0);
        // son eleman ılk elemana atanacak

        list.set(0, list.get(list.size() - 1));
        // son eleman arryden cıkartılacak
        list.removeIndex(list.size() - 1);
        // dongu ıcınde ıkı cocuk bulunup  bırınden daha kucukse buyuk olanla yer degıstırılecek
        int index = 0;
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            // left yok right yok
            // break
            if (leftChildIndex >= list.size()) break;
            // left var right yok
            // //left küçük -> break
            // //left büyük -> swap
            if (rightChildIndex >= list.size()) {
                if (list.get(leftChildIndex) <= list.get(index)) break;
                else {
                    int temp = list.get(index);
                    list.set(index, list.get(leftChildIndex));
                    list.set(leftChildIndex, temp);
                }
            } else {
                //ikisi de var
                // //buyuk olanı bul
                int maxIndex;
                if (list.get(leftChildIndex) > list.get(rightChildIndex)) maxIndex = leftChildIndex;
                else maxIndex = rightChildIndex;

                // // //buyuk olan benden kucuk -> break
                // // // buyuk olan benden buyuk -> swap
                if (list.get(maxIndex) <= list.get(index)) break;
                else {
                    int temp = list.get(index);
                    list.set(index, list.get(maxIndex));
                    list.set(maxIndex, temp);
                }
            }


            break;
        }

        return first;
    }
}
