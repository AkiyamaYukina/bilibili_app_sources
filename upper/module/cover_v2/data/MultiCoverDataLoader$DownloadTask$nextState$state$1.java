package com.bilibili.upper.module.cover_v2.data;

import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/MultiCoverDataLoader$DownloadTask$nextState$state$1.class */
public final /* synthetic */ class MultiCoverDataLoader$DownloadTask$nextState$state$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public MultiCoverDataLoader$DownloadTask$nextState$state$1(Object obj) {
        super(1, obj, MultiCoverDataLoader.DownloadTask.class, "onAnyResult", "onAnyResult(Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z6) {
        MultiCoverDataLoader.DownloadTask downloadTask = (MultiCoverDataLoader.DownloadTask) ((CallableReference) this).receiver;
        if (downloadTask.f112788e) {
            return;
        }
        if (!z6) {
            downloadTask.a(false);
        }
        downloadTask.c();
    }
}
