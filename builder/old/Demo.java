package builder.old;

// 这种设计方案 把产品和创建产品的过程 封装在一起，耦合性增强了。
class Demo
{
    public static void main(String[] args)
    {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
