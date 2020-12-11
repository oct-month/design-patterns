package prototype.deepclone;

class Demo
{
    public static void main(String[] args)
    {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println("p.name=" + p.name + " p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + " p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.name + " p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p3.name=" + p3.name + " p3.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());
    }
}
