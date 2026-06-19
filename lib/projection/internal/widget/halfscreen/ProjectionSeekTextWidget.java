package com.bilibili.lib.projection.internal.widget.halfscreen;

import Qe0.x;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import he0.k;
import ke0.InterfaceC7756d;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionSeekTextWidget.class */
public final class ProjectionSeekTextWidget extends AppCompatTextView implements InterfaceC7756d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f64091a = 0;

    public ProjectionSeekTextWidget(@NotNull Context context) {
        super(context);
    }

    public ProjectionSeekTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
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
    public final void i(InterfaceC7845m.a aVar) {
        ProjectionHalScreenSeekWidget projectionHalScreenSeekWidget = (ProjectionHalScreenSeekWidget) aVar.findViewById(2131309596);
        if (projectionHalScreenSeekWidget != null) {
            projectionHalScreenSeekWidget.f64075n = new x(this);
        }
    }
}
