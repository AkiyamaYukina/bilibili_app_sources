package com.bilibili.upper.module.partitionTag.partitionTopic.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import eJ0.C6931i;
import java.util.Iterator;
import sI0.AbstractC8579a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/RecommendTagGroup.class */
public class RecommendTagGroup extends AbstractC8579a<b, TextView> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/RecommendTagGroup$a.class */
    public static final class a extends b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/widget/RecommendTagGroup$b.class */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f113879b;

        public b(String str, boolean z6) {
            this.f113878a = str;
            this.f113879b = z6;
        }
    }

    public RecommendTagGroup(Context context) {
        super(context);
        int iDip2px = ScreenUtil.dip2px(getContext(), 10.0f);
        setVerticalInnerGap(iDip2px);
        setHorizontalInnerGap(iDip2px);
    }

    public RecommendTagGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int iDip2px = ScreenUtil.dip2px(getContext(), 10.0f);
        setVerticalInnerGap(iDip2px);
        setHorizontalInnerGap(iDip2px);
    }

    @Override // sI0.AbstractC8579a
    public final void a(View view, b bVar) {
        TextView textView = (TextView) view;
        b bVar2 = bVar;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!(bVar2 instanceof a)) {
            textView.setText(bVar2.f113878a);
            textView.setTextSize(2, 12.0f);
            textView.setMaxLines(1);
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (bVar2.f113879b) {
                textView.setTextColor(getResources().getColor(2131104252));
                textView.setBackgroundResource(2131241320);
            } else {
                textView.setTextColor(getResources().getColor(2131104273));
                textView.setBackgroundResource(2131241315);
            }
            textView.setHeight(C6931i.a(context, 30.0f));
            textView.setPadding(C6931i.a(context, 16.0f), 0, C6931i.a(context, 16.0f), 0);
            return;
        }
        textView.setText(2131851156);
        textView.setTextSize(2, 12.0f);
        textView.setMaxLines(1);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(getResources().getColor(2131104078));
        textView.setBackgroundResource(2131231857);
        if (MultipleThemeUtils.isNightTheme(context)) {
            ContextCompat.getDrawable(context, 2131235990);
        } else {
            ContextCompat.getDrawable(context, 2131235261);
        }
        Drawable drawable = ContextCompat.getDrawable(context, 2131235261);
        if (drawable != null) {
            textView.setCompoundDrawablePadding(C6931i.a(context, 2.0f));
            drawable.setBounds(0, 0, C6931i.a(context, 20.0f), C6931i.a(context, 20.0f));
            textView.setCompoundDrawables(drawable, null, null, null);
        }
        textView.setHeight(C6931i.a(context, 30.0f));
        textView.setPadding(C6931i.a(context, 12.0f), 0, C6931i.a(context, 14.0f), 0);
    }

    @Override // sI0.AbstractC8579a
    public final View b() {
        return new TintTextView(getContext());
    }

    public final void e(String str, boolean z6) {
        if (this.f127157a == null || TextUtils.isEmpty(str)) {
            return;
        }
        Iterator it = this.f127157a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b bVar = (b) it.next();
            if (bVar.f113878a.equals(str)) {
                bVar.f113879b = z6;
                break;
            }
        }
        d();
    }
}
