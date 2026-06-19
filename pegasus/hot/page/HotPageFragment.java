package com.bilibili.pegasus.hot.page;

import Bp0.k;
import O4.b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.api.BiliApiException;
import com.bilibili.bplus.following.event.ui.list.EventTopicListFragment;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pegasus.api.modelv2.PegasusHotFeedResponse;
import com.bilibili.pegasus.hot.base.BaseHotFragment;
import com.bilibili.pegasus.hot.page.HotPageFragment;
import com.bilibili.pegasus.promo.BasePromoFragment;
import com.bilibili.pegasus.utils.D;
import com.bilibili.spmid.SPMID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/page/HotPageFragment.class */
@StabilityInferred(parameters = 0)
public final class HotPageFragment extends BaseHotFragment {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f78150R = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f78151O = 42;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public k f78152P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public String f78153Q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/page/HotPageFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f78154a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f78154a = iArr;
        }
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment
    public final boolean Nf() {
        return !activityDie();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.spmid.SPMTrackNodeWrapper
    @Nullable
    public final Pair<SPMID, HashMap<String, String>> fillTrackParams() {
        HashMap mapC = b.c("page_type", "notab");
        String str = this.f78153Q;
        if (str != null) {
            mapC.put("scm_id", str);
        }
        return new Pair<>(new SPMID("hot-chart", SPMID.Segment.Second), mapC);
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment
    public final int of() {
        return this.f78151O;
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment, androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131495255, viewGroup, false);
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment, com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        MutableLiveData<Resource<PegasusHotFeedResponse>> mutableLiveDataI0;
        super.onViewCreated(view, bundle);
        if (this.f78152P == null) {
            FragmentActivity fragmentActivityP3 = p3();
            if (fragmentActivityP3 != null) {
                this.f78152P = (k) R0.k.a(fragmentActivityP3, k.class);
            }
            k kVar = this.f78152P;
            if (kVar != null && (mutableLiveDataI0 = kVar.I0(this.f78124M)) != null) {
                final int i7 = 0;
                mutableLiveDataI0.observe(this, new Observer(this, i7) { // from class: Bp0.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f857a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final BaseFragment f858b;

                    {
                        this.f857a = i7;
                        this.f858b = this;
                    }

                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        int i8;
                        ArrayList arrayList;
                        List listSubList;
                        EventTopicListFragment eventTopicListFragment = this.f858b;
                        switch (this.f857a) {
                            case 0:
                                Resource resource = (Resource) obj;
                                int i9 = HotPageFragment.f78150R;
                                Status status = resource != null ? resource.getStatus() : null;
                                i8 = status != null ? HotPageFragment.a.f78154a[status.ordinal()] : -1;
                                HotPageFragment hotPageFragment = (HotPageFragment) eventTopicListFragment;
                                if (i8 == 1) {
                                    PegasusHotFeedResponse pegasusHotFeedResponse = (PegasusHotFeedResponse) resource.getData();
                                    boolean z6 = pegasusHotFeedResponse != null ? pegasusHotFeedResponse.isRefresh : false;
                                    hotPageFragment.f78489r = 0;
                                    if (pegasusHotFeedResponse == null || (arrayList = pegasusHotFeedResponse.items) == null || arrayList.isEmpty()) {
                                        hotPageFragment.Jf();
                                    } else {
                                        if (z6) {
                                            hotPageFragment.Lf(pegasusHotFeedResponse);
                                            hotPageFragment.f78153Q = D.b();
                                        } else {
                                            PegasusHotFeedResponse pegasusHotFeedResponse2 = new PegasusHotFeedResponse();
                                            pegasusHotFeedResponse2.config = pegasusHotFeedResponse.config;
                                            pegasusHotFeedResponse2.feedVer = pegasusHotFeedResponse.feedVer;
                                            ArrayList arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = pegasusHotFeedResponse.items;
                                            int size = arrayList3 != null ? arrayList3.size() : 0;
                                            if (((ArrayList) hotPageFragment.f78488q).size() <= size) {
                                                ArrayList arrayList4 = pegasusHotFeedResponse.items;
                                                arrayList2.addAll((arrayList4 == null || (listSubList = arrayList4.subList(((ArrayList) hotPageFragment.f78488q).size(), size)) == null) ? CollectionsKt.emptyList() : listSubList);
                                            }
                                            pegasusHotFeedResponse2.items = arrayList2;
                                            hotPageFragment.Mf(pegasusHotFeedResponse2);
                                        }
                                        hotPageFragment.f78120I = pegasusHotFeedResponse.config;
                                    }
                                    break;
                                } else if (i8 == 2) {
                                    if (hotPageFragment.nf().c() == 0) {
                                        String imageUrl = AppResUtil.getImageUrl("img_holder_loading_style1.webp");
                                        com.bilibili.app.comm.list.common.widget.a aVar = hotPageFragment.f78495x;
                                        KProperty<Object>[] kPropertyArr = BasePromoFragment.f78481F;
                                        KProperty<Object> kProperty = kPropertyArr[3];
                                        BiliImageView biliImageView = (BiliImageView) aVar.b;
                                        if (biliImageView != null) {
                                            ImageExtentionKt.displayImage$default(biliImageView, imageUrl, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                                        }
                                        com.bilibili.app.comm.list.common.widget.a aVar2 = hotPageFragment.f78494w;
                                        KProperty<Object> kProperty2 = kPropertyArr[2];
                                        TextView textView = (TextView) aVar2.b;
                                        if (textView != null) {
                                            textView.setText(2131845785);
                                        }
                                        View viewWf = hotPageFragment.wf();
                                        if (viewWf != null) {
                                            viewWf.setVisibility(0);
                                        }
                                    }
                                    break;
                                } else if (i8 == 3) {
                                    BiliApiException error = resource.getError();
                                    if ((error instanceof BiliApiException) && error.mCode == 78000) {
                                        hotPageFragment.Jf();
                                    } else {
                                        hotPageFragment.Kf();
                                    }
                                    break;
                                }
                                break;
                            default:
                                Resource resource2 = (Resource) obj;
                                Status status2 = resource2.getStatus();
                                i8 = status2 != null ? EventTopicListFragment.a.a[status2.ordinal()] : -1;
                                EventTopicListFragment eventTopicListFragment2 = eventTopicListFragment;
                                if (i8 == 1) {
                                    eventTopicListFragment2.jg(true);
                                    eventTopicListFragment2.hg((Throwable) null);
                                    break;
                                } else if (i8 == 2) {
                                    eventTopicListFragment2.jg(false);
                                    eventTopicListFragment2.hg(resource2.getError());
                                    eventTopicListFragment2.Ge(false);
                                    break;
                                } else if (i8 == 3) {
                                    eventTopicListFragment2.jg(false);
                                    eventTopicListFragment2.hg((Throwable) null);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        k kVar2 = this.f78152P;
        boolean z6 = false;
        if (kVar2 != null) {
            Resource<PegasusHotFeedResponse> value = kVar2.I0(this.f78124M).getValue();
            z6 = false;
            if ((value != null ? value.getStatus() : null) == Status.SUCCESS) {
                PegasusHotFeedResponse pegasusHotFeedResponse = (PegasusHotFeedResponse) value.getData();
                z6 = false;
                if (pegasusHotFeedResponse != null) {
                    ArrayList arrayList = pegasusHotFeedResponse.items;
                    z6 = false;
                    if (arrayList != null) {
                        z6 = false;
                        if (!arrayList.isEmpty()) {
                            z6 = true;
                        }
                    }
                }
            }
        }
        this.f78119H = z6;
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            D.a(mRecyclerView, TuplesKt.to(new SPMID("feed", SPMID.Segment.Third), (Object) null));
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void zf() {
        k kVar = this.f78152P;
        if (kVar != null) {
            kVar.J0(this.f78124M, this.f78489r, Op0.b.a(this.f78151O, 0), this.f78487p);
        }
    }
}
