package com.bilibili.playset;

import F3.L3;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import bs0.InterfaceC5150a;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.router.Router;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySetGroups;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.collection.enums.CollectionCardEnum;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import com.bilibili.playset.constants.FolderGroupEnum;
import cs0.InterfaceC6755a;
import ds0.AbstractC6837d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ks0.AbstractC7785a;
import ks0.InterfaceC7786b;
import ls0.C7889a;
import org.jetbrains.annotations.NotNull;
import ys0.C9087f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/x0.class */
public final class x0 extends ls0.f<ls0.g, C7889a> implements C9087f.a<ls0.g>, InterfaceC5988l<InterfaceC7786b>, InterfaceC5150a<InterfaceC6755a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f85824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f85825g;
    public static final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f85826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f85827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f85828k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlaySetFragment f85829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f85830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<String, Boolean> f85831e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/x0$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f85832a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x006d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.playset.collection.enums.CollectionTypeEnum[] r0 = com.bilibili.playset.collection.enums.CollectionTypeEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.playset.x0.a.f85832a = r0
                r0 = r4
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.SEASON     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.playset.x0.a.f85832a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.PAY_SEASON     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.playset.x0.a.f85832a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.UGC     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.playset.x0.a.f85832a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.UGC_SEASON     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.playset.x0.a.f85832a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.OGV     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.playset.x0.a.f85832a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.FOLDER     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.playset.x0.a.f85832a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.AUDIO     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L58:
                return
            L59:
                r4 = move-exception
                goto L14
            L5d:
                r4 = move-exception
                goto L1f
            L61:
                r4 = move-exception
                goto L2a
            L65:
                r4 = move-exception
                goto L35
            L69:
                r4 = move-exception
                goto L40
            L6d:
                r4 = move-exception
                goto L4c
            L71:
                r4 = move-exception
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.x0.a.m8602clinit():void");
        }
    }

    static {
        int length = CollectionCardEnum.values().length;
        f85824f = length;
        f85825g = length + 1;
        h = length + 2;
        f85826i = length + 3;
        f85827j = length + 4;
        f85828k = length + 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    @Override // bs0.InterfaceC5150a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(@androidx.annotation.Nullable final cs0.InterfaceC6755a r10, int r11) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.x0.E(cs0.a, int):void");
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // bs0.InterfaceC5150a
    public final void F(@NonNull Context context, @Nullable InterfaceC6755a interfaceC6755a, int i7) {
        List<? extends ls0.c> list;
        ls0.d dVar = this.f123367a;
        if (dVar == null || (list = dVar.f123360a) == null || list.isEmpty() || interfaceC6755a == null) {
            return;
        }
        ls0.d dVar2 = this.f123367a;
        AbstractC7785a<InterfaceC7786b> abstractC7785a = (AbstractC7785a) dVar2.f123360a.get(dVar2.a(i7).f123363a);
        if (abstractC7785a instanceof PlaySetGroups.DefaultFolderGroup) {
            com.bilibili.playset.utils.g.a(context, FolderGroupEnum.DEFAULT);
        }
        S(abstractC7785a, interfaceC6755a);
        int i8 = a.f85832a[interfaceC6755a.getCardType().ordinal()];
        PlaySetFragment playSetFragment = this.f85829c;
        switch (i8) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
                BLRouter.routeTo(new RouteRequest.Builder(Uri.parse(interfaceC6755a.getJumpLink())).extras((Function1) new Object()).requestCode(-1).build(), playSetFragment);
                break;
            case 6:
                BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("bilibili://music/playlist/detail/")).requestCode(300).extras(new RE.d(interfaceC6755a, 2)).build(), playSetFragment);
                break;
        }
    }

    @Override // ls0.f
    public final void N(C7889a c7889a, ls0.c cVar, int i7) {
        InterfaceC7786b interfaceC7786b;
        List items = cVar.getItems();
        if (items == null || items.isEmpty() || (interfaceC7786b = (InterfaceC7786b) items.get(i7)) == null) {
            return;
        }
        if ((c7889a instanceof C5996p) && (interfaceC7786b instanceof com.bilibili.playset.api.f)) {
            ((C5996p) c7889a).p0((AbstractC7785a) cVar, (com.bilibili.playset.api.f) interfaceC7786b);
            return;
        }
        if ((c7889a instanceof AbstractC6837d) && (interfaceC7786b instanceof InterfaceC6755a)) {
            Data data = (Data) interfaceC7786b;
            AbstractC6837d abstractC6837d = (AbstractC6837d) c7889a;
            abstractC6837d.f116647a = data;
            abstractC6837d.s0(data);
            CollectionTypeEnum cardType = data.getCardType();
            CollectionTypeEnum collectionTypeEnum = CollectionTypeEnum.PAY_SEASON;
            abstractC6837d.r0(cardType != collectionTypeEnum);
            CollectionTypeEnum collectionTypeEnum2 = CollectionTypeEnum.UGC;
            if (cardType == collectionTypeEnum2 || cardType == CollectionTypeEnum.OGV || cardType == CollectionTypeEnum.UGC_SEASON || cardType == CollectionTypeEnum.SEASON || cardType == collectionTypeEnum) {
                String key = data.getKey();
                Boolean bool = this.f85831e.get(key);
                if (bool == null || !bool.booleanValue()) {
                    this.f85831e.put(key, Boolean.TRUE);
                    if (data.getCardType() == CollectionTypeEnum.SEASON || data.getCardType() == collectionTypeEnum) {
                        HashMap map = new HashMap(1);
                        map.put("flow", "drama");
                        Neurons.reportExposure(false, "main.my-favorit.detailpage-contentlist.0.show", map);
                        return;
                    }
                    if (data.getCardType() == CollectionTypeEnum.OGV) {
                        HashMap map2 = new HashMap(1);
                        map2.put("flow", "pgcvideo_detail");
                        Neurons.reportExposure(false, "main.my-favorit.detailpage-contentlist.0.show", map2);
                    } else if (data.getCardType() == collectionTypeEnum2) {
                        if (data.getAttached() != null) {
                            HashMap map3 = new HashMap(1);
                            map3.put("flow", "drama_ugcvideo_detail");
                            Neurons.reportExposure(false, "main.my-favorit.detailpage-contentlist.0.show", map3);
                        } else {
                            HashMap map4 = new HashMap(1);
                            map4.put("flow", "ugcvideo_detail");
                            Neurons.reportExposure(false, "main.my-favorit.detailpage-contentlist.0.show", map4);
                        }
                    }
                }
            }
        }
    }

    @Override // ls0.f
    public final void O(ls0.g gVar, ls0.c cVar) {
        if (cVar instanceof PlaySetGroups.DefaultFolderGroup) {
            if (gVar instanceof C5986k) {
                ((C5986k) gVar).r0((PlaySetGroups.DefaultFolderGroup) cVar);
            }
        } else if (cVar instanceof PlaySetGroups.OtherFolderGroup) {
            PlaySetGroups.OtherFolderGroup otherFolderGroup = (PlaySetGroups.OtherFolderGroup) cVar;
            if (gVar instanceof E0) {
                ((E0) gVar).r0(otherFolderGroup);
            } else if (gVar instanceof R0) {
                R0 r02 = (R0) gVar;
                nn.e.a(r02.itemView, 2131846089, r02.f84022b);
                r02.f84023c.setText(r02.itemView.getResources().getString(2131833087, Integer.valueOf(otherFolderGroup.getTotalCount())));
                r02.itemView.setOnClickListener(new Cs.d0(otherFolderGroup, 1));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.playset.k, ls0.g] */
    public final ls0.g Q(int i7, ViewGroup viewGroup) {
        if (i7 != f85824f) {
            if (i7 == f85825g || i7 == h || i7 == f85827j) {
                int i8 = E0.f83855e;
                return new E0(p.a(viewGroup, 2131499710, viewGroup, false));
            }
            if (i7 != f85826i) {
                return new ls0.g(new View(viewGroup.getContext()));
            }
            int i9 = R0.f84021d;
            return new R0(p.a(viewGroup, 2131499719, viewGroup, false));
        }
        int i10 = C5986k.f85091i;
        final View viewA = p.a(viewGroup, 2131499709, viewGroup, false);
        ?? gVar = new ls0.g(viewA);
        gVar.f85092b = (ImageView) viewA.findViewById(2131312046);
        gVar.f85093c = (TextView) viewA.findViewById(2131308958);
        gVar.f85094d = (TextView) viewA.findViewById(2131299492);
        TintTextView tintTextView = (TintTextView) viewA.findViewById(2131314994);
        gVar.f85095e = tintTextView;
        ImageView imageView = (ImageView) viewA.findViewById(2131303197);
        gVar.f85096f = imageView;
        ImageView imageView2 = (ImageView) viewA.findViewById(2131304345);
        gVar.f85097g = imageView2;
        tintTextView.setCompoundDrawableTintList(2131103284, 0, 0, 0);
        tintTextView.setOnClickListener(new View.OnClickListener(viewA, this) { // from class: com.bilibili.playset.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f85086a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final x0 f85087b;

            {
                this.f85086a = viewA;
                this.f85087b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                View view2 = this.f85086a;
                x0 x0Var = this.f85087b;
                com.bilibili.playset.utils.g.a(view2.getContext(), FolderGroupEnum.DEFAULT);
                if (view.getTag() instanceof InterfaceC7786b) {
                    Neurons.reportClick(false, "main.my-favorite.playall-button.0.click");
                    PlaySetFragment playSetFragment = x0Var.f85829c;
                    playSetFragment.getClass();
                    Router.global().with(playSetFragment).forResult(4).open(Uri.parse("bilibili://music/playlist/playpage/").buildUpon().appendPath(Long.toString(playSetFragment.lf())).appendQueryParameter("from_spmid", "main.my-favorite.0.0").appendQueryParameter("page_type", Integer.toString(3)).build());
                }
            }
        });
        imageView.setOnClickListener(new Up0.o(this, 2));
        imageView2.setOnClickListener(new LJ.h(1, (RecyclerView.ViewHolder) gVar, this));
        return gVar;
    }

    public final void R(int i7, long j7) {
        ls0.d dVar = this.f123367a;
        int size = dVar.f123360a.size();
        int itemCount = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC7785a abstractC7785a = (AbstractC7785a) dVar.f123360a.get(i8);
            if (i7 == abstractC7785a.getGroupType()) {
                Iterator it = abstractC7785a.getItems().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    int i10 = i9 + 1;
                    InterfaceC7786b interfaceC7786b = (InterfaceC7786b) it.next();
                    i9 = i10;
                    if (interfaceC7786b instanceof InterfaceC6755a) {
                        i9 = i10;
                        if (((InterfaceC6755a) interfaceC7786b).getId() == j7) {
                            int i11 = itemCount + i10;
                            abstractC7785a.setTotalCount(abstractC7785a.getTotalCount() - 1);
                            notifyItemChanged(i11 - i10);
                            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ((HashMap) this.f85829c.f84004g.f129851e).get(Long.valueOf(abstractC7785a.getGroupType()));
                            if (viewHolder != null && (viewHolder instanceof E0)) {
                                ((E0) viewHolder).r0((PlaySetGroups.OtherFolderGroup) abstractC7785a);
                            }
                            it.remove();
                            if (dVar.f123361b[i8]) {
                                notifyItemRemoved(i11);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            itemCount = dVar.f123361b[i8] ? abstractC7785a.getItemCount() + 1 + itemCount : itemCount + 1;
        }
    }

    public final void S(@NonNull AbstractC7785a<InterfaceC7786b> abstractC7785a, @NonNull InterfaceC6755a interfaceC6755a) {
        switch (a.f85832a[interfaceC6755a.getCardType().ordinal()]) {
            case 1:
            case 2:
                if (!(abstractC7785a instanceof PlaySetGroups.DefaultFolderGroup)) {
                    long id = interfaceC6755a.getId();
                    HashMap map = new HashMap(2);
                    map.put("daid", Long.toString(id));
                    map.put("module", Integer.toString(2));
                    Neurons.reportClick(false, "main.my-favorit.notdefault-fav.all.click", map);
                } else {
                    long id2 = interfaceC6755a.getId();
                    HashMap map2 = new HashMap(2);
                    map2.put("daid", Long.toString(id2));
                    map2.put("flow", "drama");
                    Neurons.reportClick(false, "main.my-favorit.detailpage-contentlist.0.click", map2);
                }
                break;
            case 3:
                long id3 = interfaceC6755a.getId();
                HashMap map3 = new HashMap(2);
                map3.put(GameCardButton.extraAvid, Long.toString(id3));
                map3.put("flow", "ugcvideo_detail");
                Neurons.reportClick(false, "main.my-favorit.detailpage-contentlist.0.click", map3);
                break;
            case 4:
                long id4 = interfaceC6755a.getId();
                long id5 = interfaceC6755a.getAttached() == null ? -1L : interfaceC6755a.getAttached().getId();
                HashMap map4 = new HashMap(3);
                map4.put(GameCardButton.extraAvid, Long.toString(id4));
                map4.put("daid", Long.toString(id5));
                map4.put("flow", "drama_ugcvideo_detail");
                Neurons.reportClick(false, "main.my-favorit.detailpage-contentlist.0.click", map4);
                break;
            case 5:
                long id6 = interfaceC6755a.getId();
                HashMap map5 = new HashMap(2);
                map5.put(GameCardButton.extraAvid, Long.toString(id6));
                map5.put("flow", "pgcvideo_detail");
                Neurons.reportClick(false, "main.my-favorit.detailpage-contentlist.0.click", map5);
                break;
            case 6:
                if (abstractC7785a instanceof PlaySetGroups.OtherFolderGroup) {
                    if (interfaceC6755a.getCreatorId() != BiliAccounts.get(this.f85829c.getContext()).mid()) {
                        s20.b.d(2, interfaceC6755a.getId());
                    } else {
                        s20.b.d(1, interfaceC6755a.getId());
                    }
                }
                break;
        }
    }

    @Override // ys0.C9087f.a
    public final RecyclerView.ViewHolder a(int i7, RecyclerView recyclerView) {
        ls0.g gVarQ;
        int i8;
        int i9;
        int i10;
        int itemViewType = getItemViewType(i7);
        int i11 = f85824f;
        if (itemViewType == i11 || itemViewType == (i8 = f85825g) || itemViewType == (i9 = h) || itemViewType == (i10 = f85827j) || itemViewType == f85826i) {
            gVarQ = Q(itemViewType, recyclerView);
        } else {
            long jB = b(i7);
            gVarQ = jB == 0 ? Q(i11, recyclerView) : jB == 1 ? Q(i8, recyclerView) : jB == 2 ? Q(i9, recyclerView) : jB == 4 ? Q(i10, recyclerView) : Q(itemViewType, recyclerView);
        }
        return gVarQ;
    }

    @Override // ys0.C9087f.a
    public final long b(int i7) {
        ls0.d dVar = this.f123367a;
        try {
            ls0.e eVarA = dVar.a(i7);
            if (((AbstractC7785a) dVar.f123360a.get(eVarA.f123363a)).getGroupType() == 3 || !dVar.f123361b[eVarA.f123363a]) {
                return -1L;
            }
            return r0.getGroupType();
        } catch (RuntimeException e7) {
            HashMap map = new HashMap();
            map.put("exception.msg", e7.getMessage());
            map.put("list.expandedGroupIndexes", Arrays.toString(dVar.f123361b));
            map.put("list.groups", dVar.f123360a.toString());
            Neurons.trackCustom("list.playset.expandable_adapter_get_header_id", -1, 0, 0, 0, 0, (String) null, map, new L3(7));
            return -1L;
        }
    }

    @Override // ys0.C9087f.a
    public final void d(int i7, RecyclerView.ViewHolder viewHolder) {
        ls0.g gVar = (ls0.g) viewHolder;
        ls0.d dVar = this.f123367a;
        ls0.e eVarA = dVar.a(i7);
        AbstractC7785a abstractC7785a = (AbstractC7785a) dVar.f123360a.get(eVarA.f123363a);
        if (gVar instanceof E0) {
            ((E0) gVar).r0((PlaySetGroups.OtherFolderGroup) abstractC7785a);
        } else if (gVar instanceof C5986k) {
            ((C5986k) gVar).r0((PlaySetGroups.DefaultFolderGroup) abstractC7785a);
        }
        if (dVar.f123361b[eVarA.f123363a]) {
            gVar.q0();
        } else {
            gVar.p0();
        }
    }

    @Override // ys0.C9087f.a
    public final boolean e(MotionEvent motionEvent, int i7) {
        ls0.d dVar = this.f123367a;
        ls0.e eVarA = dVar.a(i7);
        if (!dVar.f123361b[eVarA.f123363a]) {
            return false;
        }
        RecyclerView recyclerView = this.f85830d;
        boolean zS0 = false;
        if (recyclerView != null) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i7);
            zS0 = false;
            if (viewHolderFindViewHolderForAdapterPosition instanceof C5986k) {
                zS0 = ((C5986k) viewHolderFindViewHolderForAdapterPosition).s0(motionEvent);
            }
        }
        boolean zS02 = zS0;
        if (!zS0) {
            AbstractC7785a abstractC7785a = (AbstractC7785a) dVar.f123360a.get(eVarA.f123363a);
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ((HashMap) this.f85829c.f84004g.f129851e).get(Long.valueOf(abstractC7785a.getGroupType()));
            zS02 = zS0;
            if (viewHolder instanceof C5986k) {
                zS02 = ((C5986k) viewHolder).s0(motionEvent);
            }
        }
        if (zS02) {
            return true;
        }
        P(i7);
        return true;
    }

    @Override // ls0.f, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        ls0.d dVar = this.f123367a;
        ls0.e eVarA = dVar.a(i7);
        int i8 = eVarA.f123366d;
        AbstractC7785a abstractC7785a = (AbstractC7785a) dVar.f123360a.get(eVarA.f123363a);
        if (i8 == 1) {
            InterfaceC7786b interfaceC7786b = (InterfaceC7786b) abstractC7785a.getItems().get(eVarA.f123364b);
            if (interfaceC7786b instanceof com.bilibili.playset.api.f) {
                return f85828k;
            }
            if (interfaceC7786b instanceof InterfaceC6755a) {
                CollectionTypeEnum cardType = ((InterfaceC6755a) interfaceC7786b).getCardType();
                if (cardType == CollectionTypeEnum.UNKNOWN) {
                    return -1;
                }
                return cardType.ordinal();
            }
        } else if (i8 == 2) {
            boolean z6 = abstractC7785a instanceof PlaySetGroups.DefaultFolderGroup;
            int i9 = f85824f;
            if (z6) {
                return i9;
            }
            if (abstractC7785a instanceof PlaySetGroups.OtherFolderGroup) {
                PlaySetGroups.OtherFolderGroup otherFolderGroup = (PlaySetGroups.OtherFolderGroup) abstractC7785a;
                return otherFolderGroup.getGroupType() == 3 ? f85826i : otherFolderGroup.getGroupType() == 1 ? f85825g : otherFolderGroup.getGroupType() == 2 ? h : otherFolderGroup.getGroupType() == 4 ? f85827j : i9;
            }
        }
        return i8;
    }

    @Override // bs0.InterfaceC5150a
    public final void m(@NonNull Context context, @Nullable InterfaceC6755a interfaceC6755a, int i7) {
        if (interfaceC6755a != null) {
            ls0.d dVar = this.f123367a;
            AbstractC7785a<InterfaceC7786b> abstractC7785a = (AbstractC7785a) dVar.f123360a.get(dVar.a(i7).f123363a);
            if (abstractC7785a instanceof PlaySetGroups.DefaultFolderGroup) {
                com.bilibili.playset.utils.g.a(context, FolderGroupEnum.DEFAULT);
            }
            S(abstractC7785a, interfaceC6755a);
            PlaySetFragment playSetFragment = this.f85829c;
            if (playSetFragment.p3() == null || interfaceC6755a.getCreatorId() <= 0) {
                return;
            }
            Uri.Builder builderBuildUpon = Uri.parse("bilibili://space/" + interfaceC6755a.getCreatorId()).buildUpon();
            builderBuildUpon.appendQueryParameter("from_spmid", "main.my-favorite.0.0");
            BLRouter.routeTo(RouteRequestKt.toRouteRequest(builderBuildUpon.build()), playSetFragment.p3());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        CollectionCardEnum collectionCardEnum;
        if (i7 != f85824f && i7 != f85825g && i7 != h && i7 != f85827j && i7 != f85826i) {
            return (i7 < 0 || i7 >= CollectionCardEnum.values().length || (collectionCardEnum = CollectionCardEnum.values()[i7]) == null) ? i7 == f85828k ? C5996p.q0(this, viewGroup) : new ds0.l(viewGroup, this) : (C7889a) collectionCardEnum.getHolderBuilder().invoke(viewGroup, this);
        }
        ls0.g gVarQ = Q(i7, viewGroup);
        gVarQ.f123369a = this;
        return gVarQ;
    }

    @Override // com.bilibili.playset.InterfaceC5988l
    public final void t(AbstractC7785a<InterfaceC7786b> abstractC7785a, C5996p c5996p) {
        if (abstractC7785a.getGroupType() == 0) {
            PlaySetGroups.DefaultFolderGroup defaultFolderGroup = (PlaySetGroups.DefaultFolderGroup) abstractC7785a;
            if (defaultFolderGroup.detail == null || defaultFolderGroup.isLoading) {
                return;
            }
            defaultFolderGroup.isLoading = true;
            c5996p.f85185e.f84073a = 2;
            c5996p.t0();
            String string = Long.toString(defaultFolderGroup.detail.id);
            int i7 = defaultFolderGroup.curPage;
            ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).queryMedias(string, Integer.toString(i7 + 1), Integer.toString(40)).enqueue(new w0(this, defaultFolderGroup, c5996p));
            return;
        }
        int groupType = abstractC7785a.getGroupType();
        PlaySetFragment playSetFragment = this.f85829c;
        if (groupType == 1) {
            if (abstractC7785a instanceof PlaySetGroups.OtherFolderGroup) {
                PlaySetGroups.OtherFolderGroup otherFolderGroup = (PlaySetGroups.OtherFolderGroup) abstractC7785a;
                if (otherFolderGroup.isLoading) {
                    return;
                }
                otherFolderGroup.isLoading = true;
                c5996p.f85185e.f84073a = 2;
                c5996p.t0();
                String accessKey = BiliAccounts.get(playSetFragment.getContext()).getAccessKey();
                long jMid = BiliAccounts.get(playSetFragment.getContext()).mid();
                int i8 = otherFolderGroup.curPage + 1;
                otherFolderGroup.curPage = i8;
                ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).getCreatedPlaySet(accessKey, jMid, i8, 20, null, null).enqueue(new u0(this, c5996p, otherFolderGroup));
                return;
            }
            return;
        }
        if (abstractC7785a.getGroupType() == 2 && (abstractC7785a instanceof PlaySetGroups.OtherFolderGroup)) {
            PlaySetGroups.OtherFolderGroup otherFolderGroup2 = (PlaySetGroups.OtherFolderGroup) abstractC7785a;
            if (otherFolderGroup2.isLoading) {
                return;
            }
            otherFolderGroup2.isLoading = true;
            c5996p.f85185e.f84073a = 2;
            c5996p.t0();
            String accessKey2 = BiliAccounts.get(playSetFragment.getContext()).getAccessKey();
            long jMid2 = BiliAccounts.get(playSetFragment.getContext()).mid();
            PlaySetService playSetService = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
            int i9 = otherFolderGroup2.curPage + 1;
            otherFolderGroup2.curPage = i9;
            playSetService.getFavPlaySet(accessKey2, jMid2, i9, 20).enqueue(new v0(this, c5996p, otherFolderGroup2));
        }
    }
}
