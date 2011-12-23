!SLIDE smaller

# Peaberry：Guice方式 #

* META-INF/MANIFEST.MF （用了它自定义的Header）

        @@@ java small
        Bundle-Module: com.chinarewards.test.internal.Module

* Guice Module

        @@@ java smaller
        import static org.ops4j.peaberry.Peaberry.service;
        import static org.ops4j.peaberry.util.TypeLiterals.export;

        protected void configure() {
                /* Import, Single Instance */
                bind(S.class).toProvider(service(S.class).single());
                /* Import, Multiple Implementations */
                bind(iterable(A.class)).toProvider(
                        service(A.class).multiple());
                /* Export */
                bind(export(A.class)).toProvider(service(aImpl).export());
        }

!SLIDE smaller

# 跟Guice不是一样吗？ #
* Guice
  * JAR A定义接口
  * JAR B定义实现
  * Main JAR C要求注入实现
     * Module需要获得 JAR B 里的实现类
     * JAR C 需要依赖 JAR B

* Peaberry
  * Bundle A定义接口
  * Bundle B定义实现，**并公开服务**
  * Bundle C要求注入接口

