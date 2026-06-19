package com.bilibili.ship.theseus.ugc.endpage;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCEndPageService$handleEndPage$4.class */
public final /* synthetic */ class UGCEndPageService$handleEndPage$4 extends AdaptedFunctionReference implements Function4<c.a, Boolean, WindowSizeClass, Continuation<? super Triple<? extends c.a, ? extends Boolean, ? extends WindowSizeClass>>, Object>, SuspendFunction {
    public static final UGCEndPageService$handleEndPage$4 INSTANCE = new UGCEndPageService$handleEndPage$4();

    public UGCEndPageService$handleEndPage$4() {
        super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    public final Object invoke(c.a aVar, boolean z6, WindowSizeClass windowSizeClass, Continuation<? super Triple<c.a, Boolean, WindowSizeClass>> continuation) {
        return new Triple(aVar, Boxing.boxBoolean(z6), windowSizeClass);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((c.a) obj, ((Boolean) obj2).booleanValue(), (WindowSizeClass) obj3, (Continuation<? super Triple<c.a, Boolean, WindowSizeClass>>) obj4);
    }
}
