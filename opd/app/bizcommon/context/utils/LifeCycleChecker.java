package com.bilibili.opd.app.bizcommon.context.utils;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/utils/LifeCycleChecker.class */
public class LifeCycleChecker {
    public static boolean isAlive(Fragment fragment) {
        FragmentActivity fragmentActivityP3;
        if (fragment == null || (fragmentActivityP3 = fragment.p3()) == null) {
            return false;
        }
        return isAlive(fragmentActivityP3);
    }

    public static boolean isAlive(FragmentActivity fragmentActivity) {
        return (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.getSupportFragmentManager().isDestroyed()) ? false : true;
    }

    public static boolean isHostActivityDie(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
