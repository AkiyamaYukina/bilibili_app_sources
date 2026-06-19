package com.bilibili.playerbizcommonv2.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/x.class */
@StabilityInferred(parameters = 1)
public final class x {
    public static AnnotatedString a(long j7, String str) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int i7 = 0;
        while (true) {
            if (i7 >= str.length()) {
                break;
            }
            int iA = StringsKt.A(str, "<em class=\"keyword\">", i7, false, 4);
            if (iA == -1) {
                builder.append(str.substring(i7));
                break;
            }
            builder.append(str.substring(i7, iA));
            int iA2 = StringsKt.A(str, "</em>", iA, false, 4);
            if (iA2 == -1) {
                builder.append(str.substring(iA + 20));
                break;
            }
            String strSubstring = str.substring(iA + 20, iA2);
            int iPushStyle = builder.pushStyle(new SpanStyle(j7, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(strSubstring);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                i7 = iA2 + 5;
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        return builder.toAnnotatedString();
    }
}
