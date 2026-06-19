package com.bilibili.tgwt.detail.chat;

import android.R;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;
import com.bilibili.chatroom.widget.ChatImageSpannableTextViewCompat;
import com.bilibili.lib.theme.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/q.class */
public final class q {
    @BindingAdapter(requireAll = true, value = {"roomTitle", "curMemberCount", "memberCountDesc", "mcDesc", "roomType", "isPortrait"})
    public static final void a(@NotNull ChatImageSpannableTextViewCompat chatImageSpannableTextViewCompat, @NotNull String str, int i7, @NotNull String str2, @Nullable String str3, int i8, boolean z6) {
        if (i8 == 1) {
            chatImageSpannableTextViewCompat.setSpannableText(str);
            return;
        }
        if (i8 != 6) {
            chatImageSpannableTextViewCompat.setSpannableText(chatImageSpannableTextViewCompat.getContext().getString(2131836259, Integer.valueOf(i7)));
            return;
        }
        if (!z6) {
            chatImageSpannableTextViewCompat.setTextColor(ContextCompat.getColor(chatImageSpannableTextViewCompat.getContext(), R.color.white));
            chatImageSpannableTextViewCompat.setTextSize(1, 14.0f);
            chatImageSpannableTextViewCompat.setSpannableText(str);
            return;
        }
        String strA = G.p.a(str, "  ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(chatImageSpannableTextViewCompat.getContext(), R$color.Ga10)), 0, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), 0, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(chatImageSpannableTextViewCompat.getContext(), R$color.Pi5)), strA.length(), spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(12, true), strA.length(), spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(chatImageSpannableTextViewCompat.getContext(), R$color.Ga5)), str2.length() + strA.length(), spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(12, true), str2.length() + strA.length(), spannableStringBuilder.length(), 17);
        chatImageSpannableTextViewCompat.setSpannableText(spannableStringBuilder);
    }
}
