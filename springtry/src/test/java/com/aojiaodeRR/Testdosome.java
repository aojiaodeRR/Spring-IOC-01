package com.aojiaodeRR;

import com.aojiaodeRR.DI04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testdosome {
    @Test
    public void test01(){
//        1.指定spring配置文件
        String Coufig = "DI04/applicationContext.xml";
//       2. 创建spring容器对象
//    ClassPathXmlApplicationContext()表示从类路径中加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(Coufig);
//       3. 从容器中获取对象通过bean配置文件中定义的id值
//        需要强转类型
        Student student = (Student) ac.getBean("DI04");
//        4.用创建对象调用方法执行
        System.out.println(student);
     }

}
