package com.bilibili.playset;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.router.Router;
import com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySet;
import com.bilibili.playset.api.PlaySetGroups;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.collection.api.CollectionViewModel;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import com.bilibili.playset.dialog.OperateItem;
import com.bilibili.playset.dialog.PlaylistDetailBottomSheet;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.tencent.bugly.crashreport.CrashReport;
import cs0.InterfaceC6755a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import ks0.AbstractC7785a;
import ks0.InterfaceC7786b;
import tv.danmaku.android.log.BLog;
import ys0.C9087f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/PlaySetFragment.class */
public class PlaySetFragment extends BaseSwipeRefreshFragment implements ThemeWatcher.Observer, IPvTracker, PlaylistDetailBottomSheet.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f84000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5898c f84001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public x0 f84003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C9087f f84004g;
    public TintProgressDialog h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PlaySetGroups.DefaultFolderGroup f84005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CollectionViewModel f84006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC7786b f84007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC7785a<InterfaceC7786b> f84008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.bilibili.app.gemini.player.widget.like.l f84009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f84010n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f83999b = "favorite";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Cs.B f84011o = new Cs.B(this, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.bilibili.bililive.room.ui.danmaku.chronos.controller.i f84012p = new com.bilibili.bililive.room.ui.danmaku.chronos.controller.i(this, 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.bilibili.bililive.room.ui.danmaku.chronos.controller.j f84013q = new com.bilibili.bililive.room.ui.danmaku.chronos.controller.j(this, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.bilibili.bililive.room.ui.danmaku.chronos.controller.k f84014r = new com.bilibili.bililive.room.ui.danmaku.chronos.controller.k(this, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.bilibili.bililive.room.ui.danmaku.chronos.controller.l f84015s = new com.bilibili.bililive.room.ui.danmaku.chronos.controller.l(this, 1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.bilibili.bililive.room.ui.danmaku.chronos.controller.m f84016t = new com.bilibili.bililive.room.ui.danmaku.chronos.controller.m(this, 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/PlaySetFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f84018a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003e
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
                com.bilibili.playset.PlaySetFragment.a.f84018a = r0
                r0 = r4
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.SEASON     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.bilibili.playset.PlaySetFragment.a.f84018a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.UGC_SEASON     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.bilibili.playset.PlaySetFragment.a.f84018a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.AUDIO     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.bilibili.playset.PlaySetFragment.a.f84018a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.FOLDER     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.PlaySetFragment.a.m8452clinit():void");
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "main.my-favorite.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v42, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.playset.dialog.PlaylistDetailBottomSheet.c
    public final void h(int i7) {
        PlaySet playSet;
        PlaySet playSet2;
        PlaySet playSet3;
        PlaySet playSet4;
        long jLf;
        if (i7 != 1) {
            switch (i7) {
                case 5:
                    if (!BiliAccounts.get(getContext()).isLogin()) {
                        nf();
                    } else {
                        HashMap map = new HashMap(1);
                        map.put("manage", "4");
                        Neurons.reportClick(false, "main.my-favorite.plmanage-more.all.click", map);
                        Router.RouterProxy routerProxyWith = Router.global().with(this);
                        StringBuilder sb = new StringBuilder("bilibili://browser?url=");
                        sb.append(Uri.encode("https://www.bilibili.com/appeal/?playlistId=" + lf()));
                        routerProxyWith.open(sb.toString());
                        com.bilibili.playset.utils.f.f85659a = "playlist.playlist-detail.PLmanage-more.*.click";
                        HashMap<String, String> map2 = new HashMap<>(2);
                        com.bilibili.playset.utils.f.f85660b = map2;
                        map2.put("manage", "3");
                        String str = com.bilibili.playset.utils.f.f85659a;
                        if (str != null) {
                            if (com.bilibili.playset.utils.f.f85660b.size() != 0) {
                                Neurons.reportClick(false, str, com.bilibili.playset.utils.f.f85660b);
                            } else {
                                Neurons.reportClick$default(false, str, (Map) null, 4, (Object) null);
                            }
                        }
                    }
                    break;
                case 6:
                    s20.b.a(1, 1);
                    InterfaceC7786b interfaceC7786b = this.f84007k;
                    if (interfaceC7786b != null && (interfaceC7786b instanceof InterfaceC6755a)) {
                        InterfaceC6755a interfaceC6755a = (InterfaceC6755a) interfaceC7786b;
                        if (interfaceC6755a.getAttached() != null) {
                            s20.b.c(2, interfaceC6755a.getId());
                        } else {
                            long id = interfaceC6755a.getId();
                            HashMap mapA = pf.f.a(3, "manage", "1", "flow", "ugcvideo_detail");
                            mapA.put(GameCardButton.extraAvid, Long.toString(id));
                            Neurons.reportClick(false, "main.my-favorit.avmanage-more.0.click", mapA);
                        }
                        this.f84006j.J0(interfaceC6755a.getCardType().value(), interfaceC6755a.getId(), lf(), interfaceC6755a.getKey());
                    }
                    break;
                case 7:
                    if (!BiliAccounts.get(getContext()).isLogin()) {
                        nf();
                    } else {
                        HashMap map3 = new HashMap(1);
                        map3.put("manage", "2");
                        Neurons.reportClick(false, "main.my-favorite.plmanage-more.all.click", map3);
                        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("bilibili://music/playlist/manage")).requestCode(2).extras(new com.bilibili.ad.adview.search.inline.card155.r(this, 3)).build(), this);
                    }
                    break;
                case 8:
                    HashMap map4 = new HashMap(1);
                    map4.put("manage", "3");
                    Neurons.reportClick(false, "main.my-favorite.plmanage-more.all.click", map4);
                    new AlertDialog.Builder(getContext()).setTitle("").setMessage(getString(2131842576)).setNegativeButton(2131841494, (DialogInterface.OnClickListener) new Object()).setPositiveButton(2131841445, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.playset.D0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final PlaySetFragment f83853a;

                        {
                            this.f83853a = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            PlaySetFragment playSetFragment = this.f83853a;
                            playSetFragment.f84006j.K0(playSetFragment.lf());
                            dialogInterface.dismiss();
                        }
                    }).show();
                    break;
                case 9:
                    if (this.f84007k != null) {
                        AbstractC7785a<InterfaceC7786b> abstractC7785a = this.f84008l;
                        if (abstractC7785a instanceof PlaySetGroups.OtherFolderGroup) {
                            s20.b.a(3, 1);
                            jLf = ((PlaySetGroups.OtherFolderGroup) this.f84008l).id;
                        } else if (abstractC7785a instanceof PlaySetGroups.DefaultFolderGroup) {
                            s20.b.a(1, 1);
                            jLf = lf();
                        } else {
                            jLf = -1;
                        }
                        InterfaceC7786b interfaceC7786b2 = this.f84007k;
                        if (interfaceC7786b2 instanceof InterfaceC6755a) {
                            InterfaceC6755a interfaceC6755a2 = (InterfaceC6755a) interfaceC7786b2;
                            CollectionTypeEnum cardType = interfaceC6755a2.getCardType();
                            if (cardType != CollectionTypeEnum.FOLDER) {
                                CollectionTypeEnum collectionTypeEnum = CollectionTypeEnum.SEASON;
                                if (cardType == collectionTypeEnum) {
                                    long id2 = interfaceC6755a2.getId();
                                    HashMap mapA2 = pf.f.a(3, "manage", "3", "flow", "drama");
                                    mapA2.put(GameCardButton.extraAvid, Long.toString(id2));
                                    Neurons.reportClick(false, "main.my-favorit.avmanage-more.0.click", mapA2);
                                    if (jLf != lf()) {
                                        CollectionViewModel collectionViewModel = this.f84006j;
                                        long id3 = interfaceC6755a2.getId();
                                        collectionViewModel.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("media_id", id3);
                                        bundle.putInt("media_type", collectionTypeEnum.value());
                                        bundle.putLong("group_id", jLf);
                                        collectionViewModel.f84211d.setValue(TuplesKt.to(0, bundle));
                                        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).deleteSeason(Long.toString(id3)).enqueue(new com.bilibili.playset.collection.api.c(collectionViewModel, bundle));
                                    } else {
                                        this.f84006j.J0(interfaceC6755a2.getCardType().value(), interfaceC6755a2.getId(), jLf, interfaceC6755a2.getKey());
                                    }
                                } else if (cardType == CollectionTypeEnum.UGC_SEASON && interfaceC6755a2.getAttached() != null) {
                                    InterfaceC6755a attached = interfaceC6755a2.getAttached();
                                    s20.b.c(3, attached.getId());
                                    this.f84006j.J0(attached.getCardType().value(), attached.getId(), jLf, interfaceC6755a2.getKey());
                                }
                            } else {
                                this.f84006j.I0(this.f84008l.getGroupType(), interfaceC6755a2.getId(), PageViewTracker.getInstance().currentPolarisActionId());
                            }
                        }
                    }
                    break;
                case 10:
                    s20.b.a(2, 2);
                    InterfaceC7786b interfaceC7786b3 = this.f84007k;
                    if (interfaceC7786b3 != null && (interfaceC7786b3 instanceof InterfaceC6755a)) {
                        final long id4 = ((InterfaceC6755a) interfaceC7786b3).getId();
                        final int groupType = this.f84008l.getGroupType();
                        new AlertDialog.Builder(getContext()).setTitle("").setMessage(getString(2131842604)).setNegativeButton(2131841494, (DialogInterface.OnClickListener) new Object()).setPositiveButton(2131841445, new DialogInterface.OnClickListener(this, groupType, id4) { // from class: com.bilibili.playset.A0

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final PlaySetFragment f83843a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final int f83844b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final long f83845c;

                            {
                                this.f83843a = this;
                                this.f83844b = groupType;
                                this.f83845c = id4;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8) {
                                PlaySetFragment playSetFragment = this.f83843a;
                                int i9 = this.f83844b;
                                long j7 = this.f83845c;
                                CollectionViewModel collectionViewModel2 = playSetFragment.f84006j;
                                collectionViewModel2.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("group_type", i9);
                                bundle2.putLong("folder_id", j7);
                                collectionViewModel2.f84213f.setValue(TuplesKt.to(0, bundle2));
                                com.bilibili.playset.api.m.a(String.valueOf(j7), new com.bilibili.playset.collection.api.d(collectionViewModel2, bundle2));
                                dialogInterface.dismiss();
                            }
                        }).show();
                    }
                    break;
                case 11:
                    s20.b.a(2, 1);
                    InterfaceC7786b interfaceC7786b4 = this.f84007k;
                    if (interfaceC7786b4 != null && (interfaceC7786b4 instanceof InterfaceC6755a)) {
                        this.f84006j.I0(this.f84008l.getGroupType(), ((InterfaceC6755a) this.f84007k).getId(), PageViewTracker.getInstance().currentPolarisActionId());
                    }
                    break;
            }
        } else if (BiliAccounts.get(getContext()).isLogin()) {
            HashMap map5 = new HashMap(1);
            map5.put("manage", "1");
            Neurons.reportClick(false, "main.my-favorite.plmanage-more.all.click", map5);
            Router.RouterProxy routerProxyWith2 = Router.global().with(this).with("id", Long.toString(lf()));
            PlaySetGroups.DefaultFolderGroup defaultFolderGroup = this.f84005i;
            Router.RouterProxy routerProxyWith3 = routerProxyWith2.with("title", (defaultFolderGroup == null || (playSet4 = defaultFolderGroup.detail) == null) ? getResources().getString(2131842609) : playSet4.title);
            PlaySetGroups.DefaultFolderGroup defaultFolderGroup2 = this.f84005i;
            Router.RouterProxy routerProxyWith4 = routerProxyWith3.with("intro", (defaultFolderGroup2 == null || (playSet3 = defaultFolderGroup2.detail) == null) ? "" : playSet3.intro);
            PlaySetGroups.DefaultFolderGroup defaultFolderGroup3 = this.f84005i;
            String str2 = "";
            if (defaultFolderGroup3 != null) {
                PlaySet playSet5 = defaultFolderGroup3.detail;
                str2 = playSet5 == null ? "" : playSet5.cover;
            }
            Router.RouterProxy routerProxyWith5 = routerProxyWith4.with("cover", str2);
            PlaySetGroups.DefaultFolderGroup defaultFolderGroup4 = this.f84005i;
            Router.RouterProxy routerProxyWith6 = routerProxyWith5.with("cover_type", Integer.toString((defaultFolderGroup4 == null || (playSet2 = defaultFolderGroup4.detail) == null) ? -1 : playSet2.coverType));
            PlaySetGroups.DefaultFolderGroup defaultFolderGroup5 = this.f84005i;
            Router.RouterProxy routerProxyWith7 = routerProxyWith6.with("is_default", Boolean.toString((defaultFolderGroup5 == null || (playSet = defaultFolderGroup5.detail) == null || !playSet.isDefault()) ? false : true));
            PlaySetGroups.DefaultFolderGroup defaultFolderGroup6 = this.f84005i;
            boolean z6 = false;
            if (defaultFolderGroup6 != null) {
                PlaySet playSet6 = defaultFolderGroup6.detail;
                z6 = false;
                if (playSet6 != null) {
                    z6 = false;
                    if (playSet6.isPublic()) {
                        z6 = true;
                    }
                }
            }
            routerProxyWith7.with("private", Boolean.toString(!z6)).forResult(2).open("activity://playset/box/edit");
        } else {
            nf();
        }
        this.f84007k = null;
        this.f84008l = null;
    }

    public final void kf() {
        TintProgressDialog tintProgressDialog = this.h;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
    }

    public final long lf() {
        PlaySet playSet;
        PlaySetGroups.DefaultFolderGroup defaultFolderGroup = this.f84005i;
        return (defaultFolderGroup == null || (playSet = defaultFolderGroup.detail) == null) ? -1L : playSet.id;
    }

    public final void mf() {
        if (this.f84002e || this.f84006j == null) {
            return;
        }
        this.f84002e = true;
        long jMid = BiliAccounts.get(getContext()).mid();
        CollectionViewModel collectionViewModel = this.f84006j;
        collectionViewModel.f84209b.setValue(TuplesKt.to(0, (Object) null));
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).getGroupList(jMid).enqueue(new com.bilibili.playset.collection.api.e(collectionViewModel));
    }

    public final void nf() {
        Router.global().with(this).forResult(1001).open("activity://main/login/");
    }

    public final void of(AbstractC7785a<InterfaceC7786b> abstractC7785a, InterfaceC7786b interfaceC7786b) {
        int i7 = 2;
        if (!(interfaceC7786b instanceof PlaySet) || ((PlaySet) interfaceC7786b).id != lf()) {
            if (interfaceC7786b instanceof InterfaceC6755a) {
                int i8 = a.f84018a[((InterfaceC6755a) interfaceC7786b).getCardType().ordinal()];
                if (i8 == 1) {
                    i7 = 6;
                } else if (i8 != 2) {
                    i7 = 4;
                    if (i8 != 3) {
                        i7 = i8 != 4 ? 3 : abstractC7785a.getGroupType() == 1 ? 7 : 8;
                    }
                } else {
                    i7 = 5;
                }
            } else {
                i7 = -1;
            }
        }
        if (i7 < 0) {
            return;
        }
        this.f84007k = interfaceC7786b;
        this.f84008l = abstractC7785a;
        ArrayList<OperateItem> arrayList = PlaylistDetailBottomSheet.f84715e;
        PlaylistDetailBottomSheet playlistDetailBottomSheetA = PlaylistDetailBottomSheet.a.a(i7);
        playlistDetailBottomSheetA.show(getChildFragmentManager(), "PlaylistDetailBottomSheet");
        playlistDetailBottomSheetA.f84727d.f84729b = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (i7 == 300 && i8 == -1 && intent != null) {
            long j7 = BundleUtil.getLong(intent.getExtras(), "playlistId", new long[]{-1});
            if (BundleUtil.getBoolean(intent.getExtras(), "key_result_is_create_folder", new boolean[]{false})) {
                setRefreshStart();
                mf();
                return;
            } else {
                if (j7 == -1 || this.f84003f == null) {
                    return;
                }
                this.f84003f.R(BundleUtil.getBoolean(intent.getExtras(), "is_delete", new boolean[]{false}) ? 1 : 2, j7);
                return;
            }
        }
        if (i7 == 2 && i8 == -1) {
            if (intent == null) {
                setRefreshStart();
                mf();
                return;
            }
            String stringExtra = intent.getStringExtra("api_params_sort_record");
            if (TextUtils.isEmpty(stringExtra)) {
                setRefreshStart();
                mf();
            } else {
                setRefreshStart();
                this.f84006j.L0(lf(), stringExtra);
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (bundle != null || (arguments = getArguments()) == null) {
            return;
        }
        this.f83999b = arguments.getString("tab", "favorite");
        this.f84010n = arguments.getString("expand", null);
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment
    public final View onCreateView(LayoutInflater layoutInflater, SwipeRefreshLayout swipeRefreshLayout, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(2131499694, (ViewGroup) swipeRefreshLayout, false);
        this.f84000c = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, getContext()) { // from class: com.bilibili.playset.PlaySetFragment.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaySetFragment f84017a;

            {
                this.f84017a = this;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (IndexOutOfBoundsException e7) {
                    CrashReport.postCatchedException(e7);
                    BLog.e(this.f84017a.getClass().getSimpleName(), e7);
                }
            }
        });
        if (this.f84000c.getItemAnimator() == null || this.f84001d == null) {
            C5898c c5898c = new C5898c();
            this.f84001d = c5898c;
            c5898c.setAddDuration(200L);
            this.f84001d.setRemoveDuration(200L);
            C5898c c5898c2 = this.f84001d;
            RecyclerView recyclerView2 = this.f84000c;
            c5898c2.f84123l = recyclerView2;
            recyclerView2.setItemAnimator(c5898c2);
        }
        if (this.f84003f != null) {
            C9087f c9087f = this.f84004g;
            if (c9087f != null) {
                c9087f.a();
            }
            this.f84004g = new C9087f(this.f84000c, this.f84003f);
            this.f84000c.stopScroll();
            this.f84000c.addItemDecoration(this.f84004g);
            this.f84000c.setAdapter(this.f84003f);
        }
        CollectionViewModel collectionViewModel = (CollectionViewModel) new ViewModelProvider(this).get(CollectionViewModel.class);
        this.f84006j = collectionViewModel;
        collectionViewModel.f84209b.observe(getViewLifecycleOwner(), this.f84011o);
        this.f84006j.f84211d.observe(getViewLifecycleOwner(), this.f84012p);
        this.f84006j.f84212e.observe(getViewLifecycleOwner(), this.f84013q);
        this.f84006j.f84213f.observe(getViewLifecycleOwner(), this.f84014r);
        this.f84006j.f84210c.observe(getViewLifecycleOwner(), this.f84015s);
        this.f84006j.f84214g.observe(getViewLifecycleOwner(), this.f84016t);
        ThemeWatcher.getInstance().subscribe(this);
        return this.f84000c;
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f84000c.removeCallbacks(this.f84009m);
        ThemeWatcher.getInstance().unSubscribe(this);
        kf();
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        super.onRefresh();
        mf();
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        C9087f c9087f = this.f84004g;
        if (c9087f != null) {
            ((HashMap) c9087f.f129851e).clear();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (!z6) {
            this.f83999b = "favorite";
            return;
        }
        if ("favorite".equalsIgnoreCase(this.f83999b)) {
            x0 x0Var = this.f84003f;
            if (x0Var == null) {
                setRefreshStart();
                mf();
            } else {
                RecyclerView recyclerView = this.f84000c;
                if (recyclerView != null) {
                    recyclerView.setAdapter(x0Var);
                }
            }
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final boolean shouldReport() {
        return "favorite".equalsIgnoreCase(this.f83999b);
    }
}
