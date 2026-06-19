package com.bilibili.playset.playlist.helper;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.droid.ToastHelper;
import com.bilibili.playset.playlist.helper.MultiTypeShareHelper;
import kntr.common.share.api.k;
import kntr.common.share.common.handler.dynamic.c;
import kntr.common.share.common.handler.dynamic.f;
import kntr.common.share.core.g;
import kntr.common.share.domain.model.h;
import kntr.common.share.domain.net.ShareDefaultApiService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/helper/MultiTypeShareHelper$shareMultitypePlaylist$1.class */
public final class MultiTypeShareHelper$shareMultitypePlaylist$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c $content;
    final MultiTypeShareHelper.b $localContext;
    final h $shareMetaInfo;
    int label;
    final MultiTypeShareHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeShareHelper$shareMultitypePlaylist$1(h hVar, c cVar, MultiTypeShareHelper.b bVar, MultiTypeShareHelper multiTypeShareHelper, Continuation<? super MultiTypeShareHelper$shareMultitypePlaylist$1> continuation) {
        super(2, continuation);
        this.$shareMetaInfo = hVar;
        this.$content = cVar;
        this.$localContext = bVar;
        this.this$0 = multiTypeShareHelper;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeShareHelper$shareMultitypePlaylist$1(this.$shareMetaInfo, this.$content, this.$localContext, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kntr.common.share.domain.net.ShareDefaultApiService] */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            k kVar = k.a;
            h hVar = this.$shareMetaInfo;
            f fVar = f.b;
            c cVar = this.$content;
            MultiTypeShareHelper.b bVar = this.$localContext;
            this.label = 1;
            kVar.getClass();
            Object objA = new kntr.common.share.core.c(new kntr.common.share.domain.service.h(hVar, (ShareDefaultApiService) new Object())).a(fVar, cVar, true, bVar, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        g gVar = (g) obj;
        if (gVar instanceof g.c) {
            FragmentActivity fragmentActivity = this.this$0.f85316a;
            ToastHelper.showToastShort(fragmentActivity, fragmentActivity.getString(2131848273));
            MultiTypeShareHelper.a aVar = this.this$0.f85319d;
            if (aVar != null) {
                f.b.getClass();
                aVar.Q9();
            }
        } else if (gVar instanceof g.b) {
            FragmentActivity fragmentActivity2 = this.this$0.f85316a;
            ToastHelper.showToastShort(fragmentActivity2, fragmentActivity2.getString(2131848270));
            MultiTypeShareHelper.a aVar2 = this.this$0.f85319d;
        } else {
            if (!(gVar instanceof g.a)) {
                throw new NoWhenBranchMatchedException();
            }
            MultiTypeShareHelper.a aVar3 = this.this$0.f85319d;
        }
        return Unit.INSTANCE;
    }
}
