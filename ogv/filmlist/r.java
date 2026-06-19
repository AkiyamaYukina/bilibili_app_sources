package com.bilibili.ogv.filmlist;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.Role;
import com.bilibili.compose.iconfont.BiliIconfont;
import kntr.common.trio.navigationevent.BackHandlerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/r.class */
public final class r {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final long j7, final C c7, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1759945980);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(c7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1759945980, i10, -1, "com.bilibili.ogv.filmlist.BackIcon (PageReadyUi.kt:367)");
            }
            IconKt.m2023Iconww6aTOc(BiliIconfont.INSTANCE.getArrow_back_left_line_500(composerStartRestartGroup, 6), "", BackHandlerKt.goBackOnClick-cJG_KMw(SizeKt.m1372size3ABfNKs(modifier, c7.f67615c), false, (String) null, (Role) null, (MutableInteractionSource) null, composerStartRestartGroup, 0, 15), j7, composerStartRestartGroup, Painter.$stable | 48 | ((i10 << 9) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(j7, c7, modifier, i7) { // from class: com.bilibili.ogv.filmlist.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f67744a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C f67745b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f67746c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f67747d;

                {
                    this.f67744a = j7;
                    this.f67745b = c7;
                    this.f67746c = modifier;
                    this.f67747d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67747d | 1);
                    C c8 = this.f67745b;
                    Modifier modifier2 = this.f67746c;
                    r.a(this.f67744a, c8, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x056e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull java.lang.String r35, @org.jetbrains.annotations.NotNull com.bilibili.ogv.filmlist.part.e r36, @org.jetbrains.annotations.NotNull com.bilibili.ogv.filmlist.C r37, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r38, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.filmlist.r.b(java.lang.String, com.bilibili.ogv.filmlist.part.e, com.bilibili.ogv.filmlist.C, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0429  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final com.bilibili.ogv.filmlist.api.c r35, final com.bilibili.ogv.filmlist.part.e r36, androidx.compose.ui.Modifier r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instruction units count: 2278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.filmlist.r.c(com.bilibili.ogv.filmlist.api.c, com.bilibili.ogv.filmlist.part.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04e5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.filmlist.api.c r16, @org.jetbrains.annotations.NotNull final com.bilibili.ogv.filmlist.part.e r17, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r18, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.internal.ComposableLambda r19, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 1415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.filmlist.r.d(com.bilibili.ogv.filmlist.api.c, com.bilibili.ogv.filmlist.part.e, androidx.compose.ui.Modifier, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.runtime.Composer, int):void");
    }

    public static final boolean e(float f7, float f8) {
        boolean z6 = true;
        if ((f7 <= 0.0f || f8 <= 0.001f) && (f7 >= 0.0f || f8 >= 0.999f)) {
            z6 = false;
        }
        return z6;
    }
}
