package com.bilibili.search2.result.holder.recommend;

import Bl.U0;
import Bl.V0;
import Bl.W0;
import ES0.D;
import ES0.E;
import ES0.w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.baseres.LevelImageUtil;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.lib.avatar.layers.model.layers.ConfigKey;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.relation.widget.FollowButton;
import com.bilibili.relation.widget.FollowButtonConfig;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.AbstractC6048b;
import com.bilibili.search2.result.all.C6053g;
import com.bilibili.search2.result.holder.recommend.SearchRelatedAuthorAdapter;
import com.bilibili.search2.share.r;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.s;
import dt0.AbstractC6839b;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import kntr.base.router.Router;
import kntr.common.comment.page.store.PageStore;
import kntr.common.router.UrisKt;
import kntr.home.history.ui.components.L;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.fullscreen.state.M1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/SearchRelatedAuthorAdapter.class */
@StabilityInferred(parameters = 0)
public final class SearchRelatedAuthorAdapter extends AbstractC6048b<AbstractC6839b<UPRecommendItem>, UPRecommendItem> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Fragment f88151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88153d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/SearchRelatedAuthorAdapter$SearchRelatedAuthorItem1Holder.class */
    public final class SearchRelatedAuthorItem1Holder extends AbstractC6843f<UPRecommendItem> {

        @NotNull
        private final U0 binding;

        @NotNull
        private final Lazy mFollowButtonCallback$delegate;
        final SearchRelatedAuthorAdapter this$0;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/SearchRelatedAuthorAdapter$SearchRelatedAuthorItem1Holder$a.class */
        public static final class a extends com.bilibili.search2.utils.i {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final SearchRelatedAuthorItem1Holder f88154e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final SearchRelatedAuthorAdapter f88155f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SearchRelatedAuthorItem1Holder searchRelatedAuthorItem1Holder, SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, Context context, FollowButton followButton, boolean z6, w wVar) {
                super(context, followButton, z6, wVar);
                this.f88154e = searchRelatedAuthorItem1Holder;
                this.f88155f = searchRelatedAuthorAdapter;
            }

            @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
            public final boolean isCancel() {
                Fragment fragment = this.f88154e.getFragment();
                return (fragment != null ? fragment.p3() : null) == null;
            }

            @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
            public final boolean onInterceptBtnClick(boolean z6) {
                ExposeItem exposeItem = this.f88154e;
                UPRecommendItem uPRecommendItem = (UPRecommendItem) exposeItem.getData();
                int absoluteAdapterPosition = exposeItem.getAbsoluteAdapterPosition();
                String str = z6 ? "interaction_unfollow" : "interaction_follow";
                this.f88155f.getClass();
                SearchRelatedAuthorAdapter.U(uPRecommendItem, "follow", absoluteAdapterPosition, str);
                return super.onInterceptBtnClick(z6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SearchRelatedAuthorItem1Holder(@NotNull final SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, U0 u02) {
            super(u02.a);
            this.this$0 = searchRelatedAuthorAdapter;
            this.binding = u02;
            this.itemView.setOnClickListener(new g(0, this, searchRelatedAuthorAdapter));
            u02.b.setOnClickListener(new View.OnClickListener(this, searchRelatedAuthorAdapter) { // from class: com.bilibili.search2.result.holder.recommend.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter f88181a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter.SearchRelatedAuthorItem1Holder f88182b;

                {
                    this.f88181a = searchRelatedAuthorAdapter;
                    this.f88182b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchRelatedAuthorAdapter.SearchRelatedAuthorItem1Holder._init_$lambda$1(this.f88181a, this.f88182b, view);
                }
            });
            this.mFollowButtonCallback$delegate = LazyKt.lazy(new com.bilibili.lib.fasthybrid.common.service.prefetch.c(1, this, searchRelatedAuthorAdapter));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void _init_$lambda$0(SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, SearchRelatedAuthorItem1Holder searchRelatedAuthorItem1Holder, View view) {
            SearchRelatedAuthorAdapter.V(searchRelatedAuthorAdapter, (UPRecommendItem) searchRelatedAuthorItem1Holder.getData(), "0", searchRelatedAuthorItem1Holder.getAbsoluteAdapterPosition());
            B.r(searchRelatedAuthorItem1Holder.itemView.getContext(), ((UPRecommendItem) searchRelatedAuthorItem1Holder.getData()).getUri());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void _init_$lambda$1(SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, SearchRelatedAuthorItem1Holder searchRelatedAuthorItem1Holder, View view) {
            SearchRelatedAuthorAdapter.V(searchRelatedAuthorAdapter, (UPRecommendItem) searchRelatedAuthorItem1Holder.getData(), "head", searchRelatedAuthorItem1Holder.getAbsoluteAdapterPosition());
            if (((UPRecommendItem) searchRelatedAuthorItem1Holder.getData()).isLive()) {
                SearchRelatedAuthorAdapter.T(searchRelatedAuthorAdapter, searchRelatedAuthorItem1Holder.itemView.getContext(), (UPRecommendItem) searchRelatedAuthorItem1Holder.getData());
            } else {
                B.r(searchRelatedAuthorItem1Holder.itemView.getContext(), ((UPRecommendItem) searchRelatedAuthorItem1Holder.getData()).getUri());
            }
        }

        private final com.bilibili.search2.utils.i getMFollowButtonCallback() {
            return (com.bilibili.search2.utils.i) this.mFollowButtonCallback$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a mFollowButtonCallback_delegate$lambda$0(SearchRelatedAuthorItem1Holder searchRelatedAuthorItem1Holder, SearchRelatedAuthorAdapter searchRelatedAuthorAdapter) {
            return new a(searchRelatedAuthorItem1Holder, searchRelatedAuthorAdapter, searchRelatedAuthorItem1Holder.binding.a.getContext(), searchRelatedAuthorItem1Holder.binding.c, ((UPRecommendItem) searchRelatedAuthorItem1Holder.getData()).isUpFollowUser(), new w(searchRelatedAuthorItem1Holder, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean mFollowButtonCallback_delegate$lambda$0$0(SearchRelatedAuthorItem1Holder searchRelatedAuthorItem1Holder) {
            ((UPRecommendItem) searchRelatedAuthorItem1Holder.getData()).updateRelation(!((UPRecommendItem) searchRelatedAuthorItem1Holder.getData()).isUserFollowUp(), ((UPRecommendItem) searchRelatedAuthorItem1Holder.getData()).isUpFollowUser());
            return ((UPRecommendItem) searchRelatedAuthorItem1Holder.getData()).isUserFollowUp();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dt0.AbstractC6839b
        public void bind() {
            Integer numB = s.b(this.itemView.getContext(), 30, false);
            int iIntValue = numB != null ? numB.intValue() : (ScreenUtil.getScreenWidth(this.itemView.getContext()) - ListExtentionsKt.toPx(40.0f)) / 3;
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = iIntValue;
            view.setLayoutParams(layoutParams);
            o10.a avatarInfo = ((UPRecommendItem) getData()).getAvatarInfo();
            if (avatarInfo != null) {
                this.binding.b.show(avatarInfo, MapsKt.mapOf(TuplesKt.to(new s10.i(ConfigKey.LiveAnimaKey), new com.bilibili.ctc.common.avatar.plugin.live.g())));
            }
            this.binding.f.setText(((UPRecommendItem) getData()).getName());
            TintTextView tintTextView = this.binding.d;
            List<String> upCardInfo = ((UPRecommendItem) getData()).getUpCardInfo();
            tintTextView.setText(upCardInfo != null ? (String) CollectionsKt.getOrNull(upCardInfo, 0) : null);
            TintTextView tintTextView2 = this.binding.e;
            List<String> upCardInfo2 = ((UPRecommendItem) getData()).getUpCardInfo();
            String str = null;
            if (upCardInfo2 != null) {
                str = (String) CollectionsKt.getOrNull(upCardInfo2, 1);
            }
            tintTextView2.setText(str);
            if (!this.this$0.f88153d) {
                ListExtentionsKt.gone(this.binding.c);
                B.y(this.binding.e, ListExtentionsKt.toPx(4));
                return;
            }
            ListExtentionsKt.visible(this.binding.c);
            FollowButton followButton = this.binding.c;
            FollowButtonConfig.Builder spmid = new FollowButtonConfig.Builder(((UPRecommendItem) getData()).getMid(), ((UPRecommendItem) getData()).isUserFollowUp(), 83, getMFollowButtonCallback()).setIsGuestAttention(((UPRecommendItem) getData()).isUpFollowUser()).setSpmid("search.search-result.0.0");
            Pair pair = TuplesKt.to("entity", "query");
            String keyword = ((UPRecommendItem) getData()).getKeyword();
            String str2 = keyword;
            if (keyword == null) {
                str2 = "";
            }
            followButton.bind(spmid.setExtendContent(MapsKt.hashMapOf(new Pair[]{pair, TuplesKt.to("entity_name", str2)})).build());
            B.y(this.binding.e, ListExtentionsKt.toPx(2));
        }

        @NotNull
        public final U0 getBinding() {
            return this.binding;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/SearchRelatedAuthorAdapter$SearchRelatedAuthorItem2Holder.class */
    public final class SearchRelatedAuthorItem2Holder extends AbstractC6843f<UPRecommendItem> {

        @NotNull
        private final V0 binding;

        @NotNull
        private final Lazy mFollowButtonCallback$delegate;
        final SearchRelatedAuthorAdapter this$0;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/SearchRelatedAuthorAdapter$SearchRelatedAuthorItem2Holder$a.class */
        public static final class a extends com.bilibili.search2.utils.i {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final SearchRelatedAuthorItem2Holder f88156e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final SearchRelatedAuthorAdapter f88157f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SearchRelatedAuthorItem2Holder searchRelatedAuthorItem2Holder, SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, Context context, FollowButton followButton, boolean z6, D d7) {
                super(context, followButton, z6, d7);
                this.f88156e = searchRelatedAuthorItem2Holder;
                this.f88157f = searchRelatedAuthorAdapter;
            }

            @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
            public final boolean isCancel() {
                Fragment fragment = this.f88156e.getFragment();
                return (fragment != null ? fragment.p3() : null) == null;
            }

            @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
            public final boolean onInterceptBtnClick(boolean z6) {
                ExposeItem exposeItem = this.f88156e;
                UPRecommendItem uPRecommendItem = (UPRecommendItem) exposeItem.getData();
                int absoluteAdapterPosition = exposeItem.getAbsoluteAdapterPosition();
                String str = z6 ? "interaction_unfollow" : "interaction_follow";
                this.f88157f.getClass();
                SearchRelatedAuthorAdapter.U(uPRecommendItem, "follow", absoluteAdapterPosition, str);
                return super.onInterceptBtnClick(z6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SearchRelatedAuthorItem2Holder(@NotNull final SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, V0 v02) {
            super(v02.a);
            this.this$0 = searchRelatedAuthorAdapter;
            this.binding = v02;
            this.itemView.setOnClickListener(new View.OnClickListener(this, searchRelatedAuthorAdapter) { // from class: com.bilibili.search2.result.holder.recommend.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter f88183a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter.SearchRelatedAuthorItem2Holder f88184b;

                {
                    this.f88183a = searchRelatedAuthorAdapter;
                    this.f88184b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchRelatedAuthorAdapter.SearchRelatedAuthorItem2Holder._init_$lambda$0(this.f88183a, this.f88184b, view);
                }
            });
            v02.b.setOnClickListener(new View.OnClickListener(this, searchRelatedAuthorAdapter) { // from class: com.bilibili.search2.result.holder.recommend.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter f88185a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter.SearchRelatedAuthorItem2Holder f88186b;

                {
                    this.f88185a = searchRelatedAuthorAdapter;
                    this.f88186b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchRelatedAuthorAdapter.SearchRelatedAuthorItem2Holder._init_$lambda$1(this.f88185a, this.f88186b, view);
                }
            });
            this.mFollowButtonCallback$delegate = LazyKt.lazy(new com.bilibili.bplus.im.aichat.conversation.b(1, this, searchRelatedAuthorAdapter));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void _init_$lambda$0(SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, SearchRelatedAuthorItem2Holder searchRelatedAuthorItem2Holder, View view) {
            SearchRelatedAuthorAdapter.V(searchRelatedAuthorAdapter, (UPRecommendItem) searchRelatedAuthorItem2Holder.getData(), "0", searchRelatedAuthorItem2Holder.getAbsoluteAdapterPosition());
            B.r(searchRelatedAuthorItem2Holder.itemView.getContext(), ((UPRecommendItem) searchRelatedAuthorItem2Holder.getData()).getUri());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void _init_$lambda$1(SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, SearchRelatedAuthorItem2Holder searchRelatedAuthorItem2Holder, View view) {
            SearchRelatedAuthorAdapter.V(searchRelatedAuthorAdapter, (UPRecommendItem) searchRelatedAuthorItem2Holder.getData(), "head", searchRelatedAuthorItem2Holder.getAbsoluteAdapterPosition());
            if (((UPRecommendItem) searchRelatedAuthorItem2Holder.getData()).isLive()) {
                SearchRelatedAuthorAdapter.T(searchRelatedAuthorAdapter, searchRelatedAuthorItem2Holder.itemView.getContext(), (UPRecommendItem) searchRelatedAuthorItem2Holder.getData());
            } else {
                B.r(searchRelatedAuthorItem2Holder.itemView.getContext(), ((UPRecommendItem) searchRelatedAuthorItem2Holder.getData()).getUri());
            }
        }

        private final com.bilibili.search2.utils.i getMFollowButtonCallback() {
            return (com.bilibili.search2.utils.i) this.mFollowButtonCallback$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a mFollowButtonCallback_delegate$lambda$0(SearchRelatedAuthorItem2Holder searchRelatedAuthorItem2Holder, SearchRelatedAuthorAdapter searchRelatedAuthorAdapter) {
            return new a(searchRelatedAuthorItem2Holder, searchRelatedAuthorAdapter, searchRelatedAuthorItem2Holder.binding.a.getContext(), searchRelatedAuthorItem2Holder.binding.d, ((UPRecommendItem) searchRelatedAuthorItem2Holder.getData()).isUpFollowUser(), new D(searchRelatedAuthorItem2Holder, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean mFollowButtonCallback_delegate$lambda$0$0(SearchRelatedAuthorItem2Holder searchRelatedAuthorItem2Holder) {
            ((UPRecommendItem) searchRelatedAuthorItem2Holder.getData()).updateRelation(!((UPRecommendItem) searchRelatedAuthorItem2Holder.getData()).isUserFollowUp(), ((UPRecommendItem) searchRelatedAuthorItem2Holder.getData()).isUpFollowUser());
            return ((UPRecommendItem) searchRelatedAuthorItem2Holder.getData()).isUserFollowUp();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dt0.AbstractC6839b
        public void bind() {
            Integer numB = s.b(this.itemView.getContext(), 30, false);
            int iIntValue = numB != null ? numB.intValue() : (ScreenUtil.getScreenWidth(this.itemView.getContext()) - ListExtentionsKt.toPx(40.0f)) / 3;
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = iIntValue;
            view.setLayoutParams(layoutParams);
            B.y(this.binding.b, (int) ((((double) iIntValue) * 0.5625d) - ((double) ListExtentionsKt.toPx(18))));
            o10.a avatarInfo = ((UPRecommendItem) getData()).getAvatarInfo();
            if (avatarInfo != null) {
                this.binding.b.show(avatarInfo, MapsKt.mapOf(TuplesKt.to(new s10.i(ConfigKey.LiveAnimaKey), new com.bilibili.ctc.common.avatar.plugin.live.g())));
            }
            this.binding.g.setText(((UPRecommendItem) getData()).getName());
            TintTextView tintTextView = this.binding.e;
            List<String> upCardInfo = ((UPRecommendItem) getData()).getUpCardInfo();
            tintTextView.setText(upCardInfo != null ? (String) CollectionsKt.getOrNull(upCardInfo, 0) : null);
            TintTextView tintTextView2 = this.binding.f;
            List<String> upCardInfo2 = ((UPRecommendItem) getData()).getUpCardInfo();
            String str = null;
            if (upCardInfo2 != null) {
                str = (String) CollectionsKt.getOrNull(upCardInfo2, 1);
            }
            tintTextView2.setText(str);
            com.bilibili.search2.utils.extension.c.a(this.binding.c, ((UPRecommendItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
            if (!this.this$0.f88153d) {
                ListExtentionsKt.gone(this.binding.d);
                return;
            }
            ListExtentionsKt.visible(this.binding.d);
            FollowButton followButton = this.binding.d;
            FollowButtonConfig.Builder spmid = new FollowButtonConfig.Builder(((UPRecommendItem) getData()).getMid(), ((UPRecommendItem) getData()).isUserFollowUp(), 83, getMFollowButtonCallback()).setIsGuestAttention(((UPRecommendItem) getData()).isUpFollowUser()).setSpmid("search.search-result.0.0");
            Pair pair = TuplesKt.to("entity", "query");
            String keyword = ((UPRecommendItem) getData()).getKeyword();
            String str2 = keyword;
            if (keyword == null) {
                str2 = "";
            }
            followButton.bind(spmid.setExtendContent(MapsKt.hashMapOf(new Pair[]{pair, TuplesKt.to("entity_name", str2)})).build());
        }

        @NotNull
        public final V0 getBinding() {
            return this.binding;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/SearchRelatedAuthorAdapter$SearchRelatedAuthorItem3Holder.class */
    public final class SearchRelatedAuthorItem3Holder extends AbstractC6843f<UPRecommendItem> {

        @NotNull
        private final W0 binding;

        @NotNull
        private final Lazy mFollowButtonCallback$delegate;
        final SearchRelatedAuthorAdapter this$0;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/SearchRelatedAuthorAdapter$SearchRelatedAuthorItem3Holder$a.class */
        public static final class a extends com.bilibili.search2.utils.i {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final SearchRelatedAuthorItem3Holder f88158e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final SearchRelatedAuthorAdapter f88159f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SearchRelatedAuthorItem3Holder searchRelatedAuthorItem3Holder, SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, Context context, FollowButton followButton, boolean z6, E e7) {
                super(context, followButton, z6, e7);
                this.f88158e = searchRelatedAuthorItem3Holder;
                this.f88159f = searchRelatedAuthorAdapter;
            }

            @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
            public final boolean isCancel() {
                Fragment fragment = this.f88158e.getFragment();
                return (fragment != null ? fragment.p3() : null) == null;
            }

            @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
            public final boolean onInterceptBtnClick(boolean z6) {
                ExposeItem exposeItem = this.f88158e;
                UPRecommendItem uPRecommendItem = (UPRecommendItem) exposeItem.getData();
                int absoluteAdapterPosition = exposeItem.getAbsoluteAdapterPosition();
                String str = z6 ? "interaction_unfollow" : "interaction_follow";
                this.f88159f.getClass();
                SearchRelatedAuthorAdapter.U(uPRecommendItem, "follow", absoluteAdapterPosition, str);
                return super.onInterceptBtnClick(z6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SearchRelatedAuthorItem3Holder(@NotNull final SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, W0 w02) {
            super(w02.a);
            this.this$0 = searchRelatedAuthorAdapter;
            this.binding = w02;
            this.itemView.setOnClickListener(new View.OnClickListener(this, searchRelatedAuthorAdapter) { // from class: com.bilibili.search2.result.holder.recommend.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter f88187a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter.SearchRelatedAuthorItem3Holder f88188b;

                {
                    this.f88187a = searchRelatedAuthorAdapter;
                    this.f88188b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchRelatedAuthorAdapter.SearchRelatedAuthorItem3Holder._init_$lambda$0(this.f88187a, this.f88188b, view);
                }
            });
            w02.b.setOnClickListener(new View.OnClickListener(this, searchRelatedAuthorAdapter) { // from class: com.bilibili.search2.result.holder.recommend.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter f88189a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SearchRelatedAuthorAdapter.SearchRelatedAuthorItem3Holder f88190b;

                {
                    this.f88189a = searchRelatedAuthorAdapter;
                    this.f88190b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchRelatedAuthorAdapter.SearchRelatedAuthorItem3Holder._init_$lambda$1(this.f88189a, this.f88190b, view);
                }
            });
            final int i7 = 0;
            this.mFollowButtonCallback$delegate = LazyKt.lazy(new Function0(i7, this, searchRelatedAuthorAdapter) { // from class: com.bilibili.search2.result.holder.recommend.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f88191a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f88192b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f88193c;

                {
                    this.f88191a = i7;
                    this.f88192b = this;
                    this.f88193c = searchRelatedAuthorAdapter;
                }

                public final Object invoke() {
                    switch (this.f88191a) {
                        case 0:
                            break;
                        case 1:
                            ((PageStore) this.f88192b).b(new u51.E(((y51.g) ((State) this.f88193c).getValue()).j()));
                            break;
                        case 2:
                            kntr.home.history.mvi.d dVar = (kntr.home.history.mvi.d) this.f88192b;
                            boolean z6 = dVar.t;
                            Router router = (Router) this.f88193c;
                            if (z6) {
                                L.p(dVar, router);
                            } else {
                                String str = dVar.o;
                                if (str != null) {
                                    router.launch(UrisKt.toUri(h81.h.a(str)));
                                }
                            }
                            break;
                        default:
                            ((Function1) this.f88192b).invoke(Boolean.valueOf(((M1) this.f88193c).c));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void _init_$lambda$0(SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, SearchRelatedAuthorItem3Holder searchRelatedAuthorItem3Holder, View view) {
            SearchRelatedAuthorAdapter.V(searchRelatedAuthorAdapter, (UPRecommendItem) searchRelatedAuthorItem3Holder.getData(), "0", searchRelatedAuthorItem3Holder.getAbsoluteAdapterPosition());
            B.r(searchRelatedAuthorItem3Holder.itemView.getContext(), ((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).getUri());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void _init_$lambda$1(SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, SearchRelatedAuthorItem3Holder searchRelatedAuthorItem3Holder, View view) {
            SearchRelatedAuthorAdapter.V(searchRelatedAuthorAdapter, (UPRecommendItem) searchRelatedAuthorItem3Holder.getData(), "head", searchRelatedAuthorItem3Holder.getAbsoluteAdapterPosition());
            if (((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).isLive()) {
                SearchRelatedAuthorAdapter.T(searchRelatedAuthorAdapter, searchRelatedAuthorItem3Holder.itemView.getContext(), (UPRecommendItem) searchRelatedAuthorItem3Holder.getData());
            } else {
                B.r(searchRelatedAuthorItem3Holder.itemView.getContext(), ((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).getUri());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void bind$lambda$5(SearchRelatedAuthorItem3Holder searchRelatedAuthorItem3Holder, View view) {
            Object next;
            r rVar = r.f88699a;
            Context context = searchRelatedAuthorItem3Holder.itemView.getContext();
            List<BaseSearchItem.ThreePointItem> threePoints = ((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).getThreePoints();
            BaseSearchItem.ThreePointItem threePointItem = null;
            if (threePoints != null) {
                Iterator<T> it = threePoints.iterator();
                do {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!Intrinsics.areEqual("share", ((BaseSearchItem.ThreePointItem) next).getType()));
                threePointItem = (BaseSearchItem.ThreePointItem) next;
            }
            rVar.k(searchRelatedAuthorItem3Holder, context, null, null, threePointItem != null);
        }

        private final com.bilibili.search2.utils.i getMFollowButtonCallback() {
            return (com.bilibili.search2.utils.i) this.mFollowButtonCallback$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a mFollowButtonCallback_delegate$lambda$0(SearchRelatedAuthorItem3Holder searchRelatedAuthorItem3Holder, SearchRelatedAuthorAdapter searchRelatedAuthorAdapter) {
            return new a(searchRelatedAuthorItem3Holder, searchRelatedAuthorAdapter, searchRelatedAuthorItem3Holder.binding.a.getContext(), searchRelatedAuthorItem3Holder.binding.c, ((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).isUpFollowUser(), new E(searchRelatedAuthorItem3Holder, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean mFollowButtonCallback_delegate$lambda$0$0(SearchRelatedAuthorItem3Holder searchRelatedAuthorItem3Holder) {
            ((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).updateRelation(!((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).isUserFollowUp(), ((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).isUpFollowUser());
            return ((UPRecommendItem) searchRelatedAuthorItem3Holder.getData()).isUserFollowUp();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dt0.AbstractC6839b
        public void bind() {
            Drawable drawable;
            o10.a avatarInfo = ((UPRecommendItem) getData()).getAvatarInfo();
            if (avatarInfo != null) {
                this.binding.b.show(avatarInfo, MapsKt.mapOf(TuplesKt.to(new s10.i(ConfigKey.LiveAnimaKey), new com.bilibili.ctc.common.avatar.plugin.live.g())));
            }
            Integer levelImageNew = LevelImageUtil.INSTANCE.getLevelImageNew(((UPRecommendItem) getData()).getLevel(), ((UPRecommendItem) getData()).isSeniorMember() == 1);
            if (levelImageNew != null && (drawable = ContextCompat.getDrawable(this.itemView.getContext(), levelImageNew.intValue())) != null) {
                this.binding.h.getGenericProperties().setImage(drawable);
                int px = ListExtentionsKt.toPx((((UPRecommendItem) getData()).isSeniorMember() == 1 && ((UPRecommendItem) getData()).getLevel() == 6) ? 28 : 20);
                BiliImageView biliImageView = this.binding.h;
                biliImageView.getLayoutParams().width = px;
                biliImageView.setLayoutParams(biliImageView.getLayoutParams());
            }
            this.binding.g.setText(((UPRecommendItem) getData()).getName());
            TintTextView tintTextView = this.binding.e;
            List<String> upCardInfo = ((UPRecommendItem) getData()).getUpCardInfo();
            tintTextView.setText(upCardInfo != null ? (String) CollectionsKt.getOrNull(upCardInfo, 0) : null);
            List<String> upCardInfo2 = ((UPRecommendItem) getData()).getUpCardInfo();
            String str = upCardInfo2 != null ? (String) CollectionsKt.getOrNull(upCardInfo2, 1) : null;
            String str2 = null;
            if (str != null) {
                str2 = StringsKt.isBlank(str) ? null : str;
            }
            if (str2 != null) {
                ListExtentionsKt.visible(this.binding.f);
                this.binding.f.setText(str2);
            }
            FollowButton followButton = this.binding.c;
            FollowButtonConfig.Builder spmid = new FollowButtonConfig.Builder(((UPRecommendItem) getData()).getMid(), ((UPRecommendItem) getData()).isUserFollowUp(), 83, getMFollowButtonCallback()).setIsGuestAttention(((UPRecommendItem) getData()).isUpFollowUser()).setSpmid("search.search-result.0.0");
            Pair pair = TuplesKt.to("entity", "query");
            String keyword = ((UPRecommendItem) getData()).getKeyword();
            String str3 = keyword;
            if (keyword == null) {
                str3 = "";
            }
            followButton.bind(spmid.setExtendContent(MapsKt.hashMapOf(new Pair[]{pair, TuplesKt.to("entity_name", str3)})).build());
            this.binding.d.setOnClickListener(new com.bilibili.biligame.business.pegasus.view.g(this, 2));
        }

        @NotNull
        public final W0 getBinding() {
            return this.binding;
        }
    }

    public static final void T(SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, Context context, UPRecommendItem uPRecommendItem) {
        searchRelatedAuthorAdapter.getClass();
        String liveLink = uPRecommendItem.getLiveLink();
        if (liveLink != null) {
            if (StringsKt.isBlank(liveLink)) {
                liveLink = null;
            }
            if (liveLink != null) {
                Os0.e.g(Os0.e.f18030a, context, ListExtentionsKt.appendUrlParamsIfAbsent(liveLink, new android.util.Pair[]{android.util.Pair.create("session_id", uPRecommendItem.getTrackId()), android.util.Pair.create("launch_id", uPRecommendItem.getKeyword()), android.util.Pair.create("extra_jump_from", "23005"), android.util.Pair.create("jumpFrom", "3"), android.util.Pair.create("from_spmid", "search.search-result.0.0")}));
            }
        }
    }

    public static void U(UPRecommendItem uPRecommendItem, String str, int i7, String str2) {
        Xs0.b.i("search.search-result.search-card.all.click", null, uPRecommendItem.getLinkType(), uPRecommendItem, String.valueOf(uPRecommendItem.getMid()), String.valueOf(i7 + 1), Xs0.b.d(uPRecommendItem, str, null, 2), str2, null, null, false, null, 7936);
    }

    public static /* synthetic */ void V(SearchRelatedAuthorAdapter searchRelatedAuthorAdapter, UPRecommendItem uPRecommendItem, String str, int i7) {
        searchRelatedAuthorAdapter.getClass();
        U(uPRecommendItem, str, i7, null);
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    @NotNull
    public final AbstractC6839b P(int i7, @NotNull ViewGroup viewGroup) {
        AbstractC6839b searchRelatedAuthorItem1Holder;
        int i8 = this.f88152c;
        if (i8 == 1) {
            searchRelatedAuthorItem1Holder = new SearchRelatedAuthorItem1Holder(this, U0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            searchRelatedAuthorItem1Holder.bindFragment(this.f88151b);
        } else if (i8 == 2) {
            searchRelatedAuthorItem1Holder = new SearchRelatedAuthorItem2Holder(this, V0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            searchRelatedAuthorItem1Holder.bindFragment(this.f88151b);
        } else if (i8 != 3) {
            int i9 = C6053g.f87282b;
            searchRelatedAuthorItem1Holder = C6053g.a.a(viewGroup);
        } else {
            searchRelatedAuthorItem1Holder = new SearchRelatedAuthorItem3Holder(this, W0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            searchRelatedAuthorItem1Holder.bindFragment(this.f88151b);
        }
        return searchRelatedAuthorItem1Holder;
    }
}
