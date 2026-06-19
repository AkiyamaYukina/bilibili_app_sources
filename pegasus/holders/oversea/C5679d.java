package com.bilibili.pegasus.holders.oversea;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import aq0.C4853c;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.iconfont.KtxKt;
import com.bilibili.inline.card.CardPlayState;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.holders.AbstractC5656f;
import com.bilibili.pvtracker.PageViewTracker;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import op0.C8249a;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8340D;
import sp0.C8615d;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.oversea.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/d.class */
@StabilityInferred(parameters = 0)
public final class C5679d extends AbstractC5656f<ip0.d, C5683h> {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f77991G = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.n f77992A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Set<Long> f77993B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f77994C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f77995D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final com.bilibili.biligame.ui.minev3.C f77996E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bililive.room.ui.roomv3.voice.g f77997F;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C4853c f77998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ListPlaceHolderImageView f77999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TintTextView f78000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f78001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final TintTextView f78002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final View f78003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final TintTextView f78004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final VectorTextView f78005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final VectorTextView f78006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final VectorTextView f78007t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final TintLinearLayout f78008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final TintImageView f78009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final TintTextView f78010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final ImageView f78011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f78012y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Lazy f78013z;

    /* JADX INFO: renamed from: com.bilibili.pegasus.holders.oversea.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/d$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f78014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f78015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f78016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f78017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f78018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f78019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f78020g;

        @Nullable
        public final String h;

        public a(@Nullable String str, int i7, int i8, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.f78014a = str;
            this.f78015b = str2;
            this.f78016c = str3;
            this.f78017d = str4;
            this.f78018e = i7;
            this.f78019f = str5;
            this.f78020g = i8;
            this.h = str6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f78014a, aVar.f78014a) && Intrinsics.areEqual(this.f78015b, aVar.f78015b) && Intrinsics.areEqual(this.f78016c, aVar.f78016c) && Intrinsics.areEqual(this.f78017d, aVar.f78017d) && this.f78018e == aVar.f78018e && Intrinsics.areEqual(this.f78019f, aVar.f78019f) && this.f78020g == aVar.f78020g && Intrinsics.areEqual(this.h, aVar.h);
        }

        public final int hashCode() {
            String str = this.f78014a;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.f78015b;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f78016c;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f78017d;
            int iA = androidx.compose.animation.core.I.a(this.f78018e, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
            String str5 = this.f78019f;
            int iA2 = androidx.compose.animation.core.I.a(this.f78020g, (iA + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
            String str6 = this.h;
            return iA2 + (str6 == null ? 0 : str6.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DisplayFields(rcmdReason=");
            sb.append(this.f78014a);
            sb.append(", authorTag=");
            sb.append(this.f78015b);
            sb.append(", avatarUrl=");
            sb.append(this.f78016c);
            sb.append(", coverLeft1Text=");
            sb.append(this.f78017d);
            sb.append(", coverLeft1Icon=");
            sb.append(this.f78018e);
            sb.append(", coverLeft2Text=");
            sb.append(this.f78019f);
            sb.append(", coverLeft2Icon=");
            sb.append(this.f78020g);
            sb.append(", coverRightText=");
            return C8770a.a(sb, this.h, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5679d(@NotNull C4853c c4853c) {
        super(c4853c.f53988a);
        this.f77998k = c4853c;
        this.f77999l = c4853c.f53994g;
        TintTextView tintTextView = c4853c.h;
        this.f78000m = tintTextView;
        ViewGroup.LayoutParams layoutParams = tintTextView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        this.f78001n = layoutParams2 != null ? ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin : 0;
        this.f78002o = c4853c.f53996j;
        this.f78003p = c4853c.f53997k;
        this.f78004q = c4853c.f53989b;
        this.f78005r = this.itemView.findViewById(2131299631);
        this.f78006s = this.itemView.findViewById(2131299632);
        this.f78007t = this.itemView.findViewById(2131299649);
        TintLinearLayout tintLinearLayout = c4853c.f53991d;
        this.f78008u = tintLinearLayout;
        this.f78009v = c4853c.f53992e;
        this.f78010w = c4853c.f53993f;
        ImageView imageView = c4853c.f53995i;
        imageView.setImageResource(2131236254);
        this.f78011x = imageView;
        this.f78012y = ListExtentionsKt.lazyUnsafe(new Vk0.l(this, 2));
        this.f78013z = ListExtentionsKt.lazyUnsafe(new Wx0.a(this, 6));
        this.f77993B = new LinkedHashSet();
        this.f77996E = new com.bilibili.biligame.ui.minev3.C(this, 3);
        this.f77997F = new com.bilibili.bililive.room.ui.roomv3.voice.g(this, 1);
        ListExtentionsKt.setOnClickDebounce$default(tintLinearLayout, 0L, new View.OnClickListener(this) { // from class: com.bilibili.pegasus.holders.oversea.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5679d f77988a;

            {
                this.f77988a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ip0.d dVar;
                Fragment fragment;
                LiveData<LifecycleOwner> viewLifecycleOwnerLiveData;
                LifecycleOwner value;
                LifecycleCoroutineScope lifecycleScope;
                final C5679d c5679d = this.f77988a;
                if (c5679d.f77995D && (dVar = (ip0.d) c5679d.getBindData()) != null) {
                    final long aid = dVar.getAid();
                    if (aid <= 0 || (fragment = c5679d.getFragment()) == null || (viewLifecycleOwnerLiveData = fragment.getViewLifecycleOwnerLiveData()) == null || (value = viewLifecycleOwnerLiveData.getValue()) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(value)) == null || !c5679d.f77993B.add(Long.valueOf(aid))) {
                        return;
                    }
                    boolean addedToWatchLaterLocal = dVar.getAddedToWatchLaterLocal();
                    Neurons.reportClick(false, "tm.recommend.later-watch.0.click", C8340D.c(dVar, null, null, null, null, MapsKt.mapOf(TuplesKt.to("is_inverted_scroll", "1")), 15));
                    BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new GraduationCardHolder$onWatchLaterClick$job$1(!addedToWatchLaterLocal, aid, dVar, c5679d, null), 3, (Object) null).invokeOnCompletion(new Function1(c5679d, aid) { // from class: com.bilibili.pegasus.holders.oversea.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C5679d f77989a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final long f77990b;

                        {
                            this.f77989a = c5679d;
                            this.f77990b = aid;
                        }

                        public final Object invoke(Object obj) {
                            this.f77989a.f77993B.remove(Long.valueOf(this.f77990b));
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
        }, 1, (Object) null);
        ListExtentionsKt.setOnClickDebounce$default(imageView, 0L, new com.bilibili.bililive.biz.livehome.videofeed.adapter.c(this, 1), 1, (Object) null);
    }

    public static void E0(@NotNull ip0.d dVar) {
        Pair pair = TuplesKt.to("is_inverted_scroll", "1");
        String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
        String str = strCurrentPolarisActionId;
        if (strCurrentPolarisActionId == null) {
            str = "";
        }
        C8340D.j(dVar, dVar.f122184z.getIndexInResponse(), MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("action_id", str)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.pegasus.holders.oversea.C5679d.a F0(ip0.d r11) {
        /*
            r0 = r11
            jp0.e r0 = r0.f()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L12
            r0 = r13
            java.lang.String r0 = r0.l()
            r15 = r0
            goto L15
        L12:
            r0 = 0
            r15 = r0
        L15:
            r0 = r11
            com.bilibili.pegasus.data.component.AvatarData r0 = r0.getAvatar()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L3f
            r0 = r13
            java.lang.String r0 = r0.getText()
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L3f
            r0 = r14
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L31
            goto L33
        L31:
            r0 = 0
            r14 = r0
        L33:
            r0 = r14
            r13 = r0
            r0 = r14
            if (r0 != 0) goto L3c
            goto L3f
        L3c:
            goto L81
        L3f:
            r0 = r11
            com.bilibili.pegasus.data.component.UpArgsData r0 = r0.getUpArgs()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L5b
            r0 = r13
            java.lang.String r0 = r0.getUpName()
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L5b
            r0 = r14
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L5b
            goto L5d
        L5b:
            r0 = 0
            r14 = r0
        L5d:
            r0 = r14
            r13 = r0
            r0 = r14
            if (r0 != 0) goto L3c
            r0 = r11
            com.bilibili.pegasus.data.component.ArgsData r0 = r0.getArgs()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7f
            r0 = r13
            java.lang.String r0 = r0.getUpName()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7f
            r0 = r13
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L7f
            goto L3c
        L7f:
            r0 = 0
            r13 = r0
        L81:
            r0 = r11
            com.bilibili.pegasus.data.component.AvatarData r0 = r0.getAvatar()
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L92
            r0 = r14
            java.lang.String r0 = r0.getCover()
            r14 = r0
            goto L94
        L92:
            r0 = 0
            r14 = r0
        L94:
            r0 = r11
            java.lang.String r0 = r0.getCoverLeftText1()
            r16 = r0
            r0 = r11
            int r0 = r0.getCoverLeftIcon1()
            r12 = r0
            r0 = r11
            java.lang.String r0 = r0.getCoverLeftText2()
            r17 = r0
            com.bilibili.pegasus.holders.oversea.d$a r0 = new com.bilibili.pegasus.holders.oversea.d$a
            r1 = r0
            r2 = r15
            r3 = r12
            r4 = r11
            int r4 = r4.getCoverLeftIcon2()
            r5 = r13
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r11
            java.lang.String r9 = r9.getCoverRightText()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.oversea.C5679d.F0(ip0.d):com.bilibili.pegasus.holders.oversea.d$a");
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void B0(InlinePanel inlinePanel) {
        G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C0(boolean z6) {
        String str = z6 ? "已添加" : "稍后再看";
        TintTextView tintTextView = this.f78010w;
        tintTextView.setText(str);
        this.f78008u.setBackgroundResource(z6 ? 2131245498 : 2131245497);
        tintTextView.setTextColorById(z6 ? R$color.Ga6 : R$color.Text_white);
        Drawable appCompatDrawable = KtxKt.getAppCompatDrawable(this.itemView.getContext(), z6 ? 2131238785 : 2131238700);
        TintImageView tintImageView = this.f78009v;
        tintImageView.setImageDrawable(appCompatDrawable);
        tintImageView.setImageTintList(z6 ? R$color.Ga6 : R$color.Text_white);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(@org.jetbrains.annotations.NotNull ip0.d r10) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.oversea.C5679d.u0(ip0.d):void");
    }

    public final void G0() {
        SingleColumnInlineProperty singleColumnInlineProperty;
        ip0.d dVar = (ip0.d) getBindData();
        CardPlayState state = (dVar == null || (singleColumnInlineProperty = dVar.f122155a1) == null) ? null : singleColumnInlineProperty.getState();
        boolean z6 = state == CardPlayState.PLAYING || state == CardPlayState.PAUSE;
        ImageView imageView = this.f78011x;
        boolean z7 = this.f77994C && !z6;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f78012y.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f78013z.getValue());
        C8250b.b(cardPlayTask, z6);
        cardPlayTask.setChronosEnable(true);
        com.bilibili.pegasus.common.n nVar = new com.bilibili.pegasus.common.n((BasePegasusPlayerData) getBindData());
        nVar.setVideoStateCallback(this.f77996E);
        nVar.setFollowStateCallback(this.f77997F);
        cardPlayTask.setTaskRepository(nVar);
        this.f77992A = nVar;
        return cardPlayTask;
    }

    @NotNull
    public final Class<? extends C5683h> getPanelType() {
        return C5683h.class;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        C5683h c5683h = (C5683h) inlinePanel;
        super.onBindPanel(c5683h);
        ImageView imageView = this.f78011x;
        int i7 = 8;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        final ip0.d dVar = (ip0.d) getBindData();
        if (dVar == null) {
            return;
        }
        InlineAvatarWidgetV3 inlineAvatarWidgetV3 = c5683h.h;
        if (inlineAvatarWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            inlineAvatarWidgetV3 = null;
        }
        if (!Intrinsics.areEqual("large_cover_single_v12", "large_cover_v9")) {
            i7 = 0;
        }
        inlineAvatarWidgetV3.setVisibility(i7);
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("is_inverted_scroll", "1"));
        InlineMuteWidgetV3 inlineMuteWidgetV3 = c5683h.f78029n;
        if (inlineMuteWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV3 = null;
        }
        inlineMuteWidgetV3.setVolumeGuidanceListener(new pp0.g(dVar));
        InlineMuteWidgetV3 inlineMuteWidgetV32 = c5683h.f78029n;
        if (inlineMuteWidgetV32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV32 = null;
        }
        inlineMuteWidgetV32.setMuteStateChangeListener(new pp0.v(dVar, null, mapMapOf));
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = c5683h.f78025j;
        if (inlineDanmakuWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmaku");
            inlineDanmakuWidgetV3 = null;
        }
        final String str = null;
        inlineDanmakuWidgetV3.setOnWidgetClickListener(new Function2(dVar, str) { // from class: pp0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ip0.d f125516a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f125517b;

            {
                this.f125516a = dVar;
                this.f125517b = str;
            }

            public final Object invoke(Object obj, Object obj2) {
                C8339C.b(this.f125516a, ((Boolean) obj).booleanValue(), this.f125517b, C8339C.h("1", (Map) obj2));
                return Unit.INSTANCE;
            }
        });
        a aVarF0 = F0(dVar);
        VectorTextView vectorTextView = c5683h.f78026k;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        C8615d.a(vectorTextView, aVarF0.f78017d, aVarF0.f78018e);
        VectorTextView vectorTextView2 = c5683h.f78027l;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        C8615d.a(vectorTextView2, aVarF0.f78019f, aVarF0.f78020g);
        ImageView imageView2 = c5683h.f78028m;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.holders.oversea.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5679d f77987a;

            {
                this.f77987a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5679d c5679d = this.f77987a;
                C8249a.h(c5679d, c5679d, null, null, "1", null, true, false, true, true, MapsKt.mapOf(TuplesKt.to("is_inverted_scroll", "1")), 182);
            }
        });
        c5683h.setOnClickListener(new com.bilibili.biligame.ui.minev3.A(c5683h, 1));
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final /* bridge */ /* synthetic */ void onFirstExpose(PegasusHolderData pegasusHolderData, int i7) {
        E0((ip0.d) pegasusHolderData);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final void p0() {
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView q0() {
        return this.f78005r;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView r0() {
        return this.f78006s;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView s0() {
        return this.f78007t;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView t0() {
        return this.f78000m;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: v0 */
    public final /* bridge */ /* synthetic */ void onFirstExpose(BasePegasusData basePegasusData, int i7) {
        E0((ip0.d) basePegasusData);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void y0() {
        ip0.d dVar = (ip0.d) getBindData();
        if (dVar == null) {
            return;
        }
        CardFragmentPlayerContainerLayout cardFragmentPlayerContainerLayoutZ0 = z0();
        AV.c cVar = new AV.c(this, 2);
        Pb.B b7 = new Pb.B(this, 1);
        boolean z6 = false;
        if (dVar.isInlinePlayable()) {
            PlayerArgs playerArgs = dVar.getPlayerArgs();
            z6 = false;
            if (playerArgs != null ? playerArgs.clickToPlay() : false) {
                z6 = true;
            }
        }
        cardFragmentPlayerContainerLayoutZ0.bindViewPlay(cVar, b7, false, z6, C8340D.d(dVar));
    }
}
