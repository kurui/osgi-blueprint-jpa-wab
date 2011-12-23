!SLIDE small

# Service概念 #

* 提供方：一个对象在容器中，等待被调用
* 使用方：在容器中查找一个对象接口，调用其方法
* 例如：
  * 提供方P：提供`ValidationService`
  * 使用方C：`lookup(ValidationService.class)`
* 旧有的实现如J2EE的JNDI查找SessionBean、调用
* 问题：使用方C 直接依赖 提供方P
* 解决办法：API Bundle （Stable-Dependency-Principle）

!SLIDE small

# Service API Bundle #

* 接口模块A (Bundle)：
  * 提供`IValidationService`
* 提供方P (Bundle)，依赖A：
  * 提供`ValidationService`实现`IValidationService`
* 使用方C (Bundle)，依赖A：
  * `lookup(IValidationService.class)`

!SLIDE smaller

# OSGi Service #

* ServiceReference

        @@@ java smaller
        context.getServiceReference(IValidationService.class);

* ServiceTracker

        @@@ java smaller
        ServiceTracker st;

        public void start(BundleContext context) throws Exception {
                st = new ServiceTracker(context,
                IValidationService.class.getName(), null);
                st.open();
        }
        public void stop(BundleContext context) throws Exception {
                st.close();
        }

* 好累！
