public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setAge (int age){
        if (age < 0 || age > 100) age = 0;
        this.age = age;
    }

    public String getFirstName (){
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getAge (){
        return age;
    }

    public boolean isTeen(){
        boolean result;
        if (age > 12 && age < 20) result = true;
        else result = false;
        return result;
    }

    public String getFullName () {
        String fullName;
        if (firstName.isEmpty() == false && lastName.isEmpty() == false) fullName = firstName + ' ' + lastName;
        else if (firstName.isEmpty() == true && lastName.isEmpty() == false) fullName = lastName;
        else if (firstName.isEmpty() == false && lastName.isEmpty() == true) fullName = firstName;
        else fullName = "";
        return fullName;
    }
}
