package com.bilibili.studio.videoeditor.widgets.confirmdialog;

import TB0.C2879k;
import TB0.C2880l;
import UR0.e0;
import UR0.f0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.bilibili.app.authorspace.ui.J1;
import nx0.d;
import nx0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/confirmdialog/BiliEditorConfirmDialog.class */
public final class BiliEditorConfirmDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f110423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f110424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f110425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f110426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f110427g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final b f110428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final d f110429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final c f110430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final e f110431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final lD0.a f110432m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/confirmdialog/BiliEditorConfirmDialog$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f110434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f110435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Integer f110436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Integer f110437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f110438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f110439g;

        @Nullable
        public b h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public d f110440i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public c f110441j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public e f110442k;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/confirmdialog/BiliEditorConfirmDialog$b.class */
    public interface b {
        void a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/confirmdialog/BiliEditorConfirmDialog$c.class */
    public interface c {
        void a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.studio.videoeditor.widgets.confirmdialog.BiliEditorConfirmDialog$a, java.lang.Object] */
    public BiliEditorConfirmDialog() {
        this(new Object());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lD0.a] */
    public BiliEditorConfirmDialog(@NotNull a aVar) {
        this.f110432m = new Object();
        this.f110423c = aVar.f110435c;
        this.f110424d = aVar.f110434b;
        this.f110425e = aVar.f110436d;
        this.f110426f = aVar.f110437e;
        this.f110428i = aVar.h;
        this.f110430k = aVar.f110441j;
        this.f110422b = aVar.f110433a;
        this.f110427g = aVar.f110438f;
        this.h = aVar.f110439g;
        this.f110429j = aVar.f110440i;
        this.f110431l = aVar.f110442k;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ConstraintLayout constraintLayout;
        lD0.a aVar = this.f110432m;
        int i7 = this.f110422b;
        aVar.getClass();
        if (i7 == 1) {
            C2880l c2880lInflate = C2880l.inflate(layoutInflater, viewGroup, false);
            aVar.a(c2880lInflate);
            constraintLayout = c2880lInflate.f23858a;
        } else {
            C2879k c2879kInflate = C2879k.inflate(layoutInflater, viewGroup, false);
            aVar.a(c2879kInflate);
            constraintLayout = c2879kInflate.f23846a;
        }
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        TextView textView;
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams layoutParamsA = J1.a(window, 0);
            layoutParamsA.dimAmount = 0.5f;
            window.setAttributes(layoutParamsA);
        }
        lD0.a aVar = this.f110432m;
        Integer num = this.f110423c;
        String str = this.f110424d;
        aVar.getClass();
        if (num != null) {
            int iIntValue = num.intValue();
            TextView textView2 = aVar.a;
            if (textView2 != null) {
                textView2.setText(iIntValue);
            }
        }
        if (str != null && (textView = aVar.a) != null) {
            textView.setText(str);
        }
        lD0.a aVar2 = this.f110432m;
        boolean z6 = this.f110427g;
        boolean z7 = this.h;
        if (z6) {
            AppCompatCheckBox appCompatCheckBox = aVar2.d;
            if (appCompatCheckBox != null) {
                appCompatCheckBox.setVisibility(0);
            }
        } else {
            AppCompatCheckBox appCompatCheckBox2 = aVar2.d;
            if (appCompatCheckBox2 != null) {
                appCompatCheckBox2.setVisibility(8);
            }
        }
        AppCompatCheckBox appCompatCheckBox3 = aVar2.d;
        if (appCompatCheckBox3 != null) {
            appCompatCheckBox3.setChecked(z7);
        }
        lD0.a aVar3 = this.f110432m;
        Integer num2 = this.f110425e;
        Integer num3 = this.f110426f;
        e0 e0Var = new e0(this, 5);
        f0 f0Var = new f0(this, 6);
        if (num2 != null) {
            aVar3.getClass();
            int iIntValue2 = num2.intValue();
            TextView textView3 = aVar3.b;
            if (textView3 != null) {
                textView3.setText(iIntValue2);
            }
        }
        if (num3 == null) {
            TextView textView4 = aVar3.c;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            TextView textView5 = aVar3.c;
            if (textView5 != null) {
                textView5.setText(num3.intValue());
            }
        }
        TextView textView6 = aVar3.b;
        if (textView6 != null) {
            textView6.setOnClickListener(new com.mall.ui.page.ip.story.adapter.b(1, e0Var, aVar3));
        }
        TextView textView7 = aVar3.c;
        if (textView7 != null) {
            textView7.setOnClickListener(new com.mall.ui.page.ip.story.adapter.c(1, f0Var, aVar3));
        }
    }
}
