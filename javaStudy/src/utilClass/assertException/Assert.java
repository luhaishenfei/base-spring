package utilClass.assertException;

public  class Assert {
    //工具类
    public static void isTrue(boolean expression,String errorMsg) throws Exception {
        if (!expression){
            throw new Exception(errorMsg);
        }
    }



}
