# 迪米特法则

## 基本介绍

1. 一个对象应该对其它对象保持最少的了解。

2. 类与类关系越密切，耦合度越大。

3. 一个类对自己依赖的类知道的越少越好。
也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。
除了提供的public方法，不对外泄露任何信息。

1. 陌生的类最好不要以局部变量的形式出现在类的内部。

## 细节

1. 迪米特法则的核心是降低类之间的耦合。

2. 并不是要求完全没有依赖关系。

