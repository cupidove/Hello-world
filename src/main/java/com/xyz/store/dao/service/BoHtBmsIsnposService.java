package com.xyz.store.dao.service;

import java.util.List;

import com.xyz.store.dao.domain.BoHtBmsIsnpos;

public interface BoHtBmsIsnposService {
	
	public Long createBoHtBmsIsnpos(BoHtBmsIsnpos boHtBmsIsnpos);
	
	public BoHtBmsIsnpos getBoHtBmsIsnpos(String sn);
	
	public List<BoHtBmsIsnpos> getBoHtBmsIsnposList(String whsid);

}
