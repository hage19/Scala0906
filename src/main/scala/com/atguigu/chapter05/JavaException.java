package com.atguigu.chapter05;

public class JavaException {
    public static void main(String[] args) {
        try {
            // 可疑代码
            int i = 0;
            int b = 10;
            int c = b / i; // 执行代码时，会抛出ArithmeticException异常
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //不管是否发生因此，都有执行finally
            // 最终要执行的代码
            System.out.println("java finally");
        }

    }
}
