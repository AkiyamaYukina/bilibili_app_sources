package com.bilibili.ship.theseus.playlist.util;

import android.content.Context;
import android.text.SpannableString;
import android.widget.TextView;
import androidx.compose.ui.text.font.C4496a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.k;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/e.class */
public final class e {
    @NotNull
    public static final SpannableString a(int i7, @NotNull String str) {
        SpannableString spannableString = new SpannableString(C4496a.a("  ", str));
        spannableString.setSpan(new Cv0.f(i7), 0, 2, 33);
        return spannableString;
    }

    @NotNull
    public static final SpannableString b(@NotNull TextView textView, @NotNull Context context) {
        SpannableString spannableString = new SpannableString(textView.getText());
        if (spannableString.length() == 0) {
            return spannableString;
        }
        SpannableString spannableString2 = new SpannableString(" " + ((Object) textView.getText()));
        k kVar = new k(context, NewPlayerUtilsKt.toPx(12), NewPlayerUtilsKt.toPx(4), NewPlayerUtilsKt.toPx(1), textView, (Integer) null);
        spannableString2.setSpan(kVar, 0, 1, 17);
        kVar.g.playAnimation();
        return spannableString2;
    }
}
