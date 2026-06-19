package com.bilibili.ogv.story;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import kntr.common.comment.page.data.PresetListPageRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/f.class */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f73064b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f73063a = i7;
        this.f73064b = obj;
    }

    public final Object invoke() {
        h51.z zVar;
        Object obj = this.f73064b;
        switch (this.f73063a) {
            case 0:
                int i7 = g.f73065d;
                return Integer.valueOf(((ConstraintLayout) obj).getWidth());
            case 1:
                ((MutableState) obj).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                h51.A a7 = ((PresetListPageRepo) obj).b.d;
                return (a7 == null || (zVar = a7.b) == null) ? null : new h51.f(zVar.a);
            default:
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
        }
    }
}
