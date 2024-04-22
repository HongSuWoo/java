package test;

public class Database
{
        private String name;
        private int age;
        private String bookName;
        private int bookNum;

public Customer() {}
public Customer(String name, int age)
    {
    this.name = name;
    this.age = age;
    }
public BookAdd() {}
public BookAdd(String bookName, int bookNum)
    {
    this.bookName = bookName;
    this.bookNum = bookNum;

    }
    //메소드
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getbookName() {
        return bookName;
    }
    public void setbookNum(String bookName) {
        this.bookName = bookName;
    }
    public String bookNum() {
        return bookNum;
    }
    public void setbookNum(int bookNum) {
        this.bookNum = bookNum;
    }

}
