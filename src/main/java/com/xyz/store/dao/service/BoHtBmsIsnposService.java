package com.xyz.store.dao.service;

import org.springframework.stereotype.Service;

import com.xyz.store.dao.domain.BoHtBmsIsnpos;

@Service
public interface BoHtBmsIsnposService {
	
	public Long createBoHtBmsIsnpos(BoHtBmsIsnpos boHtBmsIsnpos);
	
	public BoHtBmsIsnpos getBoHtBmsIsnpos(String sn);

}
