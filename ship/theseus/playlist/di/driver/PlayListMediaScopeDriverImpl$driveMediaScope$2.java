package com.bilibili.ship.theseus.playlist.di.driver;

import com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.player.mediaplay.d;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$driveMediaScope$2.class */
final class PlayListMediaScopeDriverImpl$driveMediaScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PlayListMediaScopeDriverImpl.a.b $state;
    private Object L$0;
    int label;
    final PlayListMediaScopeDriverImpl this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$driveMediaScope$2$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95466a;

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
            f95466a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayListMediaScopeDriverImpl$driveMediaScope$2(PlayListMediaScopeDriverImpl.a.b bVar, PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl, Continuation<? super PlayListMediaScopeDriverImpl$driveMediaScope$2> continuation) {
        super(2, continuation);
        this.$state = bVar;
        this.this$0 = playListMediaScopeDriverImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayListMediaScopeDriverImpl$driveMediaScope$2 playListMediaScopeDriverImpl$driveMediaScope$2 = new PlayListMediaScopeDriverImpl$driveMediaScope$2(this.$state, this.this$0, continuation);
        playListMediaScopeDriverImpl$driveMediaScope$2.L$0 = obj;
        return playListMediaScopeDriverImpl$driveMediaScope$2;
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
        PlayListMediaScopeDriverImpl.a.b bVar = this.$state;
        BusinessType businessType = bVar.f95461a;
        j.a aVar = bVar.f95462b.f104513a;
        defpackage.a.b("[theseus-playlist-detail-PlayListMediaScopeDriverImpl$driveMediaScope$2-invokeSuspend] ", "start drive media scope, type: " + businessType + ", avid:" + aVar.f117658b + ", cid:" + aVar.f117659c, "PlayListMediaScopeDriverImpl$driveMediaScope$2-invokeSuspend");
        int i7 = a.f95466a[this.$state.f95461a.ordinal()];
        if (i7 == 1) {
            a.X0 x02 = this.this$0.f95452d;
            BusinessType businessType2 = BusinessType.UGC;
            d dVar = this.$state.f95462b;
            Preconditions.checkNotNull(coroutineScope);
            Preconditions.checkNotNull(businessType2);
            Preconditions.checkNotNull(dVar);
        } else if (i7 == 2) {
            a.N0 n02 = this.this$0.f95453e;
            BusinessType businessType3 = BusinessType.OGV;
            d dVar2 = this.$state.f95462b;
            Preconditions.checkNotNull(coroutineScope);
            Preconditions.checkNotNull(businessType3);
            Preconditions.checkNotNull(dVar2);
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a.D0 d02 = this.this$0.f95454f;
            PlayListMediaScopeDriverImpl.a.b bVar2 = this.$state;
            BusinessType businessType4 = bVar2.f95461a;
            d dVar3 = bVar2.f95462b;
            Preconditions.checkNotNull(coroutineScope);
            Preconditions.checkNotNull(businessType4);
            Preconditions.checkNotNull(dVar3);
        }
        return Unit.INSTANCE;
    }
}
