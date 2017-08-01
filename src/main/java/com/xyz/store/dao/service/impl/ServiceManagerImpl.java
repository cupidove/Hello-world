package com.xyz.store.dao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyz.store.dao.service.BoHtBmsIsnposService;
import com.xyz.store.dao.service.ServiceManager;

@Service
public class ServiceManagerImpl implements ServiceManager {

	@Resource
	private BoHtBmsIsnposService boHtBmsIsnposService;
	public BoHtBmsIsnposService getBoHtBmsIsnposService() {
		return this.boHtBmsIsnposService;
	}

}
