public class KidUsers implements LibraryUser{
    private int age;
    private String bookType;

    public KidUsers(int age,String bookType) {
        this.age=age;
        this.bookType=bookType;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setBookType(String book)
    {
        this.bookType=book;
    }

    @Override
    public void registerAccount() {
        if(age<12)
            System.out.println("you have successfully registered under a kids account");
        else
            System.out.println("sorry, age must be less than 12 to register as a kid");
    }

    @Override
    public void requestBook() {
        if(bookType.equals("kids"))
            System.out.println("Book issued successfully,please return the book within 10 days");
        else
            System.out.println("Oops,you are allowed to take only kids books");
    }
}
