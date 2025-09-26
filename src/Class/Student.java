package Class;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        setName(name); 
        setAge(age);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("nombre invalido");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("edad invalida");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            System.out.println("id invalido");
        }
    }
}        