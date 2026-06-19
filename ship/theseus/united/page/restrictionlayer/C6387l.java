package com.bilibili.ship.theseus.united.page.restrictionlayer;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/l.class */
public final class C6387l {
    @NotNull
    public static final CharSequence a(@NotNull TextVo textVo, @NotNull Context context) {
        Integer numO;
        Integer numO2;
        String strJ = textVo.j();
        String str = textVo.f102705a;
        CharSequence charSequence = str;
        if (strJ != null) {
            if (strJ.length() == 0) {
                charSequence = str;
            } else {
                String strA = B0.a.a(textVo.j(), " ", str);
                SpannableString spannableString = new SpannableString(strA);
                String strJ2 = textVo.j();
                if (strJ2.length() > 0) {
                    int length = strJ2.length();
                    int iN = (!Cj0.a.a(context) || (numO2 = textVo.o()) == null) ? textVo.n() : numO2.intValue();
                    spannableString.setSpan(new StrikethroughSpan(), 0, length, 17);
                    spannableString.setSpan(new ForegroundColorSpan(iN), 0, length, 18);
                    spannableString.setSpan(new AbsoluteSizeSpan(10, true), 0, length, 17);
                }
                charSequence = spannableString;
                if (str.length() > 0) {
                    int length2 = textVo.j().length();
                    int length3 = strA.length();
                    int iN2 = (!Cj0.a.a(context) || (numO = textVo.o()) == null) ? textVo.n() : numO.intValue();
                    spannableString.setSpan(new AbsoluteSizeSpan(13, true), length2, length3, 18);
                    spannableString.setSpan(new ForegroundColorSpan(iN2), length2, length3, 18);
                    charSequence = spannableString;
                }
            }
        }
        return charSequence;
    }
}
