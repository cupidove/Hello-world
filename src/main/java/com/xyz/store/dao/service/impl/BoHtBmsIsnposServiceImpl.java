package com.xyz.store.dao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xyz.store.dao.domain.BoHtBmsIsnpos;
import com.xyz.store.dao.mybatis.BoHtBmsIsnposMapper;
import com.xyz.store.dao.service.BoHtBmsIsnposService;

@Component
public class BoHtBmsIsnposServiceImpl implements BoHtBmsIsnposService {

	@Autowired
	private BoHtBmsIsnposMapper boHtBmsIsnposMapper;

	public Long createBoHtBmsIsnpos(BoHtBmsIsnpos boHtBmsIsnpos) {
		// TODO Auto-generated method stub
		return null;
	}

	public BoHtBmsIsnpos getBoHtBmsIsnpos(String sn) {
		return boHtBmsIsnposMapper.getBoHtBmsIsnpos(sn);
	}

}
