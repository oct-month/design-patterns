package builder.improve;

class HignBuilding extends HouseBuilder
{
    @Override
    public void buildBasic()
    {
        System.out.println("高楼的地基打100m");
    }

    @Override
    public void buildWalls()
    {
        System.out.println("高楼的砌墙20cm");
    }

    @Override
    public void roofed()
    {
        System.out.println("高楼的透明屋顶");
    }
}
