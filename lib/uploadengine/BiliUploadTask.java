package com.bilibili.lib.uploadengine;

import I.E;
import WQ.G;
import WQ.K;
import Xf0.C3109o;
import Xf0.InterfaceC3111q;
import android.app.Application;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C3259x;
import androidx.compose.animation.core.I;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.z;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.base.BiliContext;
import com.bilibili.base.MainThread;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.upload.UploadEngine;
import com.bilibili.lib.upload.UploadTask;
import com.bilibili.lib.upload.UploadTaskState;
import com.bilibili.lib.uploadengine.BiliUploadTask;
import com.bilibili.lib.videoupload.bean.UploadClientTimeoutConfig;
import com.bilibili.lib.videoupload.speeddetect.UploadSpeedDetect;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng0.g;
import og0.C8215c;
import og0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg0.c;
import ug0.C8730c;
import vg0.C8807a;
import vg0.C8808b;
import vg0.k;
import vg0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/BiliUploadTask.class */
@Keep
public final class BiliUploadTask extends BiliUploadListenerTask {

    @NotNull
    public static final b Companion = new Object();

    @NotNull
    private static final ConcurrentHashMap<String, BiliUploadTask> mCacheUploadTask = new ConcurrentHashMap<>();

    @NotNull
    private final a buildConfig;

    @NotNull
    private final AtomicBoolean isPending;

    @Nullable
    private ParcelFileDescriptor mCachedPfd;

    @NotNull
    private final AtomicBoolean mInterrupted;

    @NotNull
    private final ConnectivityMonitor.OnNetworkChangedListener mNetWorkChangedListener;

    @Nullable
    private volatile UploadTask mUploadTask;
    private g mUploadTaskInfo;

    @NotNull
    private final c mUploadTaskLagDetect;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/BiliUploadTask$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f65014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f65015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f65016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f65017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f65018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f65019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Function1<String, Unit> f65020g;

        public a() {
            this(null, null, null, null, null, 0, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI);
        }

        public a(String str, String str2, String str3, String str4, String str5, int i7, K k7, int i8) {
            str = (i8 & 1) != 0 ? null : str;
            str2 = (i8 & 2) != 0 ? null : str2;
            str3 = (i8 & 4) != 0 ? null : str3;
            str4 = (i8 & 8) != 0 ? null : str4;
            str5 = (i8 & 16) != 0 ? "" : str5;
            i7 = (i8 & 32) != 0 ? 0 : i7;
            k7 = (i8 & 64) != 0 ? null : k7;
            this.f65014a = str;
            this.f65015b = str2;
            this.f65016c = str3;
            this.f65017d = str4;
            this.f65018e = str5;
            this.f65019f = i7;
            this.f65020g = k7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f65014a, aVar.f65014a) && Intrinsics.areEqual(this.f65015b, aVar.f65015b) && Intrinsics.areEqual(this.f65016c, aVar.f65016c) && Intrinsics.areEqual(this.f65017d, aVar.f65017d) && Intrinsics.areEqual(this.f65018e, aVar.f65018e) && this.f65019f == aVar.f65019f && Intrinsics.areEqual(this.f65020g, aVar.f65020g);
        }

        public final int hashCode() {
            String str = this.f65014a;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.f65015b;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f65016c;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f65017d;
            int iA = I.a(this.f65019f, E.a(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f65018e), 31);
            Function1<String, Unit> function1 = this.f65020g;
            return iA + (function1 == null ? 0 : function1.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BuildConfig(filePath=" + this.f65014a + ", taskId=" + this.f65015b + ", profile=" + this.f65016c + ", metaProfile=" + this.f65017d + ", from=" + this.f65018e + ", resolution=" + this.f65019f + ", onTaskIdCreated=" + this.f65020g + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/BiliUploadTask$b.class */
    public static final class b {
        @Nullable
        public final BiliUploadTask a(@NotNull a aVar) {
            BiliUploadTask biliUploadTask;
            synchronized (this) {
                if (!TextUtils.isEmpty(aVar.f65015b) && (biliUploadTask = (BiliUploadTask) BiliUploadTask.mCacheUploadTask.get(aVar.f65015b)) != null) {
                    C8808b.a("[Upload SDK][Build] buildUploadTask hit cache,taskId=" + aVar.f65015b + " ,cacheUploadTask=" + biliUploadTask.isTaskValid());
                    return biliUploadTask;
                }
                BiliUploadTask biliUploadTask2 = new BiliUploadTask(aVar, null);
                C8808b.a("[Upload SDK][Build] buildUploadTask result,taskId=" + aVar.f65015b + ",filePath=" + aVar.f65014a + ",newUploadTask=" + biliUploadTask2.isTaskValid());
                if (!biliUploadTask2.isTaskValid()) {
                    return null;
                }
                BiliUploadTask.mCacheUploadTask.put(biliUploadTask2.getTaskId(), biliUploadTask2);
                return biliUploadTask2;
            }
        }

        @NotNull
        public final Collection<InterfaceC3111q> b() {
            Collection<InterfaceC3111q> collectionValues;
            synchronized (this) {
                collectionValues = BiliUploadTask.mCacheUploadTask.values();
            }
            return collectionValues;
        }
    }

    private BiliUploadTask(a aVar) {
        UploadTask uploadTaskCreateNewUploadTask;
        this.buildConfig = aVar;
        this.mNetWorkChangedListener = new ConnectivityMonitor.OnNetworkChangedListener(this) { // from class: Xf0.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliUploadTask f28201a;

            {
                this.f28201a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final void onChanged(int i7) throws NoWhenBranchMatchedException {
                BiliUploadTask.mNetWorkChangedListener$lambda$0(this.f28201a, i7);
            }
        };
        this.mInterrupted = new AtomicBoolean();
        this.isPending = new AtomicBoolean();
        this.mUploadTaskLagDetect = new c(this);
        try {
            Result.Companion companion = Result.Companion;
            String str = aVar.f65015b;
            this.mUploadTaskInfo = (str == null || str.length() == 0) ? new g(BiliContext.application(), aVar.f65014a) : new g();
            String str2 = aVar.f65015b;
            if (str2 == null || str2.length() == 0) {
                Function1<String, Unit> function1 = aVar.f65020g;
                if (function1 != null) {
                    g gVar = this.mUploadTaskInfo;
                    g gVar2 = gVar;
                    if (gVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                        gVar2 = null;
                    }
                    function1.invoke(String.valueOf(gVar2.f124196a));
                }
                uploadTaskCreateNewUploadTask = createNewUploadTask(aVar);
            } else {
                uploadTaskCreateNewUploadTask = restoreUploadTask(aVar.f65015b);
            }
            this.mUploadTask = uploadTaskCreateNewUploadTask;
            if (this.mUploadTask != null) {
                g gVar3 = this.mUploadTaskInfo;
                g gVar4 = gVar3;
                if (gVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar4 = null;
                }
                gVar4.J(p.f());
                g gVar5 = this.mUploadTaskInfo;
                if (gVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar5 = null;
                }
                gVar5.K(p.g());
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public /* synthetic */ BiliUploadTask(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private final UploadTask createNewUploadTask(a aVar) {
        StringBuilder sbA = l0.a("[Build] create by filePath,profile=", aVar.f65016c, ",taskId=");
        sbA.append(aVar.f65015b);
        sbA.append(",filePath=");
        String str = aVar.f65014a;
        sbA.append(str);
        sbA.append(",metaProfile=");
        String str2 = aVar.f65017d;
        sbA.append(str2);
        BiliUploadListenerTask.printLog$default(this, sbA.toString(), false, 2, null);
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            long jMid = BiliAccounts.get(BiliContext.application()).mid();
            g gVar = this.mUploadTaskInfo;
            g gVar2 = gVar;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar2 = null;
            }
            boolean zD = gVar2.D();
            UploadEngine uploadEngine = UploadEngine.getInstance();
            UploadTask.Callback uploadTaskCallback = getUploadTaskCallback();
            g gVar3 = this.mUploadTaskInfo;
            g gVar4 = gVar3;
            if (gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar4 = null;
            }
            UploadTask uploadTaskCreateTask = uploadEngine.createTask(uploadTaskCallback, jMid, gVar4.f124196a, zD ? 1 : 0);
            if (C8807a.a(str)) {
                ParcelFileDescriptor parcelFileDescriptorC = C8807a.c(str, "r");
                if (parcelFileDescriptorC != null && parcelFileDescriptorC.getFd() > 0) {
                    this.mCachedPfd = parcelFileDescriptorC;
                    if (uploadTaskCreateTask != null) {
                        uploadTaskCreateTask.setDataSource(parcelFileDescriptorC.getFd());
                    }
                    if (uploadTaskCreateTask != null) {
                        uploadTaskCreateTask.setDataSource(str);
                    }
                } else if (uploadTaskCreateTask != null) {
                    uploadTaskCreateTask.setDataSource(str);
                }
            } else if (uploadTaskCreateTask != null) {
                uploadTaskCreateTask.setDataSource(str);
            }
            if (uploadTaskCreateTask != null) {
                String str3 = aVar.f65016c;
                if (str3 != null && str3.length() != 0) {
                    uploadTaskCreateTask.setProfile(str3);
                }
                if (str2 != null && str2.length() != 0) {
                    uploadTaskCreateTask.setMetaProfile(str2);
                }
                uploadTaskCreateTask.setFrom(aVar.f65018e);
                uploadTaskCreateTask.setResolution(aVar.f65019f);
            } else {
                BiliUploadListenerTask.printLog$default(this, "createNewUploadTask() failed uploadTask==null", false, 2, null);
            }
            fillUploadTaskInfo(aVar);
            String[] strArr = k.f128240a;
            g gVar5 = this.mUploadTaskInfo;
            g gVar6 = gVar5;
            if (gVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar6 = null;
            }
            k.i(gVar6, true);
            return uploadTaskCreateTask;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return null;
            }
            BiliUploadListenerTask.printLog$default(this, C4496a.a("createNewUploadTask() onFailure=", th2.getMessage()), false, 2, null);
            return null;
        }
    }

    private final void fillUploadTaskInfo(a aVar) {
        String str = aVar.f65014a;
        if (str != null && str.length() != 0) {
            g gVar = this.mUploadTaskInfo;
            g gVar2 = gVar;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar2 = null;
            }
            gVar2.f124199d = aVar.f65014a;
        }
        String str2 = aVar.f65016c;
        if (str2 != null && str2.length() != 0) {
            g gVar3 = this.mUploadTaskInfo;
            g gVar4 = gVar3;
            if (gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar4 = null;
            }
            gVar4.L(str2);
        }
        String str3 = aVar.f65017d;
        if (str3 != null && str3.length() != 0) {
            g gVar5 = this.mUploadTaskInfo;
            g gVar6 = gVar5;
            if (gVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar6 = null;
            }
            gVar6.I(str3);
        }
        g gVar7 = this.mUploadTaskInfo;
        g gVar8 = gVar7;
        if (gVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
            gVar8 = null;
        }
        String str4 = aVar.f65018e;
        synchronized (gVar8) {
            try {
                gVar8.f124186M = str4;
            } finally {
            }
        }
        g gVar9 = this.mUploadTaskInfo;
        if (gVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
            gVar9 = null;
        }
        int i7 = aVar.f65019f;
        synchronized (gVar8) {
            try {
                gVar8.f124187N = i7;
            } finally {
            }
        }
    }

    private final String findRealTaskId(long j7) {
        Map<String, UploadTaskState> allTaskState = UploadEngine.getInstance().getAllTaskState(com.bilibili.adcommon.utils.a.a());
        Iterator<T> it = allTaskState.keySet().iterator();
        while (it.hasNext()) {
            UploadTaskState uploadTaskState = allTaskState.get((String) it.next());
            if (uploadTaskState != null && uploadTaskState.context_id_ == j7) {
                return uploadTaskState.task_id_;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void interrupt() throws NoWhenBranchMatchedException {
        UploadTaskState taskState;
        UploadTask uploadTask = this.mUploadTask;
        BiliUploadListenerTask.printLog$default(this, C4496a.a("interrupt task_id=", (uploadTask == null || (taskState = uploadTask.getTaskState()) == null) ? null : taskState.task_id_), false, 2, null);
        if (this.mInterrupted.get() || getTaskStatus() == 5) {
            return;
        }
        pause();
        this.mInterrupted.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void mNetWorkChangedListener$lambda$0(com.bilibili.lib.uploadengine.BiliUploadTask r6, int r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.uploadengine.BiliUploadTask.mNetWorkChangedListener$lambda$0(com.bilibili.lib.uploadengine.BiliUploadTask, int):void");
    }

    private final void notifyInternalNetChanged(boolean z6) {
        synchronized (this) {
            if (!vg0.c.c()) {
                int iHashCode = hashCode();
                g gVar = this.mUploadTaskInfo;
                g gVar2 = gVar;
                if (gVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar2 = null;
                }
                BiliUploadListenerTask.printLog$default(this, "notifyInternalNetChanged disable hash=" + iHashCode + ",hasNet=" + z6 + " ," + gVar2.s(), false, 2, null);
                return;
            }
            int taskStatus = getTaskStatus();
            if (taskStatus != 3 && taskStatus != 9 && taskStatus != 5 && taskStatus != 6 && taskStatus != 7) {
                UploadTask uploadTask = this.mUploadTask;
                if (uploadTask == null || !uploadTask.isStart()) {
                    return;
                }
                dispatchUploadTaskSubStatus(z6 ? BiliUploadTaskEvent.NET_WAITING : BiliUploadTaskEvent.NET_RESUME);
                return;
            }
            BiliUploadListenerTask.printLog$default(this, "notifyInternalNetChanged return,taskStatus=" + taskStatus + ",uploadStatus=" + bO0.a.b(taskStatus), false, 2, null);
        }
    }

    private final void onStartTaskFail() {
        g gVar = this.mUploadTaskInfo;
        g gVar2 = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
            gVar2 = null;
        }
        gVar2.M(4);
        MainThread.postOnMainThread(new G(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStartTaskFail$lambda$0(BiliUploadTask biliUploadTask) {
        C8215c mForwardUploadCallback = biliUploadTask.getMForwardUploadCallback();
        if (mForwardUploadCallback != null) {
            g gVar = biliUploadTask.mUploadTaskInfo;
            g gVar2 = gVar;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar2 = null;
            }
            g gVar3 = biliUploadTask.mUploadTaskInfo;
            if (gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar3 = null;
            }
            mForwardUploadCallback.k(gVar3.v(), gVar2);
        }
        return Unit.INSTANCE;
    }

    private final void resetUploadTask() {
        Object obj;
        UploadTask uploadTaskCreateNewUploadTask;
        int i7;
        UploadTaskState taskState;
        try {
            Result.Companion companion = Result.Companion;
            g gVar = this.mUploadTaskInfo;
            g gVar2 = gVar;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar2 = null;
            }
            BiliContext.application();
            gVar2.G();
            UploadTask uploadTask = this.mUploadTask;
            if (uploadTask == null || (taskState = uploadTask.getTaskState()) == null) {
                BiliUploadListenerTask.printLog$default(this, "resetUploadTask() delete task error！！！", false, 2, null);
            } else {
                BiliUploadListenerTask.printLog$default(this, "resetUploadTask() task_id=" + taskState.task_id_ + ",delete", false, 2, null);
                UploadEngine.getInstance().destoryTask(taskState.task_id_);
            }
            this.mUploadTask = null;
            ParcelFileDescriptor parcelFileDescriptor = this.mCachedPfd;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            String str = this.buildConfig.f65015b;
            if (str == null || str.length() == 0) {
                BiliUploadListenerTask.printLog$default(this, "resetUploadTask() create new task by filePath", false, 2, null);
                uploadTaskCreateNewUploadTask = createNewUploadTask(this.buildConfig);
            } else {
                BiliUploadListenerTask.printLog$default(this, "resetUploadTask() create new task by newBuildConfig", false, 2, null);
                g gVar3 = this.mUploadTaskInfo;
                g gVar4 = gVar3;
                if (gVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar4 = null;
                }
                String str2 = gVar4.f124199d;
                g gVar5 = this.mUploadTaskInfo;
                g gVar6 = gVar5;
                if (gVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar6 = null;
                }
                String strO = gVar6.o();
                g gVar7 = this.mUploadTaskInfo;
                g gVar8 = gVar7;
                if (gVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar8 = null;
                }
                String strM = gVar8.m();
                g gVar9 = this.mUploadTaskInfo;
                g gVar10 = gVar9;
                if (gVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar10 = null;
                }
                String strJ = gVar10.j();
                g gVar11 = this.mUploadTaskInfo;
                g gVar12 = gVar11;
                if (gVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar12 = null;
                }
                synchronized (gVar12) {
                    try {
                        i7 = gVar12.f124187N;
                    } finally {
                    }
                }
                uploadTaskCreateNewUploadTask = createNewUploadTask(new a(str2, null, strO, strM, strJ, i7, null, 66));
            }
            this.mUploadTask = uploadTaskCreateNewUploadTask;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            BiliUploadListenerTask.printLog$default(this, C4496a.a("resetUploadTask() error exc=", th2.getMessage()), false, 2, null);
        }
    }

    private final UploadTask restoreUploadTask(String str) {
        ParcelFileDescriptor parcelFileDescriptorC;
        try {
            Result.Companion companion = Result.Companion;
            String strFindRealTaskId = findRealTaskId(Long.parseLong(str));
            if (strFindRealTaskId != null && strFindRealTaskId.length() != 0) {
                UploadTask uploadTaskCreateTask = UploadEngine.getInstance().createTask(strFindRealTaskId, getUploadTaskCallback());
                UploadTaskState taskState = uploadTaskCreateTask.getTaskState();
                String str2 = taskState != null ? taskState.task_path_ : null;
                if (str2 == null || str2.length() == 0) {
                    BiliUploadListenerTask.printLog$default(this, "restoreUploadTask() error，taskFilePath=" + str2, false, 2, null);
                } else if (!C8807a.a(str2) || (parcelFileDescriptorC = C8807a.c(str2, "r")) == null || parcelFileDescriptorC.getFd() <= 0) {
                    uploadTaskCreateTask.setDataSource(str2);
                } else {
                    this.mCachedPfd = parcelFileDescriptorC;
                    uploadTaskCreateTask.setDataSource(parcelFileDescriptorC.getFd());
                    uploadTaskCreateTask.setDataSource(str2);
                }
                UploadTaskState taskState2 = uploadTaskCreateTask.getTaskState();
                if (taskState2 != null) {
                    g gVar = this.mUploadTaskInfo;
                    g gVar2 = gVar;
                    if (gVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                        gVar2 = null;
                    }
                    C3109o.c(taskState2, gVar2);
                } else {
                    BiliUploadListenerTask.printLog$default(this, "restoreUploadTask() error,taskState=" + uploadTaskCreateTask.getTaskState(), false, 2, null);
                }
                g gVar3 = this.mUploadTaskInfo;
                g gVar4 = gVar3;
                if (gVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar4 = null;
                }
                gVar4.A();
                return uploadTaskCreateTask;
            }
            BiliUploadListenerTask.printLog$default(this, "restoreUploadTask failed, findRealTaskId=" + strFindRealTaskId + ",taskId=" + str, false, 2, null);
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return null;
            }
            BiliUploadListenerTask.printLog$default(this, C4496a.a("restoreUploadTask() onFailure,message=", th2.getMessage()), false, 2, null);
            return null;
        }
    }

    private final void startWhenNetChange() {
        synchronized (this) {
            if (this.mInterrupted.get()) {
                start();
            }
        }
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public void clearCache() {
        BiliUploadListenerTask.printLog$default(this, C4496a.a("clearCache taskId=", getTaskId()), false, 2, null);
        ConnectivityMonitor.getInstance().unregister(this.mNetWorkChangedListener);
        ConcurrentHashMap<String, BiliUploadTask> concurrentHashMap = mCacheUploadTask;
        if (concurrentHashMap.get(getTaskId()) != null) {
            concurrentHashMap.remove(getTaskId());
        }
        stopLagDetect();
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public void delete() {
        UploadTaskState taskState;
        synchronized (this) {
            if (this.mUploadTask == null) {
                BiliUploadListenerTask.printLog$default(this, "delete() failed,mUploadTask == null", false, 2, null);
                return;
            }
            stopLagDetect();
            ConcurrentHashMap<String, BiliUploadTask> concurrentHashMap = mCacheUploadTask;
            if (concurrentHashMap.get(getTaskId()) != null) {
                concurrentHashMap.remove(getTaskId());
            }
            g uploadTaskInfo$default = BiliUploadListenerTask.getUploadTaskInfo$default(this, false, 1, null);
            UploadTask uploadTask = this.mUploadTask;
            if (uploadTask == null || (taskState = uploadTask.getTaskState()) == null) {
                BiliUploadListenerTask.printLog$default(this, "delete task error！！！", false, 2, null);
            } else {
                BiliUploadListenerTask.printLog$default(this, "task_id=" + taskState.task_id_ + ",delete", false, 2, null);
                UploadEngine.getInstance().destoryTask(taskState.task_id_);
            }
            reportTaskStepCancel(uploadTaskInfo$default);
            this.mUploadTask = null;
            ConnectivityMonitor.getInstance().unregister(this.mNetWorkChangedListener);
        }
    }

    @NotNull
    public final a getBuildConfig() {
        return this.buildConfig;
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    @Nullable
    public String getFilePath() {
        UploadTaskState taskState;
        UploadTask uploadTask = this.mUploadTask;
        return (uploadTask == null || (taskState = uploadTask.getTaskState()) == null) ? null : taskState.task_path_;
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    @Nullable
    public String getResultFile() {
        UploadTaskState taskState;
        UploadTask uploadTask = this.mUploadTask;
        String str = (uploadTask == null || (taskState = uploadTask.getTaskState()) == null) ? null : taskState.init_upload_key_;
        BiliUploadListenerTask.printLog$default(this, C4496a.a("getResultFile uploadKey=", str), false, 2, null);
        return p.e(str);
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    @NotNull
    public String getTaskId() {
        g gVar = this.mUploadTaskInfo;
        g gVar2 = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
            gVar2 = null;
        }
        return String.valueOf(gVar2.f124196a);
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    @NotNull
    public g getTaskInfo() {
        return BiliUploadListenerTask.getUploadTaskInfo$default(this, false, 1, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getTaskStatus() throws kotlin.NoWhenBranchMatchedException {
        /*
            r6 = this;
            r0 = r6
            com.bilibili.lib.upload.UploadTask r0 = r0.mUploadTask
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L20
            r0 = r9
            com.bilibili.lib.upload.UploadTaskState r0 = r0.getTaskState()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L20
            r0 = r9
            com.bilibili.lib.upload.UploadTaskState$UPLOAD_STATUS_STATE r0 = r0.status_state_
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L24
        L20:
            com.bilibili.lib.upload.UploadTaskState$UPLOAD_STATUS_STATE r0 = com.bilibili.lib.upload.UploadTaskState.UPLOAD_STATUS_STATE.UPLOAD_STATUS_INIT
            r9 = r0
        L24:
            r0 = r9
            int r0 = Xf0.C3109o.a(r0)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            r1 = 3
            if (r0 != r1) goto L3f
            r0 = r8
            r7 = r0
            r0 = r6
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.isPending
            boolean r0 = r0.get()
            if (r0 == 0) goto L3f
            r0 = 9
            r7 = r0
        L3f:
            r0 = r7
            java.lang.String r0 = bO0.a.b(r0)
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "getTaskStatus taskState="
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = ",uploadStatus="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r10
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3 = 2
            r4 = 0
            com.bilibili.lib.uploadengine.BiliUploadListenerTask.printLog$default(r0, r1, r2, r3, r4)
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.uploadengine.BiliUploadTask.getTaskStatus():int");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask
    @NotNull
    public g getUploadTaskInfo(boolean z6) throws NoWhenBranchMatchedException {
        UploadTaskState taskState;
        if (z6) {
            UploadTask uploadTask = this.mUploadTask;
            if (uploadTask == null || (taskState = uploadTask.getTaskState()) == null) {
                UploadTask uploadTask2 = this.mUploadTask;
                BiliUploadListenerTask.printLog$default(this, "getUploadTaskInfo error,taskState=" + (uploadTask2 != null ? uploadTask2.getTaskState() : null), false, 2, null);
            } else {
                g gVar = this.mUploadTaskInfo;
                g gVar2 = gVar;
                if (gVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar2 = null;
                }
                C3109o.d(taskState, gVar2);
            }
        }
        g gVar3 = this.mUploadTaskInfo;
        if (gVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
            gVar3 = null;
        }
        return gVar3;
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public boolean isExpired() {
        UploadTaskState taskState;
        UploadClientTimeoutConfig uploadClientTimeoutConfigF;
        UploadTask uploadTask = this.mUploadTask;
        if (uploadTask == null || (taskState = uploadTask.getTaskState()) == null) {
            return false;
        }
        long j7 = taskState.create_time_s_;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = 1000;
        int i7 = com.bilibili.lib.videoupload.internal.p.f65109a;
        Application application = BiliContext.application();
        long j9 = 345600000;
        if (application != null && (uploadClientTimeoutConfigF = C8730c.b(application).f()) != null) {
            j9 = uploadClientTimeoutConfigF.expiredTime;
        }
        boolean z6 = jCurrentTimeMillis - (j7 * j8) >= j9;
        if (z6) {
            String taskId = getTaskId();
            g gVar = this.mUploadTaskInfo;
            g gVar2 = gVar;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar2 = null;
            }
            BiliUploadListenerTask.printLog$default(this, z.a("taskId=", taskId, ",Task is expired!! task=", gVar2.s()), false, 2, null);
        }
        return z6;
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public boolean isNewUploadTask() {
        return true;
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public boolean isPreUploadFinish() {
        g uploadTaskInfo$default = BiliUploadListenerTask.getUploadTaskInfo$default(this, false, 1, null);
        boolean z6 = uploadTaskInfo$default.i() >= 2;
        StringBuilder sbB = O4.c.b(uploadTaskInfo$default.i(), uploadTaskInfo$default.f124196a, "isPreUploadFinish taskId=", ",step=");
        sbB.append(",isOverPreUpload=");
        sbB.append(z6);
        BiliUploadListenerTask.printLog$default(this, sbB.toString(), false, 2, null);
        if (z6) {
            return true;
        }
        boolean z7 = uploadTaskInfo$default.t() == 2 || uploadTaskInfo$default.t() == 4;
        StringBuilder sbB2 = O4.c.b(uploadTaskInfo$default.t(), uploadTaskInfo$default.f124196a, "isPreUploadFinish taskId=", ",status=");
        sbB2.append(",isRunning=");
        sbB2.append(z7);
        BiliUploadListenerTask.printLog$default(this, sbB2.toString(), false, 2, null);
        return !z7;
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public boolean isRunning() {
        UploadTask uploadTask = this.mUploadTask;
        boolean z6 = false;
        if (uploadTask != null) {
            z6 = false;
            if (uploadTask.isStart()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean isTaskValid() {
        return this.mUploadTask != null;
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask
    public void onTaskDestroyed() {
        Unit unit;
        super.onTaskDestroyed();
        stopLagDetect();
        try {
            Result.Companion companion = Result.Companion;
            ParcelFileDescriptor parcelFileDescriptor = this.mCachedPfd;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask
    public void onTaskFailed() {
        stopLagDetect();
        if (vg0.c.a()) {
            ConnectivityMonitor.getInstance().unregister(this.mNetWorkChangedListener);
        }
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask
    public void onTaskSuccess() {
        stopLagDetect();
        if (vg0.c.a()) {
            ConnectivityMonitor.getInstance().unregister(this.mNetWorkChangedListener);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public void pause() throws NoWhenBranchMatchedException {
        Object obj;
        UploadTaskState taskState;
        UploadTaskState taskState2;
        UploadTask uploadTask = this.mUploadTask;
        BiliUploadListenerTask.printLog$default(this, C4496a.a("pause() task_id=", (uploadTask == null || (taskState2 = uploadTask.getTaskState()) == null) ? null : taskState2.task_id_), false, 2, null);
        int taskStatus = getTaskStatus();
        if (taskStatus == 3 || taskStatus == 5 || taskStatus == 6) {
            BiliUploadListenerTask.printLog$default(this, C3259x.a(taskStatus, "pause() return status = "), false, 2, null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            UploadTask uploadTask2 = this.mUploadTask;
            if (uploadTask2 != null) {
                uploadTask2.stop();
            }
            this.mInterrupted.set(false);
            this.isPending.set(false);
            stopLagDetect();
            onTaskPaused();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            UploadTask uploadTask3 = this.mUploadTask;
            BiliUploadListenerTask.printLog$default(this, z.a("pause() task_id=", (uploadTask3 == null || (taskState = uploadTask3.getTaskState()) == null) ? null : taskState.task_id_, ",onFailure=", th2.getMessage()), false, 2, null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public void pending() throws NoWhenBranchMatchedException {
        Object obj;
        UploadTaskState taskState;
        UploadTaskState taskState2;
        UploadTask uploadTask = this.mUploadTask;
        BiliUploadListenerTask.printLog$default(this, C4496a.a("pending() task_id=", (uploadTask == null || (taskState2 = uploadTask.getTaskState()) == null) ? null : taskState2.task_id_), false, 2, null);
        int taskStatus = getTaskStatus();
        if (taskStatus == 5 || taskStatus == 6) {
            BiliUploadListenerTask.printLog$default(this, C3259x.a(taskStatus, "pending() return status = "), false, 2, null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            UploadTask uploadTask2 = this.mUploadTask;
            if (uploadTask2 != null) {
                uploadTask2.stop();
            }
            this.mInterrupted.set(false);
            stopLagDetect();
            this.isPending.set(true);
            onTaskPending();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            UploadTask uploadTask3 = this.mUploadTask;
            BiliUploadListenerTask.printLog$default(this, z.a("pending() task_id=", (uploadTask3 == null || (taskState = uploadTask3.getTaskState()) == null) ? null : taskState.task_id_, ",onFailure=", th2.getMessage()), false, 2, null);
        }
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public void setMetaProfile(@NotNull String str) {
        UploadTask uploadTask = this.mUploadTask;
        if (uploadTask != null) {
            uploadTask.setMetaProfile(str);
        }
        g gVar = this.mUploadTaskInfo;
        g gVar2 = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
            gVar2 = null;
        }
        gVar2.I(str);
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public void start() {
        Object obj;
        UploadTaskState taskState;
        int i7;
        UploadTask uploadTask;
        UploadTaskState taskState2;
        String taskId = getTaskId();
        UploadTask uploadTask2 = this.mUploadTask;
        BiliUploadListenerTask.printLog$default(this, z.a("start() task_id=", taskId, ",upload_id=", (uploadTask2 == null || (taskState2 = uploadTask2.getTaskState()) == null) ? null : taskState2.task_id_), false, 2, null);
        try {
            Result.Companion companion = Result.Companion;
            if (vg0.c.a() && !ConnectivityMonitor.getInstance().hasListener(this.mNetWorkChangedListener)) {
                ConnectivityMonitor.getInstance().register(this.mNetWorkChangedListener);
            }
            g gVar = this.mUploadTaskInfo;
            g gVar2 = gVar;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar2 = null;
            }
            synchronized (gVar2) {
                try {
                    i7 = gVar2.f124206l;
                } finally {
                }
            }
            if (i7 == 2) {
                g gVar3 = this.mUploadTaskInfo;
                g gVar4 = gVar3;
                if (gVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                    gVar4 = null;
                }
                if (!gVar4.D()) {
                    BiliContext.application();
                    boolean zH = p.h();
                    g gVar5 = this.mUploadTaskInfo;
                    g gVar6 = gVar5;
                    if (gVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                        gVar6 = null;
                    }
                    if (zH != gVar6.D()) {
                        resetUploadTask();
                        e mForwardNetworkListener = getMForwardNetworkListener();
                        if (mForwardNetworkListener != null) {
                            mForwardNetworkListener.a(this);
                        }
                    }
                }
            }
            if (this.mUploadTask == null) {
                BiliUploadListenerTask.printLog$default(this, "start() error mUploadTask == null", false, 2, null);
                onStartTaskFail();
                return;
            }
            UploadTask uploadTask3 = this.mUploadTask;
            if (uploadTask3 != null && uploadTask3.isStart() && (uploadTask = this.mUploadTask) != null) {
                uploadTask.stop();
            }
            this.mInterrupted.set(false);
            this.isPending.set(false);
            String[] strArr = k.f128240a;
            g gVar7 = this.mUploadTaskInfo;
            g gVar8 = gVar7;
            if (gVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar8 = null;
            }
            k.k(gVar8, true);
            g gVar9 = this.mUploadTaskInfo;
            g gVar10 = gVar9;
            if (gVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar10 = null;
            }
            g gVar11 = this.mUploadTaskInfo;
            g gVar12 = gVar11;
            if (gVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
                gVar12 = null;
            }
            float fP = gVar12.p();
            synchronized (gVar2) {
                try {
                    gVar2.f124212r = fP;
                } finally {
                }
            }
            setMStepStartTime(System.currentTimeMillis());
            UploadTask uploadTask4 = this.mUploadTask;
            if (uploadTask4 != null) {
                uploadTask4.start();
            }
            this.mUploadTaskLagDetect.d();
            UploadSpeedDetect.a();
            onTaskStarted();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            UploadTask uploadTask5 = this.mUploadTask;
            BiliUploadListenerTask.printLog$default(this, z.a("start() task=", (uploadTask5 == null || (taskState = uploadTask5.getTaskState()) == null) ? null : taskState.task_id_, ",onFailure=", th2.getMessage()), false, 2, null);
        }
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask, Xf0.InterfaceC3111q
    public void startByRCToken(@NotNull String str) {
        g gVar = this.mUploadTaskInfo;
        g gVar2 = gVar;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUploadTaskInfo");
            gVar2 = null;
        }
        synchronized (gVar2) {
            try {
                gVar2.f124195V = str;
            } catch (Throwable th) {
                throw th;
            }
        }
        start();
    }

    @Override // com.bilibili.lib.uploadengine.BiliUploadListenerTask
    public void stopLagDetect() {
        this.mUploadTaskLagDetect.e();
    }
}
