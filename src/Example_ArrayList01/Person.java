package Example_ArrayList01;

public class Person {
    private int id;
    public Person(int id){
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {// xoa cac doi tuong co cung Id
        return (obj instanceof Person)?(((Person)obj).getId()==this.id):false;
    }
}
