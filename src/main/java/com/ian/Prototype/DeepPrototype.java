package com.ian.Prototype;

import java.io.*;

/**
 * Created by Ian on 03/06/2015.
 */
public class DeepPrototype implements Serializable {
    private static final long serialVersionUID = 1L;
    private InnerClass obj;

    public InnerClass getObj() {
        return obj;
    }

    public void setObj() {
        this.obj = new InnerClass();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return ois.readObject();
    }

    class InnerClass implements Serializable {
    }
}
