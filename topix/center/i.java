package com.bilibili.topix.center;

import NI0.a;
import PD0.C2771m;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bplus.followingcard.helper.PageStatus;
import com.bilibili.bplus.followingcard.helper.W;
import com.bilibili.bplus.followingcard.helper.X;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.upper.module.template.fragment.TemplateDetailFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/i.class */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112423b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f112422a = i7;
        this.f112423b = obj;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f112423b;
        switch (this.f112422a) {
            case 0:
                Ih.d dVar = (Ih.d) obj;
                boolean z6 = dVar.b.a;
                TopixCenterFragment topixCenterFragment = (TopixCenterFragment) obj2;
                Object obj3 = dVar.a;
                if (z6) {
                    C6667e c6667e = (C6667e) topixCenterFragment.f112373d.getValue();
                    List list = (List) obj3;
                    ((ArrayList) c6667e.f112417b).clear();
                    if (list != null) {
                        ((ArrayList) c6667e.f112417b).addAll(list);
                    }
                    c6667e.notifyDataSetChanged();
                    C2771m c2771m = topixCenterFragment.f112372c;
                    if (c2771m != null) {
                        PageStatus pageStatusB = X.b(dVar.b, list);
                        W res = pageStatusB.getRes();
                        PageStatus pageStatus = PageStatus.ERROR;
                        CharSequence text = null;
                        if (pageStatusB == pageStatus || pageStatusB == PageStatus.ERROR_NET) {
                            res = new W((String) null, 2131232152, 2131854486);
                        }
                        c2771m.f18767d.setVisibility(ArraysKt.contains(new PageStatus[]{PageStatus.LIST, PageStatus.LIST_ERROR_NET}, pageStatusB) ? 0 : 8);
                        LinearLayout linearLayout = c2771m.f18766c;
                        PageStatus pageStatus2 = PageStatus.EMPTY;
                        PageStatus pageStatus3 = PageStatus.LOADING;
                        PageStatus pageStatus4 = PageStatus.ERROR_NET;
                        boolean zContains = ArraysKt.contains(new PageStatus[]{pageStatus2, pageStatus3, pageStatus, pageStatus4}, pageStatusB);
                        linearLayout.setVisibility(zContains ? 0 : 8);
                        if (zContains) {
                            Integer num = res.c;
                            if (num != null) {
                                text = linearLayout.getResources().getText(num.intValue());
                            }
                            c2771m.h.setText(text);
                            BiliImageView biliImageView = c2771m.f18770g;
                            int i7 = res.b;
                            if (i7 != 0) {
                                biliImageView.setImageResource(i7);
                            } else {
                                String str = res.a;
                                if (str == null || !(!StringsKt.isBlank(str))) {
                                    ListExtentionsKt.gone(biliImageView);
                                } else {
                                    ImageExtentionKt.displayImage$default(biliImageView, AppResUtil.getImageUrl(str), (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                                }
                            }
                        }
                        int i8 = 0;
                        if (pageStatusB != pageStatus) {
                            i8 = pageStatusB == pageStatus4 ? 0 : 8;
                        }
                        c2771m.f18768e.setVisibility(i8);
                    }
                } else {
                    C6667e c6667e2 = (C6667e) topixCenterFragment.f112373d.getValue();
                    List list2 = (List) obj3;
                    c6667e2.getClass();
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new f(c6667e2, list2));
                    ((ArrayList) c6667e2.f112417b).clear();
                    if (list2 != null) {
                        ((ArrayList) c6667e2.f112417b).addAll(list2);
                    }
                    diffResultCalculateDiff.dispatchUpdatesTo(c6667e2);
                }
                bY.c<RecyclerView> cVar = topixCenterFragment.f112375f;
                if (cVar != null) {
                    cVar.d();
                }
                bY.c<RecyclerView> cVar2 = topixCenterFragment.f112375f;
                if (cVar2 != null) {
                    cVar2.i();
                }
                break;
            case 1:
                TemplateDetailFragment templateDetailFragment = (TemplateDetailFragment) obj2;
                if (templateDetailFragment.nf().I0() > 0) {
                    Map<Long, a.b> map = NI0.a.f17097a;
                    NI0.a.b(templateDetailFragment.nf().I0(), templateDetailFragment);
                }
                break;
            case 2:
                ((Boolean) obj).getClass();
                v9.e eVar = (v9.e) obj2;
                View view = ((j8.b) eVar).a;
                OneShotPreDrawListener.add(view, new v9.d(view, eVar));
                break;
            default:
                ((wp0.i) obj2).D0(false);
                break;
        }
        return Unit.INSTANCE;
    }
}
