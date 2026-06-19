package com.bilibili.opd.app.bizcommon.ui.widget;

import AT0.c;
import Pb.F;
import Pb.G;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.n;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import j5.C7642d;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/widget/MallDialog.class */
public class MallDialog implements View.OnClickListener {
    public static final int BUTTON_CLOSE = 0;
    public static final int BUTTON_NOT_OK = 2;
    public static final int BUTTON_OK = 1;
    public static final int BUTTON_ONE = 1;
    public static final int BUTTON_TWO = 2;
    public static final int CONTENT_ONE_STYLE_BUTTON = 2;
    public static final int CONTENT_TWO_STYLE_LEFT_BUTTON = 0;
    public static final int CONTENT_TWO_STYLE_RIGHT_BUTTON = 1;
    public static final int CONTETNT_STYLE_1 = 1;
    public static final int CONTETNT_STYLE_2 = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f74651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f74652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f74653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f74654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f74655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f74656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f74657g;
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f74658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Dialog f74659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DialogOkClickListener f74660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WeakReference<Context> f74661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f74662m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/widget/MallDialog$DialogOkClickListener.class */
    public interface DialogOkClickListener {
        void onDialogClick(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/widget/MallDialog$a.class */
    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Spanned f74664b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f74666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String[] f74667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f74668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f74669g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74663a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74665c = 1;

        public a(Context context) {
            this.f74666d = context;
        }

        public final MallDialog a() {
            return new MallDialog(this, this.f74666d);
        }
    }

    public MallDialog(Context context) {
        this.f74661l = new WeakReference<>(context);
        a();
    }

    public MallDialog(a aVar, Context context) {
        this.f74661l = new WeakReference<>(context);
        this.f74662m = aVar;
        a();
    }

    public final void a() {
        if (this.f74661l.get() == null) {
            return;
        }
        this.f74659j = new Dialog(this.f74661l.get(), 2131887052);
        this.f74651a = LayoutInflater.from(this.f74661l.get()).inflate(2131498703, (ViewGroup) null);
        if (this.f74659j.getWindow() != null) {
            C7642d.a(this.f74659j.getWindow(), 0);
            this.f74659j.getWindow().setGravity(17);
        }
        this.f74659j.setContentView(this.f74651a);
        this.f74652b = (TextView) this.f74651a.findViewById(2131300062);
        this.f74654d = (TextView) this.f74651a.findViewById(2131300121);
        this.f74653c = (ViewGroup) this.f74651a.findViewById(2131307624);
        TextView textView = (TextView) this.f74651a.findViewById(2131299907);
        this.f74655e = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) this.f74651a.findViewById(2131299927);
        this.f74656f = textView2;
        textView2.setOnClickListener(this);
        View viewFindViewById = this.f74651a.findViewById(2131300123);
        this.h = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        this.f74658i = this.f74651a.findViewById(2131300129);
        this.f74657g = (TextView) this.f74651a.findViewById(2131307876);
    }

    public void dismiss() {
        Dialog dialog = this.f74659j;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        Dialog dialog2 = this.f74659j;
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new c(8));
            }
        }
        dialog2.dismiss();
    }

    public TextView getSubMsgView() {
        return this.f74654d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f74655e) {
            DialogOkClickListener dialogOkClickListener = this.f74660k;
            if (dialogOkClickListener != null) {
                dialogOkClickListener.onDialogClick(0);
            }
            dismiss();
            return;
        }
        if (view == this.f74656f) {
            DialogOkClickListener dialogOkClickListener2 = this.f74660k;
            if (dialogOkClickListener2 != null) {
                dialogOkClickListener2.onDialogClick(1);
            }
            dismiss();
            return;
        }
        if (view == this.h) {
            DialogOkClickListener dialogOkClickListener3 = this.f74660k;
            if (dialogOkClickListener3 != null) {
                dialogOkClickListener3.onDialogClick(2);
            }
            dismiss();
        }
    }

    public void setCanceledOnTouchOutside(boolean z6) {
        Dialog dialog = this.f74659j;
        if (dialog != null) {
            dialog.setCancelable(z6);
            this.f74659j.setCanceledOnTouchOutside(z6);
        }
    }

    public void setDialogClickListener(DialogOkClickListener dialogOkClickListener) {
        this.f74660k = dialogOkClickListener;
    }

    public void setMsg(String str) {
        TextView textView = this.f74652b;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    public void setMsgVisibility(int i7) {
        TextView textView = this.f74652b;
        if (textView != null) {
            textView.setVisibility(i7);
        }
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f74659j.setOnCancelListener(onCancelListener);
    }

    public void setOneBtnText(String str) {
        TextView textView = this.f74657g;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    public void setSubMsg(Spanned spanned) {
        TextView textView = this.f74654d;
        if (textView == null || spanned == null) {
            return;
        }
        textView.setVisibility(0);
        this.f74654d.setText(spanned);
    }

    public void setSubMsg(String str) {
        TextView textView = this.f74654d;
        if (textView == null || str == null) {
            return;
        }
        textView.setVisibility(0);
        this.f74654d.setText(str);
    }

    public void setSubMsgClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.f74654d;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setTwoBtnText(String str, String str2) {
        TextView textView = this.f74656f;
        if (textView != null && str != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f74655e;
        if (textView2 == null || str2 == null) {
            return;
        }
        textView2.setText(str2);
    }

    public void show() {
        Dialog dialog;
        a aVar = this.f74662m;
        if (aVar == null) {
            return;
        }
        if (aVar.f74665c == 2) {
            this.f74658i.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.f74658i.setVisibility(8);
            TextView textView = this.f74657g;
            if (textView != null) {
                this.f74662m.getClass();
                textView.setBackgroundResource(2131237518);
            }
        }
        a aVar2 = this.f74662m;
        String[] strArr = aVar2.f74667e;
        if (strArr != null) {
            if (aVar2.f74663a == 2 && strArr.length > 1) {
                this.f74652b.setText(strArr[0]);
                this.f74654d.setText(this.f74662m.f74667e[1]);
                this.f74654d.setVisibility(0);
            } else if (strArr.length == 1) {
                this.f74654d.setVisibility(8);
                this.f74652b.setText(this.f74662m.f74667e[0]);
            }
        }
        Spanned spanned = this.f74662m.f74664b;
        if (spanned != null) {
            this.f74654d.setText(spanned);
            this.f74654d.setVisibility(0);
        }
        this.f74662m.getClass();
        if (this.f74655e != null && !TextUtils.isEmpty(this.f74662m.f74668f)) {
            this.f74655e.setText(this.f74662m.f74668f);
        }
        if (this.f74656f != null && !TextUtils.isEmpty(this.f74662m.f74669g)) {
            this.f74656f.setText(this.f74662m.f74669g);
        }
        if (this.f74661l.get() == null || (dialog = this.f74659j) == null || dialog.isShowing()) {
            return;
        }
        try {
            this.f74659j.show();
        } catch (Exception e7) {
        }
    }

    public void show(int i7) {
        Dialog dialog;
        if (i7 == 2) {
            this.f74658i.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.f74658i.setVisibility(8);
        }
        if (this.f74661l.get() == null || (dialog = this.f74659j) == null || dialog.isShowing()) {
            return;
        }
        try {
            this.f74659j.show();
        } catch (Exception e7) {
        }
    }

    public void updateDialogStyle() {
        if (this.f74661l.get() != null) {
            Context context = this.f74661l.get();
            this.f74654d.setTextColor(ThemeUtils.getColorById(context, R$color.Text2));
            this.f74656f.setTextColor(ThemeUtils.getColorById(context, R$color.Pi5));
            this.f74655e.setTextColor(ThemeUtils.getColorById(context, R$color.Text1));
        }
    }
}
