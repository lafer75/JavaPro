package eighteenhomework.box;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> boxFruit;
    private int numberFruits;
    boolean nul;

    public Box() {
        boxFruit = new ArrayList<>();
        nul = true;
    }

    public Box(T... a) {
        boxFruit = new ArrayList<>();
        nul = true;
        addMany(a);
    }

    public List<T> getBoxFruit() {
        return boxFruit;
    }

    public String getBoxStyle() {
        if (!this.nul) {
            return boxFruit.get(0).getClass().getSimpleName();
        } else {
            return "null box";
        }
    }

    public void remov(String... strings) {
        if (numberFruits == 0) {
            nul = true;
            if (strings.length >= 1) {
                System.out.println("Box is null");
            }
        } else {
            boxFruit.remove(boxFruit.size() - 1);
            --numberFruits;
            if (numberFruits == 0) {
                nul = true;
            }
        }
    }


    public void addOne(T t) {
        if (numberFruits == 0) {
            boxFruit.add(t);
            numberFruits++;
            nul = false;
        } else {
            if (boxFruit.get(0).getClass().equals(t.getClass())) {
                boxFruit.add(t);
                numberFruits++;
                nul = false;
            }
        }
    }

    @SafeVarargs
    public final void addMany(T... t) {
        for (T t1 : t) {
            if (numberFruits == 0) {
                boxFruit.add(t1);
                numberFruits++;
                nul = false;
            } else {
                if (boxFruit.get(0).getClass().equals(t1.getClass())) {
                    boxFruit.add(t1);
                    numberFruits++;
                    nul = false;
                }
            }
        }
    }

    public float getWeight() {
        float end;
        if (!nul) {
            end = numberFruits * ((Fruit) boxFruit.get(0)).getWeight();
        } else {
            end = 0.0f;
        }
        return end;
    }


    public boolean compare(T t) {
        boolean end = false;
        Box box = (Box) t;
        if (this.getWeight() == (box.getWeight())) {
            end = true;
        }
        return end;
    }

    public void merge(T t) {
        Box box = (Box) t;
        if (this.getBoxStyle() == box.getBoxStyle()) {
            while (!box.nul) {
                this.addOne((T) box.getBoxFruit().get(box.boxFruit.size() - 1));
                box.remov();
            }
        }
    }

    @Override
    public String toString() {
        if (!nul) {
            return "Box style " + getBoxStyle() + ", " + numberFruits + " count ";
        } else {
            return "Box null";
        }
    }
}
