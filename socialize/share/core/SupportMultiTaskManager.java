package com.bilibili.socialize.share.core;

import android.app.Activity;
import android.app.ActivityManager;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/SupportMultiTaskManager.class */
public class SupportMultiTaskManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104981a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f104982b = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/SupportMultiTaskManager$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SupportMultiTaskManager f104983a = new SupportMultiTaskManager();
    }

    public static SupportMultiTaskManager getInstance() {
        return a.f104983a;
    }

    public void backToLaunchTaskForQQIfNeed(Activity activity) {
        if (this.f104981a != -1 && this.f104982b == 1) {
            ((ActivityManager) activity.getSystemService(GameCenterBottomTabConfig.TAB_TYPE_ACT)).moveTaskToFront(this.f104981a, 0);
            this.f104982b = 0;
        }
        this.f104982b++;
    }

    public void backToLaunchTaskForWxIfNeed(Activity activity) {
        if (this.f104981a != -1) {
            ((ActivityManager) activity.getSystemService(GameCenterBottomTabConfig.TAB_TYPE_ACT)).moveTaskToFront(this.f104981a, 0);
        }
    }

    public void setTaskId(int i7) {
        this.f104981a = i7;
        this.f104982b = 0;
    }
}
