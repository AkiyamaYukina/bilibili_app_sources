package com.bilibili.upper.module.partitionTag.partitionTopic.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bilibili.droid.ScreenUtil;
import eJ0.C6931i;
import sI0.AbstractC8579a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/SelectedTagGroup.class */
public class SelectedTagGroup extends AbstractC8579a<a, RelativeLayout> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/SelectedTagGroup$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f113881b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f113882c;

        public a(String str) {
            this.f113880a = str;
        }

        public a(String str, boolean z6) {
            this.f113880a = str;
            this.f113882c = z6;
        }
    }

    public SelectedTagGroup(Context context) {
        super(context);
        int iDip2px = ScreenUtil.dip2px(getContext(), 10.0f);
        setVerticalInnerGap(iDip2px);
        setHorizontalInnerGap(iDip2px);
    }

    public SelectedTagGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int iDip2px = ScreenUtil.dip2px(getContext(), 10.0f);
        setVerticalInnerGap(iDip2px);
        setHorizontalInnerGap(iDip2px);
    }

    @Override // sI0.AbstractC8579a
    public final void a(View view, a aVar) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (aVar2.f113881b) {
            View viewFindViewById = relativeLayout.findViewById(2131308444);
            viewFindViewById.setVisibility(0);
            viewFindViewById.setSelected(true);
        }
        if (aVar2.f113882c) {
            relativeLayout.findViewById(2131304480).setVisibility(8);
        }
        ((TextView) relativeLayout.findViewById(2131298661)).setText(aVar2.f113880a);
    }

    @Override // sI0.AbstractC8579a
    public final View b() {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getContext()).inflate(2131500672, (ViewGroup) null);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, C6931i.a(getContext(), 30.0f)));
        return relativeLayout;
    }
}
