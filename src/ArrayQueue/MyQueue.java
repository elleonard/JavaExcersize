package ArrayQueue;

/**
 * キュー実装のためのインターフェース
 * @author elleonard
 *
 * @param <T>
 */
public interface MyQueue<T> {
  /**
   * キューに要素を追加する
   * @param elem キューに追加する要素
   */
  public void enqueue(T elem);

  /**
   * キューから要素を取り出す
   * @return
   *      キューから取り出した要素
   *      キューが空の場合、null
   */
  public T dequeue();

  /**
   * キューが空であるかどうか
   * @return
   *      true  キューが空である
   *      false キューが空でない
   */
  public boolean isEmpty();

  /**
   * キューがいっぱいであるかどうか
   * @return
   *      true  キューがいっぱいである
   *      false キューに空きがある
   */
  public boolean isFull();

  /**
   * キューのサイズ
   * @return  キューに入っている要素の数
   */
  public int size();
}
