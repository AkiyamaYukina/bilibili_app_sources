package com.bilibili.playset;

import com.bilibili.lib.theme.R$color;
import com.bilibili.playset.playlist.helper.b;
import com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;
import tv.danmaku.bili.widget.dialog.CustomButtonInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$deleteFolder$1.class */
final class MultiTypeListDetailActivityV2$deleteFolder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MultiTypeListDetailActivityV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailActivityV2$deleteFolder$1(MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2, Continuation<? super MultiTypeListDetailActivityV2$deleteFolder$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailActivityV2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailActivityV2$deleteFolder$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.this$0;
            this.label = 1;
            int i8 = MultiTypeListDetailActivityV2.f83940l1;
            multiTypeListDetailActivityV2.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            BiliCommonDialog.Builder.setPositiveButton$default(BiliCommonDialog.Builder.setNegativeButton$default(new BiliCommonDialog.Builder(multiTypeListDetailActivityV2).setTitle(2131842587).setContentText(multiTypeListDetailActivityV2.getString(multiTypeListDetailActivityV2.f83969b1 ? 2131858215 : 2131842591)), 2131841494, new C5997p0(cancellableContinuationImpl), true, (CustomButtonInfo) null, 8, (Object) null), 2131841356, new C5999q0(cancellableContinuationImpl), true, (CustomButtonInfo) null, 8, (Object) null).setTitleColorRes(R$color.Text1).setButtonStyle(1).setCanceledOnTouchOutside(false).build().show(multiTypeListDetailActivityV2.getSupportFragmentManager(), "favorites_v2");
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            MultiTypeListDetailActivityV2 multiTypeListDetailActivityV22 = this.this$0;
            int i9 = MultiTypeListDetailActivityV2.f83940l1;
            multiTypeListDetailActivityV22.getClass();
            b.a aVar = b.a.f85324a;
            aVar.a("playlist.playlist-detail.PLmanage-more.*.click");
            aVar.c("manage", "2");
            b.a.b();
            PlaylistViewModelV2 playlistViewModelV2 = multiTypeListDetailActivityV22.f83970c0;
            PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
            if (playlistViewModelV2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                playlistViewModelV22 = null;
            }
            long jB7 = multiTypeListDetailActivityV22.b7();
            playlistViewModelV22.f85551m.setValue(-1);
            com.bilibili.playset.api.m.a(String.valueOf(jB7), new com.bilibili.playset.playlist.viewmodels.s(playlistViewModelV22));
        }
        return Unit.INSTANCE;
    }
}
