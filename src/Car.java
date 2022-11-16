public class Car {
    private int id;
    private String nomerAfto;

    public Car(int id, String nomerAfto) {
        this.id = id;
        this.nomerAfto = nomerAfto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomerAfto() {
        return nomerAfto;
    }

    public void setNomerAfto(String nomerAfto) {
        this.nomerAfto = nomerAfto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nomerAfto='" + nomerAfto + '\'' +
                '}';
    }
}
