package com.bilibili.ship.theseus.detail;

import com.bilibili.ship.theseus.detail.c;
import com.bilibili.ship.theseus.united.di.BusinessType;
import dagger.internal.Preconditions;
import ev0.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/MediaScopeDriverImpl$driveMediaScope$2.class */
final class MediaScopeDriverImpl$driveMediaScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c.a.b $state;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/MediaScopeDriverImpl$driveMediaScope$2$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f90852a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f90852a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaScopeDriverImpl$driveMediaScope$2(c.a.b bVar, c cVar, Continuation<? super MediaScopeDriverImpl$driveMediaScope$2> continuation) {
        super(2, continuation);
        this.$state = bVar;
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaScopeDriverImpl$driveMediaScope$2 mediaScopeDriverImpl$driveMediaScope$2 = new MediaScopeDriverImpl$driveMediaScope$2(this.$state, this.this$0, continuation);
        mediaScopeDriverImpl$driveMediaScope$2.L$0 = obj;
        return mediaScopeDriverImpl$driveMediaScope$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        c.a.b bVar = this.$state;
        BusinessType businessType = bVar.f90883a;
        j.a aVar = bVar.f90884b.f104513a;
        defpackage.a.b("[theseus-detail-MediaScopeDriverImpl$driveMediaScope$2-invokeSuspend] ", "start drive media scope, type: " + businessType + ", avid:" + aVar.f117658b + ", cid:" + aVar.f117659c, "MediaScopeDriverImpl$driveMediaScope$2-invokeSuspend");
        int i7 = a.f90852a[this.$state.f90883a.ordinal()];
        if (i7 == 1) {
            a.E1 e12 = this.this$0.f90875c;
            c.a.b bVar2 = this.$state;
            BusinessType businessType2 = bVar2.f90883a;
            com.bilibili.ship.theseus.united.player.mediaplay.d dVar = bVar2.f90884b;
            Preconditions.checkNotNull(coroutineScope);
            Preconditions.checkNotNull(businessType2);
            Preconditions.checkNotNull(dVar);
        } else if (i7 == 2) {
            a.i0 i0Var = this.this$0.f90876d;
            c.a.b bVar3 = this.$state;
            BusinessType businessType3 = bVar3.f90883a;
            com.bilibili.ship.theseus.united.player.mediaplay.d dVar2 = bVar3.f90884b;
            Preconditions.checkNotNull(coroutineScope);
            Preconditions.checkNotNull(businessType3);
            Preconditions.checkNotNull(dVar2);
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a.A a7 = this.this$0.f90877e;
            c.a.b bVar4 = this.$state;
            BusinessType businessType4 = bVar4.f90883a;
            com.bilibili.ship.theseus.united.player.mediaplay.d dVar3 = bVar4.f90884b;
            Preconditions.checkNotNull(coroutineScope);
            Preconditions.checkNotNull(businessType4);
            Preconditions.checkNotNull(dVar3);
        }
        return Unit.INSTANCE;
    }
}
