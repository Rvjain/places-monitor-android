/*
 Copyright 2019 Adobe. All rights reserved.
 This file is licensed to you under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License. You may obtain a copy
 of the License at http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software distributed under
 the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 OF ANY KIND, either express or implied. See the License for the specific language
 governing permissions and limitations under the License.
*/

//
// PlacesMonitorConstants.java
//

package com.adobe.marketing.mobile;

final class PlacesMonitorConstants {
	static final int MONITOR_PERMISSION_MASK = 0xAD00;
	static final int MONITOR_LOCATION_PERMISSION_REQUEST_CODE = MONITOR_PERMISSION_MASK | 1;

	static final String LOG_TAG = PlacesMonitor.class.getSimpleName();
	static final String EXTENSION_NAME = "com.adobe.placesMonitor";

	static final String EXTENSION_VERSION = "2.1.0";

	// event names for places monitor request content
	static final String EVENTNAME_START = "start monitoring";
	static final String EVENTNAME_STOP = "stop monitoring";
	static final String EVENTNAME_UPDATE = "update location now";
	static final String EVENTNAME_SET_LOCATION_PERMISSION = "set location permission";

	static final int NEARBY_GEOFENCES_COUNT = 20;

	static final String INTERNAL_INTENT_ACTION_LOCATION = "intentactionlocation";
	static final String INTERNAL_INTENT_ACTION_GEOFENCE = "intentactiongeofence";
	static final String INTENT_ACTION_PERMISSION_GRANTED = "permissionreceived";
	static final String INTENT_ACTION_PERMISSION_DENIED = "permissiondenied";

	static final class Location {
		static final int REQUEST_INTERVAL = 3600;				// 1 hour
		static final int REQUEST_FASTEST_INTERVAL = 1800;    	// 30 minutes
		static final int REQUEST_SMALLEST_DISPLACEMENT = 1000;   // 1 kilometer

		private Location() {
		}
	}

	static final class EventSource {
		static final String REQUEST_CONTENT = "com.adobe.eventsource.requestcontent";
		static final String SHARED_STATE = "com.adobe.eventsource.sharedstate";


		private EventSource() {
		}
	}

	static final class EventDataKeys {
		static final String EVENT_DATA_CLEAR	= "clearclientdata";
		static final String EVENT_DATA_LOCATION_PERMISSION = "locationpermission";
		private EventDataKeys() {
		}
	}


	static final class EventType {
		static final String HUB = "com.adobe.eventtype.hub";
		static final String MONITOR = "com.adobe.eventtype.placesmonitor";

		private EventType() {
		}
	}

	static final class SharedState {
		static final String STATEOWNER = "stateowner";
		static final String CONFIGURATION = "com.adobe.module.configuration";
		private SharedState() {
		}
	}

	static final class  SharedPreference {
		static final String MASTER_KEY = "com.adobe.placesMonitor";
		static final String USERWITHIN_GEOFENCES_KEY = "adb_userWithinGeofences";
		static final String HAS_MONITORING_STARTED_KEY = "adb_hasMonitoringStarted";
		static final String LOCATION_PERMISSION_KEY = "adb_locationPermission";
		private SharedPreference() {
		}
	}

	private PlacesMonitorConstants() {
	}
}
