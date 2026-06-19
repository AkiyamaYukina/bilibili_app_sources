package com.bilibili.pegasus.holders;

import android.view.View;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.playset.editor.PlaySetImagePickFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/T.class */
public final /* synthetic */ class T implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f77630b;

    public /* synthetic */ T(Object obj, int i7) {
        this.f77629a = i7;
        this.f77630b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f77629a) {
            case 0:
                LargeCoverSingleV9Holder largeCoverSingleV9Holder = (LargeCoverSingleV9Holder) this.f77630b;
                rp0.p.c(largeCoverSingleV9Holder, false, ListExtentionsKt.getGlobalRect(largeCoverSingleV9Holder.f77547k.f53690f.f53767i));
                break;
            default:
                ((PlaySetImagePickFragment) this.f77630b).dismissAllowingStateLoss();
                break;
        }
    }
}
