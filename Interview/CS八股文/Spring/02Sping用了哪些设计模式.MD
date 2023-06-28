一、单例模式

单例模式应该是大家印象最深的一种设计模式了。在Spring中最明显的使用场景是在配五文件中配三注册
bean对象的时候设置scope的们为singleton .
cbeans xmIns."http:/ /n , springframework ,ore/schema/beans
xmlns:xs1-"http://wwww3.org/2001/2L5chema-instance"
xsi:scheralocation-"http://ww,springframeworkorg/schema/beans
http://wnspringfranework.org/schena/beans/spring-beang .xsd”>
<!-- sineleton-->
<bean class-"can.dpb.pojo.user" id-"user” scope."sineleton">
<!-- sineleton end-->
cproperty nase.”nase"
value-"法没t贴"></property>
462372
c/beans>

二、原型模式(克隆模式)

原型模式也叫克降模式，Spring中该增式便用的很明显，和单例一样在bean标然中设置Scope的属性
prototype即感示该bean以克产的方式牛成
<?xml version-"1.0” encoding-"uTF-B"?>
cbeans xmIns-"http:/ww .springframework.org/schama/beans'
xmlns;xsi"http://ww.w3.ore/2091/341 Schema-instance"
xsi:scheralocation-"http://ww,springfremework,org/schera/beans
http://www.springframework.org/schena/beans/spring-beans ,xsd">
<!-- prototype-->
cbaan class_"con.dob.poro.user" id-"user"” scope "prototype"y
<!-- prototype-->
<property name-"name” value-"5tt5"</praperty>
c/bean>
(/b23n5>

三、模板模式

模板模式的核心是父类定义好流程，然后将流程中需要子类实现的方法就抽象话留给子类实现，Spring中
的jdbcTemplate就是这样的实现，我们知道ldbc的步聚是固走
·加载驱动
·获取连持通道
·构建sql话句
·执行sql语句
·关闭资源
在这些步骤中第3步和第四步是不确定的,所以就留给客户实现，而我们实际使用JdbcTemplate的时候也确
实是只需要构建SQL就可以了,这就是典型的模板模式。我们以query方法为例来看下JdbcTemplate中的代码.

四、观察者模式
观察名模式定义的是对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依羲于它的对象郁得到通知并被自动亚新。
使用比较场景是听脂中而spring中Observer模式常用的地方也是listener的实
现如ApplicationListenel

五、工厂模式
简单工厂模式
简单工广模式就是通过工厂恨据传递进来的参数决定产生哪个对象，Sprlmg中我们通过getBean方法获取
对经的时候根据Id或者name获取就是简单工厂模式了。

六、...
