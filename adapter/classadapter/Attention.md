# 类适配器模式

> Adapter类，通过继承src类，实现dst类接口，完成src->dst的适配。

## 细节

1. 因为Java是单继承机制，继承src类后，dst就只能是接口，有一定的局限性。

2. src类的方法也会暴露在Adapter中。

3. 由于继承了src类，Adapter可以根据需求重写src类的方法，灵活性很好。

