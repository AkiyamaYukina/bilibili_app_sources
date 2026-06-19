package com.bilibili.studio.videoeditor.bgm;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.studio.videoeditor.bgm.bgmlist.model.EditBgmTabList;
import com.bilibili.studio.videoeditor.bgm.bgmlist.model.EditBgmTabSep;
import com.bilibili.studio.videoeditor.bgm.favorite.model.EditBgmFavSep;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.util.Y;
import com.hihonor.push.sdk.HonorMessageService;
import com.hihonor.push.sdk.j0;
import com.hihonor.push.sdk.u;
import fB0.a;
import fB0.a$d;
import fB0.f;
import fB0.f$a;
import iB0.InterfaceC7538d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/e.class */
public final class e extends RecyclerView.Adapter<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cB0.b f109054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f109056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f109057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bgm f109058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f109059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public eB0.b f109060g;
    public eB0.o h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f109061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC7538d f109062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f109063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Sg.a f109064l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/e$a.class */
    public final class a implements f$a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f109065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f109066b;

        public a(e eVar, int i7) {
            this.f109066b = eVar;
            this.f109065a = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/e$b.class */
    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f109067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f109068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f109069c;

        public b(View view) {
            super(view);
            this.f109067a = (TextView) view.findViewById(2131314484);
            this.f109068b = (TextView) view.findViewById(2131314763);
            this.f109069c = view.findViewById(2131311123);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/e$c.class */
    public static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f109070a;

        public c(View view) {
            super(view);
            this.f109070a = (TextView) view.findViewById(2131314496);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/e$d.class */
    public static final class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dB0.a f109071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Sg.a f109072b;

        /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.studio.videoeditor.bgm.f] */
        public d(View view) {
            super(view);
            RecyclerView.Adapter adapter = new RecyclerView.Adapter();
            ((dB0.a) adapter).b = false;
            this.f109071a = adapter;
            ((dB0.a) adapter).c = new u(this) { // from class: com.bilibili.studio.videoeditor.bgm.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Object f109075a;

                {
                    this.f109075a = this;
                }

                public void a(j0 j0Var) {
                    HonorMessageService.o((HonorMessageService) this.f109075a, j0Var);
                }
            };
            RecyclerView recyclerView = (RecyclerView) view.findViewById(2131298518);
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 5));
            Y.a(recyclerView);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.bgm.e$e, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/e$e.class */
    public static final class C1205e extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f109073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinearLayout f109074b;

        public C1205e(View view) {
            super(view);
            this.f109073a = (TextView) view.findViewById(2131312845);
            this.f109074b = (LinearLayout) view.findViewById(2131305635);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/e$f.class */
    public static class f extends RecyclerView.ViewHolder {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cB0.b, java.lang.Object] */
    public e() {
        ?? obj = new Object();
        obj.f58752a = new ArrayList<>();
        this.f109054a = obj;
        this.f109055b = -1;
        this.f109056c = -1;
        this.f109057d = -1L;
        this.f109063k = "";
        obj.f58755d = new com.bilibili.studio.videoeditor.bgm.c(this);
    }

    public final void N() {
        this.f109055b = -1;
        this.f109056c = -1;
        this.f109057d = -1L;
        Bgm bgm = this.f109058e;
        if (bgm != null) {
            bgm.setSelected(false);
            this.f109058e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        cB0.b bVar = this.f109054a;
        if (bVar == null) {
            return 0;
        }
        return bVar.f58754c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        cB0.b bVar = this.f109054a;
        if (bVar.f58754c <= 0) {
            return 0;
        }
        Bgm bgmA = bVar.a(i7);
        if (bgmA instanceof BGMSearchRecommend) {
            return 1;
        }
        if (bgmA instanceof EditBgmFavSep) {
            return 2;
        }
        if (bgmA instanceof EditBgmTabSep) {
            return 3;
        }
        if (bgmA instanceof EditBgmTabList) {
            return 4;
        }
        if (bgmA instanceof BgmTab) {
            return ((BgmTab) bgmA).id == cB0.d.a().f58766g ? 6 : 5;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i7) {
        a.e eVar = (f) viewHolder;
        Bgm bgmA = this.f109054a.a(i7);
        if (bgmA instanceof BGMSearchRecommend) {
            ((c) eVar).f109070a.setOnClickListener(new c90.b(this, 1));
            return;
        }
        if (bgmA instanceof EditBgmFavSep) {
            b bVar = (b) eVar;
            if (((EditBgmFavSep) bgmA).getStatus() == 0) {
                bVar.f109069c.setVisibility(8);
                bVar.f109068b.setVisibility(8);
                bVar.f109067a.setVisibility(0);
                return;
            } else {
                bVar.f109069c.setVisibility(0);
                bVar.f109068b.setVisibility(0);
                bVar.f109067a.setVisibility(8);
                return;
            }
        }
        if (bgmA instanceof EditBgmTabSep) {
            C1205e c1205e = (C1205e) eVar;
            c1205e.f109073a.setText(((EditBgmTabSep) bgmA).getTabName());
            final EditBgmTabSep editBgmTabSep = (EditBgmTabSep) bgmA;
            c1205e.f109074b.setOnClickListener(new View.OnClickListener(this, editBgmTabSep) { // from class: com.bilibili.studio.videoeditor.bgm.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f108937a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final EditBgmTabSep f108938b;

                {
                    this.f108937a = this;
                    this.f108938b = editBgmTabSep;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e eVar2 = this.f108937a;
                    EditBgmTabSep editBgmTabSep2 = this.f108938b;
                    Sg.a aVar = eVar2.f109064l;
                    if (aVar != null) {
                        aVar.a(editBgmTabSep2.getBgmTab());
                    }
                }
            });
            return;
        }
        if (bgmA instanceof EditBgmTabList) {
            d dVar = (d) eVar;
            List<BgmTab> bgmTabList = ((EditBgmTabList) bgmA).getBgmTabList();
            dB0.a aVar = dVar.f109071a;
            aVar.a = bgmTabList;
            aVar.notifyDataSetChanged();
            aVar.a = bgmTabList;
            aVar.notifyDataSetChanged();
            dVar.f109072b = this.f109064l;
            return;
        }
        if (bgmA instanceof BgmTab) {
            BgmTab bgmTab = (BgmTab) bgmA;
            a.e eVar2 = eVar;
            eVar2.itemView.setShowMusicDetailsEntry(this.f109059f);
            eVar2.itemView.setData(bgmTab);
            eVar2.itemView.setOnClickMoreListener(new a$d(this) { // from class: com.bilibili.studio.videoeditor.bgm.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f108939a;

                {
                    this.f108939a = this;
                }
            });
            eVar2.itemView.setItemEventListener(new a(this, i7));
            eVar2.itemView.setOnPageChangeListener(new com.bilibili.studio.videoeditor.bgm.d(this, i7, bgmTab));
            return;
        }
        if (this.f109061i != 4097) {
            iB0.b.d.a(bgmA);
        }
        f.c cVar = (f.c) eVar;
        cVar.a.setData(bgmA);
        cVar.a.setShowDelete(this.f109061i == 4097);
        cVar.a.setEventListener(new a(this, i7));
        cVar.a.setShowMusicDetailsEntry(this.f109059f);
        if (i7 - 1 >= 0) {
            Bgm bgmA2 = this.f109054a.a(i7);
            if (bgmA2 instanceof EditBgmTabSep) {
                EditBgmTabSep editBgmTabSep2 = (EditBgmTabSep) bgmA2;
                if (editBgmTabSep2.getBgmTab() == null || editBgmTabSep2.getBgmTab().hasDisplayed) {
                    return;
                }
                editBgmTabSep2.getBgmTab().hasDisplayed = true;
                String tabName = editBgmTabSep2.getTabName();
                InfoEyesManager infoEyesManager = InfoEyesManager.getInstance();
                JSONObject jSONObjectF = C6635h.f();
                jSONObjectF.put("where", (Object) C6635h.g());
                jSONObjectF.put("class", (Object) tabName);
                infoEyesManager.report2(false, "000377", new String[]{"musiclist_class_exposure", "show", jSONObjectF.toJSONString()});
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i7) {
        return i7 == 1 ? new c(p.a(viewGroup, 2131495054, viewGroup, false)) : i7 == 2 ? new b(p.a(viewGroup, 2131498300, viewGroup, false)) : i7 == 3 ? new C1205e(p.a(viewGroup, 2131498246, viewGroup, false)) : i7 == 4 ? new d(p.a(viewGroup, 2131498247, viewGroup, false)) : i7 == 5 ? new RecyclerView.ViewHolder(new fB0.a(viewGroup.getContext(), 3)) : i7 == 6 ? new RecyclerView.ViewHolder(new fB0.a(viewGroup.getContext(), 4)) : new f.c(new fB0.f(viewGroup.getContext()));
    }
}
