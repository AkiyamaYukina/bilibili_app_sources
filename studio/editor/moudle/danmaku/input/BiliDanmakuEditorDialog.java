package com.bilibili.studio.editor.moudle.danmaku.input;

import TC0.d;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bigkoo.pickerview.TimePickerView;
import com.bilibili.okretro.ServiceGenerator;
import fA0.c;
import java.util.Calendar;
import java.util.Date;
import kntr.base.localization.h;
import org.jetbrains.annotations.NotNull;
import xx0.b;
import xx0.e;
import xx0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/input/BiliDanmakuEditorDialog.class */
public class BiliDanmakuEditorDialog extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f106065o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f106066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f106067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f106068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f106069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f106070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f106071g;
    public int h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f106072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f106073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f106074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f106075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f106076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f106077n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/input/BiliDanmakuEditorDialog$a.class */
    public interface a {
        void a(long j7, String str);

        void onCancel();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        EditText editText = this.f106068d;
        Boolean bool = c.a;
        c.a.b(editText);
        e eVar = this.f106073j;
        if (eVar != null) {
            eVar.dismiss();
        }
    }

    public final void hf() {
        EditText editText = this.f106068d;
        Boolean bool = c.a;
        c.a.b(editText);
        Editable text = this.f106068d.getText();
        if (text != null) {
            m9896if(this.h, text.toString().trim(), true);
        }
        kf();
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final String m9896if(int i7, @Nullable String str, boolean z6) {
        if (this.f106068d == null) {
            this.f106072i = str;
            this.h = i7;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return str.length() <= i7 ? str : str.substring(0, i7);
        }
        if (i7 < 0) {
            return null;
        }
        this.h = i7;
        if (TextUtils.isEmpty(str)) {
            this.f106072i = "";
        } else if (str.length() <= i7) {
            this.f106071g.setText(TextUtils.concat(String.valueOf(str.length()), "/", String.valueOf(i7)));
            this.f106072i = str;
        } else {
            String strSubstring = str.substring(0, i7);
            this.f106072i = strSubstring;
            this.f106071g.setText(TextUtils.concat(String.valueOf(strSubstring.length()), "/", String.valueOf(i7)));
        }
        if (z6) {
            this.f106068d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
            this.f106068d.setText(this.f106072i);
            EditText editText = this.f106068d;
            editText.setSelection(String.valueOf(editText.getText()).length());
            kf();
        }
        return this.f106072i;
    }

    public final void jf(Date date) {
        if (getContext() == null) {
            return;
        }
        this.f106070f.setText(getContext().getString(2131841869) + "  " + h.a(date.getTime()));
    }

    public final void kf() {
        EditText editText;
        if (this.f106067c == null || (editText = this.f106068d) == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(editText.getText());
        boolean z6 = zIsEmpty;
        if (this.f106077n == 2) {
            z6 = zIsEmpty | (this.f106074k == 0);
        }
        this.f106067c.setEnabled(!z6);
    }

    public final void lf() {
        if (getContext() == null) {
            return;
        }
        int i7 = this.f106075l;
        if (i7 == 0) {
            this.f106068d.setCursorVisible(true);
            this.f106068d.setBackground(ContextCompat.getDrawable(getContext(), 2131234030));
            this.f106070f.setBackground(ContextCompat.getDrawable(getContext(), 2131234039));
        } else if (i7 == 1) {
            this.f106068d.setCursorVisible(false);
            this.f106068d.setBackground(ContextCompat.getDrawable(getContext(), 2131234039));
            this.f106070f.setBackground(ContextCompat.getDrawable(getContext(), 2131234030));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == 2131298018) {
            a aVar = this.f106076m;
            if (aVar != null) {
                aVar.onCancel();
            }
            dismissAllowingStateLoss();
            return;
        }
        if (id == 2131298032) {
            hf();
            if (this.f106077n == 2) {
                this.f106067c.setEnabled(false);
                ((d) ServiceGenerator.createService(d.class)).checkLiveDanmaku(String.valueOf(this.f106068d.getText()).trim(), this.f106074k).enqueue(new f(this));
                return;
            } else {
                a aVar2 = this.f106076m;
                if (aVar2 != null) {
                    aVar2.a(this.f106074k, String.valueOf(this.f106068d.getText()).trim());
                }
                dismissAllowingStateLoss();
                return;
            }
        }
        if (id == 2131300909) {
            this.f106075l = 0;
            EditText editText = this.f106068d;
            Boolean bool = c.a;
            if ((editText != null ? editText.getContext() : null) != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
                editText.requestFocus();
                inputMethodManager.showSoftInput(editText, 0);
            }
            lf();
            m9896if(this.h, this.f106072i, true);
            return;
        }
        if (id == 2131301222) {
            this.f106075l = 1;
            hf();
            lf();
            c.a.b(this.f106068d);
            if (getContext() == null) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(this.f106074k * 1000));
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(new Date(System.currentTimeMillis()));
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(new Date(System.currentTimeMillis()));
            calendar3.add(2, 6);
            e eVar = new e(this, new TimePickerView.Builder(getContext(), new com.bilibili.ogv.filmlist.f(this)).setTitleText(getContext().getString(2131842248)).setType(new boolean[]{true, true, true, true, true, false}).setLabel(getContext().getString(2131842423), getContext().getString(2131842415), getContext().getString(2131842403), getContext().getString(2131842217), getContext().getString(2131841746), "").isCenterLabel(false).setDividerColor(-12303292).setContentSize(21).setDate(calendar).setRangDate(calendar2, calendar3).setDecorView((ViewGroup) getView()));
            this.f106073j = eVar;
            eVar.show(true);
            e eVar2 = this.f106073j;
            if (eVar2 == null) {
                return;
            }
            View viewFindViewById = eVar2.findViewById(2131297880);
            if (viewFindViewById instanceof Button) {
                ((Button) viewFindViewById).setAllCaps(false);
            }
            View viewFindViewById2 = eVar2.findViewById(2131298000);
            if (viewFindViewById2 instanceof Button) {
                ((Button) viewFindViewById2).setAllCaps(false);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull @NotNull LayoutInflater layoutInflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup viewGroup, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131493789, (ViewGroup) null, false);
        viewInflate.setSaveEnabled(false);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().setSoftInputMode(4);
            dialog.getWindow().setDimAmount(0.9f);
        }
        this.f106075l = 0;
        this.f106066b = (Button) view.findViewById(2131298018);
        this.f106067c = (Button) view.findViewById(2131298032);
        this.f106068d = (EditText) view.findViewById(2131300909);
        this.f106069e = (TextView) view.findViewById(2131314423);
        this.f106070f = (TextView) view.findViewById(2131301222);
        this.f106071g = (TextView) view.findViewById(2131316662);
        if (getContext() != null) {
            if (this.f106077n == 2) {
                this.f106069e.setText(getContext().getString(2131842399));
            } else {
                this.f106069e.setText(getContext().getString(2131841969));
            }
        }
        if (this.f106077n == 2) {
            this.f106070f.setVisibility(0);
            long j7 = this.f106074k;
            if (j7 != 0) {
                jf(new Date(j7 * 1000));
            }
        } else {
            this.f106070f.setVisibility(8);
        }
        lf();
        this.f106068d.post(new xx0.a(this));
        this.f106066b.setOnClickListener(this);
        this.f106067c.setOnClickListener(this);
        this.f106068d.setOnClickListener(this);
        this.f106070f.setOnClickListener(this);
        this.f106068d.addTextChangedListener(new xx0.c(this));
        this.f106068d.setOnKeyListener(new b(this));
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new xx0.d(this));
        }
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
