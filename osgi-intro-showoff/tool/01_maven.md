!SLIDE smaller

# Maven与Bundle #

* [org.apache.felix:maven-bundle-plugin](http://felix.apache.org/site/apache-felix-maven-bundle-plugin-bnd.html)
* 封装了 [Bnd](http://www.aqute.biz/Bnd/Bnd)

# Maven运行OSGi环境 #

* [org.ops4j:maven-pax-plugin](http://www.ops4j.org/projects/pax/construct/maven-pax-plugin/index.html)
* 封装了 [Pax-Construct](http://www.ops4j.org/projects/pax/construct/)

        @@@ sh
        $ mvn pax:run

!SLIDE smaller

# Eclipse与OSGi #

* Eclipse是专业的OSGi开发工具
* 所有 Eclipse Plugin 都是 OSGi Bundle

# Eclipse + Maven + OSGi #

        @@@ sh
        $ mvn pax:eclipse

* Eclipse 项目多了一个 **Plug-in Dependencies**

