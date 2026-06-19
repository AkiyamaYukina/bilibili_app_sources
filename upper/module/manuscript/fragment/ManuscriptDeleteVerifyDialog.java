package com.bilibili.upper.module.manuscript.fragment;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.droid.ToastHelper;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.service.UpperVerifyCodeApiService;
import com.bilibili.upper.module.manuscript.fragment.ManuscriptDeleteVerifyDialog;
import fA0.c;
import iI0.C7543e;
import iI0.C7544f;
import iI0.C7545g;
import nI0.n;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptDeleteVerifyDialog.class */
public class ManuscriptDeleteVerifyDialog extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f113587w = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113588b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113589c = 60;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f113590d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f113591e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f113592f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f113593g = null;
    public String h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f113594i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f113595j = new a(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f113596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f113597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f113598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f113599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f113600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f113601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f113602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f113603r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f113604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f113605t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f113606u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f113607v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptDeleteVerifyDialog$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManuscriptDeleteVerifyDialog f113608a;

        public a(ManuscriptDeleteVerifyDialog manuscriptDeleteVerifyDialog) {
            this.f113608a = manuscriptDeleteVerifyDialog;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ManuscriptDeleteVerifyDialog manuscriptDeleteVerifyDialog = this.f113608a;
            int i7 = ManuscriptDeleteVerifyDialog.f113587w;
            manuscriptDeleteVerifyDialog.kf();
        }
    }

    public static void hf(ManuscriptDeleteVerifyDialog manuscriptDeleteVerifyDialog, boolean z6) {
        if (z6) {
            if (manuscriptDeleteVerifyDialog.getContext() != null) {
                manuscriptDeleteVerifyDialog.f113604s.setBackground(ContextCompat.getDrawable(manuscriptDeleteVerifyDialog.getContext(), 2131241495));
            }
        } else if (manuscriptDeleteVerifyDialog.getContext() != null) {
            manuscriptDeleteVerifyDialog.f113604s.setBackground(ContextCompat.getDrawable(manuscriptDeleteVerifyDialog.getContext(), 2131241496));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        Handler handler = this.f113594i;
        if (handler != null) {
            handler.removeCallbacks(this.f113595j);
        }
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m10673if() {
        if (TextUtils.isEmpty(this.f113593g) || this.f113593g.length() != 6) {
            return;
        }
        String str = this.f113590d;
        if (str != null) {
            ((UpperVerifyCodeApiService) ServiceGenerator.createService(UpperVerifyCodeApiService.class)).checkVerifyCode(str, this.f113593g).enqueue(new C7545g(this));
        } else if (getContext() != null) {
            ToastHelper.showToastShort(getContext(), getResources().getString(2131849039));
        }
    }

    public final void jf() {
        if (!TextUtils.isEmpty(this.f113593g) && this.f113593g.length() == 6) {
            this.f113600o.setEnabled(true);
            if (getContext() != null) {
                this.f113600o.setTextColor(ThemeUtils.getColorById(getContext(), 2131104274));
            }
        } else {
            this.f113600o.setEnabled(false);
            if (getContext() != null) {
                this.f113600o.setTextColor(ThemeUtils.getColorById(getContext(), 2131104251));
            }
        }
        if (TextUtils.isEmpty(this.f113593g)) {
            this.f113603r.setVisibility(4);
        } else {
            this.f113603r.setVisibility(0);
        }
    }

    public final void kf() {
        int i7 = this.f113588b;
        if (i7 == 0) {
            jf();
            if (!TextUtils.isEmpty(this.f113592f) && !TextUtils.isEmpty(this.f113591e)) {
                if (getContext() != null) {
                    this.h = getResources().getString(2131850870) + " +" + this.f113592f + " " + this.f113591e;
                }
                this.f113596k.setText(this.h);
            }
            this.f113598m.setVisibility(0);
            this.f113597l.setVisibility(8);
            return;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                return;
            }
            this.f113598m.setVisibility(0);
            this.f113598m.setText(2131850885);
            this.f113597l.setVisibility(8);
            return;
        }
        if (this.h == null && !TextUtils.isEmpty(this.f113592f) && !TextUtils.isEmpty(this.f113591e)) {
            if (getContext() != null) {
                this.h = getResources().getString(2131850870) + " +" + this.f113592f + " " + this.f113591e;
            }
            this.f113596k.setText(this.h);
        }
        this.f113598m.setVisibility(8);
        this.f113597l.setVisibility(0);
        if (this.f113589c <= 0) {
            this.f113588b = 2;
            kf();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113589c);
        sb.append(getContext() != null ? getResources().getString(2131850905) : "");
        this.f113597l.setText(sb.toString());
        this.f113589c--;
        this.f113594i.postDelayed(this.f113595j, 1000L);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == 2131305542) {
            if (this.f113588b != 1) {
                ((UpperVerifyCodeApiService) ServiceGenerator.createService(UpperVerifyCodeApiService.class)).getVerifyCode().enqueue(new C7544f(this));
                kf();
                return;
            }
            return;
        }
        if (id == 2131298032) {
            EditText editText = this.f113602q;
            Boolean bool = c.a;
            c.a.b(editText);
            m10673if();
            return;
        }
        if (id == 2131298018) {
            Handler handler = this.f113594i;
            if (handler != null) {
                handler.removeCallbacks(this.f113595j);
            }
            dismissAllowingStateLoss();
            return;
        }
        if (id == 2131301228) {
            this.f113593g = null;
            this.f113602q.setText((CharSequence) null);
            jf();
        } else if (id == 2131298809) {
            BLog.i("ManuscriptDeleteVerifyDialog", "cl_dialog_container click");
        } else if (id == 2131298810) {
            BLog.i("ManuscriptDeleteVerifyDialog", "cl_dialog_out_container click");
            EditText editText2 = this.f113602q;
            Boolean bool2 = c.a;
            c.a.b(editText2);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494215, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Handler handler = this.f113594i;
        if (handler != null) {
            handler.removeCallbacks(this.f113595j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().setSoftInputMode(4);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.getWindow().setDimAmount(0.7f);
        }
        this.f113605t = view.findViewById(2131298810);
        this.f113606u = view.findViewById(2131298809);
        this.f113599n = view.findViewById(2131305542);
        this.f113597l = (TextView) view.findViewById(2131314440);
        this.f113598m = (TextView) view.findViewById(2131297861);
        this.f113600o = (Button) view.findViewById(2131298032);
        this.f113601p = (Button) view.findViewById(2131298018);
        this.f113596k = (TextView) view.findViewById(2131314439);
        this.f113602q = (EditText) view.findViewById(2131301227);
        this.f113603r = view.findViewById(2131301228);
        this.f113604s = view.findViewById(2131298879);
        this.f113606u.setOnClickListener(this);
        this.f113605t.setOnClickListener(this);
        this.f113599n.setOnClickListener(this);
        this.f113600o.setOnClickListener(this);
        this.f113601p.setOnClickListener(this);
        this.f113603r.setOnClickListener(this);
        this.f113602q.addTextChangedListener(new C7543e(this));
        this.f113602q.setOnKeyListener(new View.OnKeyListener(this) { // from class: iI0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ManuscriptDeleteVerifyDialog f121588a;

            {
                this.f121588a = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i7, KeyEvent keyEvent) {
                ManuscriptDeleteVerifyDialog manuscriptDeleteVerifyDialog = this.f121588a;
                int i8 = ManuscriptDeleteVerifyDialog.f113587w;
                manuscriptDeleteVerifyDialog.getClass();
                if (i7 != 4 && i7 != 6 && (keyEvent == null || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                    return false;
                }
                manuscriptDeleteVerifyDialog.m10673if();
                return false;
            }
        });
        this.f113597l.setText(2131850885);
        jf();
        kf();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(@NonNull @NotNull FragmentManager fragmentManager, @Nullable @org.jetbrains.annotations.Nullable String str) {
        try {
            super.showNow(fragmentManager, str);
        } catch (Exception e7) {
            if (isAdded()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.add(this, str);
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        }
    }
}
