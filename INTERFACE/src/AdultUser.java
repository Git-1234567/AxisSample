public class AdultUser implements LibraryUser{
   private int age;
    private String bookType;

    public AdultUser(int age,String bookType) {
        this.age=age;
        this.bookType=bookType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(age>12)
            System.out.println("you have successfully registered under a Adult Account");
        else
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Fiction"))
            System.out.println("Book issued successfully,please return the book within 7 days");
        else
            System.out.println("Oops,you are allowed to take only adult Fiction books");
    }
}
