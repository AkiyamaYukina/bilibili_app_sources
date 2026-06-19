package com.bilibili.playerbizcommonv2.widget.background;

import I3.B0;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/c.class */
@StabilityInferred(parameters = 0)
public final class c implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f82302c = LazyKt.lazy(new B0(8));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f82303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f82304b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/c$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.background.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/c$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0536a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0536a f82305a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0536a);
            }

            public final int hashCode() {
                return -76898928;
            }

            @NotNull
            public final String toString() {
                return "ClickBg";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/c$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f82306a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1103860651;
            }

            @NotNull
            public final String toString() {
                return "ClickConfirm";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.background.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/c$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class C0537c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0537c f82307a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0537c);
            }

            public final int hashCode() {
                return -30810705;
            }

            @NotNull
            public final String toString() {
                return "ClickRevert";
            }
        }
    }

    public c() {
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f82303a = mutableSharedFlowMutableSharedFlow$default;
        this.f82304b = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1805613654, true, new Function2(this) { // from class: com.bilibili.playerbizcommonv2.widget.background.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f82300a;

            {
                this.f82300a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1805613654, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogComponent.bindToView.<anonymous> (BackgroundPlayDialogCompose.kt:61)");
                    }
                    final c cVar = this.f82300a;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1366260834, true, new Function2(cVar) { // from class: com.bilibili.playerbizcommonv2.widget.background.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final c f82301a;

                        {
                            this.f82301a = cVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
                        /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x0156  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x01d0  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                            /*
                                Method dump skipped, instruction units count: 527
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.background.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
