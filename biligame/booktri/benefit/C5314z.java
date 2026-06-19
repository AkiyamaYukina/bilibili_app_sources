package com.bilibili.biligame.booktri.benefit;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/z.class */
public final /* synthetic */ class C5314z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f62482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f62483d;

    public /* synthetic */ C5314z(int i7, int i8, Object obj, Object obj2) {
        this.f62480a = i8;
        this.f62482c = obj;
        this.f62483d = obj2;
        this.f62481b = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f62480a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                D.j((String) this.f62482c, (Function0) this.f62483d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f62481b | 1));
                break;
            default:
                ((com.bilibili.ship.theseus.united.page.intro.module.promptbar.w) this.f62482c).l((TextVo) this.f62483d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f62481b | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
