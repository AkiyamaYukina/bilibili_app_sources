package com.bilibili.ogv.operation2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.ComposeView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/d.class */
public final class d extends ComponentDialog {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f70819k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f70820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f70821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f70822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f70823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableIntState f70824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f70825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f70826g;

    @NotNull
    public final Animatable<Float, AnimationVector1D> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f70827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableState f70828j;

    public d() {
        throw null;
    }

    public d(Context context, a aVar, e eVar, f fVar, long j7) {
        super(context, 2131888910);
        this.f70820a = aVar;
        this.f70821b = eVar;
        this.f70822c = fVar;
        this.f70823d = j7;
        this.f70824e = SnapshotIntStateKt.mutableIntStateOf(0);
        this.f70825f = "";
        this.f70826g = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.h = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
        this.f70827i = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f70828j = SnapshotStateKt.mutableStateOf$default(Offset.m2444boximpl(Offset.Companion.m2470getUnspecifiedF1C5BW0()), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x040d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 1207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.d.j(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        window.setAttributes(attributes);
        ComposeView composeView = new ComposeView(getContext(), null, 0, 6, null);
        composeView.setClipChildren(false);
        setContentView(composeView);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-70772197, true, new com.bilibili.app.comm.emoticon.ui.a(this, 2)));
        View childAt = composeView.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
    }
}
