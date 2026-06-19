package com.bilibili.studio.comm.manager;

import android.text.TextUtils;
import bolts.Continuation;
import bolts.Task;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/m.class */
public final /* synthetic */ class m implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f105407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f105408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105409c;

    public /* synthetic */ m(n nVar, String str, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f105407a = copyOnWriteArrayList;
        this.f105408b = nVar;
        this.f105409c = str;
    }

    @Override // bolts.Continuation
    public final Object then(Task task) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f105407a;
        BLog.e("UpperABTestManager", "initAb timeOut " + copyOnWriteArrayList.size());
        if (!copyOnWriteArrayList.isEmpty()) {
            a aVar = (a) copyOnWriteArrayList.remove(0);
            String str = this.f105408b.f105414d.get(this.f105409c);
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            aVar.a(str);
        }
        return Unit.INSTANCE;
    }
}
