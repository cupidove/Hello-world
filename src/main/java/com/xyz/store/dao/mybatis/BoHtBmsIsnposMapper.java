package com.xyz.store.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xyz.store.dao.domain.BoHtBmsIsnpos;

public interface BoHtBmsIsnposMapper {
	@Select("select * from bo_ht_bms_isnpos where sn=#{sn}")
	BoHtBmsIsnpos getBoHtBmsIsnpos(@Param("sn")String sn);
	
	List<BoHtBmsIsnpos> getBoHtBmsIsnposList(BoHtBmsIsnpos boHtBmsIsnpos);

}
