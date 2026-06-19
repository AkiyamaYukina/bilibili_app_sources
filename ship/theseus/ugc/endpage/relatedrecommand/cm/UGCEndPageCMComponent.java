package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.videodetail.endpage.EndPageAdCardType;
import com.bilibili.gripper.api.ad.biz.videodetail.endpage.IVDEndPageAdCard;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMComponent.class */
@StabilityInferred(parameters = 0)
public final class UGCEndPageCMComponent implements UIComponent<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1 f96857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final EndPageAdCardType f96858b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends UIComponent.b<View> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final IVDEndPageAdCard f96859b;

        public a(@NotNull IVDEndPageAdCard iVDEndPageAdCard) {
            super(iVDEndPageAdCard.getView());
            this.f96859b = iVDEndPageAdCard;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final UGCEndPageCMComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCEndPageCMComponent uGCEndPageCMComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = uGCEndPageCMComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMComponent$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMComponent$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final a $viewEntry;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$viewEntry = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$viewEntry, continuation);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iDpToPx = this.I$0;
            if (((UIComponent.b) this.$viewEntry).a.getLayoutParams() == null) {
                return Unit.INSTANCE;
            }
            View view = ((UIComponent.b) this.$viewEntry).a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (iDpToPx == 0) {
                iDpToPx = DimenUtilsKt.dpToPx(172);
            }
            layoutParams.width = iDpToPx;
            view.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
    }

    public UGCEndPageCMComponent(@NotNull UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1 uGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1) {
        this.f96857a = uGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1;
        this.f96858b = GAdBizKt.getGAdVideoDetail().getEndPage().getAdCardType(uGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1.f96870b, uGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1.f96869a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMComponent$a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMComponent.a r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMComponent.bindToView(com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMComponent$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new a(GAdBizKt.getGAdVideoDetail().getEndPage().getAdCard(context, this.f96858b, this.f96857a.f96869a));
    }

    @NotNull
    public final Object viewReusingKey() {
        return new Pair(super.viewReusingKey(), this.f96858b);
    }
}
