package com.bilibili.upper.module.uppercenterlocal.service;

import I.E;
import Xf0.InterfaceC3111q;
import android.app.Activity;
import androidx.appcompat.widget.C3246j;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.k;
import androidx.paging.M;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.lib.videoupload.Profile;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.videoeditor.generalrender.model.f;
import com.bilibili.studio.videoeditor.help.compiler.sdk.i;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kntr.base.jsb.api.upper.ArchiveEventType;
import kntr.base.jsb.api.upper.ArchiveStatus;
import kntr.base.jsb.api.upper.L;
import kntr.base.jsb.api.upper.MuxStatus;
import kntr.base.jsb.api.upper.NetworkType;
import kntr.base.jsb.api.upper.UploadEventType;
import kntr.base.jsb.api.upper.UploadStatus;
import kntr.base.jsb.api.upper.m;
import kntr.base.jsb.api.upper.o;
import kntr.base.jsb.api.upper.q;
import kntr.base.jsb.api.upper.u;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import og0.AbstractC8214b;
import og0.C8213a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/e.class */
@StabilityInferred(parameters = 0)
public final class e implements com.bilibili.upper.module.uppercenterlocal.service.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<Activity> f114269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f114270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, a> f114271c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f114272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public LF0.b f114273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<L> f114274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow f114275g;

    @NotNull
    public final MutableSharedFlow<kntr.base.jsb.api.upper.e> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SharedFlow f114276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Set<String> f114277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final c f114278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final b f114279l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/e$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f114280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f114281b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f114283d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final i f114286g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f114282c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f114284e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public String f114285f = "";

        public a(String str, int i7, String str2, i iVar) {
            this.f114280a = str;
            this.f114281b = i7;
            this.f114283d = str2;
            this.f114286g = iVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f114280a, aVar.f114280a) && this.f114281b == aVar.f114281b && this.f114282c == aVar.f114282c && Intrinsics.areEqual(this.f114283d, aVar.f114283d) && this.f114284e == aVar.f114284e && Intrinsics.areEqual(this.f114285f, aVar.f114285f) && Intrinsics.areEqual(this.f114286g, aVar.f114286g);
        }

        public final int hashCode() {
            return this.f114286g.hashCode() + E.a(I.a(this.f114284e, E.a(I.a(this.f114282c, I.a(this.f114281b, this.f114280a.hashCode() * 31, 31), 31), 31, this.f114283d), 31), 31, this.f114285f);
        }

        @NotNull
        public final String toString() {
            int i7 = this.f114281b;
            int i8 = this.f114282c;
            String str = this.f114283d;
            int i9 = this.f114284e;
            String str2 = this.f114285f;
            StringBuilder sb = new StringBuilder("MuxTaskInfo(taskId=");
            H0.e.b(i7, this.f114280a, ", status=", ", progress=", sb);
            M.a(i8, ", outputPath=", str, ", errorCode=", sb);
            M.a(i9, ", errorMsg=", str2, ", muxer=", sb);
            sb.append(this.f114286g);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/e$b.class */
    public static final class b implements QF0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f114287a;

        public b(e eVar) {
            this.f114287a = eVar;
        }

        @Override // QF0.e
        public final void a(QF0.f fVar) {
            e.f(this.f114287a, ArchiveEventType.ARCHIVE_EVENT_NETWORK_CHANGED, fVar.getTaskId(), null, null, null, NetworkType.NETWORK_TYPE_WIFI, 60);
        }

        @Override // QF0.e
        public final void b(QF0.f fVar) {
            e.f(this.f114287a, ArchiveEventType.ARCHIVE_EVENT_NETWORK_CHANGED, fVar.getTaskId(), null, null, null, NetworkType.NETWORK_TYPE_NON_FREE_MOBILE, 60);
        }

        @Override // QF0.e
        public final void c(QF0.f fVar) {
            e.f(this.f114287a, ArchiveEventType.ARCHIVE_EVENT_NETWORK_CHANGED, fVar.getTaskId(), null, null, null, NetworkType.NETWORK_TYPE_NO_NET, 60);
        }

        @Override // QF0.e
        public final void d(QF0.f fVar) {
            e.f(this.f114287a, ArchiveEventType.ARCHIVE_EVENT_NETWORK_CHANGED, fVar.getTaskId(), null, null, null, NetworkType.NETWORK_TYPE_FREE_MOBILE, 60);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/e$c.class */
    public static final class c implements LF0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f114288a;

        public c(e eVar) {
            this.f114288a = eVar;
        }

        @Override // LF0.e
        public final void Cb(long j7) {
            com.bilibili.ad.comm.applist.b.b(j7, "archiveTaskListener uploadStart: taskId=", "UpperCenterService");
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_UPLOAD_START, j7, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        }

        @Override // LF0.e
        public final void De(long j7) {
            com.bilibili.ad.comm.applist.b.b(j7, "archiveTaskListener uploadPending: taskId=", "UpperCenterService");
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_UPLOAD_PENDING, j7, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        }

        @Override // LF0.e
        public final void J(long j7) {
            com.bilibili.ad.comm.applist.b.b(j7, "archiveTaskListener onCancel: taskId=", "UpperCenterService");
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_CANCEL, j7, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        }

        @Override // LF0.e
        public final void Pa(long j7) {
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_SUB_STATUS_CHANGE, j7, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        }

        @Override // LF0.e
        public final void Y3(long j7, String str, String str2) {
            BLog.e("UpperCenterService", k.b(j7, "archiveTaskListener uploadFail: taskId=", ", msg=", str));
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_UPLOAD_FAIL, j7, null, str, null, null, 116);
        }

        @Override // LF0.e
        public final void Yb(long j7) {
            com.bilibili.ad.comm.applist.b.b(j7, "archiveTaskListener uploadSuccess: taskId=", "UpperCenterService");
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_UPLOAD_SUCCESS, j7, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        }

        @Override // LF0.e
        public final void a2(long j7, String str) {
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_UPLOAD_PROGRESS, j7, StringsKt.toFloatOrNull(str), null, null, null, 120);
        }

        @Override // LF0.e
        public final void f4(long j7) {
            com.bilibili.ad.comm.applist.b.b(j7, "archiveTaskListener submitSuccess: taskId=", "UpperCenterService");
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_SUBMIT_SUCCESS, j7, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        }

        @Override // LF0.e
        public final void l7(long j7) {
            com.bilibili.ad.comm.applist.b.b(j7, "archiveTaskListener onArchiveCreated: aid=", "UpperCenterService");
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_ARCHIVE_CREATED, 0L, null, null, Long.valueOf(j7), null, 92);
        }

        @Override // LF0.e
        public final void ma(long j7) {
            com.bilibili.ad.comm.applist.b.b(j7, "archiveTaskListener uploadPause: taskId=", "UpperCenterService");
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_UPLOAD_PAUSE, j7, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        }

        @Override // LF0.e
        public final void t3(long j7, String str) {
            BLog.e("UpperCenterService", k.b(j7, "archiveTaskListener submitFail: taskId=", ", msg=", str));
            e.f(this.f114288a, ArchiveEventType.ARCHIVE_EVENT_SUBMIT_FAIL, j7, null, str, null, null, 116);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/e$d.class */
    public static final class d implements Function1<Profile, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f114290b;

        public d(String str, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f114289a = str;
            this.f114290b = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            Profile profile = (Profile) obj;
            CancellableContinuationImpl cancellableContinuationImpl = this.f114290b;
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                com.bilibili.lib.uploadengine.a aVar = com.bilibili.lib.uploadengine.a.f65021a;
                InterfaceC3111q interfaceC3111qB = com.bilibili.lib.uploadengine.a.b(this.f114289a, 8, profile.getUpload(), profile.getMeta(), new com.bilibili.upper.module.uppercenterlocal.service.f(objectRef));
                if (interfaceC3111qB == null) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl(new m("")));
                } else {
                    String str = (String) objectRef.element;
                    String taskId = str;
                    if (str == null) {
                        taskId = interfaceC3111qB.getTaskId();
                    }
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl(new m(taskId)));
                }
            } catch (Exception e7) {
                q4.M.b("createUploadTask error: ", e7.getMessage(), "UpperCenterService");
                Result.Companion companion3 = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(new m("")));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.upper.module.uppercenterlocal.service.e$e, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/e$e.class */
    public static final class C1237e extends C8213a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f114292b;

        public C1237e(e eVar, String str) {
            this.f114291a = str;
            this.f114292b = eVar;
        }

        @Override // og0.C8213a, og0.f
        public final void a(ng0.g gVar) {
            Xi1.b.a(new StringBuilder("uploadListener onCancel: taskId="), this.f114291a, "UpperCenterService");
            e.g(this.f114292b, this.f114291a, UploadEventType.UPLOAD_EVENT_STATUS_CHANGED, UploadStatus.UPLOAD_STATUS_CANCELED, null, null, null, null, null, null, null, null, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE);
        }

        @Override // og0.f
        public final void c(ng0.g gVar) {
            Xi1.b.a(new StringBuilder("uploadListener onPending: taskId="), this.f114291a, "UpperCenterService");
            e.g(this.f114292b, this.f114291a, UploadEventType.UPLOAD_EVENT_STATUS_CHANGED, UploadStatus.UPLOAD_STATUS_PENDING, null, null, null, null, null, null, null, null, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE);
        }

        @Override // og0.C8213a, og0.f
        public final void e(ng0.g gVar) {
            Xi1.b.a(new StringBuilder("uploadListener onPause: taskId="), this.f114291a, "UpperCenterService");
            e.g(this.f114292b, this.f114291a, UploadEventType.UPLOAD_EVENT_STATUS_CHANGED, UploadStatus.UPLOAD_STATUS_PAUSED, null, null, null, null, null, null, null, null, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE);
        }

        @Override // og0.C8213a, og0.f
        public final void g(ng0.g gVar, long j7, long j8) {
            e.g(this.f114292b, this.f114291a, UploadEventType.UPLOAD_EVENT_SPEED, null, null, Long.valueOf(j7), Long.valueOf(j8), null, null, null, null, null, 1996);
        }

        @Override // og0.C8213a, og0.f
        public final void i(ng0.g gVar, String str) {
            BLog.d("UpperCenterService", "uploadListener onSuccess: taskId=" + this.f114291a + ", resultFile=" + str);
            e.g(this.f114292b, this.f114291a, UploadEventType.UPLOAD_EVENT_SUCCESS, UploadStatus.UPLOAD_STATUS_SUCCESS, null, null, null, null, gVar != null ? gVar.e() : null, str, null, null, 1656);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
        @Override // og0.C8213a, og0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void k(int r15, ng0.g r16) {
            /*
                r14 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "uploadListener onFail: taskId="
                r1.<init>(r2)
                r17 = r0
                r0 = r17
                r1 = r14
                java.lang.String r1 = r1.f114291a
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r17
                java.lang.String r1 = ", error="
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r17
                r1 = r15
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = "UpperCenterService"
                r1 = r17
                java.lang.String r1 = r1.toString()
                tv.danmaku.android.log.BLog.e(r0, r1)
                kntr.base.jsb.api.upper.UploadEventType r0 = kntr.base.jsb.api.upper.UploadEventType.UPLOAD_EVENT_FAIL
                r18 = r0
                kntr.base.jsb.api.upper.UploadStatus r0 = kntr.base.jsb.api.upper.UploadStatus.UPLOAD_STATUS_FAILED
                r19 = r0
                r0 = r16
                if (r0 == 0) goto L48
                r0 = r16
                java.lang.String r0 = r0.w()
                r17 = r0
                r0 = r17
                r16 = r0
                r0 = r17
                if (r0 != 0) goto L45
                goto L48
            L45:
                goto L4e
            L48:
                java.lang.String r0 = "upload failed"
                r16 = r0
                goto L45
            L4e:
                r0 = r14
                com.bilibili.upper.module.uppercenterlocal.service.e r0 = r0.f114292b
                r1 = r14
                java.lang.String r1 = r1.f114291a
                r2 = r18
                r3 = r19
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = r15
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r11 = r16
                r12 = 504(0x1f8, float:7.06E-43)
                com.bilibili.upper.module.uppercenterlocal.service.e.g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.service.e.C1237e.k(int, ng0.g):void");
        }

        @Override // og0.C8213a, og0.f
        public final void l(ng0.g gVar) {
            Xi1.b.a(new StringBuilder("uploadListener onStart: taskId="), this.f114291a, "UpperCenterService");
            e.g(this.f114292b, this.f114291a, UploadEventType.UPLOAD_EVENT_STATUS_CHANGED, UploadStatus.UPLOAD_STATUS_UPLOADING, null, null, null, null, null, null, null, null, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE);
        }

        @Override // og0.C8213a, og0.f
        public final void m(ng0.g gVar, float f7) {
            e.g(this.f114292b, this.f114291a, UploadEventType.UPLOAD_EVENT_PROGRESS, null, Float.valueOf(f7), null, null, null, null, null, null, null, TfCode.UNICOM_CDN_QUOTA_EXCEEDED_VALUE);
        }

        @Override // og0.C8213a, og0.f
        public final void n(ng0.g gVar) {
            Xi1.b.a(new StringBuilder("uploadListener onResume: taskId="), this.f114291a, "UpperCenterService");
            e.g(this.f114292b, this.f114291a, UploadEventType.UPLOAD_EVENT_STATUS_CHANGED, UploadStatus.UPLOAD_STATUS_UPLOADING, null, null, null, null, null, null, null, null, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/e$f.class */
    public static final class f extends AbstractC8214b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f114293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f114294b;

        public f(e eVar, String str) {
            this.f114293a = eVar;
            this.f114294b = str;
        }

        @Override // og0.AbstractC8214b, og0.h
        public final void a(InterfaceC3111q interfaceC3111q) {
            e.g(this.f114293a, this.f114294b, UploadEventType.UPLOAD_EVENT_NETWORK_CHANGED, null, null, null, null, NetworkType.NETWORK_TYPE_FREE_MOBILE, null, null, null, null, 1980);
        }

        @Override // og0.AbstractC8214b, og0.h
        public final void b(InterfaceC3111q interfaceC3111q) {
            e.g(this.f114293a, this.f114294b, UploadEventType.UPLOAD_EVENT_NETWORK_CHANGED, null, null, null, null, NetworkType.NETWORK_TYPE_NON_FREE_MOBILE, null, null, null, null, 1980);
        }

        @Override // og0.AbstractC8214b, og0.h
        public final void c(InterfaceC3111q interfaceC3111q) {
            e.g(this.f114293a, this.f114294b, UploadEventType.UPLOAD_EVENT_NETWORK_CHANGED, null, null, null, null, NetworkType.NETWORK_TYPE_WIFI, null, null, null, null, 1980);
        }

        @Override // og0.AbstractC8214b, og0.h
        public final void d(InterfaceC3111q interfaceC3111q) {
            e.g(this.f114293a, this.f114294b, UploadEventType.UPLOAD_EVENT_NETWORK_CHANGED, null, null, null, null, NetworkType.NETWORK_TYPE_NO_NET, null, null, null, null, 1980);
        }
    }

    public e(@NotNull WeakReference<Activity> weakReference, @NotNull CoroutineScope coroutineScope) {
        this.f114269a = weakReference;
        this.f114270b = coroutineScope;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<L> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 16, bufferOverflow);
        this.f114274f = MutableSharedFlow;
        this.f114275g = FlowKt.asSharedFlow(MutableSharedFlow);
        MutableSharedFlow<kntr.base.jsb.api.upper.e> MutableSharedFlow2 = SharedFlowKt.MutableSharedFlow(0, 16, bufferOverflow);
        this.h = MutableSharedFlow2;
        this.f114276i = FlowKt.asSharedFlow(MutableSharedFlow2);
        this.f114277j = new LinkedHashSet();
        this.f114278k = new c(this);
        this.f114279l = new b(this);
    }

    public static o a() {
        return new o(0L, "", "", 0L, "", CollectionsKt.emptyList());
    }

    public static void f(e eVar, ArchiveEventType archiveEventType, long j7, Float f7, String str, Long l7, NetworkType networkType, int i7) {
        if ((i7 & 4) != 0) {
            f7 = null;
        }
        if ((i7 & 8) != 0) {
            str = null;
        }
        if ((i7 & 32) != 0) {
            l7 = null;
        }
        if ((i7 & 64) != 0) {
            networkType = null;
        }
        eVar.getClass();
        BuildersKt.launch$default(eVar.f114270b, Dispatchers.getMain(), (CoroutineStart) null, new UpperCenterServiceImpl$emitArchiveTaskEvent$1(eVar, archiveEventType, j7, f7, str, null, l7, networkType, null), 2, (Object) null);
    }

    public static void g(e eVar, String str, UploadEventType uploadEventType, UploadStatus uploadStatus, Float f7, Long l7, Long l8, NetworkType networkType, String str2, String str3, Integer num, String str4, int i7) {
        if ((i7 & 4) != 0) {
            uploadStatus = null;
        }
        if ((i7 & 8) != 0) {
            f7 = null;
        }
        if ((i7 & 16) != 0) {
            l7 = null;
        }
        if ((i7 & 32) != 0) {
            l8 = null;
        }
        if ((i7 & 64) != 0) {
            networkType = null;
        }
        if ((i7 & 128) != 0) {
            str2 = null;
        }
        if ((i7 & 256) != 0) {
            str3 = null;
        }
        if ((i7 & 512) != 0) {
            num = null;
        }
        if ((i7 & 1024) != 0) {
            str4 = null;
        }
        eVar.getClass();
        BuildersKt.launch$default(eVar.f114270b, Dispatchers.getMain(), (CoroutineStart) null, new UpperCenterServiceImpl$emitUploadEvent$1(eVar, uploadEventType, str, uploadStatus, f7, l7, l8, networkType, str2, str3, num, str4, null), 2, (Object) null);
    }

    public static long h(long j7) {
        int iOrdinal;
        switch ((int) j7) {
            case 0:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_BUILD.ordinal();
                break;
            case 1:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_START.ordinal();
                break;
            case 2:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_PAUSE.ordinal();
                break;
            case 3:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_FAIL.ordinal();
                break;
            case 4:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_PROGRESS.ordinal();
                break;
            case 5:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_SUCCESS.ordinal();
                break;
            case 6:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_SUBMIT_FAIL.ordinal();
                break;
            case 7:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_SUBMIT_SUCCESS.ordinal();
                break;
            case 8:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_ARCHIVE_CREATED.ordinal();
                break;
            case 9:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_NET_FAIL.ordinal();
                break;
            case 10:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_SERVER_FAIL.ordinal();
                break;
            case 11:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_FILE_ERROR.ordinal();
                break;
            case 12:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_SLOWLY.ordinal();
                break;
            case 13:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_WAIT_NETWORK.ordinal();
                break;
            case 14:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_UPLOAD_PENDING.ordinal();
                break;
            case 15:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_ARCHIVE_CANCEL.ordinal();
                break;
            default:
                iOrdinal = ArchiveStatus.ARCHIVE_TASK_BUILD.ordinal();
                break;
        }
        return iOrdinal;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @Nullable
    public final Unit C1(@NotNull String str) {
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        try {
            InterfaceC3111q interfaceC3111qI = com.bilibili.lib.uploadengine.a.f65021a.i(str, true);
            if (interfaceC3111qI != null) {
                interfaceC3111qI.pause();
            }
        } catch (Exception e7) {
            q4.M.b("pauseUpload error: ", e7.getMessage(), "UpperCenterService");
        }
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void D0(long j7) {
        Activity activity = this.f114269a.get();
        if (activity == null) {
            return;
        }
        try {
            QF0.f fVarK = LF0.d.j(activity).k(j7);
            if (fVarK != null) {
                fVarK.F();
            }
            BLog.d("UpperCenterService", "interruptArchiveTask: taskId=" + j7);
        } catch (Exception e7) {
            q4.M.b("interruptArchiveTask error: ", e7.getMessage(), "UpperCenterService");
        }
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @Nullable
    public final q E0(@NotNull String str) {
        a aVar;
        if (str.length() != 0 && (aVar = this.f114271c.get(str)) != null) {
            int i7 = aVar.f114281b;
            int i8 = aVar.f114282c;
            String str2 = i7 == MuxStatus.MUX_STATUS_SUCCESS.ordinal() ? aVar.f114283d : null;
            int i9 = aVar.f114281b;
            MuxStatus muxStatus = MuxStatus.MUX_STATUS_FAILED;
            return new q(i7, str2, aVar.f114281b == muxStatus.ordinal() ? aVar.f114285f : null, i9 == muxStatus.ordinal() ? Boxing.boxInt(aVar.f114284e) : null, i8);
        }
        return new q();
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @Nullable
    public final Unit F1(@NotNull String str) {
        a aVar;
        if (str.length() != 0 && (aVar = this.f114271c.get(str)) != null) {
            try {
                aVar.f114286g.b();
                aVar.f114281b = MuxStatus.MUX_STATUS_CANCELED.ordinal();
            } catch (Exception e7) {
                q4.M.b("cancelMux error: ", e7.getMessage(), "UpperCenterService");
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @NotNull
    public final SharedFlow H() {
        return this.f114275g;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @NotNull
    public final SharedFlow I() {
        return this.f114276i;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void I0(@NotNull String str) {
        if (this.f114277j.contains(str)) {
            this.f114277j.remove(str);
            BLog.d("UpperCenterService", "unregisterUploadListener: taskId=" + str);
        }
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void I3(long j7) {
        Activity activity = this.f114269a.get();
        if (activity == null) {
            return;
        }
        try {
            QF0.f fVarK = LF0.d.j(activity).k(j7);
            if (fVarK != null) {
                fVarK.pending();
            }
            BLog.d("UpperCenterService", "pendingArchiveTask: taskId=" + j7);
        } catch (Exception e7) {
            q4.M.b("pendingArchiveTask error: ", e7.getMessage(), "UpperCenterService");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac A[Catch: Exception -> 0x0142, TRY_ENTER, TryCatch #0 {Exception -> 0x0142, blocks: (B:17:0x0056, B:20:0x0094, B:22:0x00a1, B:26:0x00b5, B:26:0x00b5, B:27:0x00b8, B:25:0x00ac, B:28:0x00df, B:28:0x00df, B:29:0x00e2), top: B:36:0x0056 }] */
    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kntr.base.jsb.api.upper.G M5(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.service.e.M5(java.lang.String, java.lang.String):kntr.base.jsb.api.upper.G");
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void O2(long j7, boolean z6) {
        Activity activity = this.f114269a.get();
        if (activity == null) {
            return;
        }
        try {
            QF0.f fVarK = LF0.d.j(activity).k(j7);
            if (fVarK != null) {
                fVarK.cancel();
            }
            BLog.d("UpperCenterService", "cancelArchiveTask: taskId=" + j7 + ", clearLocal=" + z6);
        } catch (Exception e7) {
            q4.M.b("cancelArchiveTask error: ", e7.getMessage(), "UpperCenterService");
        }
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void Q5(long j7) {
        Activity activity = this.f114269a.get();
        if (activity == null) {
            return;
        }
        try {
            QF0.f fVarK = LF0.d.j(activity).k(j7);
            if (fVarK != null) {
                fVarK.pause();
            }
            BLog.d("UpperCenterService", "pauseArchiveTask: taskId=" + j7);
        } catch (Exception e7) {
            q4.M.b("pauseArchiveTask error: ", e7.getMessage(), "UpperCenterService");
        }
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void S2(@NotNull String str, boolean z6) {
        if (this.f114269a.get() == null) {
            return;
        }
        if (this.f114277j.contains(str)) {
            C3246j.b("Upload listener already registered for taskId: ", str, "UpperCenterService");
            return;
        }
        this.f114277j.add(str);
        try {
            InterfaceC3111q interfaceC3111qI = com.bilibili.lib.uploadengine.a.f65021a.i(str, z6);
            if (interfaceC3111qI == null) {
                this.f114277j.remove(str);
                return;
            }
            interfaceC3111qI.addUploadCallback(new C1237e(this, str));
            interfaceC3111qI.addUploadNetworkListener(new f(this, str));
            BLog.d("UpperCenterService", "registerUploadListener success: taskId=".concat(str));
        } catch (Exception e7) {
            q4.M.b("registerUploadListener error: ", e7.getMessage(), "UpperCenterService");
            this.f114277j.remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea A[Catch: Exception -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x006a, blocks: (B:11:0x002c, B:13:0x003c, B:15:0x0058, B:24:0x0078, B:31:0x0095, B:34:0x00a0, B:41:0x00bb, B:43:0x00c7, B:49:0x00f2, B:48:0x00ea, B:51:0x0109), top: B:57:0x002c }] */
    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kntr.base.jsb.api.upper.o S5(long r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.service.e.S5(long):kntr.base.jsb.api.upper.o");
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @Nullable
    public final Unit T5(@NotNull String str, boolean z6) {
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        try {
            InterfaceC3111q interfaceC3111qI = com.bilibili.lib.uploadengine.a.f65021a.i(str, true);
            if (z6) {
                if (interfaceC3111qI != null) {
                    interfaceC3111qI.delete();
                }
            } else if (interfaceC3111qI != null) {
                interfaceC3111qI.pause();
            }
        } catch (Exception e7) {
            q4.M.b("cancelUpload error: ", e7.getMessage(), "UpperCenterService");
        }
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void W2(long j7) {
        Activity activity = this.f114269a.get();
        if (activity == null) {
            return;
        }
        try {
            QF0.f fVarK = LF0.d.j(activity).k(j7);
            if (fVarK != null) {
                fVarK.b1();
            }
            BLog.d("UpperCenterService", "quickStartArchiveTask: taskId=" + j7);
        } catch (Exception e7) {
            q4.M.b("quickStartArchiveTask error: ", e7.getMessage(), "UpperCenterService");
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @org.jetbrains.annotations.Nullable
    public final kntr.base.jsb.api.upper.k X1(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @Nullable
    public final u Y0(@NotNull String str) {
        u uVar;
        InterfaceC3111q interfaceC3111qI;
        UploadStatus uploadStatus;
        if (str.length() == 0) {
            return new u(-1, (String) null, (String) null, 112);
        }
        try {
            interfaceC3111qI = com.bilibili.lib.uploadengine.a.f65021a.i(str, true);
        } catch (Exception e7) {
            BLog.e("UpperCenterService", "getUploadStatus error: " + e7.getMessage());
            uVar = new u(-1, (String) null, (String) null, 112);
        }
        if (interfaceC3111qI == null) {
            return new u(-1, (String) null, (String) null, 112);
        }
        ng0.g taskInfo = interfaceC3111qI.getTaskInfo();
        switch (interfaceC3111qI.getTaskStatus()) {
            case 1:
                uploadStatus = UploadStatus.UPLOAD_STATUS_IDLE;
                break;
            case 2:
            case 4:
                uploadStatus = UploadStatus.UPLOAD_STATUS_UPLOADING;
                break;
            case 3:
                uploadStatus = UploadStatus.UPLOAD_STATUS_PAUSED;
                break;
            case 5:
                uploadStatus = UploadStatus.UPLOAD_STATUS_CANCELED;
                break;
            case 6:
                uploadStatus = UploadStatus.UPLOAD_STATUS_SUCCESS;
                break;
            case 7:
                uploadStatus = UploadStatus.UPLOAD_STATUS_FAILED;
                break;
            case 8:
                uploadStatus = UploadStatus.UPLOAD_STATUS_INTERRUPTED;
                break;
            case 9:
                uploadStatus = UploadStatus.UPLOAD_STATUS_PENDING;
                break;
            default:
                uploadStatus = UploadStatus.UPLOAD_STATUS_IDLE;
                break;
        }
        int iOrdinal = uploadStatus.ordinal();
        UploadStatus uploadStatus2 = UploadStatus.UPLOAD_STATUS_SUCCESS;
        uVar = new u(iOrdinal, (uploadStatus != uploadStatus2 || taskInfo == null) ? null : taskInfo.e(), uploadStatus == uploadStatus2 ? interfaceC3111qI.getResultFile() : null, 64);
        return uVar;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void a1(boolean z6) {
        Activity activity = this.f114269a.get();
        if (activity == null) {
            return;
        }
        try {
            BiliGlobalPreferenceHelper.getInstance(activity).setBoolean("FREE_DATA", z6);
            BLog.d("UpperCenterService", "setUse4GUploadStatus: isUse4GUpload=" + z6);
        } catch (Exception e7) {
            q4.M.b("setUse4GUploadStatus error: ", e7.getMessage(), "UpperCenterService");
        }
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @Nullable
    public final Unit c3(@NotNull String str) {
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        try {
            InterfaceC3111q interfaceC3111qI = com.bilibili.lib.uploadengine.a.f65021a.i(str, true);
            if (interfaceC3111qI != null) {
                interfaceC3111qI.start();
            }
        } catch (Exception e7) {
            q4.M.b("startUpload error: ", e7.getMessage(), "UpperCenterService");
        }
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void f1(long j7) {
        Activity activity = this.f114269a.get();
        if (activity == null) {
            return;
        }
        try {
            QF0.f fVarK = LF0.d.j(activity).k(j7);
            if (fVarK != null) {
                fVarK.start();
            }
            BLog.d("UpperCenterService", "startArchiveTask: taskId=" + j7);
        } catch (Exception e7) {
            q4.M.b("startArchiveTask error: ", e7.getMessage(), "UpperCenterService");
        }
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void f2(@Nullable Long l7) {
        if (this.f114269a.get() == null || l7 == null) {
            return;
        }
        try {
            QF0.f fVarK = LF0.d.j(this.f114269a.get()).k(l7.longValue());
            if (fVarK != null) {
                fVarK.n0(this.f114278k);
            }
            if (fVarK != null) {
                fVarK.d(this.f114279l);
            }
            BLog.d("UpperCenterService", "registerArchiveTaskListener success");
        } catch (Exception e7) {
            q4.M.b("registerArchiveTaskListener error: ", e7.getMessage(), "UpperCenterService");
        }
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @Nullable
    public final Object f3(@NotNull String str, @NotNull Continuation<? super m> continuation) {
        Activity activity = this.f114269a.get();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            BLog.e("UpperCenterService", "createUploadTask: activity is invalid");
            return new m("");
        }
        if (str.length() == 0) {
            BLog.e("UpperCenterService", "createUploadTask: videoPath is empty");
            return new m("");
        }
        if (!cn.com.chinatelecom.account.api.d.m.b(str)) {
            BLog.e("UpperCenterService", "createUploadTask: video file not found");
            return new m("");
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            String str2 = com.bilibili.studio.videoeditor.generalrender.model.f.f109601c;
            com.bilibili.studio.videoeditor.generalrender.model.f fVarF = f.a.f();
            d dVar = new d(str, cancellableContinuationImpl);
            fVarF.getClass();
            com.bilibili.studio.videoeditor.generalrender.model.f.a(dVar);
        } catch (Exception e7) {
            q4.M.b("createUploadTask error: ", e7.getMessage(), "UpperCenterService");
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(new m("")));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final boolean i1() {
        Activity activity = this.f114269a.get();
        boolean zOptBoolean = false;
        if (activity == null) {
            return false;
        }
        try {
            zOptBoolean = BiliGlobalPreferenceHelper.getInstance(activity).optBoolean("FREE_DATA", false);
        } catch (Exception e7) {
            q4.M.b("getUse4GUploadStatus error: ", e7.getMessage(), "UpperCenterService");
        }
        return zOptBoolean;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    public final void i4(@Nullable Long l7) {
        if (l7 != null) {
            QF0.f fVarK = LF0.d.j(this.f114269a.get()).k(l7.longValue());
            if (fVarK != null) {
                fVarK.T0(this.f114278k);
            }
            if (fVarK != null) {
                fVarK.Q(this.f114279l);
            }
            BLog.d("UpperCenterService", "unregisterArchiveTaskListener: taskId=" + l7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    @Override // com.bilibili.upper.module.uppercenterlocal.service.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kntr.base.jsb.api.upper.z v5(int r16) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.service.e.v5(int):kntr.base.jsb.api.upper.z");
    }
}
