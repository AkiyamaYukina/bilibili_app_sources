package com.bilibili.ship.theseus.ogv.dubbing;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.compose.ui.autofill.r;
import androidx.core.view.GravityCompat;
import com.bilibili.ship.theseus.ogv.w;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import vg.E;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/DubbingGuidePopupWindow$scheduleShowDubbingGuideTip$1.class */
final class DubbingGuidePopupWindow$scheduleShowDubbingGuideTip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final View $anchorView;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DubbingGuidePopupWindow$scheduleShowDubbingGuideTip$1(b bVar, View view, Continuation<? super DubbingGuidePopupWindow$scheduleShowDubbingGuideTip$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$anchorView = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DubbingGuidePopupWindow$scheduleShowDubbingGuideTip$1(this.this$0, this.$anchorView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        b bVar = this.this$0;
        View view = this.$anchorView;
        int i8 = b.h;
        if (!bVar.isShowing() && bVar.f91838b.isShowing()) {
            Context context = view.getContext();
            bVar.getContentView().measure(0, 0);
            int measuredWidth = bVar.getContentView().getMeasuredWidth();
            boolean z6 = bVar.f91837a.h().f102988b;
            if (z6) {
                bVar.showAsDropDown(view, Uj0.c.b(4, context) + ((-measuredWidth) / 2), 0);
            } else {
                bVar.showAsDropDown(view, (int) Uj0.c.a(-4, context), (int) Uj0.c.a(4, context), GravityCompat.END);
            }
            d dVar = bVar.f91839c;
            Pair<Long, Integer> pairA = dVar.a(z6);
            String str = z6 ? "bangumi_dubbing_guide_tip_shown_fullscreen" : "bangumi_dubbing_guide_tip_shown_halfscreen";
            SharedPreferences.Editor editorEdit = w.f94906a.edit();
            long jMid = dVar.f91844a.mid();
            StringBuilder sbA = r.a(str);
            sbA.append(dVar.f91845b);
            sbA.append(jMid);
            editorEdit.putString(sbA.toString(), E.a(((Number) pairA.getSecond()).intValue() + 1, System.currentTimeMillis(), "#"));
            editorEdit.apply();
            PageReportService.i(bVar.f91841e, z6 ? "pgc.player.voicechange.fullscreentips.show" : "pgc.player.voicechange.verticaltips.show", null, 6);
        }
        return Unit.INSTANCE;
    }
}
