package com.bilibili.ship.theseus.ugc.interactivevideo;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ugc.feature.endpage.GeminiEndPageRelatedLayoutMode;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/interactivevideo/UGCInteractVideoStrategy$keepEndPageShowing$2$1.class */
public final class UGCInteractVideoStrategy$keepEndPageShowing$2$1 extends SuspendLambda implements Function3<c.a, WindowSizeClass, Continuation<? super a>, Object> {
    Object L$0;
    int label;
    final UGCInteractVideoStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCInteractVideoStrategy$keepEndPageShowing$2$1(UGCInteractVideoStrategy uGCInteractVideoStrategy, Continuation<? super UGCInteractVideoStrategy$keepEndPageShowing$2$1> continuation) {
        super(3, continuation);
        this.this$0 = uGCInteractVideoStrategy;
    }

    public final Object invoke(c.a aVar, WindowSizeClass windowSizeClass, Continuation<? super a> continuation) {
        UGCInteractVideoStrategy$keepEndPageShowing$2$1 uGCInteractVideoStrategy$keepEndPageShowing$2$1 = new UGCInteractVideoStrategy$keepEndPageShowing$2$1(this.this$0, continuation);
        uGCInteractVideoStrategy$keepEndPageShowing$2$1.L$0 = aVar;
        return uGCInteractVideoStrategy$keepEndPageShowing$2$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        c.a aVar = (c.a) this.L$0;
        boolean z6 = aVar.f102988b;
        boolean z7 = aVar.f102987a;
        GeminiEndPageRelatedLayoutMode geminiEndPageRelatedLayoutMode = !z6 ? GeminiEndPageRelatedLayoutMode.Normal : this.this$0.f96925g.f() ? GeminiEndPageRelatedLayoutMode.LargeLandscape : (z7 && this.this$0.f96925g.i()) ? GeminiEndPageRelatedLayoutMode.NormalPortrait : this.this$0.f96925g.g() ? GeminiEndPageRelatedLayoutMode.LargePortrait : this.this$0.f96925g.h() ? GeminiEndPageRelatedLayoutMode.Medium : GeminiEndPageRelatedLayoutMode.Normal;
        boolean z8 = aVar.f102988b;
        return new a(z8 && ((!z7 && z8) || this.this$0.f96925g.f()), geminiEndPageRelatedLayoutMode);
    }
}
