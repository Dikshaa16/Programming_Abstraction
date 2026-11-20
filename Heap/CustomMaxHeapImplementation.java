package heap;

import java.util.*;

public class CustomMaxHeapImplementation {

  private final ArrayList<Integer> heap = new ArrayList<>();

  public void insert(int value) {
    heap.add(value);
    for (int i = heap.size() - 1; i > 0; ) {
      int parent = (i - 1) / 2;
      if (heap.get(parent) >= heap.get(i)) break;
      Collections.swap(heap, parent, i);
      i = parent;
    }
  }

  public Integer extractMax() {
    if (heap.isEmpty()) return null;
    int answer = heap.get(0);
    int last = heap.remove(heap.size() - 1);
    if (!heap.isEmpty()) {
      heap.set(0, last);
      int i = 0;
      while (true) {
        int left = i * 2 + 1,
          right = left + 1,
          largest = i;
        if (left < heap.size() && heap.get(left) > heap.get(largest)) largest =
          left;
        if (
          right < heap.size() && heap.get(right) > heap.get(largest)
        ) largest = right;
        if (largest == i) break;
        Collections.swap(heap, i, largest);
        i = largest;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Custom Max Heap Implementation");
  }
}
