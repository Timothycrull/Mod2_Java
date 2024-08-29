 class Main {
    public static void main(String[] args) {

        // Creates a Person object
        Person person = new Person("James", "123 street street", "7659392345", "JamesC@gmail.com");

        // Creates a Student object
        Student student = new Student("Mark", "321 Town Ave", "7659399876", "MarkK@gmail.com", Student.Freshman);

        // Creates an Employee object
        Employee employee = new Employee("Timothy", "12 West street", "7659399283", "TimothyC@gmail.com", 1, 60000);

        // Creates a Faculty object
        Faculty faculty = new Faculty("Jessica", "21 Bill street", "7659397654", "JessicaS@gmail.com", 2, 50000, "4- 6", "Professor");

        // Creates a Staff  object
        Staff staff = new Staff("Chad", "1 Country road", "7659396523", "ChadC@gmail.com", 3, 100000, "CEO");

        // Invokes toString of Person, Student, Employee, Faculty and Staff
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}