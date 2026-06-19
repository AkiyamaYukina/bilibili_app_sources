package com.bilibili.ogv.misc.sponsor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bilibili.ogv.misc.sponsor.BangumiFilterLayout;
import com.bilibili.ogv.misc.sponsor.BangumiSponsorRecommendFragment;
import com.bilibili.upper.module.contribute.picker.ui.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiFilterLayout.class */
public class BangumiFilterLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f69326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f69329d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiFilterLayout$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f69330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f69331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f69332c;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiFilterLayout$b.class */
    public interface b {
    }

    public BangumiFilterLayout(Context context) {
        super(context);
        this.f69326a = new ArrayList<>();
    }

    public BangumiFilterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69326a = new ArrayList<>();
    }

    public final void a() {
        for (int i7 = 0; i7 < this.f69327b; i7++) {
            View childAt = getChildAt(i7);
            TextView textView = (TextView) childAt.findViewById(2131301540);
            ImageView imageView = (ImageView) childAt.findViewById(2131296872);
            ImageView imageView2 = (ImageView) childAt.findViewById(2131296863);
            textView.setText(this.f69326a.get(i7).f69330a);
            if (this.f69326a.get(i7).f69332c) {
                this.f69328c = i7;
                textView.setSelected(true);
                imageView.setSelected(!this.f69326a.get(i7).f69331b);
                imageView2.setSelected(this.f69326a.get(i7).f69331b);
            } else {
                textView.setSelected(false);
                imageView.setSelected(false);
                imageView2.setSelected(false);
            }
        }
    }

    public void setFilterData(List<a> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalStateException("filterItems can not be NULL or EMPTY !");
        }
        this.f69326a.clear();
        this.f69326a.addAll(list);
        removeAllViews();
        this.f69327b = this.f69326a.size();
        for (int i7 = 0; i7 < this.f69327b; i7++) {
            View viewInflate = View.inflate(getContext(), 2131493126, null);
            final int i8 = i7;
            viewInflate.setOnClickListener(new View.OnClickListener(this, i8) { // from class: xk0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiFilterLayout f129274a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f129275b;

                {
                    this.f129274a = this;
                    this.f129275b = i8;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BangumiFilterLayout bangumiFilterLayout = this.f129274a;
                    int i9 = this.f129275b;
                    if (i9 == bangumiFilterLayout.f69328c) {
                        bangumiFilterLayout.f69326a.get(i9).f69331b = !bangumiFilterLayout.f69326a.get(i9).f69331b;
                    } else {
                        int i10 = 0;
                        while (i10 < bangumiFilterLayout.f69326a.size()) {
                            bangumiFilterLayout.f69326a.get(i10).f69332c = i9 == i10;
                            bangumiFilterLayout.f69326a.get(i10).f69331b = i9 == i10;
                            i10++;
                        }
                    }
                    bangumiFilterLayout.a();
                    w wVar = bangumiFilterLayout.f69329d;
                    if (wVar != null) {
                        boolean z6 = bangumiFilterLayout.f69326a.get(i9).f69331b;
                        BangumiSponsorRecommendFragment bangumiSponsorRecommendFragment = (BangumiSponsorRecommendFragment) wVar.a;
                        if (bangumiSponsorRecommendFragment.h) {
                            return;
                        }
                        bangumiSponsorRecommendFragment.f69357c.scrollToPositionWithOffset(0, 0);
                        com.bilibili.ogv.misc.sponsor.a aVar = bangumiSponsorRecommendFragment.f69356b;
                        ((ArrayList) aVar.f69385g).clear();
                        aVar.hideLoadMore();
                        bangumiSponsorRecommendFragment.f69359e = i9 + 1;
                        bangumiSponsorRecommendFragment.f69360f = !z6 ? 1 : 0;
                        bangumiSponsorRecommendFragment.f69362i = false;
                        bangumiSponsorRecommendFragment.mf(false);
                    }
                }
            });
            addView(viewInflate, i7, new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
        a();
    }

    public void setOnFilterItemClickListener(b bVar) {
        this.f69329d = bVar;
    }
}
