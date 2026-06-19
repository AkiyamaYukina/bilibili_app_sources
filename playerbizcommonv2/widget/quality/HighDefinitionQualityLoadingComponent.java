package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.M1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.playerbizcommonv2.widget.quality.HighDefinitionQualityLoadingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/HighDefinitionQualityLoadingComponent.class */
@StabilityInferred(parameters = 1)
public final class HighDefinitionQualityLoadingComponent implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f82674e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f82675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f82676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Scene f82677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82678d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/HighDefinitionQualityLoadingComponent$Scene.class */
    public static final class Scene {
        private static final EnumEntries $ENTRIES;
        private static final Scene[] $VALUES;
        public static final Scene THUMB = new Scene("THUMB", 0);
        public static final Scene HORIZONTAL = new Scene("HORIZONTAL", 1);
        public static final Scene VERTICAL = new Scene("VERTICAL", 2);

        private static final /* synthetic */ Scene[] $values() {
            return new Scene[]{THUMB, HORIZONTAL, VERTICAL};
        }

        static {
            Scene[] sceneArr$values = $values();
            $VALUES = sceneArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sceneArr$values);
        }

        private Scene(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Scene> getEntries() {
            return $ENTRIES;
        }

        public static Scene valueOf(String str) {
            return (Scene) Enum.valueOf(Scene.class, str);
        }

        public static Scene[] values() {
            return (Scene[]) $VALUES.clone();
        }
    }

    public HighDefinitionQualityLoadingComponent(@NotNull Scene scene, @NotNull String str, @Nullable String str2, @NotNull Function0 function0) {
        this.f82675a = str;
        this.f82676b = str2;
        this.f82677c = scene;
        this.f82678d = function0;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(final String str, final String str2, final Scene scene, final Function0<Unit> function0, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-404971279);
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
            i10 = i9 | (composerStartRestartGroup.changed(scene.ordinal()) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-404971279, i11, -1, "com.bilibili.playerbizcommonv2.widget.quality.HighDefinitionQualityLoadingComponent.HighDefinitionAnim (HighDefinitionQualityLoadingComponent.kt:74)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-966781113, true, new Function3(scene, str, str2, function0) { // from class: com.bilibili.playerbizcommonv2.widget.quality.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f82864a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final HighDefinitionQualityLoadingComponent.Scene f82865b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f82866c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f82867d;

                {
                    this.f82864a = function0;
                    this.f82865b = scene;
                    this.f82866c = str;
                    this.f82867d = str2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:114:0x06eb  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x01a4  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0241  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x02d5  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0422  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0542  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
                    /*
                        Method dump skipped, instruction units count: 1865
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.C5818o.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, str, str2, scene, function0, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final HighDefinitionQualityLoadingComponent f82868a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f82869b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f82870c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final HighDefinitionQualityLoadingComponent.Scene f82871d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function0 f82872e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f82873f;

                {
                    this.f82868a = this;
                    this.f82869b = str;
                    this.f82870c = str2;
                    this.f82871d = scene;
                    this.f82872e = function0;
                    this.f82873f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82873f | 1);
                    this.f82868a.a(this.f82869b, this.f82870c, this.f82871d, this.f82872e, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final int i7 = 0;
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(996544014, true, new Function2(this, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f82862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f82863b;

            {
                this.f82862a = i7;
                this.f82863b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f82862a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(996544014, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.quality.HighDefinitionQualityLoadingComponent.bindToView.<anonymous> (HighDefinitionQualityLoadingComponent.kt:64)");
                            }
                            HighDefinitionQualityLoadingComponent highDefinitionQualityLoadingComponent = (HighDefinitionQualityLoadingComponent) this.f82863b;
                            highDefinitionQualityLoadingComponent.a(highDefinitionQualityLoadingComponent.f82675a, highDefinitionQualityLoadingComponent.f82676b, highDefinitionQualityLoadingComponent.f82677c, highDefinitionQualityLoadingComponent.f82678d, composer, 0);
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
                                ComposerKt.traceEventStart(-1322762910, iIntValue2, -1, "kntr.app.tribee.search.base.TribeeSearchTopBar.<anonymous>.<anonymous>.<anonymous> (TribeeSearchTopBar.kt:84)");
                            }
                            CompositionLocalKt.CompositionLocalProvider(M1.f39856a.provides(Color.m2619boximpl(BiliTheme.INSTANCE.getColors(composer2, BiliTheme.$stable).getText2-0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-1585475038, true, new ZL.d((o21.a) this.f82863b, 3), composer2, 54), composer2, ProvidedValue.$stable | 48);
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
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ViewCompositionStrategy.Companion.getClass();
        return com.bilibili.app.gemini.ui.c.b(context, ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
    }
}
