package com.bilibili.ship.theseus.ugc.pages;

import MQ0.B;
import Vu0.w;
import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.opd.app.bizcommon.ui.widget.MallDialog;
import com.bilibili.ship.theseus.ugc.pages.UgcPagesService;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.mall.data.page.ipstory.bean.IpStoryItemBean;
import com.mall.ui.page.ip.story.adapter.IpStoryAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SpacesItemDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/n.class */
@StabilityInferred(parameters = 0)
public final class n extends com.bilibili.app.gemini.ui.m<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UgcPagesService.b f98045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f98046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f98047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f98048d = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/n$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<Av0.a> f98049a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Av0.a f98050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f98051c;

        public a(n nVar) {
            this.f98051c = nVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f98049a).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            TintTextView tintTextView = bVar.f98052a;
            final Av0.a aVar = (Av0.a) CollectionsKt.getOrNull(this.f98049a, i7);
            if (aVar == null) {
                return;
            }
            Context context = bVar.itemView.getContext();
            View view = bVar.itemView;
            final int i8 = 0;
            final n nVar = this.f98051c;
            view.setOnClickListener(new View.OnClickListener(i8, nVar, aVar) { // from class: com.bilibili.ship.theseus.ugc.pages.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f98042a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f98043b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f98044c;

                {
                    this.f98042a = i8;
                    this.f98043b = nVar;
                    this.f98044c = aVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f98042a) {
                        case 0:
                            n nVar2 = (n) this.f98043b;
                            Av0.a aVar2 = (Av0.a) this.f98044c;
                            UgcPagesService ugcPagesService = nVar2.f98045a.f98016a;
                            UGCPlaybackRepository uGCPlaybackRepository = ugcPagesService.f98002d;
                            com.bilibili.ship.theseus.united.page.view.a aVar3 = ugcPagesService.f98000b;
                            UGCPlaybackRepository.g(uGCPlaybackRepository, aVar3.a(), aVar2.f591b, null, null, 0, 12);
                            HashMap mapC = O4.b.c("module_type", "1");
                            mapC.put("goto_avid", String.valueOf(aVar3.a()));
                            mapC.put("goto_cid", String.valueOf(aVar2.f591b));
                            Unit unit = Unit.INSTANCE;
                            PageReportService.g(ugcPagesService.h, "united.player-video-detail.multi-p.p.click", mapC, 4);
                            break;
                        default:
                            IpStoryAdapter.IpStoryHolder ipStoryHolder = (IpStoryAdapter.IpStoryHolder) this.f98043b;
                            IpStoryItemBean ipStoryItemBean = (IpStoryItemBean) this.f98044c;
                            MallDialog mallDialog = new MallDialog(ipStoryHolder.itemView.getContext());
                            mallDialog.setMsg(B.n(2131829821));
                            mallDialog.setTwoBtnText(B.n(2131829959), B.n(2131829499));
                            mallDialog.setDialogClickListener(new com.mall.ui.page.ip.story.adapter.d(mallDialog, ipStoryItemBean, ipStoryHolder));
                            mallDialog.show(2);
                            break;
                    }
                }
            });
            tintTextView.setSelected(false);
            tintTextView.setText(aVar.f593d);
            Av0.a aVar2 = this.f98050b;
            if (aVar2 == null || !Intrinsics.areEqual(aVar2, aVar)) {
                tintTextView.setTextColor(ThemeUtils.getThemeAttrColor(context, R.attr.textColorPrimary));
            } else {
                tintTextView.setTextColor(ThemeUtils.getColorById(context, 2131103284));
                tintTextView.setSelected(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(p.a(viewGroup, 2131500385, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/n$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TintTextView f98052a;

        public b(@NotNull View view) {
            super(view);
            this.f98052a = (TintTextView) view.findViewById(2131308958);
        }
    }

    public n(@NotNull UgcPagesService.b bVar, @NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2) {
        this.f98045a = bVar;
        this.f98046b = stateFlow;
        this.f98047c = stateFlow2;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcPagesPanelComponent$bind$2((w) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        w wVarInflate = w.inflate(layoutInflater, viewGroup, false);
        SpacesItemDecoration rVar = new r(Uj0.c.b(12.0f, context), context);
        RecyclerView recyclerView = wVarInflate.f25984c;
        recyclerView.addItemDecoration(rVar);
        recyclerView.setItemAnimator(null);
        return wVarInflate;
    }
}
