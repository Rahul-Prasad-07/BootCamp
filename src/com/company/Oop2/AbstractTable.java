package com.company.Oop2;
import java.util.*;

// Class name should be "Source",
// otherwise solution won't be accepted


public class AbstractTable {
        public static void main(String args[] ) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            PrintTable obj = new PrintTable();
            obj.output(n);
        }


}

abstract class MathClass01 {
    abstract void output(Integer n);
}
  class PrintTable extends MathClass01 {

      @Override
      void output(Integer n) {

          for (int i = 1; i <= 10; i++) {

             //System.out.format("%d * %d = %d ", n, i, n * i);
              System.out.print(i*n + " ");

          }
      }
  }

