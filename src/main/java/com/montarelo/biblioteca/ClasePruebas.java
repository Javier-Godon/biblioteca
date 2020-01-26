package com.montarelo.biblioteca;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class AlertService {
   
    private AlertDAO alertDao;
    
    public AlertService(AlertDAO alertDao) {
		this.alertDao=alertDao;
	}
		
    public UUID raiseAlert() {
        return this.alertDao.addAlert(new Date());
    }
	
    public Date getAlertTime(UUID id) {
        return this.alertDao.getAlert(id);
    }	
}

class MapAlertDAO implements AlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();
	
    @Override
    public UUID addAlert(Date time) {
    	UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }
	
    @Override
    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }	
}

interface AlertDAO {
	UUID addAlert(Date time);
	Date getAlert(UUID id);
	
}
