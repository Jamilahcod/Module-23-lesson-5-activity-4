class parent {
    int age;
    String name;
    void setdetails(int age, String name){
        this.age=age;
        this.name=name;
    }

    void display() {
        System.out.println("name is: " + name);
        System.out.println("age is: " + age);
    }
}
 

class main {
    public static void main(String[] args) {
        parent p= new parent();
        p.setdetails(17,"Jamila");
        p.display();
    }
}