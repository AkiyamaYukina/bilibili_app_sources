package com.bilibili.pegasus.holders;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.C3337p;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qp0.C8476b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/L0.class */
@StabilityInferred(parameters = 0)
public final class L0 extends AbstractC5652d<fp0.s> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final aq0.J0 f77534f;

    public L0(@NotNull aq0.J0 j02) {
        super(j02.f53724a);
        this.f77534f = j02;
        j02.f53727d.setOnClickListener(new Ns.r(this, 1));
        j02.f53725b.setOnClickListener(new Ns.s(this, 3));
        j02.f53726c.setOnClickListener(new Vc.a(this, 2));
        boolean zCurrentIsSingleColumn = PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE);
        ConstraintLayout constraintLayout = j02.f53729f;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), zCurrentIsSingleColumn ? ListExtentionsKt.toPx(8.0f) : 0, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
    }

    public final void A0(View view) {
        if (Lh.n.f()) {
            fp0.s sVar = (fp0.s) getBindData();
            if (sVar == null) {
                return;
            }
            notifyItemRemove(sVar);
            return;
        }
        if (!C3337p.c(view)) {
            Context context = view.getContext();
            Lazy lazy = C8476b.f126257a;
            sg.s.b(context, "activity://main/login/");
        } else {
            fp0.s sVar2 = (fp0.s) getBindData();
            if (sVar2 != null) {
                notifyItemRemove(sVar2);
            }
            Lh.n.i(2);
            PromoToast.showMidToast(view.getContext(), 2131845109);
        }
    }

    public final void y0(View view) {
        fp0.s sVar = (fp0.s) getBindData();
        if (sVar != null) {
            notifyItemRemove(sVar);
        }
        if (Lh.n.f() || !C3337p.c(view)) {
            return;
        }
        PromoToast.showMidToast(view.getContext(), 2131845372);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final void u0(@NotNull fp0.s sVar) {
        aq0.J0 j02 = this.f77534f;
        j02.f53730g.setText(sVar.getTitle());
        j02.f53728e.setText(sVar.f());
        TintTextView tintTextView = j02.f53725b;
        fp0.n nVarG = sVar.g();
        tintTextView.setText(nVarG != null ? nVarG.b() : null);
        TintTextView tintTextView2 = j02.f53726c;
        fp0.r rVarH = sVar.h();
        String strB = null;
        if (rVarH != null) {
            strB = rVarH.b();
        }
        tintTextView2.setText(strB);
    }
}
