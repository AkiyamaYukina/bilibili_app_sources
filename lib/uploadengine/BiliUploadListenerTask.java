package com.bilibili.lib.uploadengine;

import H11.G;
import J1.z;
import Vn.A;
import Xf0.C3104j;
import Xf0.C3105k;
import Xf0.C3109o;
import Xf0.C3110p;
import Xf0.InterfaceC3111q;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C3259x;
import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.app.o;
import androidx.fragment.app.B;
import androidx.paging.M;
import com.bilibili.base.MainThread;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.upload.UploadTask;
import com.bilibili.lib.upload.UploadTaskState;
import com.bilibili.lib.uploadengine.BiliUploadListenerTask;
import com.bilibili.lib.uploadengine.BiliUploadTaskEvent;
import com.bilibili.lib.videoupload.UploadSubStatus;
import com.bilibili.lib.videoupload.UploadTaskMetaData;
import com.bilibili.lib.videoupload.bean.UploadRiskControlBean;
import com.bilibili.nativelibrary.LibBili;
import com.bilibili.studio.comm.report.editor.bean.EditorAction;
import com.google.gson.Gson;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import ng0.C8092b;
import og0.C8215c;
import og0.C8216d;
import og0.e;
import og0.f;
import og0.g;
import og0.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sg0.C8591d;
import vg0.C8808b;
import vg0.c;
import vg0.k;
import vg0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/BiliUploadListenerTask.class */
@Keep
public abstract class BiliUploadListenerTask implements InterfaceC3111q {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String TAG = "BiliUploadTask";
    private volatile boolean hasCallbackMeta;
    private volatile boolean isMetaDataFinish;
    private volatile boolean isVideoPreUploadFinish;

    @Nullable
    private volatile C8216d mForwardMetaCheckListener;

    @Nullable
    private volatile e mForwardNetworkListener;

    @Nullable
    private volatile C8215c mForwardUploadCallback;
    private long mStepStartTime;

    @NotNull
    private final CopyOnWriteArrayList<f> mCallbacks = new CopyOnWriteArrayList<>();

    @NotNull
    private final CopyOnWriteArrayList<h> mUploadNetworkListeners = new CopyOnWriteArrayList<>();

    @NotNull
    private final CopyOnWriteArrayList<g> mUploadMetaCheckListeners = new CopyOnWriteArrayList<>();

    @NotNull
    private final UploadTask.Callback uploadTaskCallback = new b(this);

    @NotNull
    private volatile UploadSubStatus mCurSubStatus = UploadSubStatus.STATUS_UPLOADING;

    @NotNull
    private AtomicBoolean waitingCheckNetState = new AtomicBoolean(false);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/BiliUploadListenerTask$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/BiliUploadListenerTask$b.class */
    public static final class b implements UploadTask.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f65011a = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliUploadListenerTask f65012b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/BiliUploadListenerTask$b$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f65013a;

            static {
                int[] iArr = new int[UploadTaskState.UPLOAD_STAGE.values().length];
                try {
                    iArr[UploadTaskState.UPLOAD_STAGE.PRE_TRANSENCODING.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[UploadTaskState.UPLOAD_STAGE.PRE_UPLOAD.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f65013a = iArr;
            }
        }

        public b(BiliUploadListenerTask biliUploadListenerTask) {
            this.f65012b = biliUploadListenerTask;
        }

        public final void a(ng0.g gVar, String str) {
            String strA = o.a(gVar.v(), "onUploadError uploadError=", ",uploadErrorMsg=", str);
            BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            BiliUploadListenerTask.printLog$default(biliUploadListenerTask, strA, false, 2, null);
            biliUploadListenerTask.reportTaskStepError(gVar, C8092b.a(gVar.v()), gVar.w());
            MainThread.runOnMainThread(new C3104j(0, biliUploadListenerTask, gVar));
        }

        public final UploadRiskControlBean b(int i7, JSONObject jSONObject) {
            int iOptInt = jSONObject.optInt("code");
            UploadRiskControlBean uploadRiskControlBean = null;
            if (iOptInt == 601) {
                uploadRiskControlBean = null;
                if (i7 == 406) {
                    uploadRiskControlBean = new UploadRiskControlBean();
                    uploadRiskControlBean.errorMsg = jSONObject.optString("message");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("detail");
                    if (jSONObjectOptJSONObject != null) {
                        uploadRiskControlBean.vVoucher = jSONObjectOptJSONObject.optString("v_voucher");
                    }
                    StringBuilder sbB = A.b(i7, iOptInt, "parseNormalRiskInfo,httpCode=", ",code=", ",riskControl=");
                    sbB.append(uploadRiskControlBean);
                    BiliUploadListenerTask.printLog$default(this.f65012b, sbB.toString(), false, 2, null);
                }
            }
            return uploadRiskControlBean;
        }

        public final UploadRiskControlBean c(int i7, JSONObject jSONObject) {
            int iOptInt = jSONObject.optInt("code");
            UploadRiskControlBean uploadRiskControlBean = null;
            if (iOptInt == 244001) {
                uploadRiskControlBean = null;
                if (i7 != 200) {
                    uploadRiskControlBean = new UploadRiskControlBean();
                    uploadRiskControlBean.errorMsg = jSONObject.optString("message");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject != null) {
                        uploadRiskControlBean.vVoucher = jSONObjectOptJSONObject.optString("v_voucher");
                    }
                    StringBuilder sbB = A.b(i7, iOptInt, "parseAndCheckRiskControl,httpCode=", ",code=", ",riskControl=");
                    sbB.append(uploadRiskControlBean);
                    BiliUploadListenerTask.printLog$default(this.f65012b, sbB.toString(), false, 2, null);
                }
            }
            return uploadRiskControlBean;
        }

        @Override // com.bilibili.lib.upload.UploadTask.Callback
        public final void onBvcMetadata(String str) {
            String strA = C4496a.a("onBvcMetadata p0=", str);
            BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            BiliUploadListenerTask.printLog$default(biliUploadListenerTask, strA, false, 2, null);
            BiliUploadListenerTask.getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null).H(biliUploadListenerTask.parse2TaskMetaData(str));
            biliUploadListenerTask.isMetaDataFinish = true;
            biliUploadListenerTask.updateMetaDataAddCallback();
        }

        @Override // com.bilibili.lib.upload.UploadTask.Callback
        public final void onDestroy() {
            String str = "onDestroy task,thread=" + Thread.currentThread();
            final BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            BiliUploadListenerTask.printLog$default(biliUploadListenerTask, str, false, 2, null);
            final ng0.g uploadTaskInfo = biliUploadListenerTask.getUploadTaskInfo(false);
            BiliUploadListenerTask.printLog$default(biliUploadListenerTask, "onDestroy currentTaskState=".concat(bO0.a.b(uploadTaskInfo.t())), false, 2, null);
            biliUploadListenerTask.onTaskDestroyed();
            final int i7 = 0;
            MainThread.runOnMainThread(new Function0(i7, biliUploadListenerTask, uploadTaskInfo) { // from class: Xf0.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f28187a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f28188b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f28189c;

                {
                    this.f28187a = i7;
                    this.f28188b = biliUploadListenerTask;
                    this.f28189c = uploadTaskInfo;
                }

                /* JADX WARN: Removed duplicated region for block: B:214:0x04fa  */
                /* JADX WARN: Type inference failed for: r0v112, types: [com.mall.ui.widget.comment.MallCommentWindow$a, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke() {
                    /*
                        Method dump skipped, instruction units count: 1441
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Xf0.C3101g.invoke():java.lang.Object");
                }
            });
        }

        @Override // com.bilibili.lib.upload.UploadTask.Callback
        public final String onGetRuquestUrl(UploadTaskState.UPLOAD_STAGE upload_stage, String str, Map<String, String> map) {
            String strM;
            String strR;
            BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            BiliUploadListenerTask.printLog$default(biliUploadListenerTask, "onGetRequestUrl before stage=" + upload_stage + ",url=" + str, false, 2, null);
            int i7 = upload_stage == null ? -1 : a.f65013a[upload_stage.ordinal()];
            strM = "";
            if (i7 == 1) {
                C3110p c3110p = C3110p.f28206a;
                boolean zD = BiliUploadListenerTask.getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null).D();
                c3110p.getClass();
                try {
                    Result.Companion companion = Result.Companion;
                    String strB = C3110p.b(str);
                    ConcurrentHashMap concurrentHashMapC = C3110p.c(str);
                    C3110p.a(concurrentHashMapC);
                    concurrentHashMapC.put("net_state", String.valueOf(p.g()));
                    if (zD) {
                        concurrentHashMapC.put("upcdn", "bili");
                    }
                    strM = p.m(strB, LibBili.signQuery(concurrentHashMapC).toString());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
                    if (th2 != null) {
                        C8808b.a("[Upload SDK] appendMetaPreUploadParams error exception=" + th2.getMessage());
                    }
                    if (str != null) {
                        strM = str;
                    }
                }
                BiliUploadListenerTask.printLog$default(biliUploadListenerTask, C4496a.a("onGetRequestUrl after url=", strM), false, 2, null);
                return strM;
            }
            if (i7 != 2) {
                return str != null ? str : "";
            }
            ng0.g uploadTaskInfo$default = BiliUploadListenerTask.getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null);
            C3110p c3110p2 = C3110p.f28206a;
            boolean zD2 = uploadTaskInfo$default.D();
            String strR2 = uploadTaskInfo$default.r();
            c3110p2.getClass();
            try {
                Result.Companion companion3 = Result.Companion;
                String strB2 = C3110p.b(str);
                ConcurrentHashMap concurrentHashMapC2 = C3110p.c(str);
                concurrentHashMapC2.put("net_state", String.valueOf(p.g()));
                if (zD2) {
                    concurrentHashMapC2.put("upcdn", "bili");
                }
                C3110p.a(concurrentHashMapC2);
                if (c.d() && strR2 != null && strR2.length() != 0) {
                    concurrentHashMapC2.put("gaia_vtoken", strR2);
                }
                strM = p.m(strB2, LibBili.signQuery(concurrentHashMapC2).toString());
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.Companion;
                Throwable th4 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th3)));
                if (th4 != null) {
                    C8808b.a("[Upload SDK] appendPreUploadParams error exception=" + th4.getMessage());
                }
                if (str != null) {
                    strM = str;
                }
            }
            if (c.d() && (strR = uploadTaskInfo$default.r()) != null && strR.length() != 0 && map != null) {
                map.put("gaia_vtoken", uploadTaskInfo$default.r());
            }
            BiliUploadListenerTask.printLog$default(biliUploadListenerTask, C4496a.a("onGetRequestUrl after url=", strM), false, 2, null);
            return strM;
        }

        @Override // com.bilibili.lib.upload.UploadTask.Callback
        public final void onProgress(int i7, long j7, long j8) {
            float f7 = j8 > 0 ? (j7 * 100.0f) / j8 : 0.0f;
            if (this.f65011a < 0.0f) {
                this.f65011a = f7;
            }
            float fAbs = Math.abs(f7 - this.f65011a);
            if (fAbs < 1.0f) {
                return;
            }
            float f8 = this.f65011a;
            Thread threadCurrentThread = Thread.currentThread();
            StringBuilder sbA = Dp.b.a("onProgress progress=", f7, ",preProgress=", f8, ",diffProgress=");
            sbA.append(fAbs);
            sbA.append(",totalBytesSent=");
            sbA.append(j7);
            z.a(j8, ",totalBytes=", ",thread=", sbA);
            sbA.append(threadCurrentThread);
            String string = sbA.toString();
            final BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            BiliUploadListenerTask.printLogD$default(biliUploadListenerTask, string, false, 2, null);
            this.f65011a = f7;
            final ng0.g uploadTaskInfo$default = BiliUploadListenerTask.getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null);
            synchronized (uploadTaskInfo$default) {
                uploadTaskInfo$default.f124213s = j7;
                uploadTaskInfo$default.d();
            }
            synchronized (uploadTaskInfo$default) {
                uploadTaskInfo$default.f124208n = j7;
            }
            final float f9 = f7;
            MainThread.runOnMainThread(new Function0(biliUploadListenerTask, uploadTaskInfo$default, f9) { // from class: Xf0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliUploadListenerTask f28184a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ng0.g f28185b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f28186c;

                {
                    this.f28184a = biliUploadListenerTask;
                    this.f28185b = uploadTaskInfo$default;
                    this.f28186c = f9;
                }

                public final Object invoke() {
                    Unit unit;
                    BiliUploadListenerTask biliUploadListenerTask2 = this.f28184a;
                    if (biliUploadListenerTask2.isInterceptCallback() || !biliUploadListenerTask2.isRunning()) {
                        BiliUploadListenerTask.printLogD$default(biliUploadListenerTask2, "onProgress,isInterceptCallback=true", false, 2, null);
                        unit = Unit.INSTANCE;
                    } else {
                        C8215c mForwardUploadCallback = biliUploadListenerTask2.getMForwardUploadCallback();
                        if (mForwardUploadCallback != null) {
                            mForwardUploadCallback.m(this.f28185b, this.f28186c);
                        }
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            });
        }

        @Override // com.bilibili.lib.upload.UploadTask.Callback
        public final void onSpeed(final int i7, long j7) {
            BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            final ng0.g uploadTaskInfo$default = BiliUploadListenerTask.getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null);
            BiliUploadListenerTask.printLogD$default(biliUploadListenerTask, B.b(i7, j7, "onSpeed speedBps=", ",remainTimeMs="), false, 2, null);
            long j8 = j7 < 0 ? Long.MAX_VALUE : j7 / ((long) 1000);
            if (uploadTaskInfo$default.t() == 7 || uploadTaskInfo$default.t() == 3 || uploadTaskInfo$default.t() == 9 || uploadTaskInfo$default.t() == 5) {
                BiliUploadListenerTask.printLogD$default(biliUploadListenerTask, C3392f.a(uploadTaskInfo$default.t(), "onSpeed status（", "） is error ，return"), false, 2, null);
                return;
            }
            long j9 = i7;
            synchronized (uploadTaskInfo$default) {
                uploadTaskInfo$default.f124214t = j9;
            }
            synchronized (uploadTaskInfo$default) {
                uploadTaskInfo$default.f124215u = j8;
            }
            final BiliUploadListenerTask biliUploadListenerTask2 = this.f65012b;
            final long j10 = j8;
            MainThread.runOnMainThread(new Function0(biliUploadListenerTask2, uploadTaskInfo$default, i7, j10) { // from class: Xf0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliUploadListenerTask f28193a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ng0.g f28194b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f28195c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f28196d;

                {
                    this.f28193a = biliUploadListenerTask2;
                    this.f28194b = uploadTaskInfo$default;
                    this.f28195c = i7;
                    this.f28196d = j10;
                }

                public final Object invoke() {
                    Unit unit;
                    BiliUploadListenerTask biliUploadListenerTask3 = this.f28193a;
                    if (biliUploadListenerTask3.isInterceptCallback()) {
                        BiliUploadListenerTask.printLogD$default(biliUploadListenerTask3, "onSpeed isInterceptCallback=true,mCurSubStatus=" + biliUploadListenerTask3.mCurSubStatus, false, 2, null);
                        unit = Unit.INSTANCE;
                    } else {
                        C8215c mForwardUploadCallback = biliUploadListenerTask3.getMForwardUploadCallback();
                        if (mForwardUploadCallback != null) {
                            mForwardUploadCallback.g(this.f28194b, this.f28195c, this.f28196d);
                        }
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            });
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.bilibili.lib.upload.UploadTask.Callback
        public final void onUploadError(UploadTaskState.UPLOAD_STAGE upload_stage, UploadTask.UPLOAD_ERROR upload_error, int i7, String str) throws NoWhenBranchMatchedException {
            UploadRiskControlBean uploadRiskControlBeanC;
            UploadRiskControlBean uploadRiskControlBeanB;
            Object obj;
            String str2;
            BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            String taskId = biliUploadListenerTask.getTaskId();
            Thread threadCurrentThread = Thread.currentThread();
            StringBuilder sb = new StringBuilder("onUploadError,task_id=");
            sb.append(taskId);
            sb.append(",uploadState=");
            sb.append(upload_stage);
            sb.append(",errorCode=");
            M.a(i7, ",errorMsg=", str, ",thread=", sb);
            sb.append(threadCurrentThread);
            int i8 = 0;
            BiliUploadListenerTask.printLog$default(biliUploadListenerTask, sb.toString(), false, 2, null);
            ng0.g uploadTaskInfo$default = BiliUploadListenerTask.getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null);
            int iB = C3109o.b(upload_stage);
            synchronized (uploadTaskInfo$default) {
                uploadTaskInfo$default.h = iB;
            }
            if (upload_stage == UploadTaskState.UPLOAD_STAGE.PRE_UPLOAD) {
                if (c.d()) {
                    uploadRiskControlBeanC = null;
                    if (str != null) {
                        if (str.length() == 0) {
                            uploadRiskControlBeanC = null;
                        } else {
                            try {
                                Result.Companion companion = Result.Companion;
                                JSONObject jSONObject = new JSONObject(str);
                                uploadRiskControlBeanB = b(i7, jSONObject);
                                uploadRiskControlBeanC = uploadRiskControlBeanB;
                                if (uploadRiskControlBeanB == null) {
                                    try {
                                        uploadRiskControlBeanC = c(i7, jSONObject);
                                    } catch (Throwable th) {
                                        th = th;
                                        Result.Companion companion2 = Result.Companion;
                                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                                        uploadRiskControlBeanC = uploadRiskControlBeanB;
                                    }
                                }
                                uploadRiskControlBeanB = uploadRiskControlBeanC;
                                obj = Result.constructor-impl(Unit.INSTANCE);
                            } catch (Throwable th2) {
                                th = th2;
                                uploadRiskControlBeanB = null;
                            }
                            Throwable th3 = Result.exceptionOrNull-impl(obj);
                            if (th3 != null) {
                                BiliUploadListenerTask.printLog$default(biliUploadListenerTask, C4496a.a("parseAndCheckRiskControl e=", th3.getMessage()), false, 2, null);
                            }
                        }
                    }
                } else {
                    uploadRiskControlBeanC = null;
                }
                if (uploadRiskControlBeanC != null && (str2 = uploadRiskControlBeanC.vVoucher) != null && str2.length() != 0) {
                    uploadTaskInfo$default.M(5);
                    uploadTaskInfo$default.N(uploadRiskControlBeanC.errorMsg);
                    uploadTaskInfo$default.f124190Q = i7;
                    String str3 = uploadRiskControlBeanC.vVoucher;
                    synchronized (uploadTaskInfo$default) {
                        uploadTaskInfo$default.f124194U = str3;
                    }
                    a(uploadTaskInfo$default, uploadRiskControlBeanC.errorMsg);
                    return;
                }
            }
            String bodyString = biliUploadListenerTask.parseBodyString(str, uploadTaskInfo$default.i());
            if (bodyString.length() > 0) {
                uploadTaskInfo$default.N(bodyString);
            }
            int i9 = upload_error == null ? -1 : C3109o.a.f28205c[upload_error.ordinal()];
            if (i9 != -1) {
                i8 = 4;
                if (i9 != 1) {
                    if (i9 == 2 || i9 == 3) {
                        i8 = 2;
                    } else if (i9 == 4) {
                        i8 = 3;
                    } else {
                        if (i9 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i8 = 4;
                    }
                }
            }
            uploadTaskInfo$default.M(i8);
            uploadTaskInfo$default.f124190Q = i7;
            a(uploadTaskInfo$default, bodyString);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.bilibili.lib.upload.UploadTask.Callback
        public void onUploadEvent(UploadTaskState.UPLOAD_STAGE upload_stage, UploadTask.UPLOAD_EVENT upload_event) throws NoWhenBranchMatchedException {
            String strE;
            BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            BiliUploadListenerTask.printLogD$default(biliUploadListenerTask, "onUploadEvent state=" + upload_stage + ",uploadEvent=" + upload_event, false, 2, null);
            ng0.g uploadTaskInfo$default = BiliUploadListenerTask.getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null);
            int iB = C3109o.b(upload_stage);
            synchronized (uploadTaskInfo$default) {
                uploadTaskInfo$default.h = iB;
            }
            if (upload_event != UploadTask.UPLOAD_EVENT.UPLAOD_EVENT_STATE_CHANGE) {
                if (upload_event == UploadTask.UPLOAD_EVENT.UPLOAD_EVENT_NETWORK_UNREACHABLE && biliUploadListenerTask.mCurSubStatus == UploadSubStatus.STATUS_WAITING && biliUploadListenerTask.waitingCheckNetState.get()) {
                    biliUploadListenerTask.dispatchUploadTaskSubStatus(BiliUploadTaskEvent.NET_WAITING);
                    biliUploadListenerTask.waitingCheckNetState.set(false);
                    return;
                }
                return;
            }
            if (uploadTaskInfo$default.i() >= 2 && (strE = uploadTaskInfo$default.e()) != null && strE.length() != 0) {
                biliUploadListenerTask.isVideoPreUploadFinish = true;
                synchronized (uploadTaskInfo$default) {
                    uploadTaskInfo$default.f124195V = null;
                }
                synchronized (uploadTaskInfo$default) {
                    uploadTaskInfo$default.f124194U = null;
                }
                biliUploadListenerTask.updateMetaDataAddCallback();
            }
            biliUploadListenerTask.notifyStateChange(upload_stage, uploadTaskInfo$default);
        }

        @Override // com.bilibili.lib.upload.UploadTask.Callback
        public final void onUploadSuccess() {
            final BiliUploadListenerTask biliUploadListenerTask = this.f65012b;
            final ng0.g uploadTaskInfo$default = BiliUploadListenerTask.getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null);
            final String strE = p.e(uploadTaskInfo$default.k());
            String taskId = biliUploadListenerTask.getTaskId();
            Thread threadCurrentThread = Thread.currentThread();
            StringBuilder sbA = G0.b.a("onUploadSuccess,task_id=", taskId, ",resultFile=", strE, ",thread=");
            sbA.append(threadCurrentThread);
            BiliUploadListenerTask.printLog$default(biliUploadListenerTask, sbA.toString(), false, 2, null);
            MainThread.runOnMainThread(new Function0(biliUploadListenerTask, uploadTaskInfo$default, strE) { // from class: Xf0.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliUploadListenerTask f28190a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ng0.g f28191b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f28192c;

                {
                    this.f28190a = biliUploadListenerTask;
                    this.f28191b = uploadTaskInfo$default;
                    this.f28192c = strE;
                }

                public final Object invoke() {
                    BiliUploadListenerTask biliUploadListenerTask2 = this.f28190a;
                    biliUploadListenerTask2.onTaskSuccess();
                    C8215c mForwardUploadCallback = biliUploadListenerTask2.getMForwardUploadCallback();
                    if (mForwardUploadCallback != null) {
                        mForwardUploadCallback.i(this.f28191b, this.f28192c);
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit dispatchUploadTaskSubStatus$lambda$0(BiliUploadListenerTask biliUploadListenerTask, BiliUploadTaskEvent biliUploadTaskEvent) throws NoWhenBranchMatchedException {
        UploadSubStatus uploadSubStatus;
        long j7;
        long j8;
        ng0.g uploadTaskInfo$default = getUploadTaskInfo$default(biliUploadListenerTask, false, 1, null);
        printLogD$default(biliUploadListenerTask, "dispatchUploadTaskSubStatus event=" + biliUploadTaskEvent + ",uploadTaskInfo=" + uploadTaskInfo$default.t(), false, 2, null);
        if (biliUploadListenerTask.mForwardUploadCallback == null) {
            return Unit.INSTANCE;
        }
        int taskStatus = biliUploadListenerTask.getTaskStatus();
        if (taskStatus == 3 || taskStatus == 9 || taskStatus == 5 || taskStatus == 6 || taskStatus == 7) {
            printLog$default(biliUploadListenerTask, "dispatchUploadTaskSubStatus return,event=" + biliUploadTaskEvent + ",status=" + taskStatus, false, 2, null);
            return Unit.INSTANCE;
        }
        int i7 = C3105k.f28200a[biliUploadTaskEvent.ordinal()];
        if (i7 == 1) {
            uploadSubStatus = UploadSubStatus.STATUS_WAITING;
        } else if (i7 == 2) {
            uploadSubStatus = UploadSubStatus.STATUS_UPLOADING;
        } else if (i7 == 3) {
            uploadSubStatus = UploadSubStatus.STATUS_LOW_SPEED;
        } else {
            if (i7 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            uploadSubStatus = UploadSubStatus.STATUS_UPLOADING;
        }
        UploadSubStatus uploadSubStatus2 = biliUploadListenerTask.mCurSubStatus;
        UploadSubStatus uploadSubStatus3 = UploadSubStatus.STATUS_WAITING;
        if (uploadSubStatus2 == uploadSubStatus3 && uploadSubStatus == UploadSubStatus.STATUS_LOW_SPEED) {
            return Unit.INSTANCE;
        }
        float fP = uploadTaskInfo$default.p();
        synchronized (uploadTaskInfo$default) {
            j7 = uploadTaskInfo$default.f124214t;
        }
        synchronized (uploadTaskInfo$default) {
            j8 = uploadTaskInfo$default.f124215u;
        }
        C8591d c8591d = new C8591d(j7, j8, fP);
        printLogD$default(biliUploadListenerTask, "dispatchUploadTaskSubStatus onSubStatusChanged,subStatus=" + uploadSubStatus + ",uploadProgress=" + c8591d, false, 2, null);
        biliUploadListenerTask.mCurSubStatus = uploadSubStatus;
        C8215c c8215c = biliUploadListenerTask.mForwardUploadCallback;
        if (c8215c != null) {
            c8215c.d(uploadTaskInfo$default, uploadSubStatus, c8591d);
        }
        if (biliUploadListenerTask.mCurSubStatus == uploadSubStatus3) {
            biliUploadListenerTask.waitingCheckNetState.set(false);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ng0.g getUploadTaskInfo$default(BiliUploadListenerTask biliUploadListenerTask, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUploadTaskInfo");
        }
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        return biliUploadListenerTask.getUploadTaskInfo(z6);
    }

    private final boolean isReportStepCancelEvent(ng0.g gVar) {
        printLog$default(this, G.f.a(gVar.i(), gVar.t(), "isReportStepEvent step=", ",status="), false, 2, null);
        boolean z6 = gVar.i() == 1 || gVar.i() == 2 || gVar.i() == 3 || gVar.i() == 4;
        boolean z7 = gVar.i() == 4 && gVar.t() == 6;
        boolean z8 = false;
        if (z6) {
            z8 = false;
            if (!z7) {
                z8 = true;
            }
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyStateChange(UploadTaskState.UPLOAD_STAGE upload_stage, ng0.g gVar) {
        printLog$default(this, "notifyStateChange stage=" + upload_stage, false, 2, null);
        if (upload_stage == UploadTaskState.UPLOAD_STAGE.PRE_UPLOAD || upload_stage == UploadTaskState.UPLOAD_STAGE.INIT_UPLOAD || upload_stage == UploadTaskState.UPLOAD_STAGE.CHUNK_UPLOAD || upload_stage == UploadTaskState.UPLOAD_STAGE.MERGE_UPLOAD) {
            reportTaskStepSuccess(gVar);
            this.mStepStartTime = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTaskPaused$lambda$0(BiliUploadListenerTask biliUploadListenerTask, ng0.g gVar) {
        biliUploadListenerTask.reportTaskStepStop(gVar);
        C8215c c8215c = biliUploadListenerTask.mForwardUploadCallback;
        if (c8215c != null) {
            c8215c.e(gVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTaskPending$lambda$0(BiliUploadListenerTask biliUploadListenerTask, ng0.g gVar) {
        biliUploadListenerTask.reportTaskStepStop(gVar);
        C8215c c8215c = biliUploadListenerTask.mForwardUploadCallback;
        if (c8215c != null) {
            c8215c.c(gVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTaskStarted$lambda$0(BiliUploadListenerTask biliUploadListenerTask, ng0.g gVar) {
        C8215c c8215c = biliUploadListenerTask.mForwardUploadCallback;
        if (c8215c != null) {
            c8215c.l(gVar);
        }
        if (biliUploadListenerTask.mCurSubStatus == UploadSubStatus.STATUS_WAITING) {
            biliUploadListenerTask.waitingCheckNetState.set(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UploadTaskMetaData parse2TaskMetaData(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            UploadTaskMetaData uploadTaskMetaData = (UploadTaskMetaData) new Gson().fromJson(StringsKt.L(str, "\n", ""), UploadTaskMetaData.class);
            uploadTaskMetaData.appVersion = FoundationAlias.getFapps().getVersionName();
            uploadTaskMetaData.path = getFilePath();
            uploadTaskMetaData.fileSize = getUploadTaskInfo$default(this, false, 1, null).f124201f;
            return uploadTaskMetaData;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return null;
            }
            printLog$default(this, C4496a.a("parse2TaskMetaData fail ext=", th2.getMessage()), false, 2, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String parseBodyString(String str, int i7) {
        Object obj;
        JSONObject jSONObject;
        int iOptInt;
        if (str == null || str.length() == 0 || i7 != 1) {
            return "";
        }
        try {
            Result.Companion companion = Result.Companion;
            jSONObject = new JSONObject(str);
            iOptInt = jSONObject.optInt("code");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (iOptInt >= 400 && iOptInt < 500) {
            return jSONObject.optString("message");
        }
        obj = Result.constructor-impl(Unit.INSTANCE);
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return "";
        }
        printLog$default(this, androidx.fragment.app.z.a("parseBodyString errorMsg=", str, ",ext=", th2.getMessage()), false, 2, null);
        return "";
    }

    public static /* synthetic */ void printLog$default(BiliUploadListenerTask biliUploadListenerTask, String str, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: printLog");
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        biliUploadListenerTask.printLog(str, z6);
    }

    public static /* synthetic */ void printLogD$default(BiliUploadListenerTask biliUploadListenerTask, String str, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: printLogD");
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        biliUploadListenerTask.printLogD(str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportTaskStepError(ng0.g gVar, String str, String str2) {
        reportTaskStepTime("error", String.valueOf(gVar.f124190Q), str, gVar, str2);
    }

    private final void reportTaskStepStop(ng0.g gVar) {
        reportTaskStepTime(EditorAction.ACTION_STOP, "", "", gVar, "");
    }

    private final void reportTaskStepSuccess(ng0.g gVar) {
        reportTaskStepTime("success", "0", "", gVar, "");
    }

    private final void reportTaskStepTime(String str, String str2, String str3, ng0.g gVar, String str4) {
        String[] strArr = k.f128240a;
        k.l(this.mStepStartTime, str, str2, str3, gVar, str4, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMetaDataAddCallback() {
        if (this.isVideoPreUploadFinish && this.isMetaDataFinish && !this.hasCallbackMeta) {
            this.hasCallbackMeta = true;
            final ng0.g uploadTaskInfo$default = getUploadTaskInfo$default(this, false, 1, null);
            UploadTaskMetaData uploadTaskMetaDataL = uploadTaskInfo$default.l();
            if (uploadTaskMetaDataL != null) {
                uploadTaskMetaDataL.cid = uploadTaskInfo$default.e();
                uploadTaskMetaDataL.filename = p.e(uploadTaskInfo$default.z());
            }
            UploadTaskMetaData uploadTaskMetaDataL2 = uploadTaskInfo$default.l();
            String str = uploadTaskMetaDataL2 != null ? uploadTaskMetaDataL2.cid : null;
            UploadTaskMetaData uploadTaskMetaDataL3 = uploadTaskInfo$default.l();
            printLog$default(this, androidx.fragment.app.z.a("updateMetaDataAddCallback callback～cid=", str, ",filename=", uploadTaskMetaDataL3 != null ? uploadTaskMetaDataL3.filename : null), false, 2, null);
            MainThread.runOnMainThread(new Function0(this, uploadTaskInfo$default) { // from class: Xf0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ng0.g f28174a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BiliUploadListenerTask f28175b;

                {
                    this.f28174a = uploadTaskInfo$default;
                    this.f28175b = this;
                }

                public final Object invoke() {
                    return BiliUploadListenerTask.updateMetaDataAddCallback$lambda$1(this.f28174a, this.f28175b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateMetaDataAddCallback$lambda$1(ng0.g gVar, BiliUploadListenerTask biliUploadListenerTask) {
        if (gVar.l() == null) {
            C8216d c8216d = biliUploadListenerTask.mForwardMetaCheckListener;
            if (c8216d != null) {
                c8216d.b("onCheckMetaFail,metaData == null");
            }
        } else {
            C8216d c8216d2 = biliUploadListenerTask.mForwardMetaCheckListener;
            if (c8216d2 != null) {
                c8216d2.a(gVar.l());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xf0.InterfaceC3111q
    public void addUploadCallback(@Nullable f fVar) {
        if (fVar == null) {
            return;
        }
        if (this.mForwardUploadCallback == null) {
            this.mForwardUploadCallback = new C8215c(this.mCallbacks);
        }
        if (this.mCallbacks.contains(fVar)) {
            return;
        }
        this.mCallbacks.add(fVar);
    }

    @Override // Xf0.InterfaceC3111q
    public void addUploadMetaCheckListener(@Nullable g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.mForwardMetaCheckListener == null) {
            this.mForwardMetaCheckListener = new C8216d(this.mUploadMetaCheckListeners);
        }
        if (this.mUploadMetaCheckListeners.contains(gVar)) {
            return;
        }
        this.mUploadMetaCheckListeners.add(gVar);
    }

    @Override // Xf0.InterfaceC3111q
    public void addUploadNetworkListener(@Nullable h hVar) {
        if (hVar == null) {
            return;
        }
        if (this.mForwardNetworkListener == null) {
            this.mForwardNetworkListener = new e(this.mUploadNetworkListeners);
        }
        if (this.mUploadNetworkListeners.contains(hVar)) {
            return;
        }
        this.mUploadNetworkListeners.add(hVar);
    }

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ void clearCache();

    @Override // Xf0.InterfaceC3111q
    public void clearUploadCallback() {
        this.mCallbacks.clear();
        this.mForwardUploadCallback = null;
    }

    public void clearUploadMetaCheckListener() {
        this.mUploadMetaCheckListeners.clear();
        this.mForwardMetaCheckListener = null;
    }

    @Override // Xf0.InterfaceC3111q
    public void clearUploadNetworkListener() {
        this.mUploadNetworkListeners.clear();
        this.mForwardNetworkListener = null;
    }

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ void delete();

    public final void dispatchUploadTaskSubStatus(@NotNull final BiliUploadTaskEvent biliUploadTaskEvent) {
        final int i7 = 0;
        MainThread.runOnMainThread(new Function0(i7, this, biliUploadTaskEvent) { // from class: Xf0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28171a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f28172b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f28173c;

            {
                this.f28171a = i7;
                this.f28172b = this;
                this.f28173c = biliUploadTaskEvent;
            }

            public final Object invoke() {
                switch (this.f28171a) {
                    case 0:
                        return BiliUploadListenerTask.dispatchUploadTaskSubStatus$lambda$0((BiliUploadListenerTask) this.f28172b, (BiliUploadTaskEvent) this.f28173c);
                    default:
                        ((FocusManager) this.f28172b).clearFocus(true);
                        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) this.f28173c;
                        if (softwareKeyboardController != null) {
                            softwareKeyboardController.hide();
                        }
                        return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // Xf0.InterfaceC3111q
    @Nullable
    public abstract /* synthetic */ String getFilePath();

    @Nullable
    public final e getMForwardNetworkListener() {
        return this.mForwardNetworkListener;
    }

    @Nullable
    public final C8215c getMForwardUploadCallback() {
        return this.mForwardUploadCallback;
    }

    public final long getMStepStartTime() {
        return this.mStepStartTime;
    }

    @Override // Xf0.InterfaceC3111q
    @Nullable
    public abstract /* synthetic */ String getResultFile();

    @Override // Xf0.InterfaceC3111q
    @NotNull
    public abstract /* synthetic */ String getTaskId();

    @Override // Xf0.InterfaceC3111q
    @Nullable
    public abstract /* synthetic */ ng0.g getTaskInfo();

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ int getTaskStatus();

    @NotNull
    public final UploadTask.Callback getUploadTaskCallback() {
        return this.uploadTaskCallback;
    }

    @NotNull
    public abstract ng0.g getUploadTaskInfo(boolean z6);

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ boolean isExpired();

    public final boolean isInterceptCallback() {
        boolean z6 = false;
        if (!c.c()) {
            printLogD$default(this, "isInterceptCallback,enableUploadNoticeOpt=false", false, 2, null);
            return false;
        }
        if (this.mCurSubStatus == UploadSubStatus.STATUS_WAITING || this.mCurSubStatus == UploadSubStatus.STATUS_LOW_SPEED) {
            z6 = true;
        }
        return z6;
    }

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ boolean isNewUploadTask();

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ boolean isPreUploadFinish();

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ boolean isRunning();

    @Override // Xf0.InterfaceC3111q
    public void notifyExternalSpeedChanged(boolean z6) {
        if (!c.c()) {
            printLog$default(this, C3259x.a(hashCode(), "notifyExternalSpeedChanged disable hash="), false, 2, null);
            return;
        }
        int taskStatus = getTaskStatus();
        if (taskStatus == 3 || taskStatus == 9 || taskStatus == 5 || taskStatus == 6 || taskStatus == 7) {
            printLog$default(this, G.f.a(hashCode(), taskStatus, "notifyExternalSpeedChanged return,hash=", ",taskStatus="), false, 2, null);
        } else if (vg0.e.b() && isRunning()) {
            dispatchUploadTaskSubStatus(z6 ? BiliUploadTaskEvent.SPEED_LOW : BiliUploadTaskEvent.SPEED_NORMAL);
        }
    }

    public void onTaskDestroyed() {
    }

    public abstract void onTaskFailed();

    public final void onTaskPaused() {
        final int i7 = 0;
        final ng0.g uploadTaskInfo$default = getUploadTaskInfo$default(this, false, 1, null);
        MainThread.runOnMainThread(new Function0(i7, this, uploadTaskInfo$default) { // from class: Xf0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28178a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f28179b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f28180c;

            {
                this.f28178a = i7;
                this.f28179b = this;
                this.f28180c = uploadTaskInfo$default;
            }

            public final Object invoke() {
                switch (this.f28178a) {
                    case 0:
                        break;
                    case 1:
                        q70.e eVar = (q70.e) this.f28179b;
                        if (eVar != null) {
                            q70.b.d(2, new JSONObject().put("tapIndex", -1), (String) null, (String) this.f28180c, eVar);
                        }
                        break;
                    default:
                        Function1 function1 = (Function1) this.f28179b;
                        if (function1 != null) {
                            function1.invoke((G) this.f28180c);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final void onTaskPending() {
        final ng0.g uploadTaskInfo$default = getUploadTaskInfo$default(this, false, 1, null);
        MainThread.runOnMainThread(new Function0(this, uploadTaskInfo$default) { // from class: Xf0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliUploadListenerTask f28176a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ng0.g f28177b;

            {
                this.f28176a = this;
                this.f28177b = uploadTaskInfo$default;
            }

            public final Object invoke() {
                return BiliUploadListenerTask.onTaskPending$lambda$0(this.f28176a, this.f28177b);
            }
        });
    }

    public final void onTaskStarted() {
        final int i7 = 0;
        final ng0.g uploadTaskInfo$default = getUploadTaskInfo$default(this, false, 1, null);
        MainThread.runOnMainThread(new Function0(i7, this, uploadTaskInfo$default) { // from class: Xf0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28181a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f28182b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f28183c;

            {
                this.f28181a = i7;
                this.f28182b = this;
                this.f28183c = uploadTaskInfo$default;
            }

            public final Object invoke() {
                switch (this.f28181a) {
                    case 0:
                        return BiliUploadListenerTask.onTaskStarted$lambda$0((BiliUploadListenerTask) this.f28182b, (ng0.g) this.f28183c);
                    default:
                        q70.e eVar = (q70.e) this.f28182b;
                        if (eVar != null) {
                            q70.b.d(2, new JSONObject().put("confirm", true).put("cancel", false), (String) null, (String) this.f28183c, eVar);
                        }
                        return Unit.INSTANCE;
                }
            }
        });
    }

    public abstract void onTaskSuccess();

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ void pause();

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ void pending();

    public final void printLog(@NotNull String str, boolean z6) {
        if (z6) {
            C8808b.a("[BiliUpload][Upload SDK] " + str);
        } else {
            C8808b.a("[Upload SDK] " + str);
        }
    }

    public final void printLogD(@NotNull String str, boolean z6) {
    }

    @Override // Xf0.InterfaceC3111q
    public void removeUploadCallback(@Nullable f fVar) {
        if (fVar == null) {
            return;
        }
        this.mCallbacks.remove(fVar);
        if (this.mCallbacks.isEmpty()) {
            clearUploadCallback();
        }
    }

    @Override // Xf0.InterfaceC3111q
    public void removeUploadMetaCheckListener(@Nullable g gVar) {
        if (gVar == null) {
            return;
        }
        this.mUploadMetaCheckListeners.remove(gVar);
        if (this.mUploadNetworkListeners.isEmpty()) {
            clearUploadMetaCheckListener();
        }
    }

    @Override // Xf0.InterfaceC3111q
    public void removeUploadNetworkListener(@Nullable h hVar) {
        if (hVar == null) {
            return;
        }
        this.mUploadNetworkListeners.remove(hVar);
        if (this.mUploadNetworkListeners.isEmpty()) {
            clearUploadNetworkListener();
        }
    }

    public final void reportTaskStepCancel(@NotNull ng0.g gVar) {
        if (isReportStepCancelEvent(gVar)) {
            reportTaskStepTime("cancel", "", "", gVar, "");
        } else {
            printLog$default(this, "reportTaskStepCancel return", false, 2, null);
        }
    }

    public final void setMForwardNetworkListener(@Nullable e eVar) {
        this.mForwardNetworkListener = eVar;
    }

    public final void setMForwardUploadCallback(@Nullable C8215c c8215c) {
        this.mForwardUploadCallback = c8215c;
    }

    public final void setMStepStartTime(long j7) {
        this.mStepStartTime = j7;
    }

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ void setMetaProfile(@NotNull String str);

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ void start();

    @Override // Xf0.InterfaceC3111q
    public abstract /* synthetic */ void startByRCToken(@NotNull String str);

    public abstract void stopLagDetect();
}
