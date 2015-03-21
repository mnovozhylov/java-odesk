package com.oDesk.api.Routers;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.oDesk.api.Routers.Helper;
import com.oDesk.api.Routers.Snapshot;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
    Snapshot.class
})
public class SnapshotTest extends Helper {
	@Test public void get() throws Exception {
		Snapshot snapshot = new Snapshot(client);
    	JSONObject json = snapshot.get("company", "username", "date");
        
        assertTrue(json instanceof JSONObject);
	}
	
	@Test public void update() throws Exception {
		Snapshot snapshot = new Snapshot(client);
    	JSONObject json = snapshot.update("company", "username", "date", new HashMap<String, String>());
        
        assertTrue(json instanceof JSONObject);
	}
	
	@Test public void delete() throws Exception {
		Snapshot snapshot = new Snapshot(client);
    	JSONObject json = snapshot.delete("company", "username", "date");
        
        assertTrue(json instanceof JSONObject);
	}
	
	@Test public void getByContract() throws Exception {
		Snapshot snapshot = new Snapshot(client);
    	JSONObject json = snapshot.getByContract("1234", "date");
        
        assertTrue(json instanceof JSONObject);
	}
	
	@Test public void updateByContract() throws Exception {
		Snapshot snapshot = new Snapshot(client);
    	JSONObject json = snapshot.updateByContract("1234", "date", new HashMap<String, String>());
        
        assertTrue(json instanceof JSONObject);
	}
	
	@Test public void deleteByContract() throws Exception {
		Snapshot snapshot = new Snapshot(client);
    	JSONObject json = snapshot.deleteByContract("1234", "date");
        
        assertTrue(json instanceof JSONObject);
	}
}