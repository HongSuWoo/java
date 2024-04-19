package com.ohgiraffers.section02.looping;
/*
while문 표현식
초기식
while(조건식){
조건식을 만족하는 경우 수행할 구문(반복할 구문);
증감식;
}

while(조건식){
조건식을 만족하는 경우 수행할 구문
}
 */
public class B_while
{
    public void testSimpleWholeStatement()
    {
     int i = 2;
     while (i <= 9 )
         {
             int j = 2;
             while(j <= 9)
              {
              System.out.printf("%d * %d = %2d   ",j,i,i*j);
              j++;
              }
          System.out.println("");
          i++;
        }
    }
}
