package com.infinario.android.infinariosdk;

import android.app.IntentService;
import android.content.Intent;

public class GcmIntentService extends IntentService {
    public GcmIntentService() {
        super("GcmIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            Infinario.handleGooglePushNotification(this, intent);
        }
    }
}
