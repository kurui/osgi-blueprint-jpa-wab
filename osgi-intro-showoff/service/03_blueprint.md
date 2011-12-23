!SLIDE small

# Blueprint #

* 源自Spring
* OSGi Enterprise Spec 4.2
* OSGI-INF/blueprint/blueprint.xml (可变)
* 并不是纯粹OSGi Framework可以满足
* 还要特别的Profile/Extension

!SLIDE smaller
# Service Provider #

* OSGI-INF/blueprint/blueprint.xml

        @@@ xml smaller
        <?xml version="1.0" encoding="UTF-8"?>
        <blueprint xmlns="http://www.osgi.org/xmlns/blueprint/v1.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            default-activation="eager">
        
            <!-- 定义一个 POJO Bean -->
            <bean id="exampleServiceImpl"
              class="com.chinarewards.test.client.internal.ExampleServiceImpl">
            </bean>
        
            <!-- Export Service Bean -->
            <service id="exampleService" ref="exampleServiceImpl" 
              interface="com.chinarewards.test.client.ExampleService">
            </service>
        </blueprint>

!SLIDE smaller
# Service Consumer #

* OSGI-INF/blueprint/blueprint.xml

        @@@ xml smaller
        <?xml version="1.0" encoding="UTF-8"?>
        <blueprint xmlns="http://www.osgi.org/xmlns/blueprint/v1.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            default-activation="eager">

            <reference id="otherService"
                interface="com.chinarewards.test.client.ExampleService"/>

            <bean id="myBean"
                class="com.chinarewards.test.client.internal.Consumer">
                <property name="example" ref="otherService" />
            </bean>

        </blueprint>

!SLIDE smaller
# 跟Spring不是一样吗? #

* Spring
  * JAR A定义接口
  * JAR B定义实现
  * Main JAR C要求注入实现
     * XML需要知道 JAR B 里的实现类
     * 而且定义在 JAR C 包里面
     * JAR C 在无形中需要依赖 JAR B
     * 虽然以 XML 形式出现
     * ClassLoader C 要利用 ClassLoader B 加载 JAR B 的对象，或者根本是同一个CL

* Blueprint
  * Bundle A定义接口
  * Bundle B定义实现，**并公开服务**
  * Bundle C要求注入接口

