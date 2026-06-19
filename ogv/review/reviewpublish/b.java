package com.bilibili.ogv.review.reviewpublish;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/b.class */
public final class b extends InputFilter.LengthFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pattern f72522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f72523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Pattern f72524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f72525d;

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        CharSequence charSequenceReplaceAll;
        CharSequence charSequenceReplaceAll2;
        CharSequence charSequenceReplaceAll3;
        SpannableString spannableString;
        String strReplaceAll = this.f72522a.matcher(charSequence).replaceAll("");
        int length = i8 - (charSequence.length() - strReplaceAll.length());
        SpannableString spannableString2 = new SpannableString(spanned);
        if (this.f72525d) {
            charSequenceReplaceAll2 = spanned.subSequence(i9, i10);
            charSequenceReplaceAll3 = spanned.subSequence(0, i9);
            spannableString = spannableString2;
            charSequenceReplaceAll = charSequence;
        } else {
            charSequenceReplaceAll = this.f72524c.matcher(strReplaceAll).replaceAll("");
            SpannableString spannableString3 = new SpannableString(this.f72524c.matcher(spanned).replaceAll(""));
            charSequenceReplaceAll2 = this.f72524c.matcher(spanned.subSequence(i9, i10)).replaceAll("");
            charSequenceReplaceAll3 = this.f72524c.matcher(spanned.subSequence(0, i9)).replaceAll("");
            spannableString = spannableString3;
        }
        int length2 = charSequence.length();
        int length3 = charSequenceReplaceAll.length();
        if (super.filter(charSequenceReplaceAll, i7, length3 + (length - length2), spannableString, charSequenceReplaceAll3.length(), charSequenceReplaceAll2.length() + charSequenceReplaceAll3.length()) != null) {
            r rVar = this.f72523b;
            if (rVar == null) {
                return "";
            }
            int length4 = spannableString.toString().length();
            KProperty<Object>[] kPropertyArr = ShortReviewPublishFragment.f72488A;
            rVar.f72553a.mf(length4);
            return "";
        }
        int length5 = spannableString.length();
        int length6 = charSequenceReplaceAll.length();
        int length7 = charSequenceReplaceAll2.length();
        r rVar2 = this.f72523b;
        if (rVar2 != null) {
            KProperty<Object>[] kPropertyArr2 = ShortReviewPublishFragment.f72488A;
            rVar2.f72553a.mf((length6 + length5) - length7);
        }
        if (!(charSequence instanceof Spanned)) {
            return strReplaceAll;
        }
        SpannableString spannableString4 = new SpannableString(strReplaceAll);
        TextUtils.copySpansFrom((Spanned) charSequence, i7, length, null, spannableString4, 0);
        return spannableString4;
    }
}
