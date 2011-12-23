!SLIDE smaller

# OSGi与JPA #

* JPA传统做法
  * Domain/Model JAR 包含 META-INF/persistence.xml
  * Client/Logic JAR 加载、引用 EntityManagerFactory/EntityManager
  * peristence.xml可以有以下任务
    * 自己叫什么名字
    * 定义所有的Entity对象
    * 声明自己需要什么**类型**(JTA, Resource-Local)的DataSource
    * 声明自己需要什么**名字**(JNDI)的DataSource
    * 声明自己需要什么JDBC Connection Properties
    * 甚至定义自己用什么SQL方言
  * JPA实现(例如Hibernate)会根据persistence.xml来创建EMF/EM

!SLIDE smaller

# JPA-OSGi做法 #

[Eclipse Intro - PDF](http://wiki.eclipse.org/images/e/ee/OSGi_JPA_Spec_and_Gemini_JPA.pdf)

[Apache Aries Configuration with Blueprint](http://jazoon.com/Portals/0/Content/slides/we_a7_1630-1650_ward.pdf)

!SLIDE smaller

# JPA-OSGi做法 #

* Persistence Bundle (Entity Beans, 定义 Persistence-Unit)
* Client Bundle (引用 Persistence Bundle 的逻辑)
* JPA Provider (EclipseLink 等 JPA 实现) 
* DataSource Service Provider (提供DataSource)

