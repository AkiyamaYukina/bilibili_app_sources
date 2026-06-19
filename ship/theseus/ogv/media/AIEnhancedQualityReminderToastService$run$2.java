package com.bilibili.ship.theseus.ogv.media;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.IToastServiceKtxKt;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/AIEnhancedQualityReminderToastService$run$2.class */
final class AIEnhancedQualityReminderToastService$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PlayerToastVo $toastVo;
    private Object L$0;
    int label;
    final AIEnhancedQualityReminderToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIEnhancedQualityReminderToastService$run$2(AIEnhancedQualityReminderToastService aIEnhancedQualityReminderToastService, PlayerToastVo playerToastVo, Continuation<AIEnhancedQualityReminderToastService$run$2> continuation) {
        super(2, continuation);
        this.this$0 = aIEnhancedQualityReminderToastService;
        this.$toastVo = playerToastVo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AIEnhancedQualityReminderToastService aIEnhancedQualityReminderToastService, CoroutineScope coroutineScope, TextVo textVo) {
        PageReportService.g(aIEnhancedQualityReminderToastService.f93976d, "player.player.aiqn-vip-toast.click.player", aIEnhancedQualityReminderToastService.h.a(), 4);
        BuildersKt.launch$default(aIEnhancedQualityReminderToastService.f93973a, (CoroutineContext) null, (CoroutineStart) null, new AIEnhancedQualityReminderToastService$run$2$toast$1$1(aIEnhancedQualityReminderToastService, null), 3, (Object) null);
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AIEnhancedQualityReminderToastService$run$2 aIEnhancedQualityReminderToastService$run$2 = new AIEnhancedQualityReminderToastService$run$2(this.this$0, this.$toastVo, continuation);
        aIEnhancedQualityReminderToastService$run$2.L$0 = obj;
        return aIEnhancedQualityReminderToastService$run$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            AIEnhancedQualityReminderToastService aIEnhancedQualityReminderToastService = this.this$0;
            Context context = aIEnhancedQualityReminderToastService.f93978f;
            final PlayerToastVo playerToastVo = this.$toastVo;
            final C6210a c6210a = new C6210a(aIEnhancedQualityReminderToastService, coroutineScope);
            KProperty<Object>[] kPropertyArr = c.f94009a;
            PlayerToast.Builder builderDuration = new PlayerToast.Builder().location(32).level(3).toastItemType(19).duration(5000L);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new ColorDrawable(0));
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            composeView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            final int i8 = 1;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(119500801, true, new Function2(i8, playerToastVo, c6210a) { // from class: com.bilibili.playset.detail.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f84283a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f84284b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f84285c;

                {
                    this.f84283a = i8;
                    this.f84284b = playerToastVo;
                    this.f84285c = c6210a;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                    /*
                        Method dump skipped, instruction units count: 328
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }));
            frameLayout.addView(composeView);
            PlayerToast playerToastBuild = builderDuration.setCustomView(frameLayout).build();
            AIEnhancedQualityReminderToastService aIEnhancedQualityReminderToastService2 = this.this$0;
            PageReportService.i(aIEnhancedQualityReminderToastService2.f93976d, "player.player.aiqn-vip-toast.show.player", aIEnhancedQualityReminderToastService2.h.a(), 4);
            IToastService iToastService = this.this$0.f93977e;
            this.label = 1;
            if (IToastServiceKtxKt.a(iToastService, playerToastBuild, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
