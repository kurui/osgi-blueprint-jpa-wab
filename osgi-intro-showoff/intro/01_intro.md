!SLIDE bullets

# OSGi介绍 #
* IT部内部培训: 2011-12-21

!SLIDE

# OSGi是什么？ #

  * Open Services Gateway initiative framework
  * 组件模型 Module System
  * 服务平台 Service Platform 
  * 是Java从来没有定义过的
  * 容器

!SLIDE

# OSGi为什么？ #
* 直接原因
  * ClassLoader问题
  * 动态服务
  * 运行依赖关系（Maven是编译需要的依赖）
  * 升级维护
* 间接原因
  * 软件架构分层

!SLIDE

# OSGi有什么？ #
* Framework
  * 相当于容器
* Bundles
  * 有特别MANIFEST信息的JAR
  * BundleActivator
* Services
  * 发布自身提供的服务
  * 引入其他Bundle提供的服务
