package com.bilibili.ship.theseus.ogv.misc;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.BindingAdapter;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/a.class */
public final class a {
    @BindingAdapter(requireAll = false, value = {"badgeInfo", "allRadius"})
    public static final void a(@NotNull TextView textView, @Nullable OgvBadgeInfo ogvBadgeInfo, boolean z6) {
        if (ogvBadgeInfo != null) {
            String str = ogvBadgeInfo.f94347a;
            if (str.length() != 0) {
                textView.setVisibility(0);
                textView.setText(str);
                textView.setBackground(z6 ? AppCompatResources.getDrawable(textView.getContext(), 2131240963) : AppCompatResources.getDrawable(textView.getContext(), 2131240942));
                Drawable background = textView.getBackground();
                int i7 = Cj0.a.a(textView.getContext()) ? ogvBadgeInfo.f94351e : ogvBadgeInfo.f94350d;
                boolean z7 = background instanceof GradientDrawable;
                GradientDrawable gradientDrawable = z7 ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(i7);
                }
                GradientDrawable gradientDrawable2 = null;
                if (z7) {
                    gradientDrawable2 = (GradientDrawable) background;
                }
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setStroke(0, 0);
                }
                textView.setBackground(background);
                return;
            }
        }
        textView.setVisibility(8);
    }
}
