package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.preference.Preference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/CustomTitlePreference.class */
@StabilityInferred(parameters = 0)
public final class CustomTitlePreference extends Preference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public TextView f78530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CharSequence f78531b;

    public CustomTitlePreference(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomTitlePreference(@NotNull Context context, @NotNull AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public CustomTitlePreference(@NotNull Context context, @NotNull AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(@NotNull androidx.preference.h hVar) {
        super.onBindViewHolder(hVar);
        TextView textView = (TextView) hVar.p0(2131308958);
        this.f78530a = textView;
        if (textView != null) {
            textView.setText(this.f78531b);
        }
    }

    @Override // androidx.preference.Preference
    public final void setTitle(@Nullable CharSequence charSequence) {
        TextView textView = this.f78530a;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.f78531b = charSequence;
    }
}
