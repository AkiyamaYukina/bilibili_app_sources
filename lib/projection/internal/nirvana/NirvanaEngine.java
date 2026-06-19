package com.bilibili.lib.projection.internal.nirvana;

import Cd0.e;
import Cd0.g;
import Cd0.l;
import Hd0.a;
import K7.L;
import M3.C2590j0;
import android.app.Application;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.A;
import androidx.fragment.app.D;
import androidx.fragment.app.z;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bilibili.base.MainThread;
import com.bilibili.bplus.baseplus.activity.t;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.nirvana.api.ActionStatus;
import com.bilibili.lib.nirvana.api.UPnPActionException;
import com.bilibili.lib.nirvana.api.m;
import com.bilibili.lib.nirvana.api.p;
import com.bilibili.lib.nirvana.api.q;
import com.bilibili.lib.nirvana.core.internal.bridge.NativeBridge;
import com.bilibili.lib.projection.base.NormalEvent;
import com.bilibili.lib.projection.internal.api.model.CurrQualityInfo;
import com.bilibili.lib.projection.internal.api.model.ProjectionInterceptInfo;
import com.bilibili.lib.projection.internal.api.model.ProjectionQualityInfo;
import com.bilibili.lib.projection.internal.api.model.QualityDescInfo;
import com.bilibili.lib.projection.internal.api.model.QualityItem;
import com.bilibili.lib.projection.internal.config.DefaultProjectionUserCompat;
import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager;
import com.bilibili.lib.projection.internal.engine.IEngineDeviceChange;
import com.bilibili.lib.projection.internal.engine.r;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import com.bilibili.lib.projection.internal.projectionitem.NoItem;
import com.bilibili.lib.projection.internal.projectionitem.base.CompatNirvanaPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.CompatProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem;
import com.bilibili.lib.projection.internal.search.C5323b;
import com.bilibili.lib.projection.internal.utils.ProjectionDanmakuSendHelper;
import com.bilibili.studio.comm.report.editor.bean.EditorAction;
import com.bilibili.studio.material.util.UtilsKt;
import he0.C7434c;
import ie0.C7564c;
import ie0.InterfaceC7569h;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import me0.C7975g;
import ne0.C8085a;
import ne0.InterfaceC8086b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qe0.C8422c;
import re0.C8518a;
import tv.danmaku.android.log.BLog;
import ue0.InterfaceC8719b;
import ue0.RunnableC8724g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine.class */
public final class NirvanaEngine implements r, m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63224a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public DefaultProjectionEngineManager f63227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.nirvana.api.m f63228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Fd0.a f63229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f63230g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Object> f63231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, ProjectionDeviceInternal> f63232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, ProjectionDeviceInternal> f63233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, ProjectionDeviceInternal> f63234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Object> f63235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Integer, Set<String>> f63236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<String> f63237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public List<String> f63238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public ProjectionInterceptInfo.ProjectionInterceptType f63239q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f63225b = LazyKt.lazy(new C2590j0(10));

    @NotNull
    public final e h = new e(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$NirvanaAutoNextPlayableItemWrapper.class */
    public static final class NirvanaAutoNextPlayableItemWrapper implements CompatNirvanaPlayableItem {

        @NotNull
        public static final a CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final StandardProjectionItem f63240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public ProjectionQualityInfo f63241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public List<ProjectionQualityInfo> f63242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f63243d = -1;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$NirvanaAutoNextPlayableItemWrapper$a.class */
        public static final class a implements Parcelable.Creator<NirvanaAutoNextPlayableItemWrapper> {
            @Override // android.os.Parcelable.Creator
            public final NirvanaAutoNextPlayableItemWrapper createFromParcel(Parcel parcel) {
                NirvanaAutoNextPlayableItemWrapper nirvanaAutoNextPlayableItemWrapper = new NirvanaAutoNextPlayableItemWrapper((StandardProjectionItem) parcel.readParcelable(StandardProjectionItem.class.getClassLoader()));
                nirvanaAutoNextPlayableItemWrapper.f63241b = (ProjectionQualityInfo) parcel.readParcelable(ProjectionQualityInfo.class.getClassLoader());
                nirvanaAutoNextPlayableItemWrapper.f63242c = parcel.createTypedArrayList(ProjectionQualityInfo.CREATOR);
                nirvanaAutoNextPlayableItemWrapper.f63243d = parcel.readInt();
                return nirvanaAutoNextPlayableItemWrapper;
            }

            @Override // android.os.Parcelable.Creator
            public final NirvanaAutoNextPlayableItemWrapper[] newArray(int i7) {
                return new NirvanaAutoNextPlayableItemWrapper[i7];
            }
        }

        public NirvanaAutoNextPlayableItemWrapper(@NotNull StandardProjectionItem standardProjectionItem) {
            this.f63240a = standardProjectionItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NirvanaAutoNextPlayableItemWrapper) && Intrinsics.areEqual(this.f63240a, ((NirvanaAutoNextPlayableItemWrapper) obj).f63240a);
        }

        @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
        public final IProjectionItem getRawItem() {
            return this.f63240a;
        }

        @Override // com.bilibili.lib.projection.internal.projectionitem.base.CompatProjectionPlayableItem, com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
        @NotNull
        public final StandardProjectionItem getRawItem() {
            return this.f63240a;
        }

        public final int hashCode() {
            return this.f63240a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "NirvanaAutoNextPlayableItemWrapper(rawItem=" + this.f63240a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeParcelable(this.f63240a, i7);
            parcel.writeParcelable(this.f63241b, i7);
            parcel.writeTypedList(this.f63242c);
            parcel.writeInt(this.f63243d);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$NirvanaDeviceSnapshot.class */
    public static final class NirvanaDeviceSnapshot implements DeviceSnapshot {

        @NotNull
        public static final a CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f63245b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$NirvanaDeviceSnapshot$a.class */
        public static final class a implements Parcelable.Creator<NirvanaDeviceSnapshot> {
            @Override // android.os.Parcelable.Creator
            public final NirvanaDeviceSnapshot createFromParcel(Parcel parcel) {
                return new NirvanaDeviceSnapshot(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NirvanaDeviceSnapshot[] newArray(int i7) {
                return new NirvanaDeviceSnapshot[i7];
            }
        }

        public NirvanaDeviceSnapshot(int i7, @NotNull String str) {
            this.f63244a = i7;
            this.f63245b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.bilibili.lib.projection.internal.device.DeviceSnapshot
        public final int e() {
            return this.f63244a;
        }

        @Override // com.bilibili.lib.projection.internal.device.DeviceSnapshot
        @NotNull
        public final String getUuid() {
            return this.f63245b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeInt(this.f63244a);
            parcel.writeString(this.f63245b);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$NirvanaPlayMode.class */
    public static final class NirvanaPlayMode {
        private static final EnumEntries $ENTRIES;
        private static final NirvanaPlayMode[] $VALUES;
        public static final NirvanaPlayMode PLAY_MODE_NORMAL = new NirvanaPlayMode("PLAY_MODE_NORMAL", 0);
        public static final NirvanaPlayMode PLAY_MODE_AUTONEXT = new NirvanaPlayMode("PLAY_MODE_AUTONEXT", 1);

        private static final /* synthetic */ NirvanaPlayMode[] $values() {
            return new NirvanaPlayMode[]{PLAY_MODE_NORMAL, PLAY_MODE_AUTONEXT};
        }

        static {
            NirvanaPlayMode[] nirvanaPlayModeArr$values = $values();
            $VALUES = nirvanaPlayModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(nirvanaPlayModeArr$values);
        }

        private NirvanaPlayMode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<NirvanaPlayMode> getEntries() {
            return $ENTRIES;
        }

        public static NirvanaPlayMode valueOf(String str) {
            return (NirvanaPlayMode) Enum.valueOf(NirvanaPlayMode.class, str);
        }

        public static NirvanaPlayMode[] values() {
            return (NirvanaPlayMode[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a.class */
    public final class a implements InterfaceC8719b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f63246A = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Ed0.b f63247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Cd0.e f63248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Cd0.l f63249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Cd0.g f63250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public String f63251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final io.reactivex.rxjava3.subjects.a<ProjectionDeviceInternal.DeviceState> f63252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final io.reactivex.rxjava3.subjects.a<ProjectionDeviceInternal.PlayerState> f63253g;

        @NotNull
        public final io.reactivex.rxjava3.subjects.a<IProjectionPlayableItem> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final PublishSubject<ge0.f> f63254i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final io.reactivex.rxjava3.subjects.a<Pair<Integer, Integer>> f63255j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final io.reactivex.rxjava3.subjects.a<Integer> f63256k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f63257l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public Triple<Integer, Integer, Integer> f63258m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f63259n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public Disposable f63260o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f63261p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public NirvanaPlayMode f63262q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f63263r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f63264s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f63265t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public CompatProjectionPlayableItem f63266u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f63267v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        public final t f63268w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f63269x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f63270y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final NirvanaEngine f63271z;

        /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$a.class */
        public abstract class AbstractC0349a<T extends com.bilibili.lib.nirvana.api.g> implements com.bilibili.lib.nirvana.api.h<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f63272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Pair<Long, String> f63273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a f63274c;

            public AbstractC0349a(@NotNull a aVar, @NotNull String str, Pair<Long, String> pair) {
                this.f63274c = aVar;
                this.f63272a = str;
                this.f63273b = pair;
            }

            public void a(@NotNull UPnPActionException uPnPActionException) {
                int errorCode = uPnPActionException.getErrorCode();
                String str = this.f63272a;
                Pair<Long, String> pair = this.f63273b;
                a aVar = this.f63274c;
                if (errorCode == -20021) {
                    aVar.f63252f.onNext(ProjectionDeviceInternal.DeviceState.CONNECTED);
                    if (Intrinsics.areEqual(str, "noreport")) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    long jLongValue = ((Number) pair.getFirst()).longValue();
                    com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                    CompatProjectionPlayableItem compatProjectionPlayableItem = aVar.f63266u;
                    aVar2.g0(compatProjectionPlayableItem != null ? compatProjectionPlayableItem.getRawItem() : null, this.f63274c, str, (String) pair.getSecond(), 1, jUptimeMillis - jLongValue, "", "", "", "");
                    return;
                }
                if (uPnPActionException.getErrorCode() == ActionStatus.DEVICE_REMOVED.getErrorCode() || uPnPActionException.getErrorCode() == ActionStatus.NATIVE_FAILURE.getErrorCode()) {
                    aVar.f63252f.onNext(ProjectionDeviceInternal.DeviceState.DISCONNECTED);
                }
                if (Intrinsics.areEqual(str, "noreport")) {
                    return;
                }
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                long jLongValue2 = ((Number) pair.getFirst()).longValue();
                com.bilibili.lib.projection.internal.reporter.a aVar3 = C7564c.f121634k;
                CompatProjectionPlayableItem compatProjectionPlayableItem2 = aVar.f63266u;
                IProjectionItem rawItem = compatProjectionPlayableItem2 != null ? compatProjectionPlayableItem2.getRawItem() : null;
                aVar3.g0(rawItem, this.f63274c, str, (String) pair.getSecond(), 2, jUptimeMillis2 - jLongValue2, uPnPActionException.getActionContent(), String.valueOf(uPnPActionException.getErrorCode()), uPnPActionException.getErrorMessage(), uPnPActionException.getResponseContent());
            }

            public void b(@NotNull T t7) {
                a aVar = this.f63274c;
                aVar.f63252f.onNext(ProjectionDeviceInternal.DeviceState.CONNECTED);
                String str = this.f63272a;
                if (Intrinsics.areEqual(str, "noreport")) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                Pair<Long, String> pair = this.f63273b;
                long jLongValue = ((Number) pair.getFirst()).longValue();
                com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                CompatProjectionPlayableItem compatProjectionPlayableItem = aVar.f63266u;
                aVar2.g0(compatProjectionPlayableItem != null ? compatProjectionPlayableItem.getRawItem() : null, this.f63274c, str, (String) pair.getSecond(), 1, jUptimeMillis - jLongValue, "", "", "", "");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$b.class */
        public final class b<T extends com.bilibili.lib.nirvana.api.g> extends AbstractC0349a<T> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final ObservableEmitter<T> f63275d;

            public b(@NotNull a aVar, ObservableEmitter<T> observableEmitter) {
                super(aVar, "noreport", new Pair(0L, ""));
                this.f63275d = observableEmitter;
            }

            @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
            public final void a(@NotNull UPnPActionException uPnPActionException) {
                ObservableEmitter<T> observableEmitter = this.f63275d;
                if (observableEmitter.isDisposed()) {
                    return;
                }
                super.a(uPnPActionException);
                observableEmitter.onError(uPnPActionException);
            }

            @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
            public final void b(@NotNull T t7) {
                ObservableEmitter<T> observableEmitter = this.f63275d;
                if (observableEmitter.isDisposed()) {
                    return;
                }
                super.b(t7);
                observableEmitter.onNext(t7);
                observableEmitter.onComplete();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$c.class */
        public class c extends AbstractC0349a<com.bilibili.lib.nirvana.api.a> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final String f63276d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final a f63277e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull a aVar, @NotNull String str, Pair<Long, String> pair) {
                super(aVar, str, pair);
                this.f63277e = aVar;
                this.f63276d = str;
            }

            @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
            public void a(@NotNull UPnPActionException uPnPActionException) {
                super.a(uPnPActionException);
                BLog.w("NirvanaEngine", D.a(this.f63276d, "' failed on device ", this.f63277e.h(), new StringBuilder("Invoke action '")), uPnPActionException);
            }

            @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(@NotNull com.bilibili.lib.nirvana.api.a aVar) {
                super.b(aVar);
                BLog.d("NirvanaEngine", A.a(this.f63276d, "' successfully on device ", this.f63277e.h(), UtilsKt.DOT, new StringBuilder("Invoke action '")));
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$d.class */
        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f63278a;

            static {
                int[] iArr = new int[NirvanaPlayMode.values().length];
                try {
                    iArr[NirvanaPlayMode.PLAY_MODE_NORMAL.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[NirvanaPlayMode.PLAY_MODE_AUTONEXT.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f63278a = iArr;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$e.class */
        public static final class e<T> implements Consumer {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f63279a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f63280b;

            public e(a aVar, float f7) {
                this.f63279a = aVar;
                this.f63280b = f7;
            }

            public final void accept(Object obj) {
                Triple<Integer, Integer, Integer> triple = (Triple) obj;
                a aVar = this.f63279a;
                aVar.f63258m = triple;
                Ref.IntRef intRef = new Ref.IntRef();
                int iIntValue = ((Number) triple.getFirst()).intValue();
                float fIntValue = ((Number) triple.getThird()).intValue() - ((Number) triple.getSecond()).intValue();
                float f7 = this.f63280b;
                int i7 = iIntValue + ((int) (fIntValue * f7));
                intRef.element = i7;
                if (i7 < ((Number) triple.getSecond()).intValue()) {
                    intRef.element = ((Number) triple.getSecond()).intValue();
                } else if (intRef.element > ((Number) triple.getThird()).intValue()) {
                    intRef.element = ((Number) triple.getThird()).intValue();
                }
                BLog.i("NirvanaEngine", "set volume: " + intRef.element + ", min = " + triple.getSecond() + ", max = " + triple.getThird());
                Pair pair = new Pair(Long.valueOf(SystemClock.uptimeMillis()), f7 > 0.0f ? "1" : "2");
                Cd0.l lVar = aVar.f63249c;
                if (lVar != null) {
                    lVar.G((short) intRef.element, new com.bilibili.lib.projection.internal.nirvana.a(aVar, pair, intRef, triple));
                }
                Cd0.l lVar2 = aVar.f63249c;
                if (lVar2 != null) {
                    lVar2.x(intRef.element == 0, new c(aVar, "mute", pair));
                }
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$f.class */
        public static final class f extends c {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final a f63281f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final IProjectionPlayableItem f63282g;
            public final long h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final boolean f63283i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final Integer f63284j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final NirvanaEngine f63285k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(a aVar, Pair<Long, String> pair, IProjectionPlayableItem iProjectionPlayableItem, long j7, boolean z6, Integer num, NirvanaEngine nirvanaEngine) {
                super(aVar, "seturi", pair);
                this.f63281f = aVar;
                this.f63282g = iProjectionPlayableItem;
                this.h = j7;
                this.f63283i = z6;
                this.f63284j = num;
                this.f63285k = nirvanaEngine;
            }

            @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.c, com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
            public final void a(UPnPActionException uPnPActionException) {
                super.a(uPnPActionException);
                int errorCode = uPnPActionException.getErrorCode();
                a aVar = this.f63281f;
                if (errorCode == -20402) {
                    BLog.i("ProjectionTrack", "seturi socket refused! search once!");
                    this.f63285k.s(-1);
                } else if (uPnPActionException.getErrorCode() == 701) {
                    aVar.stop();
                }
                HandlerThreads.postDelayed(0, new KS0.o(1, aVar, this.f63284j), 1000L);
            }

            @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.c, com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
            /* JADX INFO: renamed from: c */
            public final void b(com.bilibili.lib.nirvana.api.a aVar) {
                NirvanaPlayMode nirvanaPlayMode;
                super.b(aVar);
                a aVar2 = this.f63281f;
                aVar2.f63267v = true;
                aVar2.f63253g.onNext(ProjectionDeviceInternal.PlayerState.PLAYING);
                io.reactivex.rxjava3.subjects.a<IProjectionPlayableItem> aVar3 = aVar2.h;
                IProjectionPlayableItem iProjectionPlayableItem = this.f63282g;
                aVar3.onNext(iProjectionPlayableItem);
                aVar2.f63254i.onNext(new C8422c(0L, iProjectionPlayableItem instanceof StandardProjectionPlayableItem ? ((StandardProjectionPlayableItem) iProjectionPlayableItem).getDuration() : 0L));
                Pair pair = new Pair(Long.valueOf(SystemClock.uptimeMillis()), "");
                Cd0.e eVar = aVar2.f63248b;
                if (eVar != null) {
                    eVar.s(a.J(aVar2.f63257l), new c(aVar2, "dlnaplay", pair));
                }
                HandlerThreads.postDelayed(0, new com.bilibili.bililive.room.ui.roomv3.feedback.d(2, aVar2, this.f63284j), 1000L);
                HandlerThreads.postDelayed(0, aVar2.f63268w, 5000L);
                long j7 = this.h;
                if (j7 > 0 && ((nirvanaPlayMode = aVar2.f63262q) == NirvanaPlayMode.PLAY_MODE_NORMAL || (nirvanaPlayMode == NirvanaPlayMode.PLAY_MODE_AUTONEXT && aVar2.f63247a.a() < 103901))) {
                    aVar2.f63270y = j7;
                }
                if (this.f63283i) {
                    HandlerThreads.post(0, new kb0.b(1, iProjectionPlayableItem, aVar2));
                }
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$g.class */
        public static final class g extends c {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final a f63286f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Cd0.e f63287g;
            public final String h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final long f63288i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final long f63289j;

            /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine$a$g$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$g$a.class */
            public static final class C0350a extends c {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final a f63290f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final long f63291g;
                public final long h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0350a(a aVar, Pair<Long, String> pair, long j7, long j8) {
                    super(aVar, "seek", pair);
                    this.f63290f = aVar;
                    this.f63291g = j7;
                    this.h = j8;
                }

                @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.c, com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
                /* JADX INFO: renamed from: c */
                public final void b(com.bilibili.lib.nirvana.api.a aVar) {
                    super.b(aVar);
                    a aVar2 = this.f63290f;
                    aVar2.f63254i.onNext(NormalEvent.SEEK_COMPLETE);
                    a.H(aVar2, this.f63291g, this.h);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(a aVar, Pair<Long, String> pair, Cd0.e eVar, String str, long j7, long j8) {
                super(aVar, "seek", pair);
                this.f63286f = aVar;
                this.f63287g = eVar;
                this.h = str;
                this.f63288i = j7;
                this.f63289j = j8;
            }

            @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.c, com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
            public final void a(UPnPActionException uPnPActionException) {
                super.a(uPnPActionException);
                int errorCode = uPnPActionException.getErrorCode();
                if (400 > errorCode || errorCode >= 800) {
                    return;
                }
                C0350a c0350a = new C0350a(this.f63286f, new Pair(Long.valueOf(SystemClock.uptimeMillis()), ""), this.f63288i, this.f63289j);
                this.f63287g.C("ABS_TIME", this.h, c0350a);
            }

            @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.c, com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
            /* JADX INFO: renamed from: c */
            public final void b(com.bilibili.lib.nirvana.api.a aVar) {
                super.b(aVar);
                a aVar2 = this.f63286f;
                aVar2.f63254i.onNext(NormalEvent.SEEK_COMPLETE);
                a.H(aVar2, this.f63288i, this.f63289j);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$a$h.class */
        public static final class h implements Ie0.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f63292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f63293b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f63294c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f63295d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f63296e;

            public h(a aVar, String str, int i7, int i8, int i9) {
                this.f63292a = aVar;
                this.f63293b = str;
                this.f63294c = i7;
                this.f63295d = i8;
                this.f63296e = i9;
            }

            @Override // Ie0.c
            public final void onSuccess(String str, String str2) {
                Pair pair = new Pair(Long.valueOf(SystemClock.uptimeMillis()), "");
                a aVar = this.f63292a;
                Cd0.g gVar = aVar.f63250d;
                if (gVar != null) {
                    c cVar = new c(aVar, "senddanmaku", pair);
                    gVar.n(this.f63293b, this.f63294c, this.f63295d, this.f63296e, str, str2, cVar);
                }
            }
        }

        public a(@NotNull NirvanaEngine nirvanaEngine, Ed0.b bVar) {
            this.f63271z = nirvanaEngine;
            this.f63247a = bVar;
            N();
            this.f63251e = this.f63247a.j();
            this.f63252f = io.reactivex.rxjava3.subjects.a.d(ProjectionDeviceInternal.DeviceState.CONNECTED);
            this.f63253g = io.reactivex.rxjava3.subjects.a.d(ProjectionDeviceInternal.PlayerState.UNKNOWN);
            this.h = io.reactivex.rxjava3.subjects.a.d(NoItem.f63473a);
            this.f63254i = PublishSubject.create();
            this.f63255j = io.reactivex.rxjava3.subjects.a.d(new Pair(0, 0));
            this.f63256k = io.reactivex.rxjava3.subjects.a.d(0);
            this.f63257l = 1.0f;
            this.f63258m = new Triple<>(-1, 0, 100);
            this.f63262q = NirvanaPlayMode.PLAY_MODE_NORMAL;
            this.f63268w = new t(this, 3);
            this.f63269x = -1;
            this.f63270y = -1L;
        }

        public static void H(a aVar, long j7, long j8) {
            aVar.getClass();
            if (j8 <= 0 || j7 <= 0 || ((long) 3000) + j7 < j8 || aVar.f63267v) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar.f63259n + ((long) 5000) < jUptimeMillis) {
                aVar.f63259n = jUptimeMillis;
                aVar.f63253g.onNext(ProjectionDeviceInternal.PlayerState.COMPLETED);
                StringBuilder sb = new StringBuilder("onComplete, duration = ");
                sb.append(j8);
                com.bilibili.app.comment3.utils.r.b(j7, ", position = ", "NirvanaEngine", sb);
            }
        }

        public static long I(String str) {
            long j7 = 0;
            try {
                if (str.length() != 0) {
                    j7 = Long.parseLong(str);
                }
            } catch (Exception e7) {
            }
            return j7;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String J(float r3) {
            /*
                r0 = r3
                r1 = 1056964608(0x3f000000, float:0.5)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto Ld
                java.lang.String r0 = "1/2"
                r4 = r0
                goto L49
            Ld:
                r0 = r3
                r1 = 1061158912(0x3f400000, float:0.75)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L1a
                java.lang.String r0 = "3/4"
                r4 = r0
                goto L49
            L1a:
                r0 = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L26
            L20:
                java.lang.String r0 = "1"
                r4 = r0
                goto L49
            L26:
                r0 = r3
                r1 = 1067450368(0x3fa00000, float:1.25)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L33
                java.lang.String r0 = "5/4"
                r4 = r0
                goto L49
            L33:
                r0 = r3
                r1 = 1069547520(0x3fc00000, float:1.5)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L40
                java.lang.String r0 = "3/2"
                r4 = r0
                goto L49
            L40:
                r0 = r3
                r1 = 1073741824(0x40000000, float:2.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L20
                java.lang.String r0 = "2"
                r4 = r0
            L49:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.J(float):java.lang.String");
        }

        public static boolean L(String str) {
            return (str.length() <= 0 || Intrinsics.areEqual(str, "null") || Intrinsics.areEqual(str, "0")) ? false : true;
        }

        public static int P(int i7) {
            if (i7 == 160) {
                i7 = 32;
            } else if (i7 == 176) {
                i7 = 48;
            } else if (i7 == 192) {
                i7 = 64;
            } else if (i7 == 208) {
                i7 = 80;
            }
            return i7;
        }

        public static final int a(a aVar, String str) {
            Integer numValueOf;
            Fd0.a aVar2 = aVar.f63271z.f63229f;
            if (aVar2 != null) {
                aVar2.getClass();
                numValueOf = Integer.valueOf(NativeBridge.didlParseTimeStamp(str));
            } else {
                numValueOf = null;
            }
            int iIntValue = 0;
            if (numValueOf != null && numValueOf.intValue() == -1) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    Date date = simpleDateFormat.parse("1970-01-01 ".concat(str));
                    iIntValue = (int) ((date != null ? date.getTime() : 0L) / ((long) 1000));
                } catch (Exception e7) {
                }
            } else if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            return iIntValue;
        }

        public static final void x(a aVar, ObservableEmitter observableEmitter, int i7, int i8) {
            aVar.getClass();
            try {
                AudioManager audioManager = (AudioManager) FoundationAlias.getFapp().getSystemService("audio");
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
                int streamVolume = audioManager.getStreamVolume(3);
                observableEmitter.onNext((streamMaxVolume <= streamMinVolume || streamVolume <= 0) ? new Triple(0, Integer.valueOf(i7), Integer.valueOf(i8)) : new Triple(Integer.valueOf((((i8 - i7) * (streamVolume - i7)) / (streamMaxVolume - streamMinVolume)) + i7), Integer.valueOf(i7), Integer.valueOf(i8)));
                observableEmitter.onComplete();
            } catch (Exception e7) {
                observableEmitter.onError(e7);
            }
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Observable<ge0.f> A() {
            return this.f63254i.observeOn(AndroidSchedulers.mainThread());
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x03d9  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02f4  */
        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void B(@org.jetbrains.annotations.NotNull com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem r19, float r20, long r21, boolean r23) throws org.json.JSONException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
            /*
                Method dump skipped, instruction units count: 1623
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.B(com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem, float, long, boolean):void");
        }

        @Override // ge0.InterfaceC7274d
        public final boolean C() {
            return this.f63264s;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void D() {
            G(0.1f);
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final DeviceSnapshot F() {
            e();
            String strC = se0.k.c(this.f63247a);
            e();
            return new NirvanaDeviceSnapshot(5, strC + "_5");
        }

        public final void G(float f7) {
            Observable observableObserveOn;
            final Cd0.l lVar = this.f63249c;
            if (lVar == null) {
                observableObserveOn = Observable.empty();
            } else {
                Triple<Integer, Integer, Integer> triple = this.f63258m;
                int iIntValue = ((Number) triple.getSecond()).intValue();
                int iIntValue2 = ((Number) triple.getThird()).intValue();
                int iIntValue3 = ((Number) triple.getFirst()).intValue();
                observableObserveOn = (iIntValue > iIntValue3 || iIntValue3 > iIntValue2) ? Observable.create(new ObservableOnSubscribe(lVar, this) { // from class: ue0.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final l f127841a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final NirvanaEngine.a f127842b;

                    {
                        this.f127841a = lVar;
                        this.f127842b = this;
                    }

                    public final void subscribe(ObservableEmitter observableEmitter) {
                        int i7;
                        int i8;
                        l lVar2 = this.f127841a;
                        p pVarT = lVar2.t();
                        a.a aVarQ = pVarT != null ? pVarT.Q() : null;
                        Ref.IntRef intRef = new Ref.IntRef();
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        intRef2.element = 100;
                        if (aVarQ != null && (i7 = aVarQ.a) < (i8 = aVarQ.b)) {
                            intRef.element = i7;
                            intRef2.element = i8;
                        }
                        lVar2.w(new com.bilibili.lib.projection.internal.nirvana.c(this.f127842b, intRef, intRef2, observableEmitter, new Pair(0L, "")));
                    }
                }).observeOn(AndroidSchedulers.mainThread()) : Observable.just(triple);
            }
            Disposable disposableSubscribe = observableObserveOn.subscribe(new e(this, f7));
            CompositeDisposable compositeDisposable = this.f63271z.f63230g;
            if (compositeDisposable != null) {
                compositeDisposable.add(disposableSubscribe);
            }
        }

        public final boolean K() {
            boolean z6 = true;
            if (!StringsKt.equals(this.f63247a.E(), "HiSmart", true) || !((Boolean) this.f63271z.f63225b.getValue()).booleanValue()) {
                z6 = false;
            }
            return z6;
        }

        public final boolean M() {
            return StringsKt.l(this.f63247a.getManufacturer(), "sony");
        }

        public final void N() {
            boolean z6;
            Ed0.b bVar = this.f63247a;
            int i7 = e.a.c;
            this.f63248b = bVar.k(new q.a("urn:schemas-upnp-org:service:AVTransport:*"));
            Ed0.b bVar2 = this.f63247a;
            int i8 = l.a.c;
            this.f63249c = bVar2.k(new q.a("urn:schemas-upnp-org:service:RenderingControl:*"));
            Ed0.b bVar3 = this.f63247a;
            int i9 = g.a.c;
            Cd0.g gVarK = bVar3.k(new q.a("urn:app-bilibili-com:service:NirvanaControl:*"));
            this.f63250d = gVarK;
            int version = gVarK != null ? gVarK.getVersion() : 0;
            DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63271z.f63227d;
            boolean z7 = false;
            if (defaultProjectionEngineManager != null) {
                z7 = false;
                if (defaultProjectionEngineManager.getContext() != null) {
                    C8085a c8085a = C7564c.f121633j;
                    z7 = false;
                    if (c8085a != null) {
                        Lazy lazy = c8085a.f124080k;
                        if (!((List) lazy.getValue()).isEmpty()) {
                            if (version >= ((Number) ((List) lazy.getValue()).get(0)).intValue()) {
                                List listSubList = ((List) lazy.getValue()).subList(1, ((List) lazy.getValue()).size());
                                if (!(listSubList instanceof Collection) || !listSubList.isEmpty()) {
                                    Iterator it = listSubList.iterator();
                                    while (it.hasNext()) {
                                        if (((Number) it.next()).intValue() == version) {
                                        }
                                    }
                                }
                                z6 = true;
                            }
                            z6 = false;
                            break;
                        }
                        if (version < 3) {
                            z6 = false;
                            break;
                        }
                        z6 = true;
                        z7 = false;
                        if (z6) {
                            z7 = false;
                            if (!se0.k.b(this.f63247a)) {
                                z7 = true;
                            }
                        }
                    }
                }
            }
            this.f63263r = z7;
        }

        public final Pair<ProjectionQualityInfo, ArrayList<ProjectionQualityInfo>> O(int i7, QualityDescInfo qualityDescInfo) {
            Pair<ProjectionQualityInfo, ArrayList<ProjectionQualityInfo>> pair;
            if (qualityDescInfo == null) {
                return null;
            }
            CurrQualityInfo currentQn = qualityDescInfo.getCurrentQn();
            ArrayList<QualityItem> supportQnList = qualityDescInfo.getSupportQnList();
            if (currentQn == null || supportQnList == null) {
                pair = null;
            } else {
                int iP = P(currentQn.getQuality());
                ArrayList arrayList = new ArrayList();
                ProjectionQualityInfo projectionQualityInfo = null;
                for (QualityItem qualityItem : supportQnList) {
                    int iP2 = P(qualityItem.getQuality());
                    String description = qualityItem.getDescription();
                    String description2 = qualityItem.getDescription();
                    String displayDesc = qualityItem.getDisplayDesc();
                    if (displayDesc.length() == 0) {
                        List listR = StringsKt.R(description2, new String[]{" "}, 0, 6);
                        if (listR.size() > 1) {
                            description2 = (String) listR.get(1);
                        }
                    } else {
                        description2 = displayDesc;
                    }
                    String superscript = qualityItem.getSuperscript();
                    boolean needLogin = qualityItem.getNeedLogin();
                    boolean needVip = qualityItem.getNeedVip();
                    if (this.f63247a.a() <= 103900) {
                        needVip = C7564c.f121633j.r(i7, iP2);
                    }
                    int i8 = needVip ? 2 : 0;
                    if (this.f63247a.a() > 103900 ? needLogin : C7564c.f121633j.q(i7, iP2)) {
                        i8 |= 1;
                    }
                    ProjectionQualityInfo projectionQualityInfo2 = new ProjectionQualityInfo(iP2, "", description, description2, superscript, i8, false, "");
                    arrayList.add(projectionQualityInfo2);
                    if (iP2 == iP) {
                        projectionQualityInfo = projectionQualityInfo2;
                    }
                }
                if (projectionQualityInfo == null) {
                    return null;
                }
                pair = new Pair<>(projectionQualityInfo, arrayList);
            }
            return pair;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final ProjectionDeviceInternal.DeviceState b() {
            return (ProjectionDeviceInternal.DeviceState) this.f63252f.e();
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void c(boolean z6) {
            Pair pair = new Pair(Long.valueOf(SystemClock.uptimeMillis()), z6 ? "1" : "2");
            Cd0.g gVar = this.f63250d;
            if (gVar != null) {
                gVar.N(z6, new c(this, "danmakutoggle", pair));
            }
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final List<String> d() {
            return StringsKt.R(this.f63247a.d(), new String[]{","}, 0, 6);
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void destroy() {
            Disposable disposable = this.f63260o;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f63260o = null;
            this.f63253g.onNext(ProjectionDeviceInternal.PlayerState.UNKNOWN);
        }

        @Override // ge0.InterfaceC7274d
        public final int e() {
            this.f63271z.getClass();
            return 5;
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(se0.k.c(this.f63247a), se0.k.c(((a) obj).f63247a));
        }

        @Override // ge0.InterfaceC7274d
        public final long f() {
            long jF = this.f63247a.f();
            BLog.i("NirvanaEngine", androidx.core.content.c.b(jF, "nva display name -> ", this.f63251e, ", drainage -> "));
            return jF;
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getBrand() {
            return this.f63247a.P();
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getChannel() {
            return this.f63247a.getChannelName();
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getDisplayName() {
            return this.f63251e;
        }

        @Override // pe0.i
        @NotNull
        public final String getHost() {
            String host = Uri.parse(this.f63247a.getBaseUrl()).getHost();
            String str = host;
            if (host == null) {
                str = "";
            }
            return str;
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getManufacturer() {
            return this.f63247a.getManufacturer();
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final IProjectionPlayableItem getMediaSource() {
            return (IProjectionPlayableItem) this.h.e();
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getModel() {
            return this.f63247a.E();
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getName() {
            return this.f63247a.j();
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final ProjectionDeviceInternal.PlayerState getPlayerState() {
            return (ProjectionDeviceInternal.PlayerState) this.f63253g.e();
        }

        @Override // pe0.i
        public final int getPort() {
            return Uri.parse(this.f63247a.getBaseUrl()).getPort();
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final String getRealName() {
            return this.f63247a.j();
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getUuid() {
            return se0.k.c(this.f63247a);
        }

        @Override // ge0.InterfaceC7274d
        @NotNull
        public final String getVersion() {
            return String.valueOf(this.f63247a.a());
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final String h() {
            return androidx.constraintlayout.motion.widget.p.a("(", this.f63247a.j(), ", ", se0.k.c(this.f63247a), ")");
        }

        public final int hashCode() {
            return se0.k.c(this.f63247a).hashCode();
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Observable<ProjectionDeviceInternal.DeviceState> i() {
            return this.f63252f.distinctUntilChanged().observeOn(AndroidSchedulers.mainThread());
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Observable<IProjectionPlayableItem> j() {
            return this.h.observeOn(AndroidSchedulers.mainThread());
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
        @Override // ge0.InterfaceC7274d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean k() {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.k():boolean");
        }

        @Override // ge0.InterfaceC7274d
        public final void l(@NotNull String str) {
            this.f63251e = str;
        }

        @Override // ue0.InterfaceC8718a
        @Nullable
        public final Cd0.g m() {
            return this.f63250d;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void n() {
            G(-0.1f);
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void p(boolean z6) {
            this.f63256k.onNext(Integer.valueOf(z6 ? 2 : 0));
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void pause() {
            Pair pair = new Pair(Long.valueOf(SystemClock.uptimeMillis()), "");
            Cd0.e eVar = this.f63248b;
            if (eVar != null) {
                eVar.D(new c(this, "pause", pair));
            }
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void q(@NotNull NoItem noItem) {
            this.h.onNext(noItem);
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void r(@Nullable InterfaceC7845m interfaceC7845m) {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            if (interfaceC7845m != null && (reporter = interfaceC7845m.getReporter()) != null) {
                reporter.l(this);
            }
            this.f63260o = this.f63256k.distinctUntilChanged().switchMap(new l(this)).subscribe();
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void resume() {
            Pair pair = new Pair(Long.valueOf(SystemClock.uptimeMillis()), "");
            Cd0.e eVar = this.f63248b;
            if (eVar != null) {
                eVar.s(J(this.f63257l), new c(this, "resume", pair));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void seekTo(long r15) {
            /*
                r14 = this;
                r0 = r14
                Cd0.e r0 = r0.f63248b
                r22 = r0
                r0 = r22
                if (r0 != 0) goto Lc
                return
            Lc:
                r0 = r14
                com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem r0 = r0.getMediaSource()
                r20 = r0
                r0 = r20
                boolean r0 = r0 instanceof com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem
                if (r0 == 0) goto L24
                r0 = r20
                com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem r0 = (com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem) r0
                r20 = r0
                goto L27
            L24:
                r0 = 0
                r20 = r0
            L27:
                r0 = r20
                if (r0 == 0) goto L38
                r0 = r20
                long r0 = r0.getDuration()
                r18 = r0
            L35:
                goto L3e
            L38:
                r0 = 0
                r18 = r0
                goto L35
            L3e:
                r0 = r15
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r0 = r0 / r1
                int r0 = (int) r0
                r17 = r0
                r0 = r14
                com.bilibili.lib.projection.internal.nirvana.NirvanaEngine r0 = r0.f63271z
                Fd0.a r0 = r0.f63229f
                r20 = r0
                r0 = r20
                if (r0 == 0) goto L6f
                r0 = r20
                java.lang.Class r0 = r0.getClass()
                r0 = r17
                java.lang.String r0 = com.bilibili.lib.nirvana.core.internal.bridge.NativeBridge.didlFormatTimeStamp(r0)
                r21 = r0
                r0 = r21
                r20 = r0
                r0 = r21
                if (r0 != 0) goto L6c
                goto L6f
            L6c:
                goto L94
            L6f:
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                r1 = r0
                java.lang.String r2 = "HH:mm:ss"
                r1.<init>(r2)
                r20 = r0
                r0 = r20
                java.lang.String r1 = "UTC"
                java.util.TimeZone r1 = j$.util.DesugarTimeZone.getTimeZone(r1)
                r0.setTimeZone(r1)
                r0 = r20
                r1 = r17
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r0 = r0.format(r1)
                r20 = r0
                goto L6c
            L94:
                r0 = r22
                java.lang.String r1 = "REL_TIME"
                r2 = r20
                com.bilibili.lib.projection.internal.nirvana.NirvanaEngine$a$g r3 = new com.bilibili.lib.projection.internal.nirvana.NirvanaEngine$a$g
                r4 = r3
                r5 = r14
                kotlin.Pair r6 = new kotlin.Pair
                r7 = r6
                long r8 = android.os.SystemClock.uptimeMillis()
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                java.lang.String r9 = ""
                r7.<init>(r8, r9)
                r7 = r22
                r8 = r20
                r9 = r15
                r10 = r18
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r0.C(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.seekTo(long):void");
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final boolean sendDanmaku(@NotNull String str, int i7, int i8, int i9) {
            InterfaceC7569h context;
            Application app2;
            IProjectionItem rawItem = getMediaSource().getRawItem();
            if (!(rawItem instanceof StandardProjectionItem)) {
                return false;
            }
            StandardProjectionItem standardProjectionItem = (StandardProjectionItem) rawItem;
            long avid = standardProjectionItem.getAvid();
            long cid = standardProjectionItem.getCid();
            String spmid = standardProjectionItem.getSpmid();
            if (spmid == null) {
                spmid = "";
            }
            String fromSpmid = standardProjectionItem.getFromSpmid();
            if (fromSpmid == null) {
                fromSpmid = "";
            }
            DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63271z.f63227d;
            if (defaultProjectionEngineManager == null || (context = defaultProjectionEngineManager.getContext()) == null || (app2 = ((C7564c) context).getApp()) == null) {
                return true;
            }
            ProjectionDanmakuSendHelper.INSTANCE.sendDanmaku(app2, avid, cid, spmid, fromSpmid, this.f63261p, str, i7, i8, i9, new h(this, str, i8, i7, i9));
            return true;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void stop() {
            Pair pair = new Pair(Long.valueOf(SystemClock.uptimeMillis()), "");
            Cd0.e eVar = this.f63248b;
            if (eVar != null) {
                eVar.K(new c(this, EditorAction.ACTION_STOP, pair));
            }
            this.h.onNext(NoItem.f63473a);
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void switchQuality(int i7) {
            if (this.f63262q == NirvanaPlayMode.PLAY_MODE_AUTONEXT) {
                BLog.i("ProjectionTrack", "nirvana switch quality by auto next = " + i7);
                Pair pair = new Pair(Long.valueOf(SystemClock.uptimeMillis()), "");
                Cd0.g gVar = this.f63250d;
                if (gVar != null) {
                    gVar.y(i7, new c(this, "switchquality", pair));
                }
            }
        }

        @Override // ge0.InterfaceC7274d
        public final boolean t() {
            return this.f63263r;
        }

        @NotNull
        public final String toString() {
            return C4496a.a("DefaultNirvanaDevice", h());
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final void u(boolean z6) {
            this.f63256k.onNext(Integer.valueOf(z6 ? 3 : 2));
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        public final boolean v() {
            return this.f63265t;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Observable<ProjectionDeviceInternal.PlayerState> w() {
            return this.f63253g.distinctUntilChanged().observeOn(AndroidSchedulers.mainThread());
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal
        @NotNull
        public final Pair<Integer, Integer> y() {
            return (Pair) this.f63255j.e();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63297a;

        static {
            int[] iArr = new int[ProjectionInterceptInfo.ProjectionInterceptType.values().length];
            try {
                iArr[ProjectionInterceptInfo.ProjectionInterceptType.Default.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ProjectionInterceptInfo.ProjectionInterceptType.OnlyInterceptInList.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ProjectionInterceptInfo.ProjectionInterceptType.InterceptNotInList.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f63297a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$c.class */
    public static final class c implements Se0.a<IProjectionItem> {
        /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
        @Override // Se0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem a(com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem r5, com.bilibili.lib.projection.internal.config.DefaultRequestConfig r6, ge0.InterfaceC7274d r7) {
            /*
                r4 = this;
                r0 = r5
                boolean r0 = r0 instanceof com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
                if (r0 == 0) goto L8d
                r0 = r5
                com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem r0 = (com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem) r0
                r7 = r0
                r0 = r7
                boolean r0 = r0.isAutoNext()
                if (r0 == 0) goto L8d
                r0 = r6
                boolean r0 = r0.getSupportAutoNext()
                if (r0 == 0) goto L8d
                r0 = r6
                int r0 = r0.getDeviceEngineId()
                r1 = 7
                if (r0 != r1) goto L59
                r0 = r6
                int r0 = r0.getExpectedQuality()
                r8 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "resolve by autonext quality = "
                r1.<init>(r2)
                r5 = r0
                r0 = r5
                r1 = r8
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = "ProjectionTrack"
                r1 = r5
                java.lang.String r1 = r1.toString()
                tv.danmaku.android.log.BLog.i(r0, r1)
                com.bilibili.lib.projection.internal.projectionitem.LinkPlayableItemWrapper r0 = new com.bilibili.lib.projection.internal.projectionitem.LinkPlayableItemWrapper
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                r5 = r0
                r0 = r5
                r1 = r6
                int r1 = r1.getExpectedQuality()
                r0.f63472d = r1
                goto L96
            L59:
                r0 = r6
                int r0 = r0.getExpectedQuality()
                r8 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "resolve by autonext quality = "
                r1.<init>(r2)
                r5 = r0
                r0 = r5
                r1 = r8
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = "ProjectionTrack"
                r1 = r5
                java.lang.String r1 = r1.toString()
                tv.danmaku.android.log.BLog.i(r0, r1)
                com.bilibili.lib.projection.internal.nirvana.NirvanaEngine$NirvanaAutoNextPlayableItemWrapper r0 = new com.bilibili.lib.projection.internal.nirvana.NirvanaEngine$NirvanaAutoNextPlayableItemWrapper
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                r5 = r0
                r0 = r5
                r1 = r6
                int r1 = r1.getExpectedQuality()
                r0.f63243d = r1
                goto L96
            L8d:
                com.bilibili.lib.projection.internal.projectionitem.IllegalPlayableItemWrapper r0 = new com.bilibili.lib.projection.internal.projectionitem.IllegalPlayableItemWrapper
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                r5 = r0
            L96:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.c.a(com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem, com.bilibili.lib.projection.internal.config.DefaultRequestConfig, ge0.d):com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$d.class */
    public static final class d<T, R> implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NirvanaEngine f63298a;

        public d(NirvanaEngine nirvanaEngine) {
            this.f63298a = nirvanaEngine;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object apply(Object obj) throws NoWhenBranchMatchedException {
            NirvanaEngine nirvanaEngine = this.f63298a;
            Collection<ProjectionDeviceInternal> collectionValues = nirvanaEngine.f63232j.values();
            ArrayList arrayList = new ArrayList();
            for (T t7 : collectionValues) {
                ProjectionDeviceInternal projectionDeviceInternal = (ProjectionDeviceInternal) t7;
                if (!(projectionDeviceInternal instanceof se0.f) && !C7434c.c(projectionDeviceInternal)) {
                    String realName = projectionDeviceInternal.getRealName();
                    int i7 = b.f63297a[nirvanaEngine.f63239q.ordinal()];
                    if (i7 != 1) {
                        if (i7 == 2) {
                            List<String> list = nirvanaEngine.f63238p;
                            if (list != null) {
                                List<String> list2 = list.isEmpty() ? null : list;
                                if (list2 != null) {
                                    for (String str : list2) {
                                        if (str == null || realName == null || !StringsKt.l(realName, str)) {
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List<String> list3 = nirvanaEngine.f63238p;
                            if (list3 != null) {
                                List<String> list4 = list3.isEmpty() ? null : list3;
                                if (list4 != null) {
                                    for (String str2 : list4) {
                                        if (str2 == null || realName == null || !StringsKt.l(realName, str2)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList.add(t7);
            }
            List mutableList = CollectionsKt.toMutableList(arrayList);
            BLog.i("NirvanaEngine", "intercept type: " + nirvanaEngine.f63239q + ", intercept list: " + nirvanaEngine.f63238p + ", nirvana engine list -> " + mutableList.size() + ", what in it: [" + mutableList + "]");
            return mutableList;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$e.class */
    public static final class e implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Fz0.a f63301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final RunnableC8724g f63302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final NirvanaEngine f63303e;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$e$a.class */
        public static final class a<T, R> implements Function {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<T, R> f63304a = (a<T, R>) new Object();

            public final Object apply(Object obj) {
                return (Integer) ((Pair) obj).getFirst();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$e$b.class */
        public static final class b<T> implements Consumer {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NirvanaEngine f63305a;

            public b(NirvanaEngine nirvanaEngine) {
                this.f63305a = nirvanaEngine;
            }

            public final void accept(Object obj) {
                NirvanaEngine nirvanaEngine = this.f63305a;
                nirvanaEngine.f63232j.clear();
                nirvanaEngine.f63231i.onNext(Unit.INSTANCE);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$e$c.class */
        public static final class c<T> implements Consumer {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f63306a;

            public c(e eVar) {
                this.f63306a = eVar;
            }

            public final void accept(Object obj) {
                HandlerThreads.post(2, this.f63306a.f63302d);
            }
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [ue0.g] */
        public e(final NirvanaEngine nirvanaEngine) {
            Long longOrNull;
            Long longOrNull2;
            this.f63303e = nirvanaEngine;
            ConfigManager.Companion companion = ConfigManager.Companion;
            String str = (String) Contract.get$default(companion.config(), "cast.device_out_page_search_time", (Object) null, 2, (Object) null);
            this.f63299a = (str == null || (longOrNull2 = StringsKt.toLongOrNull(str)) == null) ? 15L : longOrNull2.longValue();
            String str2 = (String) Contract.get$default(companion.config(), "cast.device_out_page_stop_search_time", (Object) null, 2, (Object) null);
            this.f63300b = (str2 == null || (longOrNull = StringsKt.toLongOrNull(str2)) == null) ? 5L : longOrNull.longValue();
            this.f63301c = new Fz0.a(nirvanaEngine, 1);
            this.f63302d = new Runnable(this, nirvanaEngine) { // from class: ue0.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NirvanaEngine.e f127847a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final NirvanaEngine f127848b;

                {
                    this.f127847a = this;
                    this.f127848b = nirvanaEngine;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    NirvanaEngine.e eVar = this.f127847a;
                    NirvanaEngine nirvanaEngine2 = this.f127848b;
                    HandlerThreads.remove(2, eVar.f63301c);
                    HandlerThreads.post(2, new KS0.r(1, nirvanaEngine2, eVar));
                }
            };
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            C8518a c8518a;
            PublishSubject<Pair<Integer, NetworkInfo>> publishSubject;
            Observable map;
            Observable observableDistinctUntilChanged;
            Disposable disposableSubscribe;
            CompositeDisposable compositeDisposable;
            super.onCreate(lifecycleOwner);
            NirvanaEngine nirvanaEngine = this.f63303e;
            CompositeDisposable compositeDisposable2 = nirvanaEngine.f63230g;
            if (compositeDisposable2 != null) {
                compositeDisposable2.dispose();
            }
            nirvanaEngine.f63230g = new CompositeDisposable();
            DefaultProjectionEngineManager defaultProjectionEngineManager = nirvanaEngine.f63227d;
            if (defaultProjectionEngineManager != null && defaultProjectionEngineManager.getContext() != null && (c8518a = C7564c.f121641r) != null && (publishSubject = c8518a.f126652a) != null && (map = publishSubject.map(a.f63304a)) != null && (observableDistinctUntilChanged = map.distinctUntilChanged()) != null && (disposableSubscribe = observableDistinctUntilChanged.subscribe(new b(nirvanaEngine))) != null && (compositeDisposable = nirvanaEngine.f63230g) != null) {
                compositeDisposable.add(disposableSubscribe);
            }
            CompositeDisposable compositeDisposable3 = nirvanaEngine.f63230g;
            if (compositeDisposable3 != null) {
                compositeDisposable3.add(Observable.interval(1L, this.f63299a, TimeUnit.SECONDS).subscribe(new c(this)));
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            super.onDestroy(lifecycleOwner);
            NirvanaEngine nirvanaEngine = this.f63303e;
            CompositeDisposable compositeDisposable = nirvanaEngine.f63230g;
            if (compositeDisposable != null) {
                compositeDisposable.dispose();
            }
            nirvanaEngine.f63230g = null;
            HandlerThreads.remove(2, this.f63301c);
            HandlerThreads.remove(2, this.f63302d);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
            BLog.i("NirvanaEngine", "[blink] ------> stop scan, pause stop...");
            C5323b.f63716a.a(IEngineDeviceChange.EngineType.Nirvana, false);
            NirvanaEngine nirvanaEngine = this.f63303e;
            com.bilibili.lib.nirvana.api.m mVar = nirvanaEngine.f63228e;
            if (mVar != null) {
                mVar.stop();
            }
            for (ProjectionDeviceInternal projectionDeviceInternal : nirvanaEngine.f63232j.values()) {
                if (projectionDeviceInternal instanceof a) {
                    ((a) projectionDeviceInternal).f63265t = true;
                }
            }
            nirvanaEngine.f63232j.clear();
            nirvanaEngine.f63231i.onNext(Unit.INSTANCE);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            Integer intOrNull;
            super.onStart(lifecycleOwner);
            BLog.i("NirvanaEngine", "[blink] ------> start scan, start search...");
            NirvanaEngine nirvanaEngine = this.f63303e;
            nirvanaEngine.f63232j.clear();
            nirvanaEngine.f63231i.onNext(Unit.INSTANCE);
            com.bilibili.lib.nirvana.api.m mVar = nirvanaEngine.f63228e;
            if (mVar != null) {
                mVar.start();
            }
            String str = (String) ConfigManager.Companion.config().get("cast.device_out_page_on_start_search", "0");
            if (((str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue()) == 1) {
                nirvanaEngine.s(-1);
            }
            if (Ie0.d.g()) {
                for (r rVar : ((LinkedHashMap) C7564c.f121640q.f63100a).values()) {
                    if (!(rVar instanceof C7975g)) {
                        rVar.k(6);
                    }
                }
            }
            C5323b.f63716a.a(IEngineDeviceChange.EngineType.Nirvana, true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$f.class */
    public static final class f<T, R> implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NirvanaEngine f63307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProjectionPlayRecord f63308b;

        public f(NirvanaEngine nirvanaEngine, ProjectionPlayRecord projectionPlayRecord) {
            this.f63307a = nirvanaEngine;
            this.f63308b = projectionPlayRecord;
        }

        public final Object apply(Object obj) {
            ProjectionDeviceInternal projectionDeviceInternal = this.f63307a.f63232j.get(StringsKt.removeSuffix(this.f63308b.getDevice().getUuid(), "_5"));
            return projectionDeviceInternal != null ? Observable.just(projectionDeviceInternal) : Observable.empty();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/NirvanaEngine$g.class */
    public static final class g<T, R> implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionPlayRecord f63309a;

        public g(ProjectionPlayRecord projectionPlayRecord) {
            this.f63309a = projectionPlayRecord;
        }

        public final Object apply(Object obj) {
            Observable observableEmpty;
            ProjectionDeviceInternal projectionDeviceInternal = (ProjectionDeviceInternal) obj;
            if (projectionDeviceInternal instanceof a) {
                a aVar = (a) projectionDeviceInternal;
                IProjectionPlayableItem iProjectionPlayableItemF = this.f63309a.f();
                aVar.getClass();
                if (iProjectionPlayableItemF instanceof StandardProjectionPlayableItem) {
                    observableEmpty = Observable.create(new oi.b(aVar)).flatMap(new o(aVar, (StandardProjectionPlayableItem) iProjectionPlayableItemF));
                } else {
                    BLog.i("NirvanaEngine", "Unsupported to restore item " + iProjectionPlayableItemF + UtilsKt.DOT);
                    observableEmpty = Observable.empty();
                }
            } else {
                observableEmpty = Observable.empty();
            }
            return observableEmpty;
        }
    }

    public NirvanaEngine(int i7) {
        this.f63224a = i7;
        Unit unit = Unit.INSTANCE;
        this.f63231i = io.reactivex.rxjava3.subjects.a.d(unit);
        this.f63232j = new ConcurrentHashMap<>();
        this.f63233k = new ConcurrentHashMap<>();
        this.f63234l = new ConcurrentHashMap<>();
        this.f63235m = io.reactivex.rxjava3.subjects.a.d(unit);
        this.f63236n = new ConcurrentHashMap<>();
        this.f63237o = Collections.synchronizedSet(new HashSet());
        this.f63239q = ProjectionInterceptInfo.ProjectionInterceptType.Default;
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    @NotNull
    public final Observable a(int i7, @NotNull Collection collection) {
        return this.f63231i.flatMap(new p(collection, this));
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    public final void b() {
        BLog.i("NirvanaEngine", "nirvana engin restart...");
        com.bilibili.lib.nirvana.api.m mVar = this.f63228e;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    @NotNull
    public final String c() {
        return "NirvanaEngine";
    }

    public final void d(@NotNull Ed0.b bVar) {
        j4.o.a("on device removed ", bVar.getUuid(), ", remove name: ", bVar.j(), "ProjectionModify");
        String strC = se0.k.c(bVar);
        boolean zN = StringsKt.n(bVar.getUuid(), "_sdk");
        if (zN) {
            this.f63234l.remove(strC);
        } else {
            this.f63233k.remove(strC);
        }
        ProjectionDeviceInternal projectionDeviceInternalRemove = this.f63232j.remove(strC);
        if (projectionDeviceInternalRemove instanceof a) {
            ((a) projectionDeviceInternalRemove).f63265t = true;
        }
        ProjectionDeviceInternal projectionDeviceInternalRemove2 = this.f63232j.remove(strC + "_mirror");
        if (projectionDeviceInternalRemove2 instanceof a) {
            ((a) projectionDeviceInternalRemove2).f63265t = true;
        }
        ProjectionDeviceInternal projectionDeviceInternal = this.f63234l.get(strC);
        if (!zN && projectionDeviceInternal != null) {
            this.f63232j.put(strC, projectionDeviceInternal);
            BLog.i("ProjectionModify", "onDeviceRemoved, call sdk device back " + projectionDeviceInternal);
        }
        this.f63231i.onNext(Unit.INSTANCE);
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    public final int e() {
        return 5;
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    public final void f(int i7) {
        this.f63232j.clear();
        s(i7);
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    @NotNull
    public final Observable<List<ProjectionDeviceInternal>> g() {
        return this.f63231i.map(new d(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(@org.jetbrains.annotations.NotNull Ed0.b r9) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.h(Ed0.b):void");
    }

    public final void i(@NotNull Ed0.b bVar) {
        boolean zN = StringsKt.n(bVar.getUuid(), "_sdk");
        String strC = se0.k.c(bVar);
        ProjectionDeviceInternal projectionDeviceInternal = this.f63232j.get(strC);
        if (projectionDeviceInternal == null || (!se0.k.b(bVar) && (projectionDeviceInternal instanceof a) && se0.k.b(((a) projectionDeviceInternal).f63247a))) {
            if (this.f63224a >= 0 && !this.f63226c) {
                this.f63226c = true;
            }
            ProjectionDeviceInternal projectionDeviceInternalP = p(bVar);
            this.f63232j.put(strC, projectionDeviceInternalP);
            r(projectionDeviceInternalP);
            this.f63231i.onNext(Unit.INSTANCE);
        } else if ((projectionDeviceInternal instanceof se0.f) && !zN && bVar.g().length() == 0) {
            ((se0.f) projectionDeviceInternal).W(bVar.getBaseUrl());
        }
        t(bVar);
        L.a(G0.b.a("update device -> ", bVar.j(), ", uuid: ", strC, ", isSdk: "), zN, "ProjectionModify");
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    @NotNull
    public final Single j(@NotNull DefaultProjectionEngineManager defaultProjectionEngineManager) {
        BLog.i("NirvanaEngine", "NirvanaEngine init");
        BLog.i("ProjectionTrack", "NirvanaEngine init");
        this.f63227d = defaultProjectionEngineManager;
        this.f63228e = (com.bilibili.lib.nirvana.api.m) CommonNvaController.f63217a.getValue();
        Fd0.a aVar = null;
        if (((com.bilibili.lib.nirvana.api.k) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.lib.nirvana.api.k.class, (String) null, 2, (Object) null)) != null) {
            aVar = Fd0.a.a;
        }
        this.f63229f = aVar;
        InterfaceC7569h context = defaultProjectionEngineManager.getContext();
        com.bilibili.lib.nirvana.api.m mVar = this.f63228e;
        if (mVar != null) {
            mVar.L(this);
        }
        Boolean bool = (Boolean) ConfigManager.Companion.ab().get("cast.disable_dlna_engine_register_in_bg_thread", Boolean.TRUE);
        if (bool != null ? bool.booleanValue() : true) {
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
            Lifecycle lifecycle = companion.get().getLifecycle();
            e eVar = this.h;
            lifecycle.removeObserver(eVar);
            companion.get().getLifecycle().addObserver(eVar);
        } else {
            MainThread.runOnMainThread(new KS0.b(this, 7));
        }
        ((C7564c) context).getClass();
        if (C7564c.f121636m instanceof InterfaceC8086b.a) {
            DefaultProjectionUserCompat defaultProjectionUserCompatL = C7564c.f121633j.l();
            if (defaultProjectionUserCompatL == null) {
                defaultProjectionUserCompatL = new DefaultProjectionUserCompat();
            }
            C7564c.f121636m = defaultProjectionUserCompatL;
        }
        return Single.just(this);
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    public final void k(int i7) {
        s(i7);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.lib.projection.internal.engine.r
    public final void l(@NotNull ProjectionInterceptInfo.ProjectionInterceptType projectionInterceptType, @Nullable List<String> list) throws NoWhenBranchMatchedException {
        int i7;
        ProjectionDeviceInternal projectionDeviceInternal;
        String realName;
        ProjectionDeviceInternal projectionDeviceInternal2;
        String realName2;
        this.f63238p = list;
        this.f63239q = projectionInterceptType;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list == null || (i7 = b.f63297a[projectionInterceptType.ordinal()]) == 1) {
                return;
            }
            if (i7 == 2) {
                for (String str : list) {
                    List mutableList = CollectionsKt.toMutableList(this.f63232j.keySet());
                    for (int size = mutableList.size() - 1; -1 < size; size--) {
                        if (str != null && (projectionDeviceInternal = this.f63232j.get(mutableList.get(size))) != null && (realName = projectionDeviceInternal.getRealName()) != null && StringsKt.l(realName, str)) {
                            this.f63232j.remove(mutableList.get(size));
                        }
                    }
                }
                return;
            }
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            List mutableList2 = CollectionsKt.toMutableList(this.f63232j.keySet());
            for (int size2 = mutableList2.size() - 1; -1 < size2; size2--) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.f63232j.remove(mutableList2.get(size2));
                        break;
                    }
                    String next = it.next();
                    if (next != null && (projectionDeviceInternal2 = this.f63232j.get(mutableList2.get(size2))) != null && (realName2 = projectionDeviceInternal2.getRealName()) != null && StringsKt.l(realName2, next)) {
                        break;
                    }
                }
            }
        }
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    public final void m(int i7) {
        com.bilibili.ad.adview.pegasus.banner.toplive.b.a(i7, "NirvanaEngine controller stop search.... client type: ", " ....", "NirvanaEngine");
        com.bilibili.lib.nirvana.api.m mVar = this.f63228e;
        if (mVar != null) {
            mVar.l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Se0.a<?>, java.lang.Object] */
    @Override // com.bilibili.lib.projection.internal.engine.r
    @NotNull
    public final Se0.a<?> n() {
        return new Object();
    }

    @Override // com.bilibili.lib.projection.internal.engine.r
    @NotNull
    public final Observable<ProjectionDeviceInternal> o(@NotNull ProjectionPlayRecord projectionPlayRecord) {
        return this.f63231i.flatMap(new f(this, projectionPlayRecord)).take(1L).flatMap(new g(projectionPlayRecord)).observeOn(AndroidSchedulers.mainThread());
    }

    public void onDeviceEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        Object obj = map.get(NotificationCompat.CATEGORY_EVENT);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            int iIntValue = num.intValue();
            if (this.f63236n.get(Integer.valueOf(iIntValue)) == null) {
                HashSet hashSet = new HashSet();
                this.f63236n.put(Integer.valueOf(iIntValue), hashSet);
                hashSet.add(str);
            } else {
                Set<String> set = this.f63236n.get(Integer.valueOf(iIntValue));
                if (set != null) {
                    set.add(str);
                }
            }
        }
        Object obj2 = map.get("type");
        String str2 = null;
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        if (str2 != null && str2.length() > 0) {
            this.f63237o.add(str2);
        }
        bilibili.live.app.service.resolver.b.a(z.b("onDeviceEvent, singleEvent: ", num, ", uuid: ", str, ", media type: "), str2, "ProjectionModify");
        this.f63235m.onNext(Unit.INSTANCE);
    }

    public final ProjectionDeviceInternal p(Ed0.b bVar) {
        ProjectionDeviceInternal aVar;
        boolean z6 = false;
        boolean z7 = (bVar.O() & 1) == 1 && bVar.a() >= 104300;
        if ((bVar.O() & 256) == 256) {
            z6 = true;
        }
        if (!C7564c.f121633j.j() || bVar.a() < 104001 || StringsKt.n(bVar.getUuid(), "_sdk")) {
            aVar = new a(this, bVar);
        } else {
            this.f63233k.put(bVar.getUuid(), new a(this, bVar));
            se0.f fVar = new se0.f();
            Uri uri = Uri.parse(bVar.getBaseUrl());
            fVar.T(uri.getHost() + ":" + uri.getPort());
            fVar.f127202b = bVar.getUuid();
            String strJ = bVar.j();
            fVar.f127216q = strJ;
            fVar.f127205e = strJ;
            fVar.f127206f = bVar.E();
            fVar.f127207g = bVar.P();
            fVar.h = bVar.getManufacturer();
            fVar.f127208i = bVar.getChannelName();
            fVar.f127209j = bVar.a();
            fVar.f127212m = bVar.g();
            fVar.f127210k = z7;
            fVar.f127211l = z6;
            aVar = fVar;
        }
        return aVar;
    }

    @Nullable
    public final InterfaceC8719b q(@NotNull String str) {
        ProjectionDeviceInternal projectionDeviceInternal = this.f63232j.get(str);
        if (projectionDeviceInternal != null && (projectionDeviceInternal instanceof a) && !se0.k.b(((a) projectionDeviceInternal).f63247a)) {
            return (InterfaceC8719b) projectionDeviceInternal;
        }
        ProjectionDeviceInternal projectionDeviceInternal2 = this.f63233k.get(str);
        if (!(projectionDeviceInternal2 instanceof a) || se0.k.b(((a) projectionDeviceInternal2).f63247a)) {
            return null;
        }
        return (InterfaceC8719b) projectionDeviceInternal2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal r5) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.r(com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal):void");
    }

    public final void s(int i7) {
        com.bilibili.ad.adview.pegasus.banner.toplive.b.a(i7, "NirvanaEngine controller search.... client type: ", " ....", "NirvanaEngine");
        com.bilibili.lib.nirvana.api.m mVar = this.f63228e;
        if (mVar != null) {
            mVar.I();
        }
    }

    public final void t(Ed0.b bVar) {
        io.reactivex.rxjava3.subjects.a<com.bilibili.lib.projection.internal.device.a> aVar;
        com.bilibili.lib.projection.internal.device.a aVar2;
        ProjectionDeviceInternal device;
        DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63227d;
        if (defaultProjectionEngineManager == null || (aVar = defaultProjectionEngineManager.f63102c) == null || (aVar2 = (com.bilibili.lib.projection.internal.device.a) aVar.e()) == null || (device = aVar2.getDevice()) == null) {
            return;
        }
        if (device instanceof se0.f) {
            se0.f fVar = (se0.f) device;
            if (fVar.f127202b.length() > 0 && Intrinsics.areEqual(bVar.getUuid(), fVar.f127202b)) {
                fVar.W(bVar.getBaseUrl());
            }
        }
        if (device instanceof a) {
            a aVar3 = (a) device;
            if (se0.k.b(aVar3.f63247a) || se0.k.c(aVar3.f63247a).length() <= 0 || !Intrinsics.areEqual(bVar.getUuid(), se0.k.c(aVar3.f63247a))) {
                return;
            }
            aVar3.f63247a = bVar;
            aVar3.f63265t = false;
            aVar3.N();
            this.f63232j.put(se0.k.c(aVar3.f63247a), device);
        }
    }
}
