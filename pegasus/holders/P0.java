package com.bilibili.pegasus.holders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.compat.PegasusCoverStyle;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/P0.class */
@StabilityInferred(parameters = 0)
public final class P0 extends AbstractC5652d<fp0.t> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final aq0.N0 f77617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TintFixedLineSpacingTextView f77618g;

    @NotNull
    public final TintTextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TintTextView f77619i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/P0$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f77620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final P0 f77621b;

        public a(View view, P0 p02) {
            this.f77620a = view;
            this.f77621b = p02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            aq0.N0 n02 = this.f77621b.f77617f;
            TintTextView tintTextView = n02.f53781m;
            boolean z6 = true;
            if (n02.f53782n.getLineCount() != 1) {
                z6 = false;
            }
            tintTextView.setVisibility(ListExtentionsKt.toVisibility(z6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P0(@NotNull aq0.N0 n02) {
        super(n02.f53770a);
        this.f77617f = n02;
        n02.f53773d.setAspectRatio(PegasusCoverStyle.INSTANCE.getCoverRatio());
        this.itemView.setOnClickListener(new ae.b(this, 3));
        this.itemView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.O0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final P0 f77615a;

            {
                this.f77615a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                P0 p02 = this.f77615a;
                rp0.p.c(p02, true, ListExtentionsKt.getGlobalRect(p02.f77617f.f53779k));
                return true;
            }
        });
        n02.f53779k.setOnClickListener(new Nt.e(this, 4));
        this.f77618g = n02.f53782n;
        this.h = n02.f53775f;
        this.f77619i = n02.f53776g;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView q0() {
        return this.h;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView s0() {
        return this.f77619i;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView t0() {
        return this.f77618g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d4  */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(@org.jetbrains.annotations.NotNull final fp0.t r15) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.P0.u0(fp0.t):void");
    }
}
