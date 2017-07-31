package com.xyz.store.dao.service.impl;

import javax.annotation.Resource;

import com.xyz.store.dao.service.BoHtBmsIsnposService;
import com.xyz.store.dao.service.ServiceManager;

public class ServiceManagerImpl implements ServiceManager {

	@Resource
	private BoHtBmsIsnposService boHtBmsIsnposService;
	public BoHtBmsIsnposService getBoHtBmsIsnposService() {
		return this.boHtBmsIsnposService;
	}

}
