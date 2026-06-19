package com.bilibili.pegasus.holders;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/C0.class */
@StabilityInferred(parameters = 0)
public final class C0 extends C5670m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final aq0.O0 f77513k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/C0$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f77514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0 f77515b;

        public a(View view, C0 c02) {
            this.f77514a = view;
            this.f77515b = c02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            aq0.O0 o02 = this.f77515b.f77513k;
            TintTextView tintTextView = o02.f53796l;
            boolean z6 = true;
            if (o02.f53801q.getLineCount() != 1) {
                z6 = false;
            }
            tintTextView.setVisibility(ListExtentionsKt.toVisibility(z6));
        }
    }

    public C0(@NotNull aq0.O0 o02) {
        super(o02);
        this.f77513k = o02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull fp0.u uVar) {
        super.u0(uVar);
        aq0.O0 o02 = this.f77513k;
        o02.f53796l.setText(uVar.getSubtitle());
        o02.f53796l.setVisibility(8);
        View view = this.itemView;
        OneShotPreDrawListener.add(view, new a(view, this));
    }
}
