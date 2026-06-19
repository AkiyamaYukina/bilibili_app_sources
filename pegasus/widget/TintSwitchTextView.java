package com.bilibili.pegasus.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/TintSwitchTextView.class */
@StabilityInferred(parameters = 0)
public final class TintSwitchTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public CharSequence f79129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CharSequence f79130b;

    @JvmOverloads
    public TintSwitchTextView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public TintSwitchTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public TintSwitchTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public final void J() {
        if (MultipleThemeUtils.isNightTheme(getContext())) {
            CharSequence charSequence = this.f79129a;
            ListExtentionsKt.setHtmlText$default(this, charSequence != null ? charSequence.toString() : null, (String) null, 2, (Object) null);
        } else {
            CharSequence charSequence2 = this.f79130b;
            ListExtentionsKt.setHtmlText$default(this, charSequence2 != null ? charSequence2.toString() : null, (String) null, 2, (Object) null);
        }
    }

    @Override // com.bilibili.magicasakura.widgets.TintTextView, com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        super.tint();
        J();
    }
}
