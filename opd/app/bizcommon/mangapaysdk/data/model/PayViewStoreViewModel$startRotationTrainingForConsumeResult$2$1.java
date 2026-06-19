package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.blconfig.ConfigManager;
import java.util.TimerTask;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1.class */
public final class PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f74027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f74028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f74029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f74030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f74032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SafeContinuation f74033g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f74034i;

    public PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1(d dVar, SafeContinuation safeContinuation, String str, String str2) {
        Integer intOrNull;
        this.f74032f = dVar;
        this.f74033g = safeContinuation;
        this.h = str;
        this.f74034i = str2;
        String str3 = (String) ConfigManager.Companion.config().get("mangasdk.rotation_schedule_count", "4");
        this.f74030d = (str3 == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 4 : intOrNull.intValue();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        d dVar = this.f74032f;
        SafeContinuation safeContinuation = this.f74033g;
        String str = this.h;
        String str2 = this.f74034i;
        synchronized (dVar) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(dVar), (CoroutineContext) null, (CoroutineStart) null, new PayViewStoreViewModel$startRotationTrainingForConsumeResult$2$1$run$1$1(this, dVar, safeContinuation, str, str2, null), 3, (Object) null);
        }
    }
}
