package com.bilibili.ogv.misc.timeline;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import tv.danmaku.bili.widget.BaseDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/c.class */
public class c extends BaseDialog<c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f69441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnClickListener f69442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnClickListener f69443g;
    public TextView h;

    public c(Context context) {
        super(context);
    }

    public final View onCreateView() {
        View viewInflate = View.inflate(((BaseDialog) this).mContext, 2131493119, null);
        TextView textView = (TextView) viewInflate.findViewById(2131298076);
        TextView textView2 = (TextView) viewInflate.findViewById(2131298124);
        this.h = (TextView) viewInflate.findViewById(2131307623);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ogv.misc.timeline.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f69440a;

            {
                this.f69440a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c cVar = this.f69440a;
                View.OnClickListener onClickListener = cVar.f69443g;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                } else {
                    cVar.dismiss();
                }
            }
        });
        textView2.setOnClickListener(new H60.m(this, 2));
        return viewInflate;
    }

    public final void setUiBeforeShow() {
        this.h.setText(this.f69441e);
    }
}
