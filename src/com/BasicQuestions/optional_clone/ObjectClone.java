package com.BasicQuestions.optional_clone;

public class ObjectClone implements Cloneable{
    int id;
    String name;
    public ObjectClone(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }
    public ObjectClone(){
        super();
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectClone obj = new ObjectClone(1,"anil");
        ObjectClone obj1 = new ObjectClone();

        try {
            obj1 = (ObjectClone)obj.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        obj1.id =2;
        System.out.println(obj.id);  // output 2
    }
}
