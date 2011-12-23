!SLIDE small

# OSGi与WebApp #

* 模拟传统做法：Web Application Bundle (WAB)
  * 结构跟 WAR 一样
  * WEB-INF/lib 也可以保留
  * Bundle Header
    * Web-ContextPath: /my_context_path
    * Webapp-Context: /my_context_path
    * Bundle-ClassPath: .,WEB-INF/classes

!SLIDE small

# WebApp引用OSGi Service #

* OSGi Spring Integration (类似ContextLoaderListener)
* Guice-Servlet + Peaberry
