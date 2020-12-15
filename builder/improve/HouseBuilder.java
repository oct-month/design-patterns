package builder.improve;

// 抽象的建造者
abstract class HouseBuilder
{
    protected House house = new House();

    // 抽象的建造流程
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    // 建造好房子，返回
    public House buildHouse()
    {
        return house;
    }
}
