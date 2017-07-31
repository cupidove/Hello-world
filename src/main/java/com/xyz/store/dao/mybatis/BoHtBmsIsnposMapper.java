package com.xyz.store.dao.mybatis;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.xyz.store.dao.domain.BoHtBmsIsnpos;

@Repository
public interface BoHtBmsIsnposMapper {
	@Select("select * from bo_ht_bms_isnpos where sn=#{sn}")
	BoHtBmsIsnpos getBoHtBmsIsnpos(@Param("sn")String sn);

}
