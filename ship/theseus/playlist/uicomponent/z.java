package com.bilibili.ship.theseus.playlist.uicomponent;

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
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/z.class */
@StabilityInferred(parameters = 0)
public final class z implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f96107g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f96108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<Unit> f96109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.q f96110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.r f96111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f96112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final B f96113f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/z$a.class */
    @Stable
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f96114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f96115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f96117d;

        public a(@NotNull String str, @NotNull String str2, int i7, @NotNull String str3) {
            this.f96114a = str;
            this.f96115b = str2;
            this.f96116c = i7;
            this.f96117d = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f96114a, aVar.f96114a) && Intrinsics.areEqual(this.f96115b, aVar.f96115b) && this.f96116c == aVar.f96116c && Intrinsics.areEqual(this.f96117d, aVar.f96117d);
        }

        public final int hashCode() {
            return this.f96117d.hashCode() + androidx.compose.animation.core.I.a(this.f96116c, I.E.a(this.f96114a.hashCode() * 31, 31, this.f96115b), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("State(content=");
            sb.append(this.f96114a);
            sb.append(", buttonText=");
            sb.append(this.f96115b);
            sb.append(", countdown=");
            sb.append(this.f96116c);
            sb.append(", countdownFinishedSuffix=");
            return C8770a.a(sb, this.f96117d, ")");
        }
    }

    public z(@NotNull a aVar, @NotNull Flow flow, @NotNull com.bilibili.ship.theseus.playlist.q qVar, @NotNull com.bilibili.ship.theseus.playlist.r rVar) {
        this.f96108a = aVar;
        this.f96109b = flow;
        this.f96110c = qVar;
        this.f96111d = rVar;
        int i7 = aVar.f96116c;
        this.f96112e = StateFlowKt.MutableStateFlow(Integer.valueOf(i7));
        this.f96113f = new B(this, ((long) i7) * 1000);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(Composer composer, final int i7, final String str) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(826963832);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(826963832, i9, -1, "com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportVideoAreaUIComponent.VideoAreaNotSupportUI (PlaylistNotSupportVideoAreaUIComponent.kt:81)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1365616320, true, new Function2(this, str) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f96102a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final z f96103b;

                {
                    this.f96102a = str;
                    this.f96103b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x02b5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) {
                    /*
                        Method dump skipped, instruction units count: 1013
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.uicomponent.x.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, str, i7) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final z f96104a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f96105b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f96106c;

                {
                    this.f96104a = this;
                    this.f96105b = str;
                    this.f96106c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f96106c | 1);
                    this.f96104a.a((Composer) obj, iUpdateChangedFlags, this.f96105b);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        UIComponent.b bVar = (UIComponent.b) viewEntry;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlaylistNotSupportVideoAreaUIComponent$bindToView$2(this, ((ComposeView) bVar.a).getContext(), bVar, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
