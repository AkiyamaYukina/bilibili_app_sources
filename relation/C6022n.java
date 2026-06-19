package com.bilibili.relation;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bilibili.videoshortcut.sidecenter.recent.RecentBubbleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.relation.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/n.class */
public final /* synthetic */ class C6022n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86110a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f86111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f86113d;

    public /* synthetic */ C6022n(BoxScopeInstance boxScopeInstance, Function0 function0, int i7) {
        this.f86113d = boxScopeInstance;
        this.f86111b = function0;
        this.f86112c = i7;
    }

    public /* synthetic */ C6022n(Function0 function0, C6013e c6013e, int i7) {
        this.f86111b = function0;
        this.f86113d = c6013e;
        this.f86112c = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f86110a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f86112c | 1);
                C6029v.c(this.f86111b, (C6013e) this.f86113d, composer, iUpdateChangedFlags);
                break;
            default:
                RecentBubbleKt.a((BoxScopeInstance) this.f86113d, this.f86111b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f86112c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
