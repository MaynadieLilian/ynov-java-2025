package fr.ynov.java.medium;

public class Quality {
    private final int id;
    private final String name;

    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Quality q){
        if (this.id == q.id && this.name == q.name) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.id;}


    public static void main(String[] args) {
        Quality obj1 = new Quality(1, "table");
        Quality obj2 = new Quality(1, "table");
        System.out.println(obj1.hashCode()==obj2.hashCode());
    }
}


