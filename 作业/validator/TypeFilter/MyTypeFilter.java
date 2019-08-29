package com.cesgroup.zw.componentscan.validator.TypeFilter;

import com.cesgroup.zw.componentscan.validator.intf.IValidate;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Arrays;

/**
 * @Description:
 * @Author: YJK
 * @CreateDate: 2018/10/25$ 14:16$
 * @UpdateUser: yc
 * @UpdateDate: 2018/10/25$ 14:16$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class MyTypeFilter implements TypeFilter {
/**
      *
      * @param metadataReader   表示读取到的当前正在扫描的类的信息
      * @param metadataReaderFactory 表示可以获得到其他任何类的信息
      * @return
      * @throws IOException
      */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
        //  annotationMetadata  扫描类的配置信息 描述信息等
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //  classMetadata  扫描类的class信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //  扫描类的资源信息
        Resource resource = metadataReader.getResource();
        System.out.println( "==============="+classMetadata.getClassName());
        boolean result = Arrays.asList(metadataReader.getClassMetadata().getInterfaceNames()).contains(IValidate.class.getName());
        return result;
    }
}
