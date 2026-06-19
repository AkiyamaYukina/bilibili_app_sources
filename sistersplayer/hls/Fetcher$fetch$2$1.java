package com.bilibili.sistersplayer.hls;

import com.bilibili.sistersplayer.hls.Fetcher;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Fetcher$fetch$2$1.class */
public final class Fetcher$fetch$2$1 implements Function1<Throwable, Unit> {
    final Ref.ObjectRef<Fetcher.FetcherCall> $call;
    final AtomicBoolean $canceled;

    public Fetcher$fetch$2$1(AtomicBoolean atomicBoolean, Ref.ObjectRef<Fetcher.FetcherCall> objectRef) {
        this.$canceled = atomicBoolean;
        this.$call = objectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        this.$canceled.set(true);
        Fetcher.FetcherCall fetcherCall = (Fetcher.FetcherCall) this.$call.element;
        if (fetcherCall != null) {
            fetcherCall.cancel();
        }
    }
}
