package com.bilibili.playerbizcommonv2.danmaku.feedback;

import I.E;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.theme.R$color;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/k.class */
@StabilityInferred(parameters = 1)
public final class k implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f80897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f80898b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/k$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f80899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f80900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f80901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f80902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f80903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f80904f;

        public a(String str, String str2, int i7, int i8) {
            i7 = (i8 & 16) != 0 ? R$color.Text1 : i7;
            int i9 = R$color.Text2;
            this.f80899a = str;
            this.f80900b = 3;
            this.f80901c = str2;
            this.f80902d = "发送人：";
            this.f80903e = i7;
            this.f80904f = i9;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f80899a, aVar.f80899a) && this.f80900b == aVar.f80900b && Intrinsics.areEqual(this.f80901c, aVar.f80901c) && Intrinsics.areEqual(this.f80902d, aVar.f80902d) && this.f80903e == aVar.f80903e && this.f80904f == aVar.f80904f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f80904f) + I.a(this.f80903e, E.a(E.a(I.a(this.f80900b, this.f80899a.hashCode() * 31, 31), 31, this.f80901c), 31, this.f80902d), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderContent(content=");
            sb.append(this.f80899a);
            sb.append(", contentLineLimit=");
            sb.append(this.f80900b);
            sb.append(", desc=");
            sb.append(this.f80901c);
            sb.append(", descPrefix=");
            sb.append(this.f80902d);
            sb.append(", contentTextColor=");
            sb.append(this.f80903e);
            sb.append(", descTextColor=");
            return C4277b.a(this.f80904f, ")", sb);
        }
    }

    public k(@NotNull a aVar, @NotNull Function0<Unit> function0) {
        this.f80897a = aVar;
        this.f80898b = function0;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1105107965, true, new i(0, this)));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
