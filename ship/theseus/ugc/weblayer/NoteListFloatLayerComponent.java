package com.bilibili.ship.theseus.ugc.weblayer;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.note.RspNoteListByOid;
import com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent;
import java.util.ArrayList;
import java.util.List;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.W;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;
import uv0.C8768a;
import vg.G;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent.class */
@StabilityInferred(parameters = 0)
public final class NoteListFloatLayerComponent implements UIComponent<com.bilibili.app.gemini.ui.n<Vu0.o>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98629c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p f98630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f98631b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c f98632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f98633b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<RspNoteListByOid.Note> f98634c = new ArrayList();

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$a$a.class */
        public final class C0931a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f98635c = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f98636a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f98637b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0931a(@NotNull a aVar, View view) {
                super(view);
                this.f98637b = aVar;
                this.f98636a = (TextView) view.findViewById(2131308733);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$a$b.class */
        public final class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public RspNoteListByOid.Note f98638a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public BiliImageView f98639b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public BiliImageView f98640c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public TextView f98641d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public ImageView f98642e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            public TextView f98643f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            public TextView f98644g;

            @NotNull
            public TextView h;
        }

        public a(@NotNull c cVar) {
            this.f98632a = cVar;
        }

        public final void N(@NotNull List<? extends RspNoteListByOid.Note> list, boolean z6) {
            if (z6) {
                ((ArrayList) this.f98634c).clear();
            }
            ((ArrayList) this.f98634c).addAll(list);
            notifyDataSetChanged();
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void O(int r4) {
            /*
                r3 = this;
                r0 = r4
                if (r0 < 0) goto Lb
                r0 = r4
                r5 = r0
                r0 = r4
                r1 = 4
                if (r0 <= r1) goto Ld
            Lb:
                r0 = 4
                r5 = r0
            Ld:
                r0 = r3
                r1 = r5
                r0.f98633b = r1
                r0 = r3
                int r0 = r0.getItemCount()
                r1 = 1
                int r0 = r0 - r1
                r4 = r0
                r0 = r4
                if (r0 <= 0) goto L22
                r0 = r3
                r1 = r4
                r0.notifyItemChanged(r1)
            L22:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent.a.O(int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f98634c).isEmpty() ? 0 : ((ArrayList) this.f98634c).size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            return i7 < ((ArrayList) this.f98634c).size() ? 0 : 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0189  */
        /* JADX WARN: Type inference failed for: r1v39, types: [android.view.View$OnClickListener, java.lang.Object] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.ViewHolder r7, int r8) {
            /*
                Method dump skipped, instruction units count: 815
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3, types: [com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent$a$b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v4 */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            ?? c0931a;
            if (i7 == 0) {
                View viewA = p.a(viewGroup, 2131500326, viewGroup, false);
                final ?? viewHolder = new RecyclerView.ViewHolder(viewA);
                BiliImageView biliImageViewFindViewById = viewA.findViewById(2131296796);
                viewHolder.f98639b = biliImageViewFindViewById;
                BiliImageView biliImageViewFindViewById2 = viewA.findViewById(2131308809);
                viewHolder.f98640c = biliImageViewFindViewById2;
                TextView textView = (TextView) viewA.findViewById(2131304923);
                viewHolder.f98641d = textView;
                viewHolder.f98642e = (ImageView) viewA.findViewById(2131304997);
                viewHolder.f98643f = (TextView) viewA.findViewById(2131313262);
                TextView textView2 = (TextView) viewA.findViewById(2131299243);
                viewHolder.f98644g = textView2;
                TextView textView3 = (TextView) viewA.findViewById(2131307573);
                TextView textView4 = (TextView) viewA.findViewById(2131309971);
                viewHolder.h = textView4;
                biliImageViewFindViewById.setOnClickListener(new View.OnClickListener(this, viewHolder) { // from class: com.bilibili.ship.theseus.ugc.weblayer.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final NoteListFloatLayerComponent.a f98706a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final NoteListFloatLayerComponent.a.b f98707b;

                    {
                        this.f98706a = this;
                        this.f98707b = viewHolder;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f98706a.f98632a.a(true, this.f98707b.f98638a);
                    }
                });
                biliImageViewFindViewById2.setOnClickListener(new SD0.i(2, this, viewHolder));
                textView.setOnClickListener(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.card.d(1, this, (Object) viewHolder));
                textView2.setOnClickListener(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.card.e(1, this, (Object) viewHolder));
                textView3.setOnClickListener(new com.bilibili.bangumi.ui.page.detail.playerV2.widget.d(2, this, (Object) viewHolder));
                textView4.setOnClickListener(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.card.f(1, this, (Object) viewHolder));
                c0931a = viewHolder;
            } else {
                c0931a = new C0931a(this, p.a(viewGroup, 2131500325, viewGroup, false));
            }
            return c0931a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final e f98645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f98646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f98647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f98648d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public RspNoteListByOid.Page f98650f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f98649e = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final List<RspNoteListByOid.Note> f98651g = new ArrayList();

        @NotNull
        public final String h = "UgcNoteListPresenter";

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$b$a.class */
        public static final class a extends BiliApiDataCallback<RspNoteListByOid> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f98652b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f98653c;

            public a(boolean z6, b bVar) {
                this.f98652b = z6;
                this.f98653c = bVar;
            }

            @Override // com.bilibili.okretro.BiliApiDataCallback
            public final void onDataSuccess(RspNoteListByOid rspNoteListByOid) {
                RspNoteListByOid rspNoteListByOid2 = rspNoteListByOid;
                int i7 = 0;
                boolean z6 = this.f98652b;
                b bVar = this.f98653c;
                if (rspNoteListByOid2 == null) {
                    bVar.f98648d = false;
                    bVar.f98645a.a(z6);
                    return;
                }
                bVar.f98647c++;
                bVar.f98649e = rspNoteListByOid2.showPublicNote;
                bVar.f98650f = rspNoteListByOid2.page;
                List<RspNoteListByOid.Note> list = rspNoteListByOid2.list;
                List<RspNoteListByOid.Note> listEmptyList = list;
                if (list == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                ((ArrayList) bVar.f98651g).addAll(listEmptyList);
                bVar.f98648d = false;
                e eVar = bVar.f98645a;
                Ref.ObjectRef<Runnable> objectRef = eVar.f98662f;
                TintSwipeRefreshLayout tintSwipeRefreshLayout = eVar.f98658b;
                Ref.ObjectRef<Runnable> objectRef2 = eVar.f98659c;
                NoteListFloatLayerComponent noteListFloatLayerComponent = eVar.f98661e;
                NoteListFloatLayerComponent.b(tintSwipeRefreshLayout, objectRef2, noteListFloatLayerComponent, objectRef);
                a aVar = eVar.f98657a;
                Ref.ObjectRef<b> objectRef3 = eVar.f98660d;
                if (z6) {
                    NoteListFloatLayerComponent.a(objectRef3, eVar.f98663g, eVar.h, tintSwipeRefreshLayout, aVar, eVar.f98664i, eVar.f98665j, false, listEmptyList);
                } else {
                    b bVar2 = (b) objectRef3.element;
                    if (bVar2 == null) {
                        return;
                    }
                    RspNoteListByOid.Page page = bVar2.f98650f;
                    if (page != null) {
                        i7 = page.total;
                    }
                    long jA = noteListFloatLayerComponent.f98630a.a();
                    int i8 = sh1.l.a;
                    Neurons.reportExposure$default(false, "main.ugc-video-detail.notelist.0.show", W.a(GameCardButton.extraAvid, String.valueOf(jA), "number", String.valueOf(i7)), (List) null, 8, (Object) null);
                    NoteListFloatLayerComponent.a(objectRef3, eVar.f98663g, eVar.h, tintSwipeRefreshLayout, aVar, eVar.f98664i, eVar.f98665j, true, listEmptyList);
                }
                aVar.O(4);
            }

            @Override // com.bilibili.okretro.BiliApiCallback
            public final void onError(Throwable th) {
                b bVar = this.f98653c;
                boolean z6 = this.f98652b;
                if (!z6) {
                    bVar.a();
                }
                bVar.f98648d = false;
                bVar.f98645a.a(z6);
            }
        }

        public b(@NotNull e eVar) {
            this.f98645a = eVar;
        }

        public final void a() {
            this.f98647c = 0;
            this.f98649e = true;
            this.f98650f = null;
            ((ArrayList) this.f98651g).clear();
        }

        public final void b(boolean z6) {
            long j7 = this.f98646b;
            e eVar = this.f98645a;
            if (j7 <= 0) {
                a();
                this.f98648d = false;
                eVar.a(false);
                return;
            }
            if (z6) {
                eVar.f98657a.O(2);
            } else {
                eVar.f98658b.post((Runnable) eVar.f98659c.element);
            }
            long j8 = this.f98646b;
            int i7 = this.f98647c;
            ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).getNoteListByOid(j8, 0, 20, i7 + 1).enqueue(new a(z6, this));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        Object result;
        final NoteListFloatLayerComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoteListFloatLayerComponent noteListFloatLayerComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = noteListFloatLayerComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteListFloatLayerComponent f98654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<b> f98655b;

        public c(NoteListFloatLayerComponent noteListFloatLayerComponent, Ref.ObjectRef<b> objectRef) {
            this.f98654a = noteListFloatLayerComponent;
            this.f98655b = objectRef;
        }

        public final void a(boolean z6, RspNoteListByOid.Note note) {
            RspNoteListByOid.Note.Author author;
            p pVar = this.f98654a.f98630a;
            if (note == null || (author = note.author) == null) {
                return;
            }
            String str = author.name;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            NoteFloatLayerService noteFloatLayerService = pVar.f98698a;
            long jA = noteFloatLayerService.h.a();
            long j7 = author.mid;
            if (jA <= 0 || j7 <= 0) {
                G.a(androidx.compose.runtime.snapshots.z.a(jA, "fail to Author Space: ", ", "), j7, "UgcNoteFloatLayerService");
            } else {
                sh1.e.a(noteFloatLayerService.f98597b, str2, j7, noteFloatLayerService.f98602g.a().f123879a, String.valueOf(jA));
            }
            sh1.l.a(z6 ? "1" : "2", String.valueOf(note.cvid));
        }

        public final void b(RspNoteListByOid.Note note) {
            p pVar = this.f98654a.f98630a;
            if (note == null) {
                return;
            }
            long j7 = note.cvid;
            String str = note.webUrl;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            NoteFloatLayerService noteFloatLayerService = pVar.f98698a;
            noteFloatLayerService.getClass();
            noteFloatLayerService.f98605k.f127998c.tryEmit(new C8768a(str2, j7));
            sh1.l.a("3", String.valueOf(j7));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$d.class */
    public static final class d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.ObjectRef<b> f98656a;

        public d(Ref.ObjectRef<b> objectRef) {
            this.f98656a = objectRef;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            int childCount;
            b bVar;
            if (i8 > 0 && (childCount = recyclerView.getChildCount()) > 0 && (recyclerView.getChildViewHolder(recyclerView.getChildAt(childCount - 1)) instanceof a.C0931a) && (bVar = (b) this.f98656a.element) != null && !bVar.f98648d) {
                int size = ((ArrayList) bVar.f98651g).size();
                RspNoteListByOid.Page page = bVar.f98650f;
                if (size < (page != null ? page.total : 0)) {
                    bVar.f98648d = true;
                    bVar.b(true);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteListFloatLayerComponent$e.class */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f98657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TintSwipeRefreshLayout f98658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.ObjectRef<Runnable> f98659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.ObjectRef<b> f98660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final NoteListFloatLayerComponent f98661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Ref.ObjectRef<Runnable> f98662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f98663g;
        public final Context h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TextView f98664i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final LinearLayout f98665j;

        public e(a aVar, TintSwipeRefreshLayout tintSwipeRefreshLayout, Ref.ObjectRef<Runnable> objectRef, Ref.ObjectRef<b> objectRef2, NoteListFloatLayerComponent noteListFloatLayerComponent, Ref.ObjectRef<Runnable> objectRef3, TextView textView, Context context, TextView textView2, LinearLayout linearLayout) {
            this.f98657a = aVar;
            this.f98658b = tintSwipeRefreshLayout;
            this.f98659c = objectRef;
            this.f98660d = objectRef2;
            this.f98661e = noteListFloatLayerComponent;
            this.f98662f = objectRef3;
            this.f98663g = textView;
            this.h = context;
            this.f98664i = textView2;
            this.f98665j = linearLayout;
        }

        public final void a(boolean z6) {
            if (z6) {
                this.f98657a.O(3);
                return;
            }
            NoteListFloatLayerComponent.b(this.f98658b, this.f98659c, this.f98661e, this.f98662f);
            NoteListFloatLayerComponent.a(this.f98660d, this.f98663g, this.h, this.f98658b, this.f98657a, this.f98664i, this.f98665j, true, CollectionsKt.emptyList());
        }
    }

    public NoteListFloatLayerComponent(@NotNull p pVar) {
        this.f98630a = pVar;
    }

    public static final void a(Ref.ObjectRef objectRef, TextView textView, Context context, TintSwipeRefreshLayout tintSwipeRefreshLayout, a aVar, TextView textView2, LinearLayout linearLayout, boolean z6, List list) {
        Object obj = objectRef.element;
        b bVar = (b) obj;
        if (bVar != null) {
            RspNoteListByOid.Page page = bVar.f98650f;
            int i7 = page != null ? page.total : 0;
            b bVar2 = (b) obj;
            if (bVar2 != null) {
                boolean z7 = bVar2.f98649e;
                if (!z7 || i7 <= 0) {
                    textView.setText(context.getString(2131847453));
                } else {
                    textView.setText(context.getString(2131837657, NumberFormat_androidKt.format$default(Integer.valueOf(i7), (String) null, 0, 3, (Object) null)));
                }
                if (!z7) {
                    tintSwipeRefreshLayout.setEnabled(false);
                    aVar.N(CollectionsKt.emptyList(), true);
                    linearLayout.setVisibility(8);
                    textView2.setVisibility(0);
                    return;
                }
                tintSwipeRefreshLayout.setEnabled(true);
                aVar.N(list, z6);
                textView2.setVisibility(8);
                if (list.isEmpty()) {
                    linearLayout.setVisibility(0);
                } else {
                    linearLayout.setVisibility(8);
                }
            }
        }
    }

    public static final void b(TintSwipeRefreshLayout tintSwipeRefreshLayout, Ref.ObjectRef objectRef, NoteListFloatLayerComponent noteListFloatLayerComponent, Ref.ObjectRef objectRef2) {
        tintSwipeRefreshLayout.removeCallbacks((Runnable) objectRef.element);
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - noteListFloatLayerComponent.f98631b);
        if (iElapsedRealtime < 0 || iElapsedRealtime >= 500) {
            tintSwipeRefreshLayout.post((Runnable) objectRef2.element);
        } else {
            tintSwipeRefreshLayout.postDelayed((Runnable) objectRef2.element, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE - iElapsedRealtime);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.n<Vu0.o> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.weblayer.NoteListFloatLayerComponent.bindToView(com.bilibili.app.gemini.ui.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new com.bilibili.app.gemini.ui.n(Vu0.o.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
