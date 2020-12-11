package prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DeepProtoType implements Serializable, Cloneable
{
    private static final long serialVersionUID = 1L;
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType()
    {
        super();
    }

    // 方式一：使用clone方法
    @Override
    protected Object clone()
    {
        try {
            Object deep = super.clone();
            DeepProtoType deepProtoType = (DeepProtoType) deep;
            deepProtoType.deepCloneableTarget = (DeepCloneableTarget) this.deepCloneableTarget.clone();
            return deepProtoType;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // 方式二：通过对象序列化实现
    public Object deepClone()
    {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try {
                oos.close();
                bos.close();
                ois.close();
                bis.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
