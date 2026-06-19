package com.bilibili.playerbizcommonv2.widget.subtitle;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/z.class */
public final /* synthetic */ class C5893z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f83826b;

    public /* synthetic */ C5893z(Object obj, int i7) {
        this.f83825a = i7;
        this.f83826b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f83825a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-157964214, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.subtitle.MultiAudioIntroFunctionWidget.contentView.<anonymous>.<anonymous> (MultiAudioIntroFunctionWidget.kt:64)");
                    }
                    ThemeStrategy themeStrategy = ThemeStrategy.ForceDay;
                    final C c7 = (C) this.f83826b;
                    final int i7 = 0;
                    BiliThemeKt.BiliTheme(themeStrategy, false, ComposableLambdaKt.rememberComposableLambda(293188498, true, new Function2(c7, i7) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.A

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f83452a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f83453b;

                        {
                            this.f83452a = i7;
                            this.f83453b = c7;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 535
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.A.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 390, 2);
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
                        ComposerKt.traceEventStart(-1837229001, iIntValue2, -1, "com.bilibili.ship.theseus.united.utils.BiliComposeUIComponent.bindToView.<anonymous> (BiliComposeUIComponent.kt:37)");
                    }
                    final com.bilibili.ship.theseus.united.utils.a aVar = (com.bilibili.ship.theseus.united.utils.a) this.f83826b;
                    final int i8 = 1;
                    BiliThemeKt.BiliTheme(aVar.f104845a, false, ComposableLambdaKt.rememberComposableLambda(-1298576513, true, new Function2(aVar, i8) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.A

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f83452a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f83453b;

                        {
                            this.f83452a = i8;
                            this.f83453b = aVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 535
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.A.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer2, 54), composer2, 384, 2);
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
