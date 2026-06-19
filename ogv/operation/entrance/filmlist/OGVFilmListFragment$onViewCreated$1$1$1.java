package com.bilibili.ogv.operation.entrance.filmlist;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.ComposerKt;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListFragment$onViewCreated$1$1$1.class */
public final class OGVFilmListFragment$onViewCreated$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OGVFilmListPage $pageInfo;
    Object L$0;
    int label;
    final OGVFilmListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OGVFilmListFragment$onViewCreated$1$1$1(OGVFilmListFragment oGVFilmListFragment, OGVFilmListPage oGVFilmListPage, Continuation<? super OGVFilmListFragment$onViewCreated$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = oGVFilmListFragment;
        this.$pageInfo = oGVFilmListPage;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OGVFilmListFragment$onViewCreated$1$1$1(this.this$0, this.$pageInfo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        p pVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OGVFilmListFragment oGVFilmListFragment = this.this$0;
            KProperty<Object>[] kPropertyArr = OGVFilmListFragment.f69988l;
            p pVarKf = oGVFilmListFragment.kf();
            OGVFilmListFragment oGVFilmListFragment2 = this.this$0;
            String str = this.$pageInfo.f70002c;
            this.L$0 = pVarKf;
            this.label = 1;
            Context contextRequireContext = oGVFilmListFragment2.requireContext();
            objA = com.bilibili.ogvcommon.image.e.f73197a.a(BiliImageLoader.INSTANCE.acquire(contextRequireContext, oGVFilmListFragment2.getLifecycle()), str, ContextCompat.getColor(contextRequireContext, R$color.Ba0_u), new Pair(Boxing.boxFloat(0.6f), Boxing.boxFloat(0.35f)), Uj0.c.b(20, contextRequireContext), Uj0.c.b(26, contextRequireContext), this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            pVar = pVarKf;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = (p) this.L$0;
            ResultKt.throwOnFailure(obj);
            objA = obj;
        }
        int iIntValue = ((Number) objA).intValue();
        if (iIntValue != pVar.f70065k) {
            pVar.f70065k = iIntValue;
            pVar.notifyPropertyChanged(426);
        }
        int iC = Uj0.a.c(iIntValue, ComposerKt.providerMapsKey);
        int iC2 = Uj0.a.c(iIntValue, 255);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setColors(new int[]{iC, iC2});
        if (!Intrinsics.areEqual(gradientDrawable, pVar.f70062g)) {
            pVar.f70062g = gradientDrawable;
            pVar.notifyPropertyChanged(58);
        }
        return Unit.INSTANCE;
    }
}
