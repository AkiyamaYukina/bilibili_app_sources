package com.bilibili.ogv.filmlist.part;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.bilibili.playset.detail.compose.FavoritesArticleCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/f.class */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f67773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f67774d;

    public /* synthetic */ f(int i7, int i8, Object obj, Object obj2) {
        this.f67771a = i8;
        this.f67773c = obj;
        this.f67774d = obj2;
        this.f67772b = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f67771a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                ((g) this.f67773c).invoke((Modifier) this.f67774d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f67772b | 1));
                break;
            default:
                FavoritesArticleCardKt.a((com.bilibili.playset.api.c) this.f67773c, (Function1) this.f67774d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f67772b | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
