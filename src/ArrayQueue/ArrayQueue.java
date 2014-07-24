package ArrayQueue;

import utils.TypeUtils;

/**
 * 配列を用いたキューの実装
 * @author elleonard
 *
 * @param <T>
 */
public class ArrayQueue<T> implements MyQueue<T> {

  private Object[] array;
  private int head;
  private int tail;

  ArrayQueue(int size){
    array = new Object[size+1];
    head = tail = 0;
  }

  /**
   * キューから要素を取り出す
   * @return キューの先頭の要素
   */
  @Override
  public T dequeue() {
    if(isEmpty()) return null;
    T ret = TypeUtils.castObject(array[head]);
    head++; if(head > array.length) head = 0;
    return ret;
  }

  /**
   * キューが空であるかどうか
   * @return
   *      true  キューが空である
   *      false キューが空でない
   */
  @Override
  public boolean isEmpty() {
    return head == tail;
  }

  /**
   * キューのサイズ
   * Javaでは負の剰余になり得るため、
   * array.lengthを加えている
   * @return int キューに要素がいくつ入っているか
   */
  @Override
  public int size() {
    return (tail + array.length - head) % array.length;
  }

  /**
   * キューに要素を追加する
   * キューのサイズが上限に達している場合、例外を吐く
   * @params elem キューに追加する要素
   */
  @Override
  public void enqueue(T elem) {
    if(isFull()) {
      try {
        throw new Exception();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    array[tail] = elem;
    tail++;
    if(tail > array.length) tail = 0;
  }

  /**
   * キューがいっぱいかどうか
   * @return
   *      true  キューがいっぱいである
   *      false キューに空きがある
   */
  @Override
  public boolean isFull() {
    return size() == array.length-1;
  }

}

class ArrayQueueMain {
  public static void main(String args[]) {
    ArrayQueue<Integer> queue = new ArrayQueue<Integer>(10);
    for(int i=0; i<10; i++)
      queue.enqueue(i);
    for(int i=0;i<10;i++) {
      int x = queue.dequeue();
      System.out.println(x);
    }
  }
}
