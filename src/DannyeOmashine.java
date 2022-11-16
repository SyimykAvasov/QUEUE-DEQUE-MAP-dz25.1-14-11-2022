public class DannyeOmashine {
    private int godvypuska;
    private String model;
    private int sena;
    private String svet;

    public DannyeOmashine(int godvypuska, String model, int sena, String svet) {
        this.godvypuska = godvypuska;
        this.model = model;
        this.sena = sena;
        this.svet = svet;
    }

    public int getGodvypuska() {
        return godvypuska;
    }

    public void setGodvypuska(int godvypuska) {
        this.godvypuska = godvypuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSena() {
        return sena;
    }

    public void setSena(int sena) {
        this.sena = sena;
    }

    public String getSvet() {
        return svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }

    @Override
    public String toString() {
        return "DannyeOmashine{" +
                "godvypuska=" + godvypuska +
                ", model='" + model + '\'' +
                ", sena=" + sena +
                ", svet='" + svet + '\'' +
                '}';
    }
}
