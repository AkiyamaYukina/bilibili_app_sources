package com.bilibili.lib.projection.internal.widget.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import he0.k;
import ke0.InterfaceC7754b;
import kotlin.jvm.JvmOverloads;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSeekTextWidget.class */
public final class ProjectionDialogSeekTextWidget extends AppCompatTextView implements InterfaceC7754b {
    @JvmOverloads
    public ProjectionDialogSeekTextWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public ProjectionDialogSeekTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ProjectionDialogSeekTextWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public final void J(int i7, int i8) {
        String strA = k.a(i7);
        if (TextUtils.isEmpty(strA)) {
            strA = "00:00";
        }
        String strA2 = k.a(i8);
        setText(strA + "/" + (TextUtils.isEmpty(strA2) ? "00:00" : strA2));
    }

    @Override // ke0.InterfaceC7753a
    public final /* bridge */ /* synthetic */ void i(InterfaceC7845m interfaceC7845m) {
    }
}
