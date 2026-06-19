package com.bilibili.lib.push;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/PushNotification.class */
@Keep
public class PushNotification {
    public List<Channel> channels = new ArrayList();
    public int pushType;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/PushNotification$Channel.class */
    @Keep
    public static class Channel {
        public String description;
        public String id;
        public int importance = 3;
        public String name;
        public String uniqueKey;

        public void generateKey() {
            this.uniqueKey = this.id + "," + this.name;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public PushNotification m6696clone() throws CloneNotSupportedException {
        PushNotification pushNotification = new PushNotification();
        pushNotification.pushType = this.pushType;
        pushNotification.channels = new ArrayList(this.channels);
        return pushNotification;
    }
}
