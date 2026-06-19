package com.bilibili.pegasus.holders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bF0.C5057v;
import com.bilibili.magicasakura.widgets.TintEditText;
import com.bilibili.pegasus.data.component.DescButtonData;
import com.bilibili.upper.module.manuscript.bean.AuditReason;
import gI0.C7251a;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import op0.C8249a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/A0.class */
public final /* synthetic */ class A0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f77508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.ViewHolder f77509c;

    public /* synthetic */ A0(int i7, RecyclerView.ViewHolder viewHolder, Object obj) {
        this.f77507a = i7;
        this.f77508b = obj;
        this.f77509c = viewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f77507a) {
            case 0:
                fp0.m mVar = (fp0.m) this.f77508b;
                LargeCoverV9Holder largeCoverV9Holder = (LargeCoverV9Holder) this.f77509c;
                DescButtonData descButton = mVar.getDescButton();
                String uri = descButton != null ? descButton.getUri() : null;
                if (uri == null || StringsKt.isBlank(uri)) {
                    C8249a.h(largeCoverV9Holder, largeCoverV9Holder, null, null, "0", null, false, false, false, false, null, 2038);
                } else {
                    C8249a.g(largeCoverV9Holder, mVar);
                }
                break;
            default:
                C7251a c7251a = (C7251a) this.f77508b;
                C7251a.c cVar = (C7251a.c) this.f77509c;
                C7251a.e eVar = (C7251a.e) CollectionsKt.getOrNull(c7251a.f119807b, cVar.getAbsoluteAdapterPosition());
                if (eVar != null) {
                    Ba.a aVar = c7251a.f119814j;
                    if (aVar != null) {
                        aVar.invoke(Boolean.FALSE);
                    }
                    boolean z6 = eVar.f119828b;
                    C5057v c5057v = cVar.f119817a;
                    if (z6) {
                        eJ0.H.a(2131851159, c5057v.f56217c.getContext());
                    } else {
                        c5057v.f56218d.setVisibility(0);
                        c5057v.f56235v.setVisibility(0);
                        eVar.f119827a = 2;
                        String str = cVar.f119823g;
                        TintEditText tintEditText = c5057v.f56217c;
                        tintEditText.setText(str);
                        tintEditText.setSelection(cVar.f119823g.length());
                        cVar.r0(false);
                    }
                    TE0.b bVar = TE0.b.f24088a;
                    long j7 = c7251a.f119812g;
                    AuditReason auditReason = cVar.f119820d;
                    long j8 = auditReason != null ? auditReason.f113566b : -1L;
                    int iP0 = cVar.p0();
                    bVar.getClass();
                    TE0.b.X(iP0, j7, j8);
                    break;
                }
                break;
        }
    }
}
