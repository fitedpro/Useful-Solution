import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Class reuse
*/


public class Solution003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        String grandmotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String dautherName = reader.readLine();

        Cat catGrandFather = new Cat(grandfatherName);
        Cat catGrandMother = new Cat(grandmotherName);
        Cat catFather = new Cat(fatherName, catGrandFather, null);
        Cat catMother = new Cat(motherName, null, catGrandMother);
        Cat catSon = new Cat(sonName, catFather, catMother);
        Cat catDauther = new Cat(dautherName, catFather, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDauther);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if  ((mother == null) && (father == null))
                return "The cat's name is " + name + ", no mother, no father";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
