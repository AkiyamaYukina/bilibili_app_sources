package com.bilibili.upper.module.uppercenter.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.upper.module.uppercenter.fragment.UpperCenterKntrFragment;
import kntr.common.compose.launcher.B;
import kntr.common.compose.launcher.VertexFragment;
import kntr.common.compose.launcher.g;
import kntr.common.router.GlobalRouterKt;
import kntr.common.router.UrisKt;
import kntr.common.trio.vertex.VertexContext;
import kntr.common.trio.vertex.VertexUi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/fragment/UpperCenterKntrFragment.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterKntrFragment extends VertexFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1<? super VertexContext, ? extends VertexUi> f114088c;

    @NotNull
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final VertexUi m10694if(@NotNull VertexFragment.onCreate.vertexContext.1 r42) {
        Function1<? super VertexContext, ? extends VertexUi> function1 = this.f114088c;
        Function1<? super VertexContext, ? extends VertexUi> function12 = function1;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vertex");
            function12 = null;
        }
        return (VertexUi) function12.invoke(r42);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        boolean z6 = false;
        if (arguments != null) {
            z6 = arguments.getBoolean("isEmbedded", false);
        }
        String str = z6 ? "bilibili://upper/center?is_embedded=1" : "bilibili://upper/center";
        B b7 = g.b(GlobalRouterKt.getGlobalRouter().find(UrisKt.toUri(str)));
        if (b7 == null) {
            throw new IllegalStateException("Cannot find vertex from ".concat(str).toString());
        }
        this.f114088c = b7.a;
        super.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        boolean z6 = false;
        if (arguments != null) {
            z6 = arguments.getBoolean("isEmbedded", false);
        }
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        final boolean z7 = z6;
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1800213806, true, new Function2(z7, this) { // from class: YI0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f28683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UpperCenterKntrFragment f28684b;

            {
                this.f28683a = z7;
                this.f28684b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 272
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: YI0.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        return composeView;
    }
}
