package com.bilibili.music.podcast.moss;

import com.bilibili.api.BiliApiException;
import com.bilibili.base.MainThread;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/d.class */
public final class d implements MossResponseHandler<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<Object, Object> f66881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<Object, Object> f66882b;

    public d(a<Object, Object> aVar, a<Object, Object> aVar2) {
        this.f66881a = aVar;
        this.f66882b = aVar2;
    }

    public final void onError(final MossException mossException) {
        final a<Object, Object> aVar = this.f66881a;
        final a<Object, Object> aVar2 = this.f66882b;
        MainThread.runOnMainThread(new Function0(aVar, mossException, aVar2) { // from class: com.bilibili.music.podcast.moss.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f66878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MossException f66879b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a f66880c;

            {
                this.f66878a = aVar;
                this.f66879b = mossException;
                this.f66880c = aVar2;
            }

            public final Object invoke() {
                Unit unit;
                if (this.f66878a.isCancel()) {
                    unit = Unit.INSTANCE;
                } else {
                    BusinessException businessException = this.f66879b;
                    boolean z6 = businessException instanceof BusinessException;
                    a aVar3 = this.f66880c;
                    if (z6) {
                        BusinessException businessException2 = businessException;
                        aVar3.onError(new BiliApiException(businessException2.getCode(), businessException2.getMessage()));
                    } else {
                        aVar3.onError(businessException);
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        });
    }

    public final void onNext(Object obj) {
        MainThread.runOnMainThread(new b(this.f66881a, 0, this.f66882b, obj));
    }
}
