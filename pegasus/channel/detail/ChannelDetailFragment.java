package com.bilibili.pegasus.channel.detail;

import Nn0.k;
import Os.f;
import Qp0.c;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.model.ChannelDataItem;
import com.bilibili.pegasus.api.model.PullDownTipsItem;
import com.bilibili.pegasus.api.modelv2.ChannelFeedV2;
import com.bilibili.pegasus.api.modelv2.TopStickItem;
import com.bilibili.pegasus.card.base.C;
import com.bilibili.pegasus.card.base.F;
import com.bilibili.pegasus.card.f0;
import com.bilibili.pegasus.channel.detail.ChannelDetailFragment;
import com.bilibili.pegasus.promo.BasePromoFragment;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pvtracker.IPvTracker;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelDetailFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelDetailFragment extends BasePromoFragment implements ThemeWatcher.Observer, Mn0.b, IPvTracker {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public ChannelDataItem f74885H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public String f74886I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public TopStickItem f74887J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f74888K;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public Fh.a f74895R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f74897T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f74898U;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final KProperty<Object>[] f74883Y = {new MutablePropertyReference1Impl(ChannelDetailFragment.class, "publishButton", "getPublishButton()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public static final a f74882X = new Object();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f74884G = 3;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f74889L = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f74890M = 1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f74891N = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f74892O = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f74893P = new com.bilibili.app.comm.list.common.widget.a(jf());

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final String f74894Q = "traffic.channel-detail.0.0.pv";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public String f74896S = "";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final b f74899V = new b(this);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @NotNull
    public String f74900W = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelDetailFragment$a.class */
    public static final class a {
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        public static void a(@NotNull Context context, @NotNull String... strArr) {
            if (!BiliAccounts.get(context).isLogin()) {
                c.b(context);
                return;
            }
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            Pattern pattern = c.f20125a;
            if (context != null) {
                Uri.Builder builderBuildUpon = Uri.parse("bilibili://uper/user_center/archive_entrance/").buildUpon();
                String strF = ArraysKt.F(strArr2, ",", (CharSequence) null, (CharSequence) null, (Function1) new Object(), 30);
                builderBuildUpon.appendQueryParameter("tags", strF);
                builderBuildUpon.appendQueryParameter("topics", strF);
                c.d(context, builderBuildUpon.build(), null, null, null, null, 0, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_RESULT_BLUR);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelDetailFragment$b.class */
    public static final class b extends BiliApiDataCallback<ChannelFeedV2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChannelDetailFragment f74901b;

        public b(ChannelDetailFragment channelDetailFragment) {
            this.f74901b = channelDetailFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            ChannelDetailFragment channelDetailFragment = this.f74901b;
            boolean z6 = channelDetailFragment.isDetached() || channelDetailFragment.activityDie();
            if (z6) {
                channelDetailFragment.f78457c = false;
            }
            return z6;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(ChannelFeedV2 channelFeedV2) {
            boolean z6;
            int size;
            ChannelFeedV2 channelFeedV22 = channelFeedV2;
            a aVar = ChannelDetailFragment.f74882X;
            ChannelDetailFragment channelDetailFragment = this.f74901b;
            channelDetailFragment.f78489r = 0;
            channelDetailFragment.f78457c = false;
            channelDetailFragment.setRefreshCompleted();
            View viewWf = channelDetailFragment.wf();
            if (viewWf != null) {
                viewWf.setVisibility(8);
            }
            List<BasicIndexItem> list = channelFeedV22 != null ? channelFeedV22.feedList : null;
            if (list == null || list.isEmpty()) {
                if (!channelDetailFragment.f78487p) {
                    PromoToast.showBottomToast(channelDetailFragment.p3(), 2131841349);
                } else if (channelDetailFragment.nf().c() == 0) {
                    channelDetailFragment.Ff(2131232151, 2131845371);
                } else {
                    PromoToast.showTopToast(channelDetailFragment.p3(), 2131841349);
                }
                channelDetailFragment.f74888K = false;
                return;
            }
            for (BasicIndexItem basicIndexItem : list) {
                ChannelDataItem channelDataItem = channelDetailFragment.f74885H;
                basicIndexItem.channelId = x.u(channelDataItem != null ? Long.valueOf(channelDataItem.a) : null);
            }
            if (!channelDetailFragment.f78487p) {
                channelDetailFragment.f74888K = false;
                List<BasicIndexItem> list2 = channelFeedV22.feedList;
                if (list2 != null && channelDetailFragment.nf().c() < 500) {
                    int size2 = (((ArrayList) channelDetailFragment.f78488q).size() + list2.size()) - BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE;
                    if (size2 >= 0) {
                        list2.subList(list2.size() - size2, list2.size()).clear();
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int iC = channelDetailFragment.mf().f10355b.c();
                    int iLf = channelDetailFragment.lf(list2);
                    ((ArrayList) channelDetailFragment.f78488q).addAll(list2);
                    int i7 = iLf;
                    if (z6) {
                        if (channelDetailFragment.f78496y == null) {
                            BasicIndexItem basicIndexItem2 = new BasicIndexItem();
                            basicIndexItem2.cardType = "footer_empty";
                            List list3 = C.a;
                            basicIndexItem2.setViewType(-318259799);
                            channelDetailFragment.f78496y = channelDetailFragment.nf().a(basicIndexItem2, channelDetailFragment);
                        }
                        com.bilibili.pegasus.card.base.a<?, ?> aVar2 = channelDetailFragment.f78496y;
                        if ((aVar2 != null ? aVar2.a() : null) != null) {
                            ((ArrayList) channelDetailFragment.f78488q).add(channelDetailFragment.f78496y.a());
                        }
                        F fNf = channelDetailFragment.nf();
                        com.bilibili.pegasus.card.base.a<?, ?> aVar3 = channelDetailFragment.f78496y;
                        if (aVar3 == null) {
                            fNf.getClass();
                        } else {
                            ((ArrayList) fNf.a).add(aVar3);
                        }
                        channelDetailFragment.f78458d = false;
                        i7 = iLf + 1;
                    }
                    channelDetailFragment.mf().notifyItemRangeInserted(iC, i7);
                    return;
                }
                return;
            }
            if (channelDetailFragment.f74887J == null) {
                channelDetailFragment.f74887J = channelFeedV22.topStick;
            }
            List<BasicIndexItem> list4 = channelFeedV22.feedList;
            if (list4 == null) {
                return;
            }
            int size3 = list4.size();
            if (channelDetailFragment.f74888K) {
                ((ArrayList) channelDetailFragment.f78488q).clear();
                size = 0;
            } else {
                size = (((ArrayList) channelDetailFragment.f78488q).size() + size3) - 100;
            }
            if (size > 0) {
                int size4 = ((ArrayList) channelDetailFragment.f78488q).size() - size;
                int i8 = size4;
                if (size4 < 0) {
                    i8 = 0;
                }
                ((ArrayList) channelDetailFragment.f78488q).subList(i8, ((ArrayList) channelDetailFragment.f78488q).size()).clear();
            }
            channelDetailFragment.uf();
            TopStickItem topStickItem = channelDetailFragment.f74887J;
            if (topStickItem != null) {
                ChannelDataItem channelDataItem2 = channelDetailFragment.f74885H;
                ((BasicIndexItem) topStickItem).channelId = x.u(channelDataItem2 != null ? Long.valueOf(channelDataItem2.a) : null);
                f0 f0VarA = channelDetailFragment.nf().a(channelDetailFragment.f74887J, channelDetailFragment);
                F fNf2 = channelDetailFragment.nf();
                if (f0VarA == null) {
                    fNf2.getClass();
                } else {
                    ((ArrayList) fNf2.a).add(f0VarA);
                }
            }
            channelDetailFragment.lf(list4);
            if (!((ArrayList) channelDetailFragment.f78488q).isEmpty()) {
                if (Intrinsics.areEqual(((BasicIndexItem) ((ArrayList) channelDetailFragment.f78488q).get(0)).goTo, "topstick")) {
                    ((ArrayList) channelDetailFragment.f78488q).remove(0);
                }
                if (!channelDetailFragment.f74888K) {
                    PullDownTipsItem pullDownTipsItem = channelDetailFragment.f78492u;
                    if (pullDownTipsItem != null) {
                        ((ArrayList) channelDetailFragment.f78488q).remove(pullDownTipsItem);
                    }
                    PullDownTipsItem pullDownTipsItem2 = new PullDownTipsItem(true);
                    ((ArrayList) channelDetailFragment.f78488q).add(0, pullDownTipsItem2);
                    channelDetailFragment.f78492u = pullDownTipsItem2;
                }
                channelDetailFragment.lf(channelDetailFragment.f78488q);
            }
            ((ArrayList) channelDetailFragment.f78488q).addAll(0, list4);
            channelDetailFragment.mf().notifyDataSetChanged();
            channelDetailFragment.getMRecyclerView().scrollToPosition(0);
            if (channelDetailFragment.f74888K) {
                channelDetailFragment.f74888K = false;
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            a aVar = ChannelDetailFragment.f74882X;
            ChannelDetailFragment channelDetailFragment = this.f74901b;
            channelDetailFragment.f78457c = false;
            channelDetailFragment.setRefreshCompleted();
            View viewWf = channelDetailFragment.wf();
            if (viewWf != null) {
                viewWf.setVisibility(8);
            }
            String message = th != null ? th.getMessage() : null;
            if (channelDetailFragment.nf().c() == 0) {
                if (message == null || TextUtils.isEmpty(message)) {
                    channelDetailFragment.Ff(2131232151, 2131841503);
                } else {
                    com.bilibili.app.comm.list.common.widget.a aVar2 = channelDetailFragment.f78495x;
                    KProperty<Object>[] kPropertyArr = BasePromoFragment.f78481F;
                    KProperty<Object> kProperty = kPropertyArr[3];
                    BiliImageView biliImageView = (BiliImageView) aVar2.b;
                    if (biliImageView != null) {
                        ImageExtentionKt.displayImageResource(biliImageView, 2131232151);
                    }
                    com.bilibili.app.comm.list.common.widget.a aVar3 = channelDetailFragment.f78494w;
                    KProperty<Object> kProperty2 = kPropertyArr[2];
                    TextView textView = (TextView) aVar3.b;
                    if (textView != null) {
                        textView.setText(message);
                    }
                    View viewWf2 = channelDetailFragment.wf();
                    if (viewWf2 != null) {
                        viewWf2.setVisibility(0);
                    }
                }
            }
            if (!(th instanceof BiliApiException)) {
                channelDetailFragment.f74889L = false;
                channelDetailFragment.f74891N = RoomDatabase.MAX_BIND_PARAMETER_CNT;
                PromoToast.showBottomToast(channelDetailFragment.p3(), 2131841349);
                return;
            }
            int i7 = ((BiliApiException) th).mCode;
            channelDetailFragment.f74891N = i7;
            if (i7 == 16109) {
                PromoToast.showBottomToast(channelDetailFragment.p3(), 2131845158);
                channelDetailFragment.f74889L = false;
            } else if (i7 != 16110) {
                PromoToast.showBottomToast(channelDetailFragment.p3(), 2131841349);
            } else {
                PromoToast.showBottomToast(channelDetailFragment.p3(), 2131841349);
            }
        }
    }

    public final void If() {
        ChannelDataItem channelDataItem = this.f74885H;
        if (channelDataItem == null || channelDataItem.i != 1) {
            com.bilibili.app.comm.list.common.widget.a aVar = this.f74893P;
            KProperty<Object> kProperty = f74883Y[0];
            View view = (View) aVar.b;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        com.bilibili.app.comm.list.common.widget.a aVar2 = this.f74893P;
        KProperty<Object> kProperty2 = f74883Y[0];
        View view2 = (View) aVar2.b;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Jf() {
        /*
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = r0.f74885H
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1f
            r0 = r6
            long r0 = r0.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L22
        L1f:
            java.lang.String r0 = ""
            r6 = r0
        L22:
            r0 = r8
            java.lang.String r1 = "channelid"
            r2 = r6
            r0.putString(r1, r2)
            com.bilibili.pvtracker.PageViewTracker r0 = com.bilibili.pvtracker.PageViewTracker.getInstance()
            r1 = r5
            r2 = r5
            java.lang.String r2 = r2.f74894Q
            r3 = r8
            r0.setExtra(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channel.detail.ChannelDetailFragment.Jf():void");
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public final boolean canLoadNextPage() {
        return !this.f78457c && this.f74889L;
    }

    @Override // com.bilibili.pegasus.promo.e
    public final boolean e7() {
        return true;
    }

    @NotNull
    public final Fragment getFragment() {
        return this;
    }

    @NotNull
    public final String getPageId() {
        return this.f74900W;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return this.f74894Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // com.bilibili.pvtracker.IPvTracker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle getPvExtra() {
        /*
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Exception -> L2b
            r7 = r0
            r0 = r7
            r0.<init>()     // Catch: java.lang.Exception -> L2b
            r0 = r4
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = r0.f74885H     // Catch: java.lang.Exception -> L2b
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1f
            r0 = r5
            long r0 = r0.a     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L2b
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L22
        L1f:
            java.lang.String r0 = ""
            r5 = r0
        L22:
            r0 = r7
            java.lang.String r1 = "channelid"
            r2 = r5
            r0.putString(r1, r2)     // Catch: java.lang.Exception -> L2b
            r0 = r7
            return r0
        L2b:
            r5 = move-exception
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channel.detail.ChannelDetailFragment.getPvExtra():android.os.Bundle");
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public final boolean hasNextPage() {
        boolean z6 = false;
        boolean z7 = this.f78496y != null;
        boolean zCanScrollVertically = getMRecyclerView().canScrollVertically(1);
        if (!this.f78457c && !zCanScrollVertically && !z7) {
            int i7 = this.f74891N;
            if (i7 == 999) {
                PromoToast.showBottomToast(p3(), 2131841349);
            } else if (i7 == 16109) {
                PromoToast.showBottomToast(p3(), 2131845158);
            }
        }
        if (((ArrayList) this.f78488q).size() < 500) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment
    public final int of() {
        return this.f74884G;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // com.bilibili.pegasus.promo.BasePegasusFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            super.onCreate(r1)
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()
            r7 = r0
            java.lang.String r0 = ""
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L24
            r0 = r7
            java.lang.String r1 = "channel_data"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = (com.bilibili.pegasus.api.model.ChannelDataItem) r0
            r10 = r0
            r0 = r10
            r7 = r0
            r0 = r10
            if (r0 != 0) goto L31
        L24:
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = new com.bilibili.pegasus.api.model.ChannelDataItem
            r1 = r0
            r2 = -1
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            r7 = r0
        L31:
            r0 = r6
            r1 = r7
            r0.f74885H = r1
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L49
            r0 = r7
            java.lang.String r1 = "from_spmid"
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            goto L4b
        L49:
            r0 = 0
            r7 = r0
        L4b:
            r0 = r6
            r1 = r7
            r0.f74886I = r1
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()
            r10 = r0
            r0 = r9
            r7 = r0
            r0 = r10
            if (r0 == 0) goto L6e
            r0 = r10
            java.lang.String r1 = "channel_converge_page_from"
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L6e
            r0 = r9
            r7 = r0
            goto L6e
        L6e:
            r0 = r6
            r1 = r7
            r0.f74896S = r1
            r0 = 1
            r8 = r0
            r0 = r6
            r1 = 1
            r0.f74888K = r1
            r0 = r6
            android.content.Context r0 = r0.getContext()
            com.bilibili.lib.accounts.BiliAccounts r0 = com.bilibili.lib.accounts.BiliAccounts.get(r0)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L8a
            goto L8c
        L8a:
            r0 = 2
            r8 = r0
        L8c:
            r0 = r6
            r1 = r8
            r0.f78489r = r1
            r0 = r6
            com.bilibili.pegasus.card.base.F r1 = new com.bilibili.pegasus.card.base.F
            r2 = r1
            com.bilibili.pegasus.card.base.d r3 = new com.bilibili.pegasus.card.base.d
            r4 = r3
            r4.<init>()
            r4 = r6
            int r4 = r4.f74884G
            r2.<init>(r3, r4)
            r0.f78465j = r1
            r0 = r6
            Ip0.a r1 = new Ip0.a
            r2 = r1
            r3 = r6
            com.bilibili.pegasus.card.base.F r3 = r3.nf()
            r2.<init>(r3)
            r0.f78464i = r1
            com.bilibili.lib.ui.theme.ThemeWatcher r0 = com.bilibili.lib.ui.theme.ThemeWatcher.getInstance()
            r1 = r6
            r0.subscribe(r1)
            r0 = r6
            r0.Jf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channel.detail.ChannelDetailFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131495230, viewGroup, false);
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f74890M = 1;
        this.f74887J = null;
        ((ArrayList) this.f78488q).clear();
        ThemeWatcher.getInstance().unSubscribe(this);
    }

    public final void onDetailRefresh() {
        ListExtentionsKt.smoothScrollToTop(getMRecyclerView());
        onRefresh();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        mf().notifyUserVisible(false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        mf().notifyUserVisible(true);
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void onRefresh() {
        super.onRefresh();
        Gf();
        Fh.a aVar = this.f74895R;
        if (aVar != null) {
            aVar.a();
        }
        this.f74895R = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (getParentFragment() == null || !getUserVisibleHint()) {
            return;
        }
        setUserVisibleHint(requireParentFragment().getUserVisibleHint());
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.f64616Wh0));
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        AppBarLayout appBarLayoutFindViewById;
        Window window;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(2131309659);
        com.bilibili.app.comm.list.common.widget.a aVar = this.f74893P;
        KProperty<Object>[] kPropertyArr = f74883Y;
        aVar.a(viewFindViewById, kPropertyArr[0]);
        com.bilibili.app.comm.list.common.widget.a aVar2 = this.f74893P;
        KProperty<Object> kProperty = kPropertyArr[0];
        View view2 = (View) aVar2.b;
        if (view2 != null) {
            view2.setOnClickListener(new k(this, 0));
        }
        FragmentActivity fragmentActivityP3 = p3();
        View decorView = (fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null && (appBarLayoutFindViewById = decorView.findViewById(2131296646)) != null) {
            appBarLayoutFindViewById.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: Nn0.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChannelDetailFragment f17321a;

                {
                    this.f17321a = this;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                    ChannelDetailFragment.a aVar3 = ChannelDetailFragment.f74882X;
                    ChannelDetailFragment channelDetailFragment = this.f17321a;
                    channelDetailFragment.f74898U = i7;
                    com.bilibili.app.comm.list.common.widget.a aVar4 = channelDetailFragment.f74893P;
                    KProperty<Object> kProperty2 = ChannelDetailFragment.f74883Y[0];
                    View view3 = (View) aVar4.b;
                    if (view3 != null) {
                        view3.setTranslationY((-i7) - channelDetailFragment.f74897T);
                    }
                }
            });
        }
        If();
        Jf();
        vf();
    }

    public final void setInitOffset(int i7) {
        this.f74897T = i7;
        this.f74898U = this.f74898U;
        com.bilibili.app.comm.list.common.widget.a aVar = this.f74893P;
        KProperty<Object> kProperty = f74883Y[0];
        View view = (View) aVar.b;
        if (view != null) {
            view.setTranslationY((-r0) - i7);
        }
    }

    public final void setPageId(@NotNull String str) {
        this.f74900W = str;
    }

    public final void setRefreshCallback(@NotNull Fh.a aVar) {
        this.f74895R = aVar;
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (p3() == null || xf() == null) {
            return;
        }
        if (this.f74888K) {
            Bundle arguments = getArguments();
            this.f74892O = Intrinsics.areEqual(arguments != null ? arguments.getString("init_page_id") : null, "multiple");
        } else {
            this.f74892O = true;
        }
        if (z6 && ((ArrayList) this.f78488q).isEmpty() && !this.f78457c) {
            Gf();
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final boolean shouldReport() {
        return this.f74892O;
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void vf() {
        super.vf();
        getMRecyclerView().setBackgroundColor(ThemeUtils.getColorById(p3(), R$color.f64616Wh0));
    }

    @Override // Mn0.b
    public final void w3(@NotNull ChannelDataItem channelDataItem) {
        long j7 = channelDataItem.a;
        ChannelDataItem channelDataItem2 = this.f74885H;
        if (j7 != x.u(channelDataItem2 != null ? Long.valueOf(channelDataItem2.a) : null)) {
            long j8 = channelDataItem.a;
            ChannelDataItem channelDataItem3 = this.f74885H;
            Long lValueOf = null;
            if (channelDataItem3 != null) {
                lValueOf = Long.valueOf(channelDataItem3.a);
            }
            f.b(z.a(j8, "Channel id incompatible!! New id: ", " old id: "), x.u(lValueOf), "ChannelDetailFragment");
        }
        this.f74885H = channelDataItem;
        If();
        Jf();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zf() {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channel.detail.ChannelDetailFragment.zf():void");
    }
}
