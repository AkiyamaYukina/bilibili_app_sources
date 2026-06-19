package com.bilibili.playerbizcommon.input.panels.commandsdetail.mark;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playerbizcommon.input.panels.commandsdetail.mark.MarkGoodsList;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/mark/MarkRelatedGoodsItem$requestGoodsList$1.class */
public final class MarkRelatedGoodsItem$requestGoodsList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $avid;
    int label;
    final e this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/mark/MarkRelatedGoodsItem$requestGoodsList$1$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MarkGoodsList f80134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f80135b;

        public a(MarkGoodsList markGoodsList, e eVar) {
            this.f80134a = markGoodsList;
            this.f80135b = eVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkRelatedGoodsItem$requestGoodsList$1(e eVar, long j7, Continuation<? super MarkRelatedGoodsItem$requestGoodsList$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$avid = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarkRelatedGoodsItem$requestGoodsList$1(this.this$0, this.$avid, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MarkGoodsList markGoodsList;
        List<MarkGoodsList.MarkGoods> itemList;
        FragmentManager supportFragmentManager;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BiliCall<GeneralResponse<MarkGoodsList>> markGoodsList2 = this.this$0.getMCommandApiService().getMarkGoodsList(String.valueOf(this.$avid), "1");
                this.label = 1;
                Object data = BiliCallExtKt.getData(markGoodsList2, this);
                obj = data;
                if (data == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            markGoodsList = (MarkGoodsList) obj;
            itemList = markGoodsList != null ? markGoodsList.getItemList() : null;
        } catch (Exception e7) {
            BLog.i("MarkRelatedGoodItem", "mark goods request failed -> " + e7);
        }
        if (itemList != null && !itemList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putInt("mark_goods_dialog_height", this.this$0.f80150b.f());
            MarkGoodsDialog markGoodsDialog = new MarkGoodsDialog();
            markGoodsDialog.setArguments(bundle);
            if (markGoodsDialog.isAdded()) {
                return Unit.INSTANCE;
            }
            e eVar = this.this$0;
            markGoodsDialog.f80133e = new a(markGoodsList, eVar);
            FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(eVar.getContext());
            if (fragmentActivityFindFragmentActivityOrNull != null && (supportFragmentManager = fragmentActivityFindFragmentActivityOrNull.getSupportFragmentManager()) != null) {
                markGoodsDialog.showNow(supportFragmentManager, "MarkRelatedGoodItem");
            }
            return Unit.INSTANCE;
        }
        Application application = BiliContext.application();
        Context applicationContext = null;
        if (application != null) {
            applicationContext = application.getApplicationContext();
        }
        ToastHelper.showToastShort(applicationContext, "暂无可选择的商品");
        BLog.i("MarkRelatedGoodItem", "mark goods data list is empty");
        return Unit.INSTANCE;
    }
}
