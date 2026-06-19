package com.bilibili.playset.detail.compose;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.mall.data.page.feeds.MallStoryFeedsPurchaseButtonBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/compose/M.class */
public final /* synthetic */ class M implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84377a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f84378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f84380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f84381e;

    public /* synthetic */ M(Modifier modifier, MallStoryFeedsPurchaseButtonBean mallStoryFeedsPurchaseButtonBean, Function1 function1, int i7) {
        this.f84380d = modifier;
        this.f84381e = mallStoryFeedsPurchaseButtonBean;
        this.f84378b = function1;
        this.f84379c = i7;
    }

    public /* synthetic */ M(com.bilibili.playset.detail.data.h hVar, Function1 function1, LazyGridState lazyGridState, int i7) {
        this.f84380d = hVar;
        this.f84378b = function1;
        this.f84381e = lazyGridState;
        this.f84379c = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f84377a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                N.c((com.bilibili.playset.detail.data.h) this.f84380d, this.f84378b, (LazyGridState) this.f84381e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f84379c | 1));
                break;
            default:
                iS0.l.b((Modifier) this.f84380d, (MallStoryFeedsPurchaseButtonBean) this.f84381e, this.f84378b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f84379c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
