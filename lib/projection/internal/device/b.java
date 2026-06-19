package com.bilibili.lib.projection.internal.device;

import I1.C2157f0;
import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.app.comment3.ui.nextholder.handle.l;
import com.bilibili.app.preferences.fragment.u0;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blkv.RawKV;
import com.bilibili.lib.fasthybrid.game.engine.api.n;
import com.bilibili.lib.foundation.util.Objects;
import com.bilibili.lib.projection.commonburid.CastCommonParameters;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import com.bilibili.lib.projection.datasource.ProjectionDataSource;
import com.bilibili.lib.projection.internal.api.model.ProjectionQualityInfo;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import com.bilibili.lib.projection.internal.projectionitem.LinkPlayableItemWrapper;
import com.bilibili.lib.projection.internal.projectionitem.NoItem;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionLiveItemData;
import com.bilibili.lib.projection.internal.projectionitem.base.CompatProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem;
import com.bilibili.pegasus.categoryv2.detail.C;
import he0.C7433b;
import he0.C7434c;
import he0.C7435d;
import he0.j;
import ie0.C7564c;
import ie0.InterfaceC7569h;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe0.RunnableC8295b;
import pe0.h;
import se0.RunnableC8584a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/b.class */
public class b implements com.bilibili.lib.projection.internal.device.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final Map<String, com.bilibili.lib.projection.internal.device.a> f63072t = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ProjectionDeviceInternal f63073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC7569h f63074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final InterfaceC7845m f63075c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63078f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f63082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f63083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f63084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f63085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ProjectionDataSource f63086o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<IProjectionPlayableItem> f63088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f63089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final c f63090s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<Integer, InterfaceC7845m> f63076d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63077e = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f63079g = new CompositeDisposable();

    @NotNull
    public final bY0.c h = new bY0.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f63080i = new CompositeDisposable();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f63087p = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/b$a.class */
    public static final class a<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f63091a;

        public a(b bVar) {
            this.f63091a = bVar;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        public final void accept(Object obj) {
            ProjectionDataSource.b next;
            ProjectionDeviceInternal.PlayerState playerState = (ProjectionDeviceInternal.PlayerState) obj;
            ProjectionDeviceInternal.PlayerState playerState2 = ProjectionDeviceInternal.PlayerState.COMPLETED;
            b bVar = this.f63091a;
            if (playerState != playerState2) {
                if (playerState == ProjectionDeviceInternal.PlayerState.STOPPED || playerState == ProjectionDeviceInternal.PlayerState.IDLE) {
                    bVar.f63085n = 0L;
                    return;
                }
                return;
            }
            IProjectionPlayableItem currentItem = bVar.getCurrentItem();
            if (currentItem instanceof StandardProjectionItem) {
                b.l(bVar.getClient(), new C(2, currentItem, bVar));
            }
            ProjectionDataSource projectionDataSource = bVar.f63086o;
            if (projectionDataSource == null || (next = projectionDataSource.next(bVar.f63087p)) == null) {
                return;
            }
            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
            j.e("player.player.screencast-continuousplay.continuous.show", bVar.f63073a, null, aVar.f63524a, new Object(), 4);
            bVar.q(bVar.f63077e, next.f62997a, 0L, true, false, bVar.f63083l);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.device.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/b$b.class */
    public static final class C0347b<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f63092a;

        public C0347b(b bVar) {
            this.f63092a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x020e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void accept(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 1122
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.device.b.C0347b.accept(java.lang.Object):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/b$c.class */
    public static final class c implements ProjectionDataSource.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f63093a;

        public c(b bVar) {
            this.f63093a = bVar;
        }

        @Override // com.bilibili.lib.projection.datasource.ProjectionDataSource.a
        public final void a(ProjectionDataSource projectionDataSource) {
            b bVar = this.f63093a;
            bVar.f63087p = projectionDataSource.indexOf(bVar.getCurrentItem().getRawItem());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/b$d.class */
    public static final class d<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f63094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63095b;

        public d(b bVar, long j7) {
            this.f63094a = bVar;
            this.f63095b = j7;
        }

        public final void accept(Object obj) {
            Pair pair = (Pair) obj;
            IProjectionItem rawItem = ((IProjectionPlayableItem) pair.getFirst()).getRawItem();
            if (rawItem instanceof ProjectionLiveItemData) {
                CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
                CastCommonParameters castCommonParametersCommonParams = companion.instance().commonParams();
                if (castCommonParametersCommonParams != null) {
                    castCommonParametersCommonParams.updateContentType(CastContentType.CastContentTypeLIVE);
                }
                CastCommonParameters castCommonParametersCommonParams2 = companion.instance().commonParams();
                if (castCommonParametersCommonParams2 != null) {
                    String roomId = ((ProjectionLiveItemData) rawItem).getRoomId();
                    castCommonParametersCommonParams2.updateContentId(Objects.toJsonString(MapsKt.mapOf(TuplesKt.to("room_id", roomId != null ? roomId : ""))));
                }
            } else if (rawItem instanceof ProjectionItemData) {
                CastEventTrackingManager.Companion companion2 = CastEventTrackingManager.Companion;
                CastCommonParameters castCommonParametersCommonParams3 = companion2.instance().commonParams();
                if (castCommonParametersCommonParams3 != null) {
                    castCommonParametersCommonParams3.updateContentType(((ProjectionItemData) rawItem).f63492t);
                }
                CastCommonParameters castCommonParametersCommonParams4 = companion2.instance().commonParams();
                if (castCommonParametersCommonParams4 != null) {
                    ProjectionItemData projectionItemData = (ProjectionItemData) rawItem;
                    String strValueOf = String.valueOf(projectionItemData.f63475b);
                    String str = strValueOf;
                    if (strValueOf == null) {
                        str = "";
                    }
                    Pair pair2 = TuplesKt.to(GameCardButton.extraAvid, str);
                    Pair pair3 = TuplesKt.to("cid", String.valueOf(projectionItemData.f63477d));
                    Pair pair4 = TuplesKt.to("ep_id", String.valueOf(projectionItemData.f63478e));
                    Pair pair5 = TuplesKt.to("season_id", String.valueOf(projectionItemData.f63479f));
                    String str2 = projectionItemData.f63476c;
                    castCommonParametersCommonParams4.updateContentId(Objects.toJsonString(MapsKt.mapOf(new Pair[]{pair2, pair3, pair4, pair5, TuplesKt.to("bvid", str2 != null ? str2 : ""), TuplesKt.to("upmid", String.valueOf(projectionItemData.f63480g))})));
                }
            }
            int iIntValue = ((Number) pair.getSecond()).intValue();
            b bVar = this.f63094a;
            bVar.f63087p = iIntValue;
            IProjectionPlayableItem iProjectionPlayableItem = (IProjectionPlayableItem) pair.getFirst();
            InterfaceC7845m client = bVar.getClient();
            bVar.f63073a.B(iProjectionPlayableItem, client != null ? client.getPlaySpeed() : 1.0f, this.f63095b, bVar.f63083l);
            bVar.f63088q.onNext(pair.getFirst());
            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
            IProjectionItem rawItem2 = ((IProjectionPlayableItem) pair.getFirst()).getRawItem();
            aVar.getClass();
            if (rawItem2 instanceof StandardProjectionItem) {
                aVar.f63525b = false;
                j.h("player.cast.success", bVar.f63073a, true, (StandardProjectionItem) rawItem2, aVar.f63524a, new eZ0.d((StandardProjectionItem) rawItem2, 1));
            }
            InterfaceC7845m client2 = bVar.getClient();
            j jVar = j.f120871a;
            StandardProjectionItem standardProjectionItem = null;
            ProjectionDeviceInternal projectionDeviceInternal = bVar.f63073a;
            if (client2 == null || client2.getClientType() != 4) {
                IProjectionItem rawItem3 = ((IProjectionPlayableItem) pair.getFirst()).getRawItem();
                final int i7 = bVar.f63081j;
                InterfaceC7845m client3 = bVar.getClient();
                Float fValueOf = client3 != null ? Float.valueOf(client3.getPlaySpeed()) : null;
                if (rawItem3 instanceof StandardProjectionItem) {
                    standardProjectionItem = (StandardProjectionItem) rawItem3;
                }
                if (standardProjectionItem != null) {
                    final Float f7 = fValueOf;
                    jVar.b("player.player.terminal-playing.clarity.click", projectionDeviceInternal, (StandardProjectionItem) rawItem3, aVar.f63524a, new Function1(i7, f7) { // from class: ze0.I

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f130231a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Float f130232b;

                        {
                            this.f130231a = i7;
                            this.f130232b = f7;
                        }

                        public final Object invoke(Object obj2) {
                            Map map = (Map) obj2;
                            map.put("qn", String.valueOf(this.f130231a));
                            map.put("level", String.valueOf(this.f130232b));
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            IProjectionItem rawItem4 = ((IProjectionPlayableItem) pair.getFirst()).getRawItem();
            final int i8 = bVar.f63082k;
            InterfaceC7845m client4 = bVar.getClient();
            Float fValueOf2 = client4 != null ? Float.valueOf(client4.getPlaySpeed()) : null;
            StandardProjectionItem standardProjectionItem2 = null;
            if (rawItem4 instanceof StandardProjectionItem) {
                standardProjectionItem2 = (StandardProjectionItem) rawItem4;
            }
            if (standardProjectionItem2 != null) {
                final Float f8 = fValueOf2;
                jVar.b("player.player.terminal-playing.clarity.click", projectionDeviceInternal, (StandardProjectionItem) rawItem4, aVar.f63524a, new Function1(i8, f8) { // from class: ze0.I

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f130231a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Float f130232b;

                    {
                        this.f130231a = i8;
                        this.f130232b = f8;
                    }

                    public final Object invoke(Object obj2) {
                        Map map = (Map) obj2;
                        map.put("qn", String.valueOf(this.f130231a));
                        map.put("level", String.valueOf(this.f130232b));
                        return Unit.INSTANCE;
                    }
                });
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/b$e.class */
    public static final class e<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f63096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC7845m f63097b;

        public e(b bVar, InterfaceC7845m interfaceC7845m) {
            this.f63096a = bVar;
            this.f63097b = interfaceC7845m;
        }

        public final void accept(Object obj) {
            Throwable th = (Throwable) obj;
            b bVar = this.f63096a;
            if (bVar.f63076d.isEmpty()) {
                bVar.f63074b.d().G();
            } else {
                b.l(this.f63097b, new l(th, 2));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/b$f.class */
    public static final class f implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f63098a;

        public f(b bVar) {
            this.f63098a = bVar;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            b bVar = this.f63098a;
            if (!z6 && bVar.f63073a.v()) {
                b.l(bVar.getClient(), new n(1));
                return;
            }
            int i7 = bVar.f63087p;
            if (i7 >= 0) {
                bVar.A(0L, bVar.f63077e, i7, bVar.f63083l);
            }
        }
    }

    public b(ProjectionDeviceInternal projectionDeviceInternal, InterfaceC7569h interfaceC7569h, ProjectionPlayRecord projectionPlayRecord, InterfaceC7845m interfaceC7845m) {
        ProjectionQualityInfo projectionQualityInfoF0;
        this.f63073a = projectionDeviceInternal;
        this.f63074b = interfaceC7569h;
        this.f63075c = interfaceC7845m;
        this.f63081j = -1;
        this.f63082k = -1;
        io.reactivex.rxjava3.subjects.a<IProjectionPlayableItem> aVarD = io.reactivex.rxjava3.subjects.a.d(NoItem.f63473a);
        this.f63088q = aVarD;
        if (projectionPlayRecord != null) {
            projectionPlayRecord.f().getRawItem().getClientType();
            aVarD.onNext(projectionPlayRecord.f());
            IProjectionPlayableItem iProjectionPlayableItemF = projectionPlayRecord.f();
            StandardProjectionPlayableItem standardProjectionPlayableItem = iProjectionPlayableItemF instanceof StandardProjectionPlayableItem ? (StandardProjectionPlayableItem) iProjectionPlayableItemF : null;
            this.f63081j = (standardProjectionPlayableItem == null || (projectionQualityInfoF0 = standardProjectionPlayableItem.F0()) == null) ? -1 : projectionQualityInfoF0.f63004a;
            IProjectionPlayableItem iProjectionPlayableItemF2 = projectionPlayRecord.f();
            StandardProjectionPlayableItem standardProjectionPlayableItem2 = iProjectionPlayableItemF2 instanceof StandardProjectionPlayableItem ? (StandardProjectionPlayableItem) iProjectionPlayableItemF2 : null;
            int i7 = -1;
            if (standardProjectionPlayableItem2 != null) {
                ProjectionQualityInfo projectionQualityInfoF02 = standardProjectionPlayableItem2.F0();
                i7 = -1;
                if (projectionQualityInfoF02 != null) {
                    i7 = projectionQualityInfoF02.f63004a;
                }
            }
            this.f63082k = i7;
        }
        this.f63090s = new c(this);
    }

    public static Unit g(Ref.ObjectRef objectRef, Ref.IntRef intRef, InterfaceC7845m interfaceC7845m) {
        interfaceC7845m.c((IProjectionItem) objectRef.element, intRef.element, false);
        return Unit.INSTANCE;
    }

    public static Unit j(Ref.ObjectRef objectRef, Ref.IntRef intRef, InterfaceC7845m interfaceC7845m) {
        interfaceC7845m.c((IProjectionItem) objectRef.element, intRef.element, false);
        return Unit.INSTANCE;
    }

    public static final boolean k(b bVar, String str) {
        bVar.getClass();
        return (str.length() <= 0 || Intrinsics.areEqual(str, "null") || Intrinsics.areEqual(str, "0")) ? false : true;
    }

    public static void l(InterfaceC7845m interfaceC7845m, Function1 function1) {
        if (interfaceC7845m != null) {
            HandlerThreads.runOn(0, new RunnableC8295b(0, function1, interfaceC7845m));
        }
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void A(long j7, int i7, int i8, boolean z6) {
        u0.a(C2157f0.a(i8, j7, "active device play index = ", ", start = "), ", danmaku = ", z6, "ProjectionTrack");
        q(i7, i8, j7, false, false, z6);
        this.f63084m = C0.b();
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void a() {
        ProjectionDeviceInternal projectionDeviceInternal = this.f63073a;
        if (projectionDeviceInternal instanceof se0.f) {
            se0.f fVar = (se0.f) projectionDeviceInternal;
            fVar.f127191J = false;
            com.bilibili.lib.nirvana.api.l lVar = fVar.f127223x;
            if (lVar != null) {
                lVar.close();
            }
            fVar.f127223x = null;
            fVar.f127222w = 0;
        }
    }

    @Override // com.bilibili.lib.projection.internal.device.a, ke0.InterfaceC7753a
    public final void b(@NotNull Object obj) {
        if (obj instanceof InterfaceC7845m) {
            if (this.f63076d.remove(Integer.valueOf(((InterfaceC7845m) obj).getClientId())) == null || !this.f63076d.isEmpty()) {
                return;
            }
            this.f63073a.u(false);
            DisposableHelper.set(this.h.a, Disposable.disposed());
            if (this.f63078f == 0) {
                r();
                return;
            }
            return;
        }
        int i7 = this.f63078f;
        if (i7 > 0) {
            int i8 = i7 - 1;
            this.f63078f = i8;
            if (i8 == 0 && this.f63076d.isEmpty()) {
                r();
            }
        }
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void c(boolean z6) {
        this.f63083l = z6;
        this.f63073a.c(z6);
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void d() {
        ProjectionDeviceInternal projectionDeviceInternal = this.f63073a;
        if (projectionDeviceInternal instanceof se0.f) {
            se0.f fVar = (se0.f) projectionDeviceInternal;
            if (fVar.f127223x == null) {
                fVar.P();
            }
            String str = fVar.f127202b;
            String str2 = fVar.f127215p;
            ProjectionDeviceInternal.DeviceState deviceStateB = fVar.b();
            boolean z6 = fVar.f127191J;
            String str3 = fVar.f127216q;
            StringBuilder sbA = G0.b.a("[blink] ------> session connect device<", str, " ", str2, " ");
            sbA.append(deviceStateB);
            sbA.append(" ");
            sbA.append(z6);
            sbA.append(" ");
            sbA.append(str3);
            sbA.append("> ");
            sbA.append(fVar);
            BLog.i("DefaultLinkDevice", sbA.toString());
            com.bilibili.lib.nirvana.api.l lVar = fVar.f127223x;
            if (lVar != null) {
                lVar.connect();
            }
        }
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void e(int i7, @NotNull ProjectionDataSource projectionDataSource) {
        this.f63077e = i7;
        ProjectionDataSource projectionDataSource2 = this.f63086o;
        c cVar = this.f63090s;
        if (projectionDataSource2 != null) {
            projectionDataSource2.unregisterDataSetObserver(cVar);
        }
        this.f63086o = projectionDataSource;
        projectionDataSource.registerDataSetObserver(cVar);
        projectionDataSource.notifyDataSetChanged();
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void f(@Nullable com.bilibili.lib.projection.internal.device.a aVar) {
        if (aVar != null) {
            this.f63087p = aVar.getIndex();
            this.f63085n = aVar.getProgress();
            this.f63081j = aVar.p();
            this.f63082k = aVar.t();
            this.f63086o = aVar.getSource();
            ProjectionDataSource source = aVar.getSource();
            if (source != null) {
                source.registerDataSetObserver(this.f63090s);
            }
        }
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    @Nullable
    public final InterfaceC7845m getClient() {
        return (InterfaceC7845m) ((LinkedHashMap) this.f63076d).get(Integer.valueOf(this.f63077e));
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    @NotNull
    public final IProjectionPlayableItem getCurrentItem() {
        return (IProjectionPlayableItem) this.f63088q.e();
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    @NotNull
    public final ProjectionDeviceInternal getDevice() {
        return this.f63073a;
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final int getIndex() {
        return this.f63087p;
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final long getProgress() {
        return this.f63085n;
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    @NotNull
    public final InterfaceC7569h getService() {
        return this.f63074b;
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    @Nullable
    public final ProjectionDataSource getSource() {
        return this.f63086o;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(@NotNull Object obj) {
        if (obj instanceof InterfaceC7845m) {
            if (this.f63076d.isEmpty() && this.f63078f == 0) {
                o();
            }
            InterfaceC7845m interfaceC7845m = (InterfaceC7845m) obj;
            this.f63076d.put(Integer.valueOf(interfaceC7845m.getClientId()), obj);
            this.f63077e = interfaceC7845m.getClientId();
            IProjectionItem iProjectionItemN = interfaceC7845m.n(false);
            if (iProjectionItemN != null) {
                iProjectionItemN.getClientType();
            }
            if (this.f63076d.size() == 1) {
                ProjectionDeviceInternal projectionDeviceInternal = this.f63073a;
                projectionDeviceInternal.u(true);
                if (!(projectionDeviceInternal instanceof ProjectionDeviceInternal.b) && this.f63076d.size() == 1) {
                    DisposableHelper.set(this.h.a, projectionDeviceInternal.A().subscribe(new h(this)));
                }
            }
        } else {
            if (this.f63076d.isEmpty() && this.f63078f == 0) {
                o();
            }
            this.f63078f++;
        }
        this.f63084m = C0.b();
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    @NotNull
    public final Observable<IProjectionPlayableItem> n() {
        return this.f63088q.observeOn(AndroidSchedulers.mainThread());
    }

    public void o() {
        ProjectionDeviceInternal projectionDeviceInternal = this.f63073a;
        projectionDeviceInternal.r(this.f63075c);
        projectionDeviceInternal.p(true);
        ProjectionDataSource projectionDataSource = this.f63086o;
        if (projectionDataSource != null) {
            projectionDataSource.registerDataSetObserver(this.f63090s);
        }
        if (projectionDeviceInternal instanceof ProjectionDeviceInternal.b) {
            return;
        }
        Disposable disposableSubscribe = projectionDeviceInternal.w().subscribe(new a(this));
        CompositeDisposable compositeDisposable = this.f63079g;
        compositeDisposable.add(disposableSubscribe);
        compositeDisposable.add(projectionDeviceInternal.A().subscribe(new C0347b(this)));
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final int p() {
        return this.f63081j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r12, final int r13, long r14, final boolean r16, final boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.device.b.q(int, int, long, boolean, boolean, boolean):void");
    }

    public void r() {
        ProjectionDeviceInternal projectionDeviceInternal = this.f63073a;
        projectionDeviceInternal.p(false);
        projectionDeviceInternal.destroy();
        ProjectionDataSource projectionDataSource = this.f63086o;
        if (projectionDataSource != null) {
            projectionDataSource.unregisterDataSetObserver(this.f63090s);
        }
        this.f63079g.clear();
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void replay() {
        BLog.i("ProjectionTrack", "[blink] ------>, active device replay");
        C7564c.f121625a.j(new f(this));
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void seekTo(long j7, int i7) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        InterfaceC7845m client = getClient();
        ProjectionDeviceInternal projectionDeviceInternal = this.f63073a;
        if (client != null && (reporter = client.getReporter()) != null) {
            InterfaceC7845m client2 = getClient();
            StandardProjectionItem standardProjectionItem = null;
            IProjectionItem iProjectionItemN = client2 != null ? client2.n(true) : null;
            if (iProjectionItemN instanceof StandardProjectionItem) {
                standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
            }
            reporter.R(standardProjectionItem, projectionDeviceInternal, i7);
        }
        projectionDeviceInternal.seekTo(j7);
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void switchQuality(int i7) {
        bilibili.live.app.service.resolver.c.a(i7, "active device switch quality = ", "ProjectionTrack");
        boolean z6 = true;
        ProjectionDeviceInternal projectionDeviceInternal = this.f63073a;
        if (i7 >= 0) {
            InterfaceC7845m client = getClient();
            if (client != null && client.getClientType() == 4) {
                C7564c.f121633j.v(i7);
            } else if (C7433b.b(projectionDeviceInternal) || (projectionDeviceInternal != null && C7434c.c(projectionDeviceInternal))) {
                C7564c.f121633j.u(i7);
            } else {
                RawKV rawKV = C7564c.f121633j.f124071a;
                RawKV rawKV2 = rawKV;
                if (rawKV == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storage");
                    rawKV2 = null;
                }
                rawKV2.putInt("last_quality_third_part", i7);
            }
        }
        if (this.f63084m == C0.b()) {
            z6 = false;
        }
        if (projectionDeviceInternal.C() && !z6) {
            projectionDeviceInternal.switchQuality(i7);
            return;
        }
        A(this.f63085n, this.f63077e, this.f63087p, this.f63083l);
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final int t() {
        return this.f63082k;
    }

    @Override // com.bilibili.lib.projection.internal.device.a
    public final void x(@Nullable IProjectionPlayableItem iProjectionPlayableItem) {
        io.reactivex.rxjava3.subjects.a<IProjectionPlayableItem> aVar = this.f63088q;
        if (iProjectionPlayableItem != null) {
            aVar.onNext(iProjectionPlayableItem);
        }
        IProjectionPlayableItem iProjectionPlayableItem2 = (IProjectionPlayableItem) aVar.e();
        ProjectionDeviceInternal projectionDeviceInternal = this.f63073a;
        if (!(projectionDeviceInternal instanceof se0.f) || iProjectionPlayableItem2 == null) {
            return;
        }
        se0.f fVar = (se0.f) projectionDeviceInternal;
        fVar.getClass();
        if (iProjectionPlayableItem2 instanceof CompatProjectionPlayableItem) {
            fVar.f127188G = false;
            com.bilibili.lib.nirvana.api.l lVar = fVar.f127223x;
            if (lVar == null) {
                fVar.P();
            } else {
                lVar.connect();
            }
            fVar.f127192K = (CompatProjectionPlayableItem) iProjectionPlayableItem2;
            boolean zIsAutoNext = ((CompatProjectionPlayableItem) iProjectionPlayableItem2).getRawItem().isAutoNext();
            boolean zG = fVar.G(iProjectionPlayableItem2);
            fVar.f127186E = zG;
            boolean z6 = zG && zIsAutoNext;
            fVar.f127185D = z6;
            if (z6) {
                LinkPlayableItemWrapper linkPlayableItemWrapper = iProjectionPlayableItem2 instanceof LinkPlayableItemWrapper ? (LinkPlayableItemWrapper) iProjectionPlayableItem2 : null;
                fVar.f127187F = linkPlayableItemWrapper != null ? linkPlayableItemWrapper.f63472d : -1;
                HandlerThreads.runOn(0, new RunnableC8584a(fVar, NirvanaEngine.NirvanaPlayMode.PLAY_MODE_AUTONEXT));
            } else {
                fVar.f127187F = C7435d.a(fVar);
                HandlerThreads.runOn(0, new RunnableC8584a(fVar, NirvanaEngine.NirvanaPlayMode.PLAY_MODE_NORMAL));
            }
            fVar.f127218s.onNext(ProjectionDeviceInternal.PlayerState.PLAYING);
            boolean z7 = iProjectionPlayableItem2 instanceof StandardProjectionPlayableItem;
            io.reactivex.rxjava3.subjects.a<IProjectionPlayableItem> aVar2 = fVar.f127219t;
            if (z7) {
                StandardProjectionPlayableItem standardProjectionPlayableItem = (StandardProjectionPlayableItem) iProjectionPlayableItem2;
                LinkPlayableItemWrapper linkPlayableItemWrapper2 = new LinkPlayableItemWrapper(standardProjectionPlayableItem.getRawItem());
                linkPlayableItemWrapper2.f63472d = C7435d.a(fVar);
                linkPlayableItemWrapper2.f63470b = standardProjectionPlayableItem.F0();
                linkPlayableItemWrapper2.f63471c = standardProjectionPlayableItem.getSupportQualities();
                aVar2.onNext(linkPlayableItemWrapper2);
            } else {
                aVar2.onNext(iProjectionPlayableItem2);
            }
            com.bilibili.lib.nirvana.api.l lVar2 = fVar.f127223x;
            if (lVar2 != null) {
                lVar2.b(MapsKt.mapOf(TuplesKt.to("Command", "GetPlayInfo")), new byte[0]);
            }
            fVar.H();
            fVar.I();
        }
    }
}
