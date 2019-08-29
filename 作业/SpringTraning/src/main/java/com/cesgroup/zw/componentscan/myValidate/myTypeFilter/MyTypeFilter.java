package com.cesgroup.zw.componentscan.myValidate.myTypeFilter;

import com.cesgroup.zw.componentscan.annotation01.mapper.Dao;
import com.cesgroup.zw.componentscan.myValidate.dao.IValidate;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Arrays;

public class MyTypeFilter implements TypeFilter{
	
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {

		System.out.println("call CustomTypeFilter "+ metadataReader.getClassMetadata().getClassName());
		
		boolean result = Arrays.asList(metadataReader.getClassMetadata().getInterfaceNames()).contains(IValidate.class.getName());

		return result;// 如果匹配成功就不扫描
	}

	


}
