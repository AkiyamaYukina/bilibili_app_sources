package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import Di0.C1602f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.ad.adview.search.inline.card155.r0;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.List;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.BlurOption;
import kntr.base.imageloader.ImageRequest;
import kntr.base.imageloader.ImmutableImageRequest;
import kntr.base.imageloader.Radius;
import kntr.base.imageloader.Sigma;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent.class */
@StabilityInferred(parameters = 0)
public final class CheeseStudyCompletedComponent implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f90140a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final j f90141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MZ.c f90142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final k f90143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final l f90144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f90145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f90146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final MutableState f90147g = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

        @NotNull
        public final MutableState h = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final MutableState f90148i = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final MutableState f90149j = SnapshotStateKt.mutableStateOf$default(Duration.box-impl(Duration.Companion.getZERO-UwyO8pc()), null, 2, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final MutableState f90150k = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final b f90151l = new b();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final MutableState f90152m = SnapshotStateKt.mutableStateOf$default(new c.a(), null, 2, null);

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$a$a.class */
        public interface InterfaceC0641a {

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$a$a$a.class */
            @StabilityInferred(parameters = 1)
            public static final class C0642a implements InterfaceC0641a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C0642a f90153a = new Object();

                public final boolean equals(@Nullable Object obj) {
                    return this == obj || (obj instanceof C0642a);
                }

                public final int hashCode() {
                    return 1986280293;
                }

                @NotNull
                public final String toString() {
                    return "End";
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent$a$a$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$a$a$b.class */
            @StabilityInferred(parameters = 1)
            public static final class b implements InterfaceC0641a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final b f90154a = new Object();

                public final boolean equals(@Nullable Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1116490546;
                }

                @NotNull
                public final String toString() {
                    return "Initial";
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent$a$a$c */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$a$a$c.class */
            @StabilityInferred(parameters = 1)
            public static final class c implements InterfaceC0641a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final c f90155a = new Object();

                public final boolean equals(@Nullable Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1862990956;
                }

                @NotNull
                public final String toString() {
                    return "Start";
                }
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final MutableState f90156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final MutableState f90157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final MutableState f90158c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final MutableState f90159d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public final MutableState f90160e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            public final MutableState f90161f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            public final MutableState f90162g;

            public b() {
                InterfaceC0641a.b bVar = InterfaceC0641a.b.f90154a;
                this.f90156a = SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
                this.f90157b = SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
                this.f90158c = SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
                this.f90159d = SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
                this.f90160e = SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
                this.f90161f = SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
                this.f90162g = SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedComponent$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f90163a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f90164b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final Integer f90165c;

            public c(long j7, String str, Integer num) {
                this.f90163a = str;
                this.f90164b = j7;
                this.f90165c = num;
            }
        }

        public a(@NotNull j jVar, @NotNull MZ.c cVar, @NotNull k kVar, @NotNull l lVar, @NotNull String str, @NotNull ExposureEntry exposureEntry) {
            this.f90141a = jVar;
            this.f90142b = cVar;
            this.f90143c = kVar;
            this.f90144d = lVar;
            this.f90145e = str;
            this.f90146f = exposureEntry;
        }
    }

    public CheeseStudyCompletedComponent(@NotNull a aVar) {
        this.f90140a = aVar;
    }

    public static Modifier f(Modifier modifier, final a.InterfaceC0641a interfaceC0641a, final int i7) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3(interfaceC0641a, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheeseStudyCompletedComponent.a.InterfaceC0641a f90244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f90245b;

            {
                this.f90244a = interfaceC0641a;
                this.f90245b = i7;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 275
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, 1, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(final k kVar, final l lVar, final String str, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-15876695);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(kVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(lVar) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(str) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, 1 & i11)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-15876695, i11, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent.BottomBtn (CheeseStudyCompletedComponent.kt:392)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            float f7 = SearchBangumiItem.TYPE_FULLNET_MOVIE;
            float fM3880constructorimpl = Dp.m3880constructorimpl(f7);
            float f8 = 30;
            float f9 = 15;
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(H.a(f9, SizeKt.m1374sizeVpY3zN4(companion3, fM3880constructorimpl, Dp.m3880constructorimpl(f8)), Color.m2628copywmQWz5c$default(Color.Companion.m2666getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), false, null, null, null, kVar, 15, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i12 = BiliTheme.$stable;
            TextStyle t14 = biliTheme.getTextStyle(composerStartRestartGroup, i12).getT14();
            long j7 = biliTheme.getColors(composerStartRestartGroup, i12).getText_white-0d7_KjU();
            TextAlign.Companion companion4 = TextAlign.Companion;
            TextKt.m1772Text4IGK_g("晒一晒", (Modifier) companion3, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(companion4.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t14, composerStartRestartGroup, 54, 0, 65016);
            composerStartRestartGroup.endNode();
            Modifier modifierM1186clickableoSLSa3U$default2 = ClickableKt.m1186clickableoSLSa3U$default(H.a(f9, SizeKt.m1374sizeVpY3zN4(companion3, r0.a(16, companion3, composerStartRestartGroup, 6, f7), Dp.m3880constructorimpl(f8)), biliTheme.getColors(composerStartRestartGroup, i12).getBrand_pink-0d7_KjU()), false, null, null, null, lVar, 15, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default2);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            TextKt.m1772Text4IGK_g(str, (Modifier) companion3, biliTheme.getColors(composerStartRestartGroup, i12).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(companion4.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i12).getT14(), composerStartRestartGroup, ((i11 >> 6) & 14) | 48, 0, 65016);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, kVar, lVar, str, modifier, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseStudyCompletedComponent f90238a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final k f90239b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final l f90240c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f90241d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Modifier f90242e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f90243f;

                {
                    this.f90238a = this;
                    this.f90239b = kVar;
                    this.f90240c = lVar;
                    this.f90241d = str;
                    this.f90242e = modifier;
                    this.f90243f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90243f | 1);
                    k kVar2 = this.f90239b;
                    l lVar2 = this.f90240c;
                    String str2 = this.f90241d;
                    Modifier modifier2 = this.f90242e;
                    this.f90238a.a(kVar2, lVar2, str2, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(final a aVar, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-627661713);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | ((i7 & 512) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-627661713, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent.CheeseStudyLayerFullScreenContent (CheeseStudyCompletedComponent.kt:140)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImmutableImageRequest immutableImageRequestBuild = new ImageRequest(aVar.f90145e).requestBlur(new BlurOption(Radius.constructor-impl(49), Sigma.constructor-impl(25), (DefaultConstructorMarker) null)).build();
            Modifier.Companion companion3 = Modifier.Companion;
            BiliImageKt.BiliImage(immutableImageRequestBuild, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            Color.Companion companion4 = Color.Companion;
            SpacerKt.Spacer(BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m2628copywmQWz5c$default(companion4.m2655getBlack0d7_KjU(), 0.88f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 6);
            ImageRequest imageRequest = new ImageRequest("https://i0.hdslb.com/bfs/activity-plat/static/20250919/3e589f9b66684a98619533747d9f4f0f/Y8gdQ5vEUu.png");
            Unit unit = Unit.INSTANCE;
            BiliImageKt.BiliImage(imageRequest.build(), AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 2.9071429f, false, 2, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion.getTopCenter());
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyRowMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f7 = 12;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null);
            float f8 = 24;
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(modifierM1346paddingqDBjuR0$default, Dp.m3880constructorimpl(f8)), false, null, null, null, aVar.f90141a, 15, null);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(2131232471, composerStartRestartGroup, 0);
            int i11 = Painter.$stable | 48;
            ImageKt.Image(painterPainterResource, (String) null, modifierM1186clickableoSLSa3U$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(2131233478, composerStartRestartGroup, 0), (String) null, ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m3880constructorimpl(f7), 0.0f, 11, null), Dp.m3880constructorimpl(f8)), false, null, null, null, aVar.f90142b, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
            composerStartRestartGroup.endNode();
            Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion.getCenter());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign2);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM1374sizeVpY3zN4 = SizeKt.m1374sizeVpY3zN4(PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(1), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(220), Dp.m3880constructorimpl(140));
            a.b bVar = aVar.f90151l;
            Modifier modifierF = f(modifierM1374sizeVpY3zN4, (a.InterfaceC0641a) bVar.f90156a.getValue(), 160);
            MutableState mutableState = bVar.f90156a;
            final a.InterfaceC0641a interfaceC0641a = (a.InterfaceC0641a) mutableState.getValue();
            ImageKt.Image(PainterResources_androidKt.painterResource(2131244871, composerStartRestartGroup, 0), (String) null, ComposedModifierKt.composed$default(modifierF, null, new Function3(interfaceC0641a) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseStudyCompletedComponent.a.InterfaceC0641a f90230a;

                {
                    this.f90230a = interfaceC0641a;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
                    /*
                        Method dump skipped, instruction units count: 264
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
            TextKt.m1772Text4IGK_g((String) aVar.f90147g.getValue(), f(SizeKt.m1379widthInVpY3zN4$default(companion3, 0.0f, Dp.m3880constructorimpl(306), 1, null), (a.InterfaceC0641a) mutableState.getValue(), 160), companion4.m2666getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT22b(), composerStartRestartGroup, 384, 3120, 55288);
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(3), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(36));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl4 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl4, currentCompositionLocalMap4);
            Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
            a.c cVar = (a.c) aVar.f90148i.getValue();
            MutableState mutableState2 = bVar.f90158c;
            if (cVar != null) {
                composerStartRestartGroup.startReplaceGroup(392129908);
                e(aVar.f90151l, cVar, 0L, 0L, f(SizeKt.m1379widthInVpY3zN4$default(companion3, 0.0f, Dp.m3880constructorimpl(ErrorCode.E_T0_INIT_FAILED), 1, null), (a.InterfaceC0641a) mutableState2.getValue(), 120), composerStartRestartGroup, (ExposureEntry.$stable << 15) | ((i10 << 9) & 458752), 12);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                BiliImageKt.BiliImage(Ef.x.b(composerStartRestartGroup, 392678701, "https://i0.hdslb.com/bfs/activity-plat/static/20250919/3e589f9b66684a98619533747d9f4f0f/Y8gdQ5vEUu.png"), f(SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(8), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(f8)), (a.InterfaceC0641a) mutableState2.getValue(), 120), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 0, 1020);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            a(aVar.f90143c, aVar.f90144d, (String) aVar.f90150k.getValue(), f(PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(18), 0.0f, 0.0f, 13, null), (a.InterfaceC0641a) bVar.f90157b.getValue(), 80), composerStartRestartGroup, (ExposureEntry.$stable << 12) | (57344 & (i10 << 6)));
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, aVar, modifier, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseStudyCompletedComponent f90226a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CheeseStudyCompletedComponent.a f90227b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f90228c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f90229d;

                {
                    this.f90226a = this;
                    this.f90227b = aVar;
                    this.f90228c = modifier;
                    this.f90229d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90229d | 1);
                    CheeseStudyCompletedComponent.a aVar2 = this.f90227b;
                    Modifier modifier2 = this.f90228c;
                    this.f90226a.b(aVar2, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-635497653, true, new C6113a(this)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c(final a aVar, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1227765779);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | ((i7 & 512) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1227765779, i10, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent.CheeseStudyLayerHalfScreenContent (CheeseStudyCompletedComponent.kt:270)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImmutableImageRequest immutableImageRequestBuild = new ImageRequest(aVar.f90145e).requestBlur(new BlurOption(Radius.constructor-impl(49), Sigma.constructor-impl(25), (DefaultConstructorMarker) null)).build();
            Modifier.Companion companion3 = Modifier.Companion;
            BiliImageKt.BiliImage(immutableImageRequestBuild, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            Color.Companion companion4 = Color.Companion;
            SpacerKt.Spacer(BackgroundKt.m1169backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m2628copywmQWz5c$default(companion4.m2655getBlack0d7_KjU(), 0.88f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 6);
            ImageRequest imageRequest = new ImageRequest("https://i0.hdslb.com/bfs/activity-plat/static/20250923/3e589f9b66684a98619533747d9f4f0f/lhWCqs6Jr8.png");
            Unit unit = Unit.INSTANCE;
            BiliImageKt.BiliImage(imageRequest.build(), AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 3.8659794f, false, 2, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion.getCenter());
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            a.b bVar = aVar.f90151l;
            Modifier modifierF = f(companion3, (a.InterfaceC0641a) bVar.f90156a.getValue(), 160);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierF);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f7 = 22;
            Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, 0.0f, Dp.m3880constructorimpl(f7), 0.0f, 11, null);
            float f8 = 14;
            Modifier modifierM1334offsetVpY3zN4$default = OffsetKt.m1334offsetVpY3zN4$default(rowScopeInstance.align(SizeKt.m1372size3ABfNKs(modifierM1346paddingqDBjuR0$default, Dp.m3880constructorimpl(f8)), companion.getTop()), 0.0f, Dp.m3880constructorimpl(-4), 1, null);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(2131244874, composerStartRestartGroup, 0);
            int i11 = Painter.$stable | 48;
            ImageKt.Image(painterPainterResource, (String) null, modifierM1334offsetVpY3zN4$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
            TextKt.m1772Text4IGK_g((String) aVar.f90147g.getValue(), SizeKt.m1379widthInVpY3zN4$default(companion3, 0.0f, Dp.m3880constructorimpl(253), 1, null), companion4.m2666getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT18b(), composerStartRestartGroup, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 3120, 55288);
            ImageKt.Image(PainterResources_androidKt.painterResource(2131244874, composerStartRestartGroup, 0), (String) null, OffsetKt.m1334offsetVpY3zN4$default(rowScopeInstance.align(SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(f8)), companion.getBottom()), 0.0f, Dp.m3880constructorimpl(4), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
            composerStartRestartGroup.endNode();
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(3), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(36));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl4 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM2296constructorimpl4, currentCompositionLocalMap4);
            Updater.m2304setimpl(composerM2296constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl4, Integer.valueOf(iHashCode4), composerM2296constructorimpl4));
            a.c cVar = (a.c) aVar.f90148i.getValue();
            MutableState mutableState = bVar.f90158c;
            if (cVar != null) {
                composerStartRestartGroup.startReplaceGroup(-796552123);
                e(aVar.f90151l, cVar, TextUnitKt.getSp(12), TextUnitKt.getSp(18), f(SizeKt.m1379widthInVpY3zN4$default(companion3, 0.0f, Dp.m3880constructorimpl(325), 1, null), (a.InterfaceC0641a) mutableState.getValue(), 120), composerStartRestartGroup, (ExposureEntry.$stable << 15) | 3456 | ((i10 << 9) & 458752), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                BiliImageKt.BiliImage(Ef.x.b(composerStartRestartGroup, -795900472, "https://i0.hdslb.com/bfs/activity-plat/static/20250924/3e589f9b66684a98619533747d9f4f0f/zyeHZq8ZVf.webp"), f(SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(8), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(24)), (a.InterfaceC0641a) mutableState.getValue(), 120), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 0, 1020);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            a(aVar.f90143c, aVar.f90144d, (String) aVar.f90150k.getValue(), f(PaddingKt.m1346paddingqDBjuR0$default(companion3, 0.0f, Dp.m3880constructorimpl(15), 0.0f, 0.0f, 13, null), (a.InterfaceC0641a) bVar.f90157b.getValue(), 80), composerStartRestartGroup, (ExposureEntry.$stable << 12) | (57344 & (i10 << 6)));
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, aVar, modifier, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseStudyCompletedComponent f90222a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CheeseStudyCompletedComponent.a f90223b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f90224c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f90225d;

                {
                    this.f90222a = this;
                    this.f90223b = aVar;
                    this.f90224c = modifier;
                    this.f90225d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90225d | 1);
                    CheeseStudyCompletedComponent.a aVar2 = this.f90223b;
                    Modifier modifier2 = this.f90224c;
                    this.f90222a.c(aVar2, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cb  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent.a.InterfaceC0641a r27, final int r28, final long r29, final androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 1027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent.d(com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent$a$a, int, long, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void e(@NotNull final a.b bVar, @NotNull final a.c cVar, long j7, long j8, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-112861066);
        int i11 = (i7 & 6) == 0 ? (composerStartRestartGroup.changed(bVar) ? 4 : 2) | i7 : i7;
        int i12 = i11;
        if ((i7 & 48) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(cVar) ? 32 : 16);
        }
        int i13 = i8 & 4;
        if (i13 != 0) {
            i9 = i12 | 384;
        } else {
            i9 = i12;
            if ((i7 & 384) == 0) {
                i9 = i12 | (composerStartRestartGroup.changed(j7) ? 256 : 128);
            }
        }
        int i14 = i8 & 8;
        if (i14 != 0) {
            i10 = i9 | 3072;
        } else {
            i10 = i9;
            if ((i7 & 3072) == 0) {
                i10 = i9 | (composerStartRestartGroup.changed(j8) ? 2048 : 1024);
            }
        }
        int i15 = i10;
        if ((i7 & 24576) == 0) {
            i15 = i10 | (composerStartRestartGroup.changed(modifier) ? 16384 : 8192);
        }
        int i16 = i15;
        if ((196608 & i7) == 0) {
            i16 = i15 | ((262144 & i7) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 131072 : 65536);
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i16) != 74898, i16 & 1)) {
            if (i13 != 0) {
                j7 = TextUnitKt.getSp(15);
            }
            if (i14 != 0) {
                j8 = TextUnitKt.getSp(26);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-112861066, i16, -1, "com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent.Subtitle (CheeseStudyCompletedComponent.kt:440)");
            }
            List listR = StringsKt.R(cVar.f90163a, new String[]{"%@"}, 0, 6);
            if (listR.size() == 1) {
                composerStartRestartGroup.startReplaceGroup(715750695);
                TextKt.m1772Text4IGK_g((String) listR.get(0), modifier, BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText_white-0d7_KjU(), j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i16 >> 9) & 112) | ((i16 << 3) & 7168), 3120, 120816);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(716193654);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getBottom(), composerStartRestartGroup, 48);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
                O4.d.c(companion, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1413763521);
                int i17 = 0;
                for (Object obj : listR) {
                    if (i17 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj;
                    BiliTheme biliTheme = BiliTheme.INSTANCE;
                    int i18 = BiliTheme.$stable;
                    long j9 = biliTheme.getColors(composerStartRestartGroup, i18).getText_white-0d7_KjU();
                    int iM3827getEllipsisgIe3tQ8 = TextOverflow.Companion.m3827getEllipsisgIe3tQ8();
                    Modifier.Companion companion2 = Modifier.Companion;
                    int i19 = (i16 << 3) & 7168;
                    TextKt.m1772Text4IGK_g(str, (Modifier) companion2, j9, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3827getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i19 | 48, 3120, 120816);
                    if (i17 == 0) {
                        composerStartRestartGroup.startReplaceGroup(-1368037701);
                        long j10 = cVar.f90164b;
                        int i20 = (int) Duration.getInWholeHours-impl(j10);
                        if (i20 > 0) {
                            composerStartRestartGroup.startReplaceGroup(-1367953815);
                            a.InterfaceC0641a interfaceC0641a = (a.InterfaceC0641a) bVar.f90160e.getValue();
                            Modifier modifierF = f(companion2, (a.InterfaceC0641a) bVar.f90159d.getValue(), 120);
                            int i21 = i16 >> 3;
                            d(interfaceC0641a, i20, j8, modifierF, composerStartRestartGroup, (i21 & 57344) | (i21 & 896) | (ExposureEntry.$stable << 12));
                            TextKt.m1772Text4IGK_g("小时", (Modifier) companion2, biliTheme.getColors(composerStartRestartGroup, i18).getText_white-0d7_KjU(), j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i19 | 54, 0, 131056);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1367017801);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        int i22 = (int) (Duration.getInWholeMinutes-impl(j10) % ((long) 60));
                        if (i22 > 0) {
                            composerStartRestartGroup.startReplaceGroup(-1366852633);
                            a.InterfaceC0641a interfaceC0641a2 = (a.InterfaceC0641a) bVar.f90160e.getValue();
                            Modifier modifierF2 = f(companion2, (a.InterfaceC0641a) bVar.f90159d.getValue(), 120);
                            int i23 = i16 >> 3;
                            d(interfaceC0641a2, i22, j8, modifierF2, composerStartRestartGroup, (i23 & 896) | (ExposureEntry.$stable << 12) | (i23 & 57344));
                            TextKt.m1772Text4IGK_g("分钟", (Modifier) companion2, biliTheme.getColors(composerStartRestartGroup, i18).getText_white-0d7_KjU(), j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i19 | 54, 0, 131056);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1365914697);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1365888905);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (i17 != 1 || listR.size() <= 2) {
                        composerStartRestartGroup.startReplaceGroup(-1364744137);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1365796432);
                        Integer num = cVar.f90165c;
                        if (num != null) {
                            composerStartRestartGroup.startReplaceGroup(-1365753373);
                            a.InterfaceC0641a interfaceC0641a3 = (a.InterfaceC0641a) bVar.f90162g.getValue();
                            int iIntValue = num.intValue();
                            Modifier modifierF3 = f(companion2, (a.InterfaceC0641a) bVar.f90161f.getValue(), 120);
                            int i24 = i16 >> 3;
                            d(interfaceC0641a3, iIntValue, j8, modifierF3, composerStartRestartGroup, (i24 & 896) | (ExposureEntry.$stable << 12) | (i24 & 57344));
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1365070691);
                            TextKt.m1772Text4IGK_g(" - ", (Modifier) companion2, biliTheme.getColors(composerStartRestartGroup, i18).getText_white-0d7_KjU(), j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i19 | 54, 0, 131056);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    i17++;
                }
                com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.o.a(composerStartRestartGroup);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j11 = j7;
            final long j12 = j8;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, bVar, cVar, j11, j12, modifier, i7, i8) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseStudyCompletedComponent f90231a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CheeseStudyCompletedComponent.a.b f90232b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CheeseStudyCompletedComponent.a.c f90233c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f90234d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f90235e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Modifier f90236f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final int f90237g;
                public final int h;

                {
                    this.f90231a = this;
                    this.f90232b = bVar;
                    this.f90233c = cVar;
                    this.f90234d = j11;
                    this.f90235e = j12;
                    this.f90236f = modifier;
                    this.f90237g = i7;
                    this.h = i8;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f90237g | 1);
                    CheeseStudyCompletedComponent.a.c cVar2 = this.f90233c;
                    Modifier modifier2 = this.f90236f;
                    int i25 = this.h;
                    this.f90231a.e(this.f90232b, cVar2, this.f90234d, this.f90235e, modifier2, (Composer) obj2, iUpdateChangedFlags, i25);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
