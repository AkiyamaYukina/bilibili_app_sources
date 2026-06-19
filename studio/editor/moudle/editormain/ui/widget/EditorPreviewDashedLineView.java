package com.bilibili.studio.editor.moudle.editormain.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/widget/EditorPreviewDashedLineView.class */
public final class EditorPreviewDashedLineView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f107097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final View f107098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View f107099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f107100d;

    @JvmOverloads
    public EditorPreviewDashedLineView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public EditorPreviewDashedLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public EditorPreviewDashedLineView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        View.inflate(context, 2131501966, this);
        this.f107097a = findViewById(2131319218);
        this.f107098b = findViewById(2131319217);
        this.f107099c = findViewById(2131319219);
        this.f107100d = findViewById(2131319220);
    }
}
