package builder.improve;

// 建造的具体流程从抽象Builder改为Director负责
class Demo
{
    public static void main(String[] args)
    {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();

        System.out.println("----------------------------");

        HignBuilding hignBuilding = new HignBuilding();
        houseDirector.setHouseBuilder(hignBuilding);
        House house2 = houseDirector.constructHouse();
    }
}
