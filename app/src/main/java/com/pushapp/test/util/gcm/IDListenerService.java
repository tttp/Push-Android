package com.pushapp.test.util.gcm;

import com.google.android.gms.iid.InstanceIDListenerService;
import com.pushapp.test.util.NotificationManager;

/**
 * Created by christopher on 7/13/16.
 */

public class IDListenerService extends InstanceIDListenerService {
    @Override
    public void onTokenRefresh() {
        NotificationManager.getNotificationManager().registerForNotifications(getApplicationContext());
    }
}