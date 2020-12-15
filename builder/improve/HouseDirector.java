package builder.improve;

class HouseDirector
{
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder)
    {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder)
    {
        this.houseBuilder = houseBuilder;
    }

    // 建造房子的流程交给Director负责
    public House constructHouse()
    {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
