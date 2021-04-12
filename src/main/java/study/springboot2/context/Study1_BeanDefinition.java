package study.springboot2.context;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author shsq
 * @description: Study1_BeanDefinition
 * @date 2021/4/12 10:45
 */
public interface Study1_BeanDefinition extends BeanDefinition {
    /**
     * 此类表示 Bean 定义
     * Spring 根据 BeanDefinition 来创建 Bean 对象，BeanDefinition 有很多属性用来描述 Bean
     * 开发中 @Component @Bean <bean/> 都会解析为 BeanDefinition
     */

    /**
     * beanClass
     * 表示 bean 的类型，Spring 根据此实例化对象
     *
     * @return
     */
    @Override
    String getBeanClassName();

    @Override
    void setBeanClassName(String s);

    /**
     * scope
     * 表示作用域，singleton 为单例 bean ，prototype 为原型 bean
     *
     * @return
     */
    @Override
    String getScope();

    @Override
    void setScope(String s);

    /**
     * isLazy
     * 是否懒加载，原型 bean 此项无效
     *
     * @return
     */
    @Override
    boolean isLazyInit();

    /**
     * dependsOn
     * 此 bean 的依赖 bean
     *
     * @return
     */
    @Override
    String[] getDependsOn();

    @Override
    void setDependsOn(String... strings);

    /**
     * primary
     * 是否是主 bean ，Spring 根据类型找到的多个 bean 中直接注入主 bean
     *
     * @return
     */
    @Override
    boolean isPrimary();

    @Override
    void setPrimary(boolean b);

    /**
     * initMethodName
     * bean 的初始化方法
     *
     * @return
     */
    @Override
    String getInitMethodName();

    @Override
    void setInitMethodName(String s);
}
