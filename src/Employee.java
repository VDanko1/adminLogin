import java.util.Random;

public class Employee {
    private int id;
    private boolean add;
    private boolean remove;
    private boolean sell;
    private Random random;

    public Employee(int ID) {
        random = new Random();
        this.id = ID;
        this.add = random.nextBoolean();
        this.remove = random.nextBoolean();
        this.sell = random.nextBoolean();
    }

    public boolean isSell() {
        return sell;
    }

    public void setSell(boolean sell) {
        this.sell = sell;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean remove) {
        this.remove = remove;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
