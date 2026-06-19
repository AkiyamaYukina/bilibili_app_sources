package com.bilibili.playerbizcommonv2.widget.speed;

import F3.C1717e0;
import android.content.Context;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.RawRes;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.bplus.followinglist.opus.list.component.C;
import com.bilibili.playerbizcommonv2.widget.speed.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/n.class */
@StabilityInferred(parameters = 0)
public final class n extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<d> f83435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<r> f83436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f83437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f83438e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/n$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f83439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f83440b;

        public a(@NotNull String str, @NotNull Function0<Unit> function0) {
            this.f83439a = str;
            this.f83440b = function0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f83439a, aVar.f83439a) && Intrinsics.areEqual(this.f83440b, aVar.f83440b);
        }

        public final int hashCode() {
            return this.f83440b.hashCode() + (this.f83439a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Button(text=" + this.f83439a + ", onClick=" + this.f83440b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/n$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/n$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f83441a;

            public a(@DrawableRes int i7) {
                this.f83441a = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f83441a == ((a) obj).f83441a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f83441a);
            }

            @NotNull
            public final String toString() {
                return C4277b.a(this.f83441a, ")", new StringBuilder("Image(resId="));
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.speed.n$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/n$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0556b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f83442a;

            public C0556b(@RawRes int i7) {
                this.f83442a = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0556b) && this.f83442a == ((C0556b) obj).f83442a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f83442a);
            }

            @NotNull
            public final String toString() {
                return C4277b.a(this.f83442a, ")", new StringBuilder("Lottie(resId="));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/n$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends AbsFunctionWidget.Configuration {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "WidgetConfiguration(config=null)";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/n$d.class */
    @StabilityInferred(parameters = 0)
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f83443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final b f83444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final a f83445c;

        public d(@NotNull String str, @Nullable b bVar, @Nullable a aVar) {
            this.f83443a = str;
            this.f83444b = bVar;
            this.f83445c = aVar;
        }
    }

    public n(@NotNull Context context, @NotNull final d dVar) {
        super(context);
        this.f83434a = 14;
        this.f83435b = StateFlowKt.MutableStateFlow(dVar);
        this.f83436c = new ArrayList();
        this.f83437d = LazyKt.lazy(new C1717e0(12));
        this.f83438e = LazyKt.lazy(new Function0(dVar, this) { // from class: com.bilibili.playerbizcommonv2.widget.speed.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n.d f83432a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final n f83433b;

            {
                this.f83432a = dVar;
                this.f83433b = this;
            }

            public final Object invoke() {
                MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(this.f83432a);
                n nVar = this.f83433b;
                FlowKt.launchIn(FlowKt.onEach(nVar.f83435b, new TripleSpeedFunctionWidgetV2$_uiStateFlow$2$1(nVar, MutableStateFlow, null)), (CoroutineScope) nVar.f83437d.getValue());
                return MutableStateFlow;
            }
        });
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(428221901, true, new C(this, 1)));
        return composeView;
    }

    public final void g(@NotNull d dVar) {
        this.f83435b.setValue(dVar);
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().launchType(2).build();
    }

    @NotNull
    public final String getTag() {
        return "TripleSpeedFunctionWidgetV2";
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        if (configuration instanceof c) {
            ((c) configuration).getClass();
            g(null);
        }
    }

    public final void onRelease() {
    }
}
