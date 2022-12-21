package lekcja;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lekcja {
    public static void main(String[] args) {
        Map<String, Notebook> notebooks = new HashMap<>();
        notebooks.put("B590", new Notebook("Lenovo", "B590"));
        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));

        Set<Map.Entry<String, Notebook>> entry = notebooks.entrySet();
        System.out.println(entry);
        for (Map.Entry<String, Notebook> stringNotebookEntry : entry) {
            System.out.println(stringNotebookEntry.getKey() + " " + stringNotebookEntry.getValue());
        }

    }
}
