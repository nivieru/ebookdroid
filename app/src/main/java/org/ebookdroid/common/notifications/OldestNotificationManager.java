package org.ebookdroid.common.notifications;

import android.annotation.TargetApi;
import android.content.Intent;

@TargetApi(3)
class OldestNotificationManager extends AbstractNotificationManager {

    @Override
    public int notify(final CharSequence title, final CharSequence message, final Intent intent) {
        final int id = SEQ.getAndIncrement();
        return id;
    }
}
