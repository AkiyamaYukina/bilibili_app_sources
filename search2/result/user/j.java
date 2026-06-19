package com.bilibili.search2.result.user;

import ES0.V0;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.baseres.LevelImageUtil;
import com.bilibili.commons.StringUtils;
import com.bilibili.droid.StringUtil;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.lib.avatar.layers.LayerAvatarView;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.relation.widget.FollowButton;
import com.bilibili.relation.widget.FollowButtonConfig;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchOfficialVerify;
import com.bilibili.search2.api.SearchUpperItem;
import dt0.AbstractC6843f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.C8397q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/j.class */
@StabilityInferred(parameters = 0)
public final class j extends AbstractC6843f<SearchUpperItem> implements View.OnClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f88559o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final WeakReference<SearchResultUserFragment> f88560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LayerAvatarView f88561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f88562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ImageView f88563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TextView f88564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f88565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final FollowButton f88566g;

    @NotNull
    public final TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final BiliImageView f88567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ViewStub f88568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public a f88569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public h f88570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f88571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f88572n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/j$a.class */
    public static final class a extends com.bilibili.search2.utils.i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j f88573e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, Context context, FollowButton followButton, boolean z6, V0 v02) {
            super(context, followButton, z6, v02);
            this.f88573e = jVar;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final boolean isCancel() {
            j jVar = this.f88573e;
            WeakReference<SearchResultUserFragment> weakReference = jVar.f88560a;
            return weakReference == null || weakReference.get() == null || jVar.f88560a.get().p3() == null;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final void onFollowStart() {
            super.onFollowStart();
            ExposeItem exposeItem = this.f88573e;
            Xs0.b.j("follow", (BaseSearchItem) exposeItem.getData(), null, String.valueOf(exposeItem.getBindingAdapterPosition() + 1), null, 192);
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final void onUnFollowStart() {
            super.onUnFollowStart();
            ExposeItem exposeItem = this.f88573e;
            Xs0.b.j("unfollow", (BaseSearchItem) exposeItem.getData(), null, String.valueOf(exposeItem.getBindingAdapterPosition() + 1), null, 192);
        }
    }

    public j(View view, SearchResultUserFragment searchResultUserFragment) {
        super(view);
        this.f88571m = ListExtentionsKt.toPx(12);
        this.f88572n = new HashMap<>();
        this.f88560a = new WeakReference<>(searchResultUserFragment);
        LayerAvatarView layerAvatarViewFindViewById = view.findViewById(2131296823);
        this.f88561b = layerAvatarViewFindViewById;
        this.f88562c = (TextView) view.findViewById(2131315715);
        this.f88563d = (ImageView) view.findViewById(2131315971);
        TextView textView = (TextView) view.findViewById(2131305395);
        this.f88564e = textView;
        this.f88565f = (TextView) view.findViewById(2131320992);
        FollowButton followButton = (FollowButton) view.findViewById(2131301778);
        this.f88566g = followButton;
        this.h = (TextView) view.findViewById(2131321014);
        this.f88567i = view.findViewById(2131316365);
        this.f88568j = (ViewStub) view.findViewById(2131310877);
        followButton.setOnClickListener(this);
        textView.setOnClickListener(this);
        view.setOnClickListener(this);
        layerAvatarViewFindViewById.setOnClickListener(this);
    }

    public static long s0(SearchUpperItem searchUpperItem) {
        long j7 = 0;
        if (searchUpperItem != null) {
            try {
                String param = searchUpperItem.getParam();
                j7 = 0;
                if (param != null) {
                    j7 = Long.parseLong(param);
                }
            } catch (Exception e7) {
                C8397q.a("convert Long error: ", "SearchResultUserViewHolder", e7);
                j7 = 0;
            }
        }
        return j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        SearchOfficialVerify officialVerify;
        TextView textView = this.f88562c;
        textView.setTextColor(textView.getContext().getResources().getColor(R$color.Ga10));
        o10.a avatarItem = ((SearchUpperItem) getData()).getAvatarItem();
        if (avatarItem != null) {
            LayerAvatarView.show$default(this.f88561b, avatarItem, (Map) null, 2, (Object) null);
        }
        String handle = ((SearchUpperItem) getData()).getHandle();
        boolean z6 = handle == null || handle.length() == 0;
        String userCardDesc = ((SearchUpperItem) getData()).getUserCardDesc();
        boolean z7 = userCardDesc == null || userCardDesc.length() == 0;
        SearchOfficialVerify officialVerify2 = ((SearchUpperItem) getData()).getOfficialVerify();
        String desc = officialVerify2 != null ? officialVerify2.getDesc() : null;
        boolean z8 = desc == null || desc.length() == 0;
        String handle2 = !z6 ? ((SearchUpperItem) getData()).getHandle() : !z7 ? ((SearchUpperItem) getData()).getUserCardDesc() : q0();
        String userCardDesc2 = !z6 ? !z7 ? ((SearchUpperItem) getData()).getUserCardDesc() : q0() : (z8 || (officialVerify = ((SearchUpperItem) getData()).getOfficialVerify()) == null) ? null : officialVerify.getDesc();
        this.f88565f.setText(handle2);
        this.h.setText(userCardDesc2);
        this.h.setVisibility((userCardDesc2 == null || userCardDesc2.length() == 0) ? 8 : 0);
        boolean z9 = ((SearchUpperItem) getData()).getLevel() == 6 && ((SearchUpperItem) getData()).isSeniorMember() == 1;
        Integer levelImageNew = LevelImageUtil.INSTANCE.getLevelImageNew(((SearchUpperItem) getData()).getLevel(), ((SearchUpperItem) getData()).isSeniorMember() == 1);
        if (levelImageNew == null) {
            this.f88563d.setImageDrawable(null);
        } else {
            this.f88563d.setImageResource(levelImageNew.intValue());
            this.f88563d.getLayoutParams().width = ListExtentionsKt.toPx(z9 ? 28 : 20);
            ImageView imageView = this.f88563d;
            imageView.setLayoutParams(imageView.getLayoutParams());
        }
        this.f88564e.setVisibility(((SearchUpperItem) getData()).getLiveStatus() == 1 ? 0 : 8);
        if (this.f88569k == null) {
            this.f88569k = new a(this, this.itemView.getContext(), this.f88566g, ((SearchUpperItem) getData()).isUpFollowUser(), new V0(this, 2));
        }
        HashMap<String, String> mapC = O4.b.c("entity", "query");
        mapC.put("entity_name", ((SearchUpperItem) getData()).getKeyword() == null ? "" : ((SearchUpperItem) getData()).getKeyword());
        Ref.LongRef longRef = new Ref.LongRef();
        long jS0 = s0((SearchUpperItem) getData());
        longRef.element = jS0;
        this.f88566g.bind(new FollowButtonConfig.Builder(jS0, ((SearchUpperItem) getData()).isUserFollowUp(), 83, this.f88569k).setIsGuestAttention(((SearchUpperItem) getData()).isUpFollowUser()).setSpmid("search.search-result.0.0").setExtendContent(mapC).build());
        this.itemView.post(new Jk.d(this, 3));
        String vipLabel = ((SearchUpperItem) getData()).getVipLabel();
        if (SearchResultUserFragment.f88520K) {
            boolean z10 = ((SearchUpperItem) getData()).getLiveStatus() == 1;
            if (StringUtils.isEmpty(vipLabel) || z10) {
                this.f88567i.setVisibility(8);
            } else {
                com.bilibili.search2.utils.extension.c.a(this.f88567i, vipLabel, null, true, null, null, 0, 0, 250);
                this.f88567i.setVisibility(0);
            }
        } else {
            this.f88567i.setVisibility(8);
        }
        if (((SearchUpperItem) getData()).isBigVipYear()) {
            TextView textView2 = this.f88562c;
            textView2.setTextColor(textView2.getContext().getResources().getColor(2131103284));
        }
        this.f88562c.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchUpperItem) getData()).getTitle(), 0, 4, (Object) null));
        this.f88572n.put("pr_id", com.bilibili.search2.result.holder.author.j.a(this.f88568j, this.itemView, ((SearchUpperItem) getData()).getNotice(), new i(this, longRef)) ? String.valueOf(((SearchUpperItem) getData()).getNotice().getNoticeId()) : "");
        HashMap<String, String> map = this.f88572n;
        h hVar = this.f88570l;
        boolean zAreEqual = false;
        if (hVar != null) {
            zAreEqual = Intrinsics.areEqual(hVar.M0(), Boolean.TRUE);
        }
        map.put("is_recall", zAreEqual ? "0" : "1");
        ((SearchUpperItem) getData()).setServerPagePos(getLayoutPosition() + 1);
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f88570l = fragment != null ? (h) new ViewModelProvider(fragment).get(h.class) : null;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        if (!((SearchUpperItem) getData()).isExposed()) {
            SearchUpperItem searchUpperItem = (SearchUpperItem) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z6 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z6 = true;
            }
            searchUpperItem.setAtFirstScreen(z6);
        }
        Xs0.b.k("search.user-search.user-search.all.show", "app-user", (BaseSearchItem) getData(), null, this.f88572n, false, null, null, null, 992);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131305395) {
            if (StringUtil.isNotBlank(((SearchUpperItem) getData()).getJumpUri())) {
                Os0.e.g(Os0.e.f18030a, this.itemView.getContext(), ListExtentionsKt.appendUrlParamsIfAbsent(((SearchUpperItem) getData()).getJumpUri(), new Pair[]{Pair.create("extra_jump_from", "23006")}));
                InfoEyesManager.getInstance().report2(false, "000082", new String[]{Uri.encode(((SearchUpperItem) getData()).getKeyword()), ((SearchUpperItem) getData()).getTrackId(), "up_app_user", String.valueOf(((SearchUpperItem) getData()).getRoomId()), "live", "", "", String.valueOf(getBindingAdapterPosition() + 1)});
                Xs0.b.j("live", (BaseSearchItem) getData(), String.valueOf(((SearchUpperItem) getData()).getRoomId()), String.valueOf(getBindingAdapterPosition() + 1), r0(), 64);
                return;
            }
            return;
        }
        WeakReference<SearchResultUserFragment> weakReference = this.f88560a;
        if (weakReference == null || weakReference.get() == null || this.f88560a.get().p3() == null) {
            return;
        }
        Os0.e eVar = Os0.e.f18030a;
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://space/:mid/").extras(new Os0.d(s0((SearchUpperItem) getData()))).requestCode(101).build(), this.f88560a.get());
        Xs0.b.j("card", (BaseSearchItem) getData(), null, String.valueOf(getBindingAdapterPosition() + 1), r0(), 64);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String q0() {
        return B0.a.a(this.itemView.getContext().getResources().getQuantityString(2131689611, ((SearchUpperItem) getData()).getFans(), NumberFormat_androidKt.format$default(Integer.valueOf(((SearchUpperItem) getData()).getFans()), "0", 0, 2, (Object) null)), "\u3000", this.itemView.getContext().getResources().getQuantityString(2131689730, ((SearchUpperItem) getData()).getArchives(), NumberFormat_androidKt.format$default(Integer.valueOf(((SearchUpperItem) getData()).getArchives()), "0", 0, 2, (Object) null)));
    }

    public final Map<String, String> r0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h hVar = this.f88570l;
        linkedHashMap.put("is_recall", hVar != null ? Intrinsics.areEqual(hVar.M0(), Boolean.TRUE) : false ? "0" : "1");
        return linkedHashMap;
    }
}
