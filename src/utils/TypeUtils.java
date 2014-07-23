package utils;

/**
 * 型に関するユーティリティ
 * @author elleonard
 *
 */
public class TypeUtils {
  /**
   * Object型からT型にキャストする
   */
  @SuppressWarnings("unchecked")
  public static <T> T castObject(Object src) {
    T ret = (T) src;
    return ret;
  }
}
