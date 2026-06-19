package com.bilibili.opd.app.bizcommon.context;

import android.app.Application;
import com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/Module.class */
public interface Module extends AppLifecycleExtension.ExtLifecycleDelegate {
    void onCreate(Application application);
}
