package common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

public class SessionStore {

	private Map<String, HttpSession> sessions;
	private static final SessionStore store = new SessionStore();
	
	private SessionStore() {
		sessions = new HashMap<String, HttpSession>();
	}
	
	public static SessionStore getInstance() {
		return store;
	}
	
	public void add(HttpSession session) {
		String sessionId = session.getId();
		sessions.put(sessionId, session);
	}
	
	public HttpSession get(String sessionId) {
		return sessions.get(sessionId);
	}
	
	public void invalidate(String sessionId) {
		HttpSession session = sessions.get(sessionId);
		if ( session != null ) {
			session.invalidate();
			sessions.remove(sessionId);
		}
	}
	
	public List<HttpSession> getAllSessions() {
		List<HttpSession> sessionList = new ArrayList<HttpSession>();
		
		Iterator<String> sessionIds = sessions.keySet().iterator();
		String sessionId = "";
		while ( sessionIds.hasNext() ) {
			sessionId = sessionIds.next();
			sessionList.add(sessions.get(sessionId));
		}
		return sessionList;
	}
	
	public List<HttpSession> getAllElements(String attributeKey, Class attributeClass) {
		List<HttpSession> sessionList = new ArrayList<HttpSession>();
		
		Iterator<String> sessionIds = sessions.keySet().iterator();
		String sessionId = "";
		while ( sessionIds.hasNext() ) {
			sessionId = sessionIds.next();
			sessionList.add(sessions.get(sessionId));
		}
		return sessionList;
	}
	
}




