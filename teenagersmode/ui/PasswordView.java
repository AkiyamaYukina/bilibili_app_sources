package com.bilibili.teenagersmode.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/PasswordView.class */
public class PasswordView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f110596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char[] f110597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<TextView> f110598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f110599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbsoluteSizeSpan f110600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f110601g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/PasswordView$a.class */
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<PasswordView> f110602a;

        public a(PasswordView passwordView) {
            super(Looper.getMainLooper());
            this.f110602a = new WeakReference<>(passwordView);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            PasswordView passwordView;
            super.handleMessage(message);
            if (message.what != 100 || (passwordView = this.f110602a.get()) == null) {
                return;
            }
            int i7 = message.arg1;
            char[] cArr = passwordView.f110597c;
            if (cArr == null || i7 != cArr.length - 1) {
                return;
            }
            ((TextView) ((ArrayList) passwordView.f110598d).get(i7)).setText(passwordView.getResources().getString(2131835369));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/PasswordView$b.class */
    public interface b {
        void a();

        void b(String str);
    }

    public PasswordView(Context context) {
        this(context, null);
    }

    public PasswordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
        this.f110598d = arrayList;
        this.f110600f = new AbsoluteSizeSpan(18, true);
        this.f110595a = context;
        this.f110601g = new a(this);
        View viewInflate = LayoutInflater.from(context).inflate(2131500148, this);
        this.f110596b = (EditText) viewInflate.findViewById(2131301196);
        arrayList.add((TextView) viewInflate.findViewById(2131300897));
        arrayList.add((TextView) viewInflate.findViewById(2131300898));
        arrayList.add((TextView) viewInflate.findViewById(2131300899));
        arrayList.add((TextView) viewInflate.findViewById(2131300900));
        this.f110596b.addTextChangedListener(new c(this));
    }

    public final void j0() {
        this.f110597c = null;
        EditText editText = this.f110596b;
        if (editText != null) {
            editText.setText("");
        }
        Iterator it = ((ArrayList) this.f110598d).iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setText("");
        }
    }

    public final void k0() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager == null || this.f110595a == null || getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EditText editText = this.f110596b;
        if (editText == null || this.f110595a == null) {
            return;
        }
        editText.postDelayed(new RunnableC6653b(this, 0), 150L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOnInputListener(b bVar) {
        this.f110599e = bVar;
    }
}
