package com.bilibili.lib.ui.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/BottomDialogMenu.class */
public class BottomDialogMenu extends AlertDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<IFloatMenuItem> f64849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public OnCloseClickListener f64850b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/BottomDialogMenu$OnCloseClickListener.class */
    public interface OnCloseClickListener {
        void onCloseClick();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/BottomDialogMenu$a.class */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f64851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<IFloatMenuItem> f64852b = new ArrayList();

        public a(@NonNull Context context) {
            this.f64851a = context;
        }

        public final BottomDialogMenu a() {
            BottomDialogMenu bottomDialogMenu = new BottomDialogMenu(this.f64851a);
            ((ArrayList) bottomDialogMenu.f64849a).addAll(this.f64852b);
            return bottomDialogMenu;
        }
    }

    public BottomDialogMenu(@NonNull Context context) {
        super(context);
        this.f64849a = new ArrayList();
    }

    public BottomDialogMenu(@NonNull Context context, int i7) {
        super(context, i7);
        this.f64849a = new ArrayList();
    }

    public BottomDialogMenu(@NonNull Context context, boolean z6, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z6, onCancelListener);
        this.f64849a = new ArrayList();
    }

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131494518);
        View viewFindViewById = findViewById(2131298371);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new com.bilibili.lib.ui.menu.a(this));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(2131304620);
        if (linearLayout != null) {
            for (int i7 = 0; i7 < ((ArrayList) this.f64849a).size(); i7++) {
                IFloatMenuItem iFloatMenuItem = (IFloatMenuItem) ((ArrayList) this.f64849a).get(i7);
                View view = iFloatMenuItem.getView(null, linearLayout);
                if (i7 <= 0 || i7 >= ((ArrayList) this.f64849a).size()) {
                    iFloatMenuItem.toggleDivider(8);
                } else {
                    iFloatMenuItem.toggleDivider(0);
                }
                linearLayout.addView(view, i7);
                iFloatMenuItem.onBindDialog(this);
            }
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setWindowAnimations(2131888141);
        }
    }

    public void setOnCloseClickListener(OnCloseClickListener onCloseClickListener) {
        this.f64850b = onCloseClickListener;
    }
}
