package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import I.E;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/d.class */
@StabilityInferred(parameters = 1)
public final class d implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f100110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f100111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f100112c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/d$a.class */
    @Stable
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f100113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f100114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f100115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f100116d;

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.f100113a = str;
            this.f100114b = str2;
            this.f100115c = str3;
            this.f100116d = str4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f100113a, aVar.f100113a) && Intrinsics.areEqual(this.f100114b, aVar.f100114b) && Intrinsics.areEqual(this.f100115c, aVar.f100115c) && Intrinsics.areEqual(this.f100116d, aVar.f100116d);
        }

        public final int hashCode() {
            return this.f100116d.hashCode() + E.a(E.a(this.f100113a.hashCode() * 31, 31, this.f100114b), 31, this.f100115c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("State(title=");
            sb.append(this.f100113a);
            sb.append(", content=");
            sb.append(this.f100114b);
            sb.append(", leftBtnText=");
            sb.append(this.f100115c);
            sb.append(", rightBtnText=");
            return C8770a.a(sb, this.f100116d, ")");
        }
    }

    public d(@NotNull a aVar, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
        this.f100110a = aVar;
        this.f100111b = function0;
        this.f100112c = function02;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(final a aVar, final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-827925005);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(this) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-827925005, i10, -1, "com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripPopupUIComponent.PopupUi (GuideStripPopupUIComponent.kt:43)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(78048059, true, new Function2(function0, aVar, this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f100103a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final d.a f100104b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final d f100105c;

                {
                    this.f100103a = function0;
                    this.f100104b = aVar;
                    this.f100105c = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x057d  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0668  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) {
                    /*
                        Method dump skipped, instruction units count: 1841
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, aVar, function0, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f100106a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final d.a f100107b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f100108c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f100109d;

                {
                    this.f100106a = this;
                    this.f100107b = aVar;
                    this.f100108c = function0;
                    this.f100109d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f100109d | 1);
                    this.f100106a.a(this.f100107b, this.f100108c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final UIComponent.b bVar = (UIComponent.b) viewEntry;
        ((ComposeView) bVar.a).setContent(ComposableLambdaKt.composableLambdaInstance(-527518317, true, new Function2(this, bVar) { // from class: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f100101a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UIComponent.b f100102b;

            {
                this.f100101a = this;
                this.f100102b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                /*
                    r6 = this;
                    r0 = r7
                    androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                    r11 = r0
                    r0 = r8
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r0 = r0.intValue()
                    r9 = r0
                    r0 = r9
                    r1 = 3
                    r0 = r0 & r1
                    r1 = 2
                    if (r0 == r1) goto L1b
                    r0 = 1
                    r10 = r0
                    goto L1e
                L1b:
                    r0 = 0
                    r10 = r0
                L1e:
                    r0 = r11
                    r1 = r10
                    r2 = r9
                    r3 = 1
                    r2 = r2 & r3
                    boolean r0 = r0.shouldExecute(r1, r2)
                    if (r0 == 0) goto La0
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto L3c
                    r0 = -527518317(0xffffffffe08eb593, float:-8.22663E19)
                    r1 = r9
                    r2 = -1
                    java.lang.String r3 = "com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripPopupUIComponent.bindToView.<anonymous> (GuideStripPopupUIComponent.kt:33)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                L3c:
                    r0 = r6
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.d r0 = r0.f100101a
                    r12 = r0
                    r0 = r12
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.d$a r0 = r0.f100110a
                    r13 = r0
                    r0 = r6
                    com.bilibili.app.gemini.ui.UIComponent$b r0 = r0.f100102b
                    r14 = r0
                    r0 = r11
                    r1 = r14
                    boolean r0 = r0.changedInstance(r1)
                    r10 = r0
                    r0 = r11
                    java.lang.Object r0 = r0.rememberedValue()
                    r8 = r0
                    r0 = r10
                    if (r0 != 0) goto L73
                    r0 = r8
                    r7 = r0
                    r0 = r8
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L86
                L73:
                    cV0.O r0 = new cV0.O
                    r1 = r0
                    r2 = r14
                    r3 = 5
                    r1.<init>(r2, r3)
                    r7 = r0
                    r0 = r11
                    r1 = r7
                    r0.updateRememberedValue(r1)
                L86:
                    r0 = r12
                    r1 = r13
                    r2 = r7
                    kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                    r3 = r11
                    r4 = 0
                    r0.a(r1, r2, r3, r4)
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto La7
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                    goto La7
                La0:
                    r0 = r11
                    r0.skipToGroupEnd()
                La7:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
