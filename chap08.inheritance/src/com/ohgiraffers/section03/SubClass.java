package com.ohgiraffers.section03;

public class SubClass extends SuperClass
{
//아래의 private 메소드는 자식에서 접글ㄴ할 수 없는 메소드로 재정의가 불가능하다.
//    private void privateMethod(){}
//    private final void finalMethod(){}
//파이널은 수정이 불가능하니깐

    @Override
    public void method(int num) {
        super.method(num);
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
    @Override
    public void jetho() throws NullPointerException
    {
        super.jetho();
    }

}
