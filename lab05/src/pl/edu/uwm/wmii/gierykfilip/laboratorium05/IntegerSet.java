package pl.edu.uwm.wmii.gierykfilip.laboratorium05;

public class IntegerSet {
    boolean[] liczby;

    public IntegerSet() {
        this.liczby = new boolean[100];
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet zbior = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (a.liczby[i] || b.liczby[i]) {
                zbior.liczby[i] = true;
            }
        }
        return zbior;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet zbior = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (a.liczby[i] && b.liczby[i]) {
                zbior.liczby[i] = true;
            }
        }
        return zbior;
    }

    public void insertElement(int i) {
        this.liczby[i - 1] = true;
    }

    public void deleteElement(int i) {
        this.liczby[i - 1] = false;
    }

    public String toString() {
        StringBuilder lancuch = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (this.liczby[i]) {
                lancuch.append(i + 1);
                lancuch.append(" ");
            }
        }
        return lancuch.toString();
    }

    public boolean equals(IntegerSet a) {
        for (int i = 0; i < 100; i++) {
            if (this.liczby[i] != a.liczby[i]) {
                return false;
            }
        }
        return true;
    }
}
