package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.h;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/a.class */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89385a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f89387c;

    public /* synthetic */ a(int i7, c cVar) {
        this.f89386b = i7;
        this.f89387c = cVar;
    }

    public /* synthetic */ a(LazyListState lazyListState, int i7) {
        this.f89387c = lazyListState;
        this.f89386b = i7;
    }

    public final Object invoke() {
        boolean z6;
        switch (this.f89385a) {
            case 0:
                StringBuilder sb = new StringBuilder("desc image exposure pos = ");
                int i7 = this.f89386b;
                sb.append(i7);
                BLog.d(sb.toString());
                ((c) this.f89387c).f89391b.tryEmit(new h.c(i7));
                return Unit.INSTANCE;
            default:
                LazyListLayoutInfo layoutInfo = ((LazyListState) this.f89387c).getLayoutInfo();
                int totalItemsCount = layoutInfo.getTotalItemsCount();
                if (totalItemsCount == 0) {
                    z6 = false;
                } else {
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull(layoutInfo.getVisibleItemsInfo());
                    z6 = false;
                    if (lazyListItemInfo != null) {
                        z6 = false;
                        if (lazyListItemInfo.getIndex() >= (totalItemsCount - 1) - this.f89386b) {
                            z6 = true;
                        }
                    }
                }
                return Boolean.valueOf(z6);
        }
    }
}
