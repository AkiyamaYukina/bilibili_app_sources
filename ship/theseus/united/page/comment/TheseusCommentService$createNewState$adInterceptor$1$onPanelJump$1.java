package com.bilibili.ship.theseus.united.page.comment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.gripper.api.ad.biz.comment.AdCommentPanelData;
import com.bilibili.gripper.api.ad.biz.comment.PageTrack;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelCallback;
import kntr.app.ad.biz.comment.AdCommentPanelType;
import kntr.app.ad.biz.comment.W;
import kntr.app.ad.biz.comment.X;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$adInterceptor$1$onPanelJump$1.class */
public final class TheseusCommentService$createNewState$adInterceptor$1$onPanelJump$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final X $panelData;
    final AdCommentPanelType $panelType;
    int label;
    final TheseusCommentService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$adInterceptor$1$onPanelJump$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f99272a;

        static {
            int[] iArr = new int[AdCommentPanelType.values().length];
            try {
                iArr[AdCommentPanelType.H5.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[AdCommentPanelType.GAME.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[AdCommentPanelType.MALL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[AdCommentPanelType.BIZ_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f99272a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$createNewState$adInterceptor$1$onPanelJump$1(AdCommentPanelType adCommentPanelType, X x6, TheseusCommentService theseusCommentService, Continuation<? super TheseusCommentService$createNewState$adInterceptor$1$onPanelJump$1> continuation) {
        super(2, continuation);
        this.$panelType = adCommentPanelType;
        this.$panelData = x6;
        this.this$0 = theseusCommentService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusCommentService$createNewState$adInterceptor$1$onPanelJump$1(this.$panelType, this.$panelData, this.this$0, continuation);
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
        int i7 = a.f99272a[this.$panelType.ordinal()];
        int i8 = 1;
        if (i7 == 1) {
            i8 = 0;
        } else if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i8 = 0;
            } else {
                i8 = 2;
            }
        }
        String str = this.$panelData.d;
        Object object = null;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                object = null;
            } else {
                try {
                    object = JSON.parseObject(str, (Class<Object>) SourceContent.class);
                } catch (JSONException e7) {
                    object = null;
                }
            }
        }
        W w7 = this.$panelData.b;
        IPanelCallback.showPanel$default(this.this$0.h.b(), i8, new AdCommentPanelData((SourceContent) object, new PageTrack(w7.a, w7.b)), (IAdPanelListener) null, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
