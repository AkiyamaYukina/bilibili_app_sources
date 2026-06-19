package com.bilibili.teenagersmode.ui;

import android.os.Message;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.widget.TextView;
import com.bilibili.teenagersmode.ui.PasswordView;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/c.class */
public final class c implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasswordView f110662a;

    public c(PasswordView passwordView) {
        this.f110662a = passwordView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        PasswordView passwordView = this.f110662a;
        char[] cArr = passwordView.f110597c;
        boolean z6 = length < (cArr == null ? 0 : cArr.length);
        if (length < 0 || length > 4) {
            return;
        }
        char[] cArr2 = new char[length];
        passwordView.f110597c = cArr2;
        editable.getChars(0, length, cArr2, 0);
        PasswordView passwordView2 = this.f110662a;
        passwordView2.f110601g.removeCallbacksAndMessages(null);
        char[] cArr3 = passwordView2.f110597c;
        if (cArr3 == null) {
            return;
        }
        int length2 = cArr3.length;
        int i7 = 0;
        while (i7 < 4) {
            TextView textView = (TextView) ((ArrayList) passwordView2.f110598d).get(i7);
            int i8 = length2 - 1;
            textView.setSelected(i7 == i8);
            if (z6) {
                textView.setText(i7 <= i8 ? passwordView2.getResources().getString(2131835369) : "");
            } else if (i7 < i8) {
                textView.setText(passwordView2.getResources().getString(2131835369));
            } else if (i7 == i8) {
                SpannableString spannableString = new SpannableString(String.valueOf(passwordView2.f110597c[i7]));
                spannableString.setSpan(passwordView2.f110600f, 0, spannableString.length(), 33);
                textView.setText(spannableString);
                PasswordView.a aVar = passwordView2.f110601g;
                aVar.sendMessageDelayed(Message.obtain(aVar, 100, i7, -1), 2000L);
            } else {
                textView.setText("");
            }
            i7++;
        }
        PasswordView.b bVar = passwordView2.f110599e;
        if (bVar != null) {
            if (length2 != 4) {
                bVar.a();
                return;
            }
            char[] cArr4 = passwordView2.f110597c;
            StringBuilder sb = new StringBuilder();
            for (char c7 : cArr4) {
                sb.append(c7);
            }
            bVar.b(sb.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
