## application.xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:context="http://www.springframework.org/schema/context"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans.xsd
http://www.springframework.org/schema/context
http://www.springframework.org/schema/context/spring-context.xsd">

<context:annotation-config/>
</beans>

2.属性如何注入
@Component有几个衍生注解，我们在web开发中,会按照mvc三次架构分层
   ·dao        @Repository
   ·service    @Service
   ·controller @Controller
    这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean