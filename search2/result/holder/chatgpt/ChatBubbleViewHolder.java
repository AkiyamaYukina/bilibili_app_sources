package com.bilibili.search2.result.holder.chatgpt;

import G3.C1959y0;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.search.v2.Action;
import com.bapis.bilibili.broadcast.message.main.LikeState;
import com.bilibili.app.comm.list.widget.opus.A;
import com.bilibili.app.comm.list.widget.opus.K;
import com.bilibili.app.comm.list.widget.opus.L;
import com.bilibili.app.comm.list.widget.opus.N;
import com.bilibili.app.comm.list.widget.opus.OpusView;
import com.bilibili.app.comm.list.widget.opus.ThemeStrategy;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import com.bilibili.search2.utils.B;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/ChatBubbleViewHolder.class */
@StabilityInferred(parameters = 0)
public final class ChatBubbleViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Bl.n f87905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Fragment f87906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SearchChatGptHolder f87907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f87908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MutableLiveData<A> f87909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f87910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87911g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f87912i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/ChatBubbleViewHolder$a.class */
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatBubbleViewHolder f87913a;

        public a(ChatBubbleViewHolder chatBubbleViewHolder) {
            this.f87913a = chatBubbleViewHolder;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Bl.n nVar = this.f87913a.f87905a;
            nVar.b.setClickable(true);
            ListExtentionsKt.gone(nVar.e);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            Bl.n nVar = this.f87913a.f87905a;
            nVar.b.setClickable(false);
            ListExtentionsKt.invisible(nVar.c);
        }
    }

    public ChatBubbleViewHolder(@NotNull Bl.n nVar, @NotNull Fragment fragment, @NotNull SearchChatGptHolder searchChatGptHolder) {
        super(nVar.a);
        this.f87905a = nVar;
        this.f87906b = fragment;
        this.f87907c = searchChatGptHolder;
        int px = ListExtentionsKt.toPx(4);
        this.h = ListExtentionsKt.lazyUnsafe(new C1959y0(8));
        TintConstraintLayout tintConstraintLayout = nVar.a;
        Context context = tintConstraintLayout.getContext();
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        L l7 = new L(K.a.a, N.o, ThemeStrategy.FollowApp);
        OpusView opusView = nVar.g;
        com.bilibili.app.comm.list.widget.opus.q.b(opusView, context, nVar.a, viewLifecycleOwner, (LifecycleOwner) null, (FragmentManager) null, fragment, (Function1) null, l7, 72);
        ListExtentionsKt.invisible(tintConstraintLayout);
        opusView.e(ColorStateList.valueOf(0), (ColorStateList) null);
        B.j(nVar.c, px, px, px, px);
        B.j(nVar.b, px, px, px, px);
        this.f87912i = new a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0151 A[Catch: all -> 0x0187, TRY_ENTER, TryCatch #0 {all -> 0x0187, blocks: (B:41:0x012b, B:47:0x0162, B:46:0x0151), top: B:54:0x0128 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0188 -> B:47:0x0162). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.comm.list.widget.opus.a p0(com.bilibili.app.comm.list.widget.opus.F r5, com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem.Bubble r6) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.ChatBubbleViewHolder.p0(com.bilibili.app.comm.list.widget.opus.F, com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem$Bubble):com.bilibili.app.comm.list.widget.opus.a");
    }

    public final void q0(Bl.n nVar) {
        Long likeNumber;
        if (!((Boolean) this.h.getValue()).booleanValue()) {
            ListExtentionsKt.gone(nVar.d);
            return;
        }
        SearchChatResultItem searchChatResultItem = this.f87907c.f87937f;
        if (searchChatResultItem == null || (likeNumber = searchChatResultItem.getLikeNumber()) == null) {
            return;
        }
        long jLongValue = likeNumber.longValue();
        if (this.f87911g) {
            nVar.d.setText(NumberFormat_androidKt.format$default(Long.valueOf(jLongValue + 1), "", 0, 2, (Object) null));
        } else {
            nVar.d.setText(NumberFormat_androidKt.format$default(Long.valueOf(jLongValue), "", 0, 2, (Object) null));
        }
    }

    public final void r0(Action action) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f87906b.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new ChatBubbleViewHolder$reportClick$1(this, action, null), 3, (Object) null);
    }

    public final void s0(Bl.n nVar) {
        ListExtentionsKt.visible(nVar.f);
        TintImageView tintImageView = nVar.b;
        ListExtentionsKt.visible(tintImageView);
        TintImageView tintImageView2 = nVar.c;
        ListExtentionsKt.visible(tintImageView2);
        SearchChatResultItem searchChatResultItem = this.f87907c.f87937f;
        LikeState likeState = searchChatResultItem != null ? searchChatResultItem.getLikeState() : null;
        if (likeState == LikeState.LIKE) {
            this.f87911g = true;
            this.f87910f = false;
        } else if (likeState == LikeState.DISLIKE) {
            this.f87910f = true;
            this.f87911g = false;
        }
        if (this.f87911g) {
            tintImageView2.setImageResource(2131236127);
            tintImageView2.setImageTintList(R$color.Brand_pink);
        } else {
            tintImageView2.setImageResource(2131236134);
        }
        if (this.f87910f) {
            tintImageView.setImageResource(2131236109);
        } else {
            tintImageView.setImageResource(2131236133);
        }
        q0(nVar);
        tintImageView2.setClickable(true);
        tintImageView.setClickable(true);
        tintImageView2.setOnClickListener(new f(0, this, nVar));
        tintImageView.setOnClickListener(new g(0, this, nVar));
    }
}
