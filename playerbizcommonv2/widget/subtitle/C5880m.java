package com.bilibili.playerbizcommonv2.widget.subtitle;

import F3.C1757j0;
import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bilibili.lib.media.resource.Badge;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/m.class */
public final class C5880m {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final String str, @NotNull final String str2, @NotNull final List<M0> list, @NotNull final List<M0> list2, @Nullable final Badge badge, @NotNull final Function2<? super String, ? super Boolean, Unit> function2, @NotNull final Function2<? super String, ? super Boolean, Unit> function22, @NotNull final Function0<Unit> function0, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(878793442);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str2) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(list) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(list2) ? 2048 : 1024);
        }
        if ((i7 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(badge) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((196608 & i7) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536);
        }
        int i13 = i12;
        if ((1572864 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288);
        }
        int i14 = i13;
        if ((12582912 & i7) == 0) {
            i14 = i13 | (composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304);
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i14) != 4793490, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(878793442, i14, -1, "com.bilibili.playerbizcommonv2.widget.subtitle.BilingualPanelContent (BilingualCompose.kt:129)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            float f7 = 16;
            final float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
            final float fM3880constructorimpl2 = Dp.m3880constructorimpl(f7);
            final float fM3880constructorimpl3 = Dp.m3880constructorimpl(44);
            final float fA = com.bilibili.ad.adview.liveroom.answer.fragment.compont.H0.a(f7, fM3880constructorimpl3);
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object c1757j0 = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                c1757j0 = new C1757j0(11);
                composerStartRestartGroup.updateRememberedValue(c1757j0);
            }
            BoxWithConstraintsKt.BoxWithConstraints(ClickableKt.m1186clickableoSLSa3U$default(companion, false, null, null, null, (Function0) c1757j0, 15, null), null, false, ComposableLambdaKt.rememberComposableLambda(1743310668, true, new Function3(fM3880constructorimpl, fM3880constructorimpl2, fA, fM3880constructorimpl3, function0, context, str, badge, list, function2, str2, list2, function22) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final float f83668a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f83669b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f83670c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final float f83671d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function0 f83672e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Context f83673f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final String f83674g;
                public final Badge h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final List f83675i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final Function2 f83676j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final String f83677k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final List f83678l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final Function2 f83679m;

                {
                    this.f83668a = fM3880constructorimpl;
                    this.f83669b = fM3880constructorimpl2;
                    this.f83670c = fA;
                    this.f83671d = fM3880constructorimpl3;
                    this.f83672e = function0;
                    this.f83673f = context;
                    this.f83674g = str;
                    this.h = badge;
                    this.f83675i = list;
                    this.f83676j = function2;
                    this.f83677k = str2;
                    this.f83678l = list2;
                    this.f83679m = function22;
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x0442  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x05b6  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x066d  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
                    /*
                        Method dump skipped, instruction units count: 1740
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.C5862d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, str2, list, list2, badge, function2, function22, function0, i7) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f83690a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f83691b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List f83692c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final List f83693d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Badge f83694e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function2 f83695f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Function2 f83696g;
                public final Function0 h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final int f83697i;

                {
                    this.f83690a = str;
                    this.f83691b = str2;
                    this.f83692c = list;
                    this.f83693d = list2;
                    this.f83694e = badge;
                    this.f83695f = function2;
                    this.f83696g = function22;
                    this.h = function0;
                    this.f83697i = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f83697i | 1);
                    C5880m.a(this.f83690a, this.f83691b, this.f83692c, this.f83693d, this.f83694e, this.f83695f, this.f83696g, this.h, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0198  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final java.lang.String r14, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r15, @org.jetbrains.annotations.Nullable final com.bilibili.lib.media.resource.Badge r16, @org.jetbrains.annotations.NotNull final java.util.List r17, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2 r18, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.C5880m.b(java.lang.String, androidx.compose.ui.Modifier, com.bilibili.lib.media.resource.Badge, java.util.List, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }
}
