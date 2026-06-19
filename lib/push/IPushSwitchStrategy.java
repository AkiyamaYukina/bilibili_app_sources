package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/IPushSwitchStrategy.class */
public interface IPushSwitchStrategy {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/IPushSwitchStrategy$PUSH_TYPE.class */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PUSH_TYPE {
        public static final int EMPTY = -1;
        public static final int FCM = 7;
        public static final int HONOR = 9;
        public static final int HUAWEI = 3;
        public static final int JPUSH = 6;
        public static final int OPPO = 5;
        public static final int VIVO = 8;
        public static final int XIAOMI = 2;
    }

    default String getAbTestGroup() {
        return "";
    }

    @Nullable
    IPushRegistry getDefaultType();

    @Nullable
    IPushRegistry switchPushType(@NonNull Context context);
}
