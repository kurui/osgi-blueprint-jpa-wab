!SLIDE small

# Bundle基本结构 #

* 普通的JAR文件
* META-INF/MANIFEST.MF
* Bundle-Name: 组件的唯一标识
* Bundle-Version: 组件的版本号
* Export-Package: 对于包装里面的对象，什么需要开放

        @@@ java smaller
        Bundle-ManifestVersion: 2
        Bundle-Name: com.chinarewards.test.client
        Bundle-Version: 1.0.0
        Export-Package: com.chinarewards.test.client

!SLIDE smaller

# Bundle的依赖 #

* 依赖其他组件的Export-Package

        @@@ java smaller
        Import-Package: com.chinarewards.test.domain

* 或者需要准确版本号的

        @@@ java smaller
        Import-Package: com.chinarewards.test.domain;version="1.0.0"

* 或者需要某个版本号范围的

        @@@ java smaller
        Import-Package: com.chinarewards.test.domain;version="[1.0.0-2.0.0)"

* 用逗号分隔多个依赖


!SLIDE smaller

# Bundle Activator #

* META-INF/MANIFEST.MF

        @@@ java smaller
        Bundle-Activator: com.chinarewards.test.client.internal.Activator

* Java代码（BundleContext是唯一跟Framework沟通的对象）


        @@@ java smaller
        import org.osgi.framework.BundleActivator;
        import org.osgi.framework.BundleContext;

        public class Activator implements BundleActivator {
          // Return ASAP
          public void start(BundleContext context) throws Exception {
        	System.out.println("Bundle Started!");
          }
          // Return ASAP
          public void stop(BundleContext context) throws Exception {
        	System.out.println("Bundle Stopped!");
          }
        }
