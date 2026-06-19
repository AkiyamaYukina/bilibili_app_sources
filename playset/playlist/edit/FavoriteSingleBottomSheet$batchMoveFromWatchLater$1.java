package com.bilibili.playset.playlist.edit;

import Sg1.c;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySetService;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.ui.watchlater.viewmodel.WatchLaterViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$batchMoveFromWatchLater$1.class */
final class FavoriteSingleBottomSheet$batchMoveFromWatchLater$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $resources;
    final long $targetMediaId;
    int label;
    final FavoriteSingleBottomSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteSingleBottomSheet$batchMoveFromWatchLater$1(String str, long j7, FavoriteSingleBottomSheet favoriteSingleBottomSheet, Continuation<? super FavoriteSingleBottomSheet$batchMoveFromWatchLater$1> continuation) {
        super(2, continuation);
        this.$resources = str;
        this.$targetMediaId = j7;
        this.this$0 = favoriteSingleBottomSheet;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoriteSingleBottomSheet$batchMoveFromWatchLater$1(this.$resources, this.$targetMediaId, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.fragment.app.Fragment, com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$resources;
                long j7 = this.$targetMediaId;
                this.label = 1;
                Object response = BiliCallExtKt.getResponse(((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).batchMoveResourceFromWatchLater(str, j7), this);
                if (response != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    response = Unit.INSTANCE;
                }
                if (response == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FavoriteSingleBottomSheet.hf(this.this$0);
            FavoriteSingleBottomSheet favoriteSingleBottomSheet = this.this$0;
            favoriteSingleBottomSheet.f85213q = false;
            WatchLaterViewModel.onAction.1.a aVar = favoriteSingleBottomSheet.f85200c;
            if (aVar != null) {
                aVar.a.L0(new c.f());
                Neurons.reportClick(false, "main.later-watch.editor.move.click", MapsKt.mapOf(TuplesKt.to("num", String.valueOf(aVar.b))));
            }
            ToastHelper.showToastShort(this.this$0.getContext(), this.this$0.getString(2131842595));
            this.this$0.dismiss();
        } catch (Exception e7) {
            FavoriteSingleBottomSheet.hf(this.this$0);
            ?? r02 = this.this$0;
            r02.f85213q = false;
            ToastHelper.showToastShort(this.this$0.getContext(), r02.getString(2131842481));
            WatchLaterViewModel.onAction.1.a aVar2 = this.this$0.f85200c;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
        return Unit.INSTANCE;
    }
}
