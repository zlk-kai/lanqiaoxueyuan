package 数据结构.线性结构;

class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void add() throws Exception {
        MyArrayList list = new MyArrayList();
        list.add("nike");
        list.add("addidiaos");
        list.add("NB");
        list.add("nike");
        list.add("addidiaos");
        list.add("NB");
        list.add("nike");
        list.add("addidiaos");
        list.add("NB");
        list.add("nike");
        list.add("addidiaos");
        list.add("NB");


        System.out.println(list);
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }

    @org.junit.jupiter.api.Test
    void testDelete() {
    }

    @org.junit.jupiter.api.Test
    void update() {
        MyArrayList list = new MyArrayList();
        list.update(0,"zhang");
        System.out.println(list);
    }

    @org.junit.jupiter.api.Test
    void contains() {
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
    }
}