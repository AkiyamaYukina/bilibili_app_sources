package com.bilibili.playset.detail;

import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.Upper;
import com.bilibili.playset.detail.data.j;
import fs0.InterfaceC7170a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$getPlaylistBasicInfo$1.class */
final class MultiTypeListDetailViewModel$getPlaylistBasicInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $playlistId;
    int label;
    final MultiTypeListDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailViewModel$getPlaylistBasicInfo$1(MultiTypeListDetailViewModel multiTypeListDetailViewModel, long j7, Continuation<? super MultiTypeListDetailViewModel$getPlaylistBasicInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailViewModel;
        this.$playlistId = j7;
    }

    private static final com.bilibili.playset.detail.data.h invokeSuspend$lambda$0(Ref.LongRef longRef, MultitypePlaylist.Info info, boolean z6, boolean z7, com.bilibili.playset.detail.data.h hVar) {
        long j7 = longRef.element;
        MultitypePlaylist.Info info2 = new MultitypePlaylist.Info();
        info2.attr = info.attr;
        info2.socializeInfo = info.socializeInfo;
        info2.cover = info.cover;
        info2.cover_type = info.cover_type;
        info2.ctime = info.ctime;
        info2.favState = info.favState;
        info2.id = info.id;
        info2.intro = info.intro;
        info2.likeState = info.likeState;
        info2.mediaCount = info.mediaCount;
        info2.isTop = info.isTop;
        info2.mid = info.mid;
        info2.mtime = info.mtime;
        info2.title = info.title;
        info2.type = info.type;
        info2.upper = info.upper;
        info2.pageType = info.pageType;
        boolean z8 = info.likeState > 0;
        int i7 = info.favState;
        return com.bilibili.playset.detail.data.h.a(hVar, 0L, j7, null, null, info2, z7, ((info.attr >> 1) & 1) == 0, z8, true, i7 > 0, z6 && !z7, z6, null, i7 > 0, false, false, false, 0, 0, 4171789);
    }

    private static final com.bilibili.playset.detail.data.h invokeSuspend$lambda$1(com.bilibili.playset.detail.data.h hVar) {
        return com.bilibili.playset.detail.data.h.a(hVar, 0L, 0L, null, null, null, false, false, false, false, false, false, false, !ConnectivityMonitor.getInstance().isNetworkActive() ? j.d.f84538a : j.e.f84539a, false, false, false, false, 0, 0, 4180735);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailViewModel$getPlaylistBasicInfo$1(this.this$0, this.$playlistId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        boolean z6 = true;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC7170a interfaceC7170a = this.this$0.f84273c;
                long j7 = this.$playlistId;
                this.label = 1;
                Object objI = interfaceC7170a.i(j7, this);
                obj = objI;
                if (objI == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MultitypePlaylist.Info info = (MultitypePlaylist.Info) obj;
            if (!(((com.bilibili.playset.detail.data.h) this.this$0.getState().getValue()).f84525n instanceof j.d) && !(((com.bilibili.playset.detail.data.h) this.this$0.getState().getValue()).f84525n instanceof j.e)) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel = this.this$0;
                Math.ceil(((double) info.mediaCount) / 1000.0d);
                multiTypeListDetailViewModel.getClass();
                Ref.LongRef longRef = new Ref.LongRef();
                Upper upper = info.upper;
                long j8 = upper != null ? upper.mid : 0L;
                longRef.element = j8;
                if (j8 == 0) {
                    longRef.element = ((com.bilibili.playset.detail.data.h) this.this$0.getState().getValue()).f84514b;
                }
                MultiTypeListDetailViewModel multiTypeListDetailViewModel2 = this.this$0;
                long j9 = longRef.element;
                multiTypeListDetailViewModel2.getClass();
                boolean z7 = BiliAccounts.get(BiliContext.application()).isLogin() && j9 == BiliAccounts.get(BiliContext.application()).mid();
                if ((info.attr & 1) != 0) {
                    z6 = false;
                }
                MultiTypeListDetailViewModel multiTypeListDetailViewModel3 = this.this$0;
                MutableStateFlow<com.bilibili.playset.detail.data.h> mutableStateFlowP0 = multiTypeListDetailViewModel3.P0();
                do {
                    value2 = mutableStateFlowP0.getValue();
                } while (!mutableStateFlowP0.compareAndSet(value2, invokeSuspend$lambda$0(longRef, info, z6, z7, (com.bilibili.playset.detail.data.h) multiTypeListDetailViewModel3.P0().getValue())));
            }
        } catch (Throwable th) {
            MultiTypeListDetailViewModel multiTypeListDetailViewModel4 = this.this$0;
            MutableStateFlow<com.bilibili.playset.detail.data.h> mutableStateFlowP02 = multiTypeListDetailViewModel4.P0();
            do {
                value = mutableStateFlowP02.getValue();
            } while (!mutableStateFlowP02.compareAndSet(value, invokeSuspend$lambda$1((com.bilibili.playset.detail.data.h) multiTypeListDetailViewModel4.P0().getValue())));
        }
        return Unit.INSTANCE;
    }
}
