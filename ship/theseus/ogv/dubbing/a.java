package com.bilibili.ship.theseus.ogv.dubbing;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Job;
import sr0.C8620c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/a.class */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f91836b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f91835a = i7;
        this.f91836b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f91835a) {
            case 0:
                b bVar = (b) this.f91836b;
                bVar.f91842f.invoke(view.getContext());
                bVar.dismiss();
                break;
            case 1:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f91836b;
                Job job = (Job) objectRef.element;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                objectRef.element = null;
                break;
            default:
                C8620c c8620c = (C8620c) this.f91836b;
                if (!c8620c.f127372j) {
                    c8620c.f127364a.h(c8620c.h, c8620c.f127366c);
                } else {
                    View.OnClickListener onClickListener = c8620c.f127375m;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
                break;
        }
    }
}
