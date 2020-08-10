package 数据结构.线性结构;

public interface MyList {
    /*新增一个元素*/
    void add(Object element);
    /*删除相同元素*/
    void delete(Object element);
    /*根据索引删除元素*/
    void delete(int index);
    /*
    * 将指定索引位置得元素替换成新元素
    * */
    void update(int index,Object newElement);
    /*
    * 当前列表中是否含有target这个元素
    * */
    boolean contains(Object target);
    /*返回指定元素索引处得元素*/
    Object at(int index);

    int indexOf(Object element);
}
