package com.bilibili.music.podcast.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.C3259x;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/r.class */
public final class r {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/r$a.class */
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View.OnClickListener f67029a;

        public a(View.OnClickListener onClickListener) {
            this.f67029a = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            this.f67029a.onClick(view);
        }
    }

    @NotNull
    public static CharSequence a(@NotNull TextView textView, @NotNull String str, int i7, @Nullable View.OnClickListener onClickListener) {
        if (i7 <= 0) {
            return str;
        }
        textView.setMovementMethod(new LinkMovementMethod());
        textView.setClickable(false);
        textView.setLongClickable(false);
        int i8 = Build.VERSION.SDK_INT;
        textView.setContextClickable(false);
        textView.setHighlightColor(0);
        Context context = textView.getContext();
        int iMax = textView.getLayoutParams().width;
        if (iMax <= 0) {
            int i9 = context.getResources().getDisplayMetrics().widthPixels;
            Resources resources = context.getResources();
            iMax = Math.max(0, ((((i9 - textView.getPaddingLeft()) - textView.getPaddingRight()) - (resources.getDimensionPixelSize(2131166715) * 2)) - resources.getDimensionPixelSize(2131166718)) - resources.getDimensionPixelSize(2131166719));
        }
        String strA = C3259x.a(i7, "P");
        o oVar = new o(strA, context);
        int iB = oVar.b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str, 0, str.length(), textView.getPaint(), iMax);
        builderObtain.setAlignment(Layout.Alignment.ALIGN_NORMAL);
        builderObtain.setIncludePad(textView.getIncludeFontPadding());
        builderObtain.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        if (i8 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        int iMin = Math.min(staticLayoutBuild.getLineCount(), 2) - 1;
        int lineStart = staticLayoutBuild.getLineStart(iMin);
        int lineEnd = staticLayoutBuild.getLineEnd(iMin);
        float fMin = staticLayoutBuild.getLineCount() > 1 ? Math.min(staticLayoutBuild.getLineWidth(0), staticLayoutBuild.getWidth()) : staticLayoutBuild.getWidth();
        CharSequence charSequenceSubSequence = str.subSequence(lineStart, lineEnd);
        TextPaint paint = staticLayoutBuild.getPaint();
        boolean z6 = staticLayoutBuild.getLineCount() > 2 || (staticLayoutBuild.getLineCount() == 2 && fMin - staticLayoutBuild.getLineWidth(iMin) < ((float) iB));
        int iBreakText = paint.breakText(charSequenceSubSequence, 0, charSequenceSubSequence.length(), true, (fMin - iB) - (z6 ? paint.measureText("...") : 0.0f), new float[1]);
        if (!z6) {
            spannableStringBuilder.append(str.subSequence(0, lineEnd));
            if (iBreakText < charSequenceSubSequence.length()) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            Unit unit = Unit.INSTANCE;
        } else if (iBreakText <= 0) {
            spannableStringBuilder.append(str.subSequence(0, lineStart));
        } else {
            spannableStringBuilder.append(str.subSequence(0, lineStart));
            spannableStringBuilder.append(charSequenceSubSequence.subSequence(0, iBreakText));
        }
        if (z6) {
            spannableStringBuilder.append((CharSequence) "...");
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(strA, oVar, 33);
        if (onClickListener != null) {
            spannableStringBuilder.setSpan(new a(onClickListener), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
