package com.bilibili.search2.result.holder.collection;

import BS0.A;
import BS0.B;
import BS0.o;
import Bl.f1;
import Jh.q;
import Ob1.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.inline.config.search.SearchAutoPlayUtilsKt;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.inline.widgetV3.OnSeekReportListener;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.listplayer.ListPlayerManager;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.fasthybrid.biz.debug.n0;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.api.SearchCollectionItem;
import com.bilibili.search2.api.UgcInline;
import com.bilibili.search2.widget.SearchPlayerContainerLayout;
import com.tencent.connect.common.Constants;
import dt0.AbstractC6841d;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.basic.BaseMainFrameFragment;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import yt0.AbstractC9088a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/collection/g.class */
@StabilityInferred(parameters = 0)
public final class g extends AbstractC9088a<com.bilibili.search2.panel.j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Fragment f88064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewGroup f88065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SearchCollectionItem f88066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final UgcInline f88067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final j f88068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final f1 f88069g;

    @NotNull
    public final q h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SearchPlayerContainerLayout f88070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f88071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f88072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f88073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f88074m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/collection/g$a.class */
    public static final class a implements OnSeekReportListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f88075a;

        public a(g gVar) {
            this.f88075a = gVar;
        }

        public final void onSeekStart(int i7) {
            g gVar = this.f88075a;
            String moduleType = gVar.f88068f.getModuleType();
            AbstractC6841d abstractC6841d = gVar.f129854a;
            Xs0.b.i("search.search-result.search-card.all.click", null, moduleType, abstractC6841d, null, null, Xs0.b.d(abstractC6841d, "seek", null, 2), i7 != 1 ? i7 != 3 ? "" : "video_slide" : NotificationCompat.CATEGORY_PROGRESS, null, null, false, null, 6912);
        }
    }

    public g(@Nullable Fragment fragment, @NotNull ViewGroup viewGroup, @NotNull SearchCollectionItem searchCollectionItem, @Nullable UgcInline ugcInline, @NotNull j jVar) {
        super(searchCollectionItem);
        this.f88064b = fragment;
        this.f88065c = viewGroup;
        this.f88066d = searchCollectionItem;
        this.f88067e = ugcInline;
        this.f88068f = jVar;
        f1 f1VarInflate = f1.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        this.f88069g = f1VarInflate;
        this.h = q.bind(f1VarInflate.c.b);
        this.f88070i = (SearchPlayerContainerLayout) f1VarInflate.a.findViewWithTag(ListPlayerManager.AUTO_PLAY_VIEW_TAG);
        this.f88072k = ListExtentionsKt.lazyUnsafe(new A(this, 4));
        f1VarInflate.e.setVisibility(ListExtentionsKt.toVisibility(!searchCollectionItem.getHideTitle()));
        this.f88073l = new h(this);
        this.f88074m = ListExtentionsKt.lazyUnsafe(new B(this, 4));
    }

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
    @Override // yt0.AbstractC9088a
    public final void a() {
        this.f88065c.removeAllViews();
        ViewGroup viewGroup = this.f88065c;
        f1 f1Var = this.f88069g;
        viewGroup.addView(f1Var.a);
        View.OnClickListener oVar = new o(this, 3);
        ConstraintLayout constraintLayout = f1Var.a;
        constraintLayout.setOnClickListener(oVar);
        ListPlaceHolderImageView listPlaceHolderImageView = f1Var.d;
        listPlaceHolderImageView.setOnClickListener(new b(this, 0));
        listPlaceHolderImageView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.search2.result.holder.collection.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f88059a;

            {
                this.f88059a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f88059a.f88068f.x0("long_press");
                return true;
            }
        });
        constraintLayout.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.search2.result.holder.collection.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f88060a;

            {
                this.f88060a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f88060a.f88068f.x0("long_press");
                return true;
            }
        });
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: com.bilibili.search2.result.holder.collection.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f88061a;

            {
                this.f88061a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f88061a.f88068f.x0("long_press");
                return true;
            }
        };
        CardFragmentPlayerContainerLayout cardFragmentPlayerContainerLayout = this.f88070i;
        cardFragmentPlayerContainerLayout.setOnLongClickListener(onLongClickListener);
        f1Var.f.setVisibility(4);
        ((DefaultCardPlayBehaviorWrap) this.f88074m.getValue()).reset(this);
        ((InlineUGCHistoryServiceV2) this.f88072k.getValue()).reset(this.f88066d.getUri());
        cardFragmentPlayerContainerLayout.setId(ViewCompat.generateViewId());
        cardFragmentPlayerContainerLayout.setIconVisible(true);
        UgcInline ugcInline = this.f88067e;
        if (ugcInline != null) {
            com.bilibili.search2.utils.extension.c.a(listPlaceHolderImageView, ugcInline.getCover(), null, false, null, null, 0, 0, 254);
            PlayerArgs playerArgs = ugcInline.getPlayerArgs();
            listPlaceHolderImageView.showPlaceHolderInnerDrawable(playerArgs != null ? playerArgs.hidePlayButton : false);
            q qVar = this.h;
            ListExtentionsKt.setTextWithIcon$default(qVar.c, ugcInline.getCoverLeftText1(), ugcInline.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
            ListExtentionsKt.setTextWithIcon$default(qVar.d, ugcInline.getCoverLeftText2(), ugcInline.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
            f1Var.c.c.setText(ugcInline.getCoverRightText());
            EQ.i iVar = new EQ.i(this, 1);
            p pVar = new p(this, 3);
            PlayerArgs playerArgs2 = ugcInline.getPlayerArgs();
            boolean z6 = (playerArgs2 == null || playerArgs2.hidePlayButton) ? false : true;
            PlayerArgs playerArgs3 = ugcInline.getPlayerArgs();
            CardFragmentPlayerContainerLayout.bindViewPlay$default(this.f88070i, iVar, pVar, z6, (playerArgs3 != null ? playerArgs3.manualPlay : 0) == 1, (Map) null, 16, (Object) null);
        }
    }

    @Override // yt0.AbstractC9088a
    public final void b(@NotNull InlinePanel inlinePanel) {
        onBindPanel((com.bilibili.search2.panel.j) inlinePanel);
    }

    @Override // yt0.AbstractC9088a
    public final void c(boolean z6, @Nullable InlinePanel inlinePanel) {
        com.bilibili.search2.panel.j jVar = inlinePanel instanceof com.bilibili.search2.panel.j ? (com.bilibili.search2.panel.j) inlinePanel : null;
        if (jVar != null) {
            jVar.setNetAlertEnable(z6);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        this.f88071j = z6;
        cardPlayTask.setNetworkAlertEnable(SearchAutoPlayUtilsKt.getEnableNetworkAlert(z6));
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f88074m.getValue());
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f88072k.getValue());
        cardPlayTask.setChronosEnable(true);
        cardPlayTask.setMute(com.bilibili.app.comm.list.common.widget.p.a);
        cardPlayTask.setStartPosition(-1L);
        return cardPlayTask;
    }

    @Override // yt0.AbstractC9088a
    public final void d(@Nullable InlinePanel inlinePanel) {
        com.bilibili.search2.panel.j jVar = inlinePanel instanceof com.bilibili.search2.panel.j ? (com.bilibili.search2.panel.j) inlinePanel : null;
        if (jVar != null) {
            jVar.showWidgets();
        }
    }

    @NotNull
    public final InlineGestureSeekBarContainer e() {
        f1 f1Var = this.f88069g;
        f1Var.f.setVisibility(0);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = f1Var.a.findViewById(2131303684);
        UgcInline ugcInline = this.f88067e;
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(ugcInline != null ? ugcInline.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void onBindPanel(@NotNull com.bilibili.search2.panel.j jVar) {
        jVar.o();
        jVar.setNetAlertEnable(SearchAutoPlayUtilsKt.getEnableNetworkAlert(this.f88071j));
        jVar.setOnLongClickListener(new QG.e(this, 3));
        UgcInline ugcInline = this.f88067e;
        if (ugcInline == null || !ugcInline.getHideDanmakuSwitch()) {
            jVar.getDanmaku().setVisible(true);
            jVar.getDanmaku().setVisibility(0);
        } else {
            jVar.getDanmaku().setVisible(false);
            jVar.getDanmaku().setVisibility(8);
        }
        jVar.getDanmaku().setOnWidgetClickListener(new com.bilibili.app.comm.restrict.lessonsmode.ui.b(this, 1));
        final int i7 = 0;
        jVar.n().setOnWidgetClickListener(new Function1(this, i7) { // from class: com.bilibili.search2.result.holder.collection.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f88062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f88063b;

            {
                this.f88062a = i7;
                this.f88063b = this;
            }

            public final Object invoke(Object obj) {
                switch (this.f88062a) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        g gVar = (g) this.f88063b;
                        String moduleType = gVar.f88068f.getModuleType();
                        AbstractC6841d abstractC6841d = gVar.f129854a;
                        Xs0.b.i("search.search-result.search-card.all.click", null, moduleType, abstractC6841d, null, null, Xs0.b.d(abstractC6841d, "volume", null, 2), !zBooleanValue ? "volume_on" : "volume_off", null, null, false, null, 6912);
                        return Unit.INSTANCE;
                    default:
                        ((MutableBundleLike) obj).put("search_default_word", JSON.toJSONString(((BaseMainFrameFragment) this.f88063b).q));
                        return null;
                }
            }
        });
        jVar.getGestureSeekWidget().setOnClickListener(new com.bilibili.search2.result.holder.collection.a(this, 0));
        jVar.getGestureSeekWidget().setSeekReportListener(new a(this));
        jVar.l().setVisible(Ct0.B.b());
        jVar.l().setVisibility(ListExtentionsKt.toVisibility(Ct0.B.b()));
        if (Ct0.B.b()) {
            jVar.l().setOnClickListener(new n0(this, 1));
        }
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerE = e();
        inlineGestureSeekBarContainerE.setVisibility(0);
        inlineGestureSeekBarContainerE.resetProgress();
        jVar.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerE);
        jVar.addOnDetachListener(this.f88073l);
        ListExtentionsKt.setTextWithIcon$default(jVar.getCoverLeftText1(), ugcInline != null ? ugcInline.getCoverLeftText1() : null, ugcInline != null ? ugcInline.getCoverLeftIcon1() : 0, 2131103591, 0.0f, 0.0f, 48, (Object) null);
        VectorTextView coverLeftText2 = jVar.getCoverLeftText2();
        String coverLeftText22 = null;
        if (ugcInline != null) {
            coverLeftText22 = ugcInline.getCoverLeftText2();
        }
        ListExtentionsKt.setTextWithIcon$default(coverLeftText2, coverLeftText22, ugcInline != null ? ugcInline.getCoverLeftIcon2() : 0, 2131103591, 0.0f, 0.0f, 48, (Object) null);
        InlineTask inlineToastTask = new InlineToastTask(jVar);
        InlineTask inlineTaskM = jVar.m();
        inlineTaskM.setManual(this.f88071j);
        Unit unit = Unit.INSTANCE;
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTaskM, jVar.getSeekGuideWidget(), inlineToastTask})).execute();
        jVar.m().setOnWidgetClickListener(this.f88068f);
    }

    public final void g(boolean z6) {
        j jVar = this.f88068f;
        jVar.clickWithRefreshStatusViews(jVar.f88080f);
        com.bilibili.search2.utils.q.b(jVar, this.f129854a, z6, false, null, false, this.f88066d.getUri(), 116);
        String moduleType = jVar.getModuleType();
        UgcInline ugcInline = this.f88067e;
        Xs0.b.i("search.search-result.search-card.all.click", null, moduleType, this.f129854a, ugcInline != null ? ugcInline.getParam() : null, null, Xs0.b.d(this.f129854a, "inline", null, 2), null, ugcInline != null ? ugcInline.getCardGoto() : null, null, false, null, Constants.CODE_REQUEST_MAX);
    }

    @NotNull
    public final IInlineCardData getCardData() {
        return this.f129854a;
    }

    @NotNull
    public final ViewGroup getInlineContainer() {
        return this.f88070i;
    }

    @NotNull
    public final Class<com.bilibili.search2.panel.j> getPanelType() {
        return com.bilibili.search2.panel.j.class;
    }
}
