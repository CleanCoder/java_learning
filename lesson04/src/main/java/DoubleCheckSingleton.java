public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private DoubleCheckSingleton()  {  }

    public static DoubleCheckSingleton getInstance()  {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
