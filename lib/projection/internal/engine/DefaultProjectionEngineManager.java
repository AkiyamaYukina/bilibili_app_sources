package com.bilibili.lib.projection.internal.engine;

import He0.InterfaceC2124c;
import android.app.Application;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.fasthybrid.container.c0;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.projection.ProjectionScreenType;
import com.bilibili.lib.projection.commonburid.CastCommonParameters;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import com.bilibili.lib.projection.commonburid.CastScreenType;
import com.bilibili.lib.projection.internal.api.model.ListUiBean;
import com.bilibili.lib.projection.internal.api.model.ProjectionInterceptInfo;
import com.bilibili.lib.projection.internal.api.model.SearchUiBean;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.device.a;
import com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord;
import com.bililive.bililive.infra.hybrid.callhandler.O;
import ge0.InterfaceC7274d;
import he0.C7435d;
import ie0.C7564c;
import ie0.InterfaceC7569h;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import je0.C7662c;
import je0.InterfaceC7667h;
import kntr.base.utils.foundation.CpuUtils;
import kotlin.ExceptionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import le0.InterfaceC7845m;
import me0.C7975g;
import me0.C7985q;
import ne0.C8085a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager.class */
public final class DefaultProjectionEngineManager implements s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f63099t = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C7564c f63101b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ProjectionPlayRecord f63103d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Disposable f63105f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public List<String> f63107i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public List<? extends InterfaceC7274d> f63109k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f63112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Long f63113o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Integer, r> f63100a = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<com.bilibili.lib.projection.internal.device.a> f63102c = io.reactivex.rxjava3.subjects.a.d(a.C0346a.f63071a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final bY0.c f63104e = new bY0.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<ProjectionDeviceInternal> f63106g = io.reactivex.rxjava3.subjects.a.d(ProjectionDeviceInternal.b.f63069a);

    @NotNull
    public ProjectionInterceptInfo.ProjectionInterceptType h = ProjectionInterceptInfo.ProjectionInterceptType.Default;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.lib.projection.internal.engine.a f63108j = new PassportObserver(this) { // from class: com.bilibili.lib.projection.internal.engine.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63137a;

        {
            this.f63137a = this;
        }

        public final void onChange(Topic topic) {
            BLog.i("ProjectionEngineManager", "login status change to " + topic);
            if ((topic == null ? -1 : DefaultProjectionEngineManager.a.f63118a[topic.ordinal()]) == 1) {
                this.f63137a.G();
            }
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public ArrayList<InterfaceC7274d> f63110l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f63111m = ConfigManager.Companion.isHitFF("cast.enable_device_info_report");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f63114p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final C7662c f63115q = new C7662c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final c0 f63116r = new c0(this, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final f f63117s = new f(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f63119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f63120c;

        static {
            int[] iArr = new int[Topic.values().length];
            try {
                iArr[Topic.SIGN_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f63118a = iArr;
            int[] iArr2 = new int[EngineManagerRegisterEnum.values().length];
            try {
                iArr2[EngineManagerRegisterEnum.Init.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr2[EngineManagerRegisterEnum.Client.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[EngineManagerRegisterEnum.Search.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            f63119b = iArr2;
            int[] iArr3 = new int[ProjectionInterceptInfo.ProjectionInterceptType.values().length];
            try {
                iArr3[ProjectionInterceptInfo.ProjectionInterceptType.Default.ordinal()] = 1;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr3[ProjectionInterceptInfo.ProjectionInterceptType.OnlyInterceptInList.ordinal()] = 2;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr3[ProjectionInterceptInfo.ProjectionInterceptType.InterceptNotInList.ordinal()] = 3;
            } catch (NoSuchFieldError e13) {
            }
            f63120c = iArr3;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$b.class */
    public static final class b<T, R> implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63121a;

        public b(DefaultProjectionEngineManager defaultProjectionEngineManager) {
            this.f63121a = defaultProjectionEngineManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object apply(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 1203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager.b.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$c.class */
    public static final class c<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63122a;

        public c(DefaultProjectionEngineManager defaultProjectionEngineManager) {
            this.f63122a = defaultProjectionEngineManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0019, B:8:0x0024, B:18:0x0044, B:20:0x004f, B:23:0x005c, B:25:0x0073, B:27:0x007b, B:29:0x008f, B:30:0x009a, B:32:0x00a2, B:37:0x00b1, B:39:0x00be, B:45:0x00d2, B:48:0x00dd, B:13:0x0035), top: B:57:0x0019 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void accept(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager.c.accept(java.lang.Object):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$d.class */
    public static final class d<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC7845m f63124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IProjectionItem f63125c;

        public d(DefaultProjectionEngineManager defaultProjectionEngineManager, IProjectionItem iProjectionItem, InterfaceC7845m interfaceC7845m) {
            this.f63123a = defaultProjectionEngineManager;
            this.f63124b = interfaceC7845m;
            this.f63125c = iProjectionItem;
        }

        public final void accept(Object obj) {
            SearchUiBean searchUiBean;
            Pair pair = (Pair) obj;
            DefaultProjectionEngineManager.f63099t = false;
            final ProjectionDeviceInternal projectionDeviceInternal = (ProjectionDeviceInternal) pair.getFirst();
            boolean z6 = projectionDeviceInternal instanceof ProjectionDeviceInternal.b;
            final DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63123a;
            if (z6) {
                defaultProjectionEngineManager.K(false, null, "find_device_stub");
                Application app2 = ((C7564c) defaultProjectionEngineManager.getContext()).getApp();
                ListUiBean listUiBean = C7435d.f120838c;
                InterfaceC7845m.h(this.f63124b, app2, false, false, (listUiBean == null || (searchUiBean = listUiBean.getSearchUiBean()) == null || !searchUiBean.isShowFullscreen()) ? false : true, 4);
                return;
            }
            if (((projectionDeviceInternal instanceof C7985q) || (projectionDeviceInternal instanceof NirvanaEngine.a)) && StringsKt.n(projectionDeviceInternal.getDisplayName(), "我的小电视")) {
                List<? extends InterfaceC7274d> list = defaultProjectionEngineManager.f63109k;
                if (list != null) {
                    InterfaceC7274d interfaceC7274dO = DefaultProjectionEngineManager.o(projectionDeviceInternal.getUuid(), CollectionsKt.toMutableList(list));
                    if (interfaceC7274dO != null) {
                        projectionDeviceInternal.l(interfaceC7274dO.getDisplayName());
                    }
                } else {
                    projectionDeviceInternal.l("我的小电视");
                }
            }
            int iIntValue = ((Number) pair.getSecond()).intValue();
            final IProjectionItem iProjectionItem = this.f63125c;
            defaultProjectionEngineManager.g(iIntValue, projectionDeviceInternal, this.f63124b, new Function1(defaultProjectionEngineManager, iProjectionItem, projectionDeviceInternal) { // from class: com.bilibili.lib.projection.internal.engine.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DefaultProjectionEngineManager f63144a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final IProjectionItem f63145b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ProjectionDeviceInternal f63146c;

                {
                    this.f63144a = defaultProjectionEngineManager;
                    this.f63145b = iProjectionItem;
                    this.f63146c = projectionDeviceInternal;
                }

                public final Object invoke(Object obj2) {
                    DefaultProjectionEngineManager defaultProjectionEngineManager2 = this.f63144a;
                    ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                    C7564c.f121634k.X(this.f63145b, this.f63146c, 1);
                    defaultProjectionEngineManager2.K(true, (com.bilibili.lib.projection.internal.device.a) obj2, "direct_connect_device");
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$e.class */
    public static final class e<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC7845m f63127b;

        public e(DefaultProjectionEngineManager defaultProjectionEngineManager, InterfaceC7845m interfaceC7845m) {
            this.f63126a = defaultProjectionEngineManager;
            this.f63127b = interfaceC7845m;
        }

        public final void accept(Object obj) {
            DefaultProjectionEngineManager.f63099t = false;
            DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63126a;
            defaultProjectionEngineManager.K(false, null, "find_device_error");
            Application app2 = ((C7564c) defaultProjectionEngineManager.getContext()).getApp();
            InterfaceC7845m interfaceC7845m = this.f63127b;
            interfaceC7845m.b(app2, false, interfaceC7845m.getClientType() == 4 && interfaceC7845m.getConfig().getScreenType$biliscreencast_release() == ProjectionScreenType.FULLSCREEN, true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$f.class */
    public static final class f implements se0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63128a;

        public f(DefaultProjectionEngineManager defaultProjectionEngineManager) {
            this.f63128a = defaultProjectionEngineManager;
        }

        @Override // se0.h
        public final void a(final se0.f fVar) {
            final int i7 = 0;
            final DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63128a;
            HandlerThreads.runOn(0, new Runnable(i7, fVar, defaultProjectionEngineManager) { // from class: com.bilibili.lib.projection.internal.engine.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f63160a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f63161b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f63162c;

                {
                    this.f63160a = i7;
                    this.f63161b = fVar;
                    this.f63162c = defaultProjectionEngineManager;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IProjectionPlayableItem currentItem;
                    switch (this.f63160a) {
                        case 0:
                            se0.f fVar2 = (se0.f) this.f63161b;
                            DefaultProjectionEngineManager defaultProjectionEngineManager2 = (DefaultProjectionEngineManager) this.f63162c;
                            String str = fVar2.f127204d;
                            com.bilibili.lib.projection.internal.device.a aVar = (com.bilibili.lib.projection.internal.device.a) defaultProjectionEngineManager2.f63102c.e();
                            IProjectionItem rawItem = (aVar == null || (currentItem = aVar.getCurrentItem()) == null) ? null : currentItem.getRawItem();
                            String str2 = fVar2.f127205e;
                            String str3 = fVar2.f127204d;
                            String str4 = fVar2.f127201a;
                            StringBuilder sbA = G0.b.a("linkCallback ::: ", str2, ", code = ", str3, ", address = ");
                            sbA.append(str4);
                            BLog.i("ProjectionTrack", sbA.toString());
                            if (str.length() > 0) {
                                ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                                if (Intrinsics.areEqual(str, C7564c.f121637n.a())) {
                                    BLog.i("ProjectionTrack", "onConnected ::: bingo!! get the same code");
                                    ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                                    com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                                    ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                                    aVar2.b0(rawItem, fVar2, 1, C7564c.f121637n.a(), str, fVar2.f127203c, fVar2.f127202b);
                                    com.bilibili.lib.projection.internal.device.a aVar3 = (com.bilibili.lib.projection.internal.device.a) defaultProjectionEngineManager2.f63102c.e();
                                    InterfaceC7845m client = aVar3 != null ? aVar3.getClient() : null;
                                    if (C7564c.f121633j.j() && client != null) {
                                        BLog.i("ProjectionTrack", "onConnected ::: switch to link device");
                                        defaultProjectionEngineManager2.g(4, fVar2, client, null);
                                    }
                                    ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                                    C7564c.f121637n.b("");
                                }
                            }
                            ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                            com.bilibili.lib.projection.internal.reporter.a aVar4 = C7564c.f121634k;
                            ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                            aVar4.b0(rawItem, null, 2, C7564c.f121637n.a(), str, fVar2.f127203c, fVar2.f127202b);
                            ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                            C7564c.f121637n.b("");
                            String str5 = fVar2.f127204d;
                            ((C7564c) defaultProjectionEngineManager2.getContext()).getClass();
                            j4.o.a("onConnected ::: code not same = ", str5, ", origin code = ", C7564c.f121637n.a(), "ProjectionTrack");
                            break;
                        default:
                            try {
                                ((O) this.f63161b).e((JSONObject) this.f63162c);
                            } catch (Exception e7) {
                                BLog.e("LiveBridgeCallHandlerUIFull", "setNavMenu()", e7);
                            }
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$g.class */
    public static final class g<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EngineManagerRegisterEnum f63130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63131c;

        public g(DefaultProjectionEngineManager defaultProjectionEngineManager, EngineManagerRegisterEnum engineManagerRegisterEnum, int i7) {
            this.f63129a = defaultProjectionEngineManager;
            this.f63130b = engineManagerRegisterEnum;
            this.f63131c = i7;
        }

        public final void accept(Object obj) {
            this.f63129a.l(this.f63130b, this.f63131c);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$h.class */
    public static final class h<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EngineManagerRegisterEnum f63133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63134c;

        public h(DefaultProjectionEngineManager defaultProjectionEngineManager, EngineManagerRegisterEnum engineManagerRegisterEnum, int i7) {
            this.f63132a = defaultProjectionEngineManager;
            this.f63133b = engineManagerRegisterEnum;
            this.f63134c = i7;
        }

        public final void accept(Object obj) {
            this.f63132a.l(this.f63133b, this.f63134c);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$i.class */
    public static final class i<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultProjectionEngineManager f63135a;

        public i(DefaultProjectionEngineManager defaultProjectionEngineManager) {
            this.f63135a = defaultProjectionEngineManager;
        }

        public final void accept(Object obj) {
            r rVar = (r) obj;
            DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63135a;
            Map<Integer, r> map = defaultProjectionEngineManager.f63100a;
            Pair pair = TuplesKt.to(Integer.valueOf(rVar.e()), rVar);
            map.put((Integer) pair.getFirst(), (r) pair.getSecond());
            ProjectionPlayRecord projectionPlayRecord = defaultProjectionEngineManager.f63103d;
            if (projectionPlayRecord == null || projectionPlayRecord.getDevice().e() != rVar.e()) {
                return;
            }
            DisposableHelper.set(defaultProjectionEngineManager.f63104e.a, rVar.o(projectionPlayRecord).subscribe(new p(defaultProjectionEngineManager, projectionPlayRecord), new q(projectionPlayRecord)));
            defaultProjectionEngineManager.f63103d = null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$j.class */
    public static final class j<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f63136a;

        public j(r rVar) {
            this.f63136a = rVar;
        }

        public final void accept(Object obj) {
            r rVar = this.f63136a;
            BLog.e("ProjectionEngineManager", androidx.customview.widget.b.b(rVar.e(), "Init engine(", ",", rVar.c(), ") failed."), (Throwable) obj);
        }
    }

    public static InterfaceC7274d o(String str, List list) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC7274d interfaceC7274d = (InterfaceC7274d) list.get(i7);
            if (Intrinsics.areEqual(str, interfaceC7274d.getUuid())) {
                return interfaceC7274d;
            }
        }
        return null;
    }

    public final boolean D() {
        return !Intrinsics.areEqual(this.f63106g.e(), ProjectionDeviceInternal.b.f63069a);
    }

    @Override // com.bilibili.lib.projection.internal.engine.s
    public final void E(@NotNull InterfaceC7667h interfaceC7667h) {
        C7662c c7662c = this.f63115q;
        if (c7662c.f122372b.contains(interfaceC7667h)) {
            return;
        }
        c7662c.f122372b.add(interfaceC7667h);
        boolean z6 = c7662c.f122374d || c7662c.f122375e;
        if (!z6 && c7662c.f122373c) {
            c7662c.c();
        }
        interfaceC7667h.a(z6);
    }

    public final void F(@NotNull EngineManagerRegisterEnum engineManagerRegisterEnum, int i7) {
        Long longOrNull;
        Long longOrNull2;
        int i8 = a.f63119b[engineManagerRegisterEnum.ordinal()];
        if (i8 == 1) {
            ((C7564c) getContext()).getClass();
            C7564c.f121633j.getClass();
            String str = (String) Contract.get$default(ConfigManager.Companion.config(), "nva.biz.delay_register_on_init", (Object) null, 2, (Object) null);
            Observable.timer((str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? 3000L : longOrNull.longValue(), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new g(this, engineManagerRegisterEnum, i7));
            return;
        }
        if (i8 != 2) {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            l(engineManagerRegisterEnum, i7);
        } else {
            ((C7564c) getContext()).getClass();
            C7564c.f121633j.getClass();
            String str2 = (String) Contract.get$default(ConfigManager.Companion.config(), "videodetail.cast_browse_preload_time", (Object) null, 2, (Object) null);
            Observable.timer((str2 == null || (longOrNull2 = StringsKt.toLongOrNull(str2)) == null) ? 0L : longOrNull2.longValue(), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new h(this, engineManagerRegisterEnum, i7));
        }
    }

    public final void G() {
        this.f63102c.onNext(a.C0346a.f63071a);
    }

    @Override // com.bilibili.lib.projection.internal.engine.s
    public final void H(@NotNull InterfaceC7667h interfaceC7667h) {
        C7662c c7662c = this.f63115q;
        if (c7662c.f122372b.contains(interfaceC7667h)) {
            c7662c.f122372b.remove(interfaceC7667h);
        }
    }

    public final void J(@NotNull r rVar) {
        rVar.j(this).subscribe(new i(this), new j(rVar));
    }

    public final void K(boolean z6, com.bilibili.lib.projection.internal.device.a aVar, String str) {
        ExceptionsKt.stackTraceToString(new Exception());
        ProjectionDeviceInternal device = aVar != null ? aVar.getDevice() : null;
        CastScreenType castScreenType = device instanceof C7985q ? CastScreenType.CastScreenTypeCloud : device instanceof NirvanaEngine.a ? CastScreenType.CastScreenTypeDLNA : CastScreenType.CastScreenTypeUnknown;
        CastEventTrackingManager.Companion companion = CastEventTrackingManager.Companion;
        CastCommonParameters castCommonParametersCommonParams = companion.instance().commonParams();
        if (castCommonParametersCommonParams != null) {
            castCommonParametersCommonParams.updateScreenCastType(castScreenType);
        }
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        CastCommonParameters castCommonParametersCommonParams2 = companion.instance().commonParams();
        if (Intrinsics.areEqual(castCommonParametersCommonParams2 != null ? castCommonParametersCommonParams2.getCurrentScreencastSessionId() : null, this.f63112n)) {
            Long l7 = this.f63113o;
            if (jCurrentThreadTimeMillis - (l7 != null ? l7.longValue() : 0L) < 500) {
                return;
            }
        }
        Map<String, String> mapMapOf = str.length() > 0 ? MapsKt.mapOf(TuplesKt.to("cast_reason", str)) : MapsKt.emptyMap();
        ((C7564c) getContext()).getClass();
        C7564c.f121634k.Z(z6, false, aVar != null ? aVar.getDevice() : null, mapMapOf);
        CastCommonParameters castCommonParametersCommonParams3 = companion.instance().commonParams();
        String currentScreencastSessionId = null;
        if (castCommonParametersCommonParams3 != null) {
            currentScreencastSessionId = castCommonParametersCommonParams3.getCurrentScreencastSessionId();
        }
        this.f63112n = currentScreencastSessionId;
        this.f63113o = Long.valueOf(jCurrentThreadTimeMillis);
    }

    public final void L(@Nullable com.bilibili.lib.projection.internal.device.a aVar, @NotNull String str) {
        K(false, aVar, str);
    }

    public final void M(int i7) {
        IProjectionItem iProjectionItemN;
        BLog.i("ProjectionEngineManager", "search clientId:" + i7);
        InterfaceC7845m interfaceC7845mH = ((C7564c) getContext()).h(i7);
        int clientType = (interfaceC7845mH == null || (iProjectionItemN = interfaceC7845mH.n(false)) == null) ? 1 : iProjectionItemN.getClientType();
        for (r rVar : ((LinkedHashMap) this.f63100a).values()) {
            if (!(rVar instanceof ve0.e)) {
                rVar.k(clientType);
            }
        }
    }

    public final void N(InterfaceC7845m interfaceC7845m) {
        InterfaceC7569h context = getContext();
        InterfaceC2124c.a aVar = InterfaceC2124c.a.f8659a;
        ((C7564c) context).getClass();
        C7564c.f121637n = aVar;
        if (interfaceC7845m.getClientType() == 6) {
            this.f63106g.onNext(ProjectionDeviceInternal.b.f63069a);
        }
        this.f63102c.onNext(a.C0346a.f63071a);
        interfaceC7845m.o();
    }

    public final void g(int i7, ProjectionDeviceInternal projectionDeviceInternal, InterfaceC7845m interfaceC7845m, Function1<? super com.bilibili.lib.projection.internal.device.a, Unit> function1) {
        final com.bilibili.lib.projection.internal.engine.b bVar = new com.bilibili.lib.projection.internal.engine.b(this, interfaceC7845m, projectionDeviceInternal, i7, function1);
        if (interfaceC7845m.getFromCastButton()) {
            ((C7564c) getContext()).getApp().getBaseContext();
            interfaceC7845m.q(new C7435d.a(interfaceC7845m.getFromCastButton()), projectionDeviceInternal);
            interfaceC7845m.setFromCastButton(false);
        }
        HandlerThreads.post(0, new Runnable(bVar) { // from class: com.bilibili.lib.projection.internal.engine.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f63143a;

            {
                this.f63143a = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f63143a.invoke();
            }
        });
    }

    @Override // com.bilibili.lib.projection.internal.engine.s
    @NotNull
    public final InterfaceC7569h getContext() {
        C7564c c7564c = this.f63101b;
        if (c7564c != null) {
            return c7564c;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @Override // com.bilibili.lib.projection.internal.engine.s
    public final void h(@NotNull InterfaceC7667h interfaceC7667h) {
        C7662c c7662c = this.f63115q;
        if (c7662c.f122371a.contains(interfaceC7667h)) {
            return;
        }
        c7662c.f122371a.add(interfaceC7667h);
        boolean z6 = c7662c.f122374d || c7662c.f122375e;
        if (!z6 && c7662c.f122373c) {
            c7662c.c();
        }
        interfaceC7667h.a(z6);
    }

    public final void j(int i7, @NotNull InterfaceC7274d interfaceC7274d) {
        InterfaceC7845m interfaceC7845mH;
        bilibili.live.app.service.resolver.c.a(i7, "connectForClient clientId:", "ProjectionEngineManager");
        if (!(interfaceC7274d instanceof ProjectionDeviceInternal) || (interfaceC7845mH = ((C7564c) getContext()).h(i7)) == null) {
            return;
        }
        g(0, (ProjectionDeviceInternal) interfaceC7274d, interfaceC7845mH, null);
    }

    public final void k(int i7) {
        BLog.i("ProjectionEngineManager", "disconnectForClient clientId:" + i7);
        InterfaceC7845m interfaceC7845mH = ((C7564c) getContext()).h(i7);
        if (interfaceC7845mH != null) {
            N(interfaceC7845mH);
        }
    }

    public final void l(EngineManagerRegisterEnum engineManagerRegisterEnum, int i7) {
        List listEmptyList;
        Integer intOrNull;
        Integer intOrNull2;
        if (this.f63114p.isEmpty()) {
            this.f63115q.c();
        }
        int i8 = a.f63119b[engineManagerRegisterEnum.ordinal()];
        if (i8 == 1) {
            ((C7564c) getContext()).getClass();
            listEmptyList = (List) C7564c.f121633j.f124074d.getValue();
        } else if (i8 != 2) {
            listEmptyList = i8 != 3 ? CollectionsKt.emptyList() : CollectionsKt.arrayListOf(new Integer[]{5, 10, 15});
        } else {
            ((C7564c) getContext()).getClass();
            listEmptyList = (List) C7564c.f121633j.f124075e.getValue();
        }
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!this.f63114p.contains(Integer.valueOf(iIntValue))) {
                ((C7564c) getContext()).getClass();
                C8085a c8085a = C7564c.f121633j;
                boolean z6 = false;
                if (iIntValue == 5) {
                    c8085a.getClass();
                    boolean z7 = false;
                    if (!CpuUtils.isX86(FoundationAlias.getFapp())) {
                        String str = (String) Contract.get$default(ConfigManager.Companion.config(), "cast.switcher_nva", (Object) null, 2, (Object) null);
                        z7 = false;
                        if (((str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 1 : intOrNull.intValue()) == 1) {
                            z7 = true;
                        }
                    }
                    if (z7) {
                        Boolean bool = (Boolean) ConfigManager.Companion.ab().get("cast.disable_dlna_engine_register_in_bg_thread", Boolean.TRUE);
                        if (bool != null ? bool.booleanValue() : true) {
                            J(new NirvanaEngine(i7));
                            BLog.i("NirvanaEngine", "nirvana registerEngine in main thread");
                        } else {
                            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new DefaultProjectionEngineManager$doRegister$1$1(this, i7, null), 3, (Object) null);
                        }
                    }
                } else if (iIntValue == 10) {
                    c8085a.getClass();
                    String str2 = (String) Contract.get$default(ConfigManager.Companion.config(), "cast.switcher_cloud", (Object) null, 2, (Object) null);
                    if (((str2 == null || (intOrNull2 = StringsKt.toIntOrNull(str2)) == null) ? 1 : intOrNull2.intValue()) == 1) {
                        z6 = true;
                    }
                    if (z6) {
                        J(new C7975g());
                    }
                } else if (iIntValue == 15) {
                    J(new ve0.e());
                }
                this.f63114p.add(Integer.valueOf(iIntValue));
            }
        }
        Disposable disposable = this.f63105f;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63105f = v().subscribe(new c(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(@org.jetbrains.annotations.NotNull com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem r8, @org.jetbrains.annotations.NotNull le0.InterfaceC7845m r9) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager.q(com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem, le0.m):void");
    }

    @Nullable
    public final r r(int i7) {
        return (r) ((LinkedHashMap) this.f63100a).get(Integer.valueOf(i7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<InterfaceC7274d> u() {
        List listEmptyList = this.f63109k;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @NotNull
    public final Observable<List<InterfaceC7274d>> v() {
        Collection collectionValues = ((LinkedHashMap) this.f63100a).values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((r) it.next()).g());
        }
        return Observable.combineLatest(arrayList, new b(this)).observeOn(AndroidSchedulers.mainThread());
    }

    @Override // com.bilibili.lib.projection.internal.engine.s
    public final void w(@NotNull InterfaceC7667h interfaceC7667h) {
        C7662c c7662c = this.f63115q;
        if (c7662c.f122371a.contains(interfaceC7667h)) {
            c7662c.f122371a.remove(interfaceC7667h);
        }
    }

    public final void z(@Nullable ProjectionInterceptInfo.ProjectionInterceptType projectionInterceptType, @Nullable List<String> list) {
        BLog.i("ProjectionEngineManager", "some special machine in interceptList: " + list + ", interceptType: " + projectionInterceptType);
        ProjectionInterceptInfo.ProjectionInterceptType projectionInterceptType2 = projectionInterceptType;
        if (projectionInterceptType == null) {
            projectionInterceptType2 = ProjectionInterceptInfo.ProjectionInterceptType.Default;
        }
        this.h = projectionInterceptType2;
        this.f63107i = list;
        Iterator it = ((LinkedHashMap) this.f63100a).entrySet().iterator();
        while (it.hasNext()) {
            ((r) ((Map.Entry) it.next()).getValue()).l(this.h, list);
        }
    }
}
