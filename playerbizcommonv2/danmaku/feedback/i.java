package com.bilibili.playerbizcommonv2.danmaku.feedback;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.united.page.intro.module.relate.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/i.class */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIComponent f80894b;

    public /* synthetic */ i(int i7, UIComponent uIComponent) {
        this.f80893a = i7;
        this.f80894b = uIComponent;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f80893a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1105107965, iIntValue, -1, "com.bilibili.playerbizcommonv2.danmaku.feedback.DanmakuFeedbackHeader.bindToView.<anonymous> (DanmakuFeedbackHeader.kt:47)");
                    }
                    final int i7 = 0;
                    final k kVar = (k) this.f80894b;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1811229621, true, new Function2(i7, kVar) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f80895a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final UIComponent f80896b;

                        {
                            this.f80895a = i7;
                            this.f80896b = kVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:45:0x02e3  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                            /*
                                Method dump skipped, instruction units count: 1180
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.feedback.j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-61726714, iIntValue2, -1, "com.bilibili.ship.theseus.united.page.intro.module.relate.RelateDislikeComponent.bindToView.<anonymous> (RelateDislikeComponent.kt:52)");
                    }
                    final int i8 = 1;
                    final u0 u0Var = (u0) this.f80894b;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1412881342, true, new Function2(i8, u0Var) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f80895a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final UIComponent f80896b;

                        {
                            this.f80895a = i8;
                            this.f80896b = u0Var;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:45:0x02e3  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                            /*
                                Method dump skipped, instruction units count: 1180
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.feedback.j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer2, 54), composer2, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
