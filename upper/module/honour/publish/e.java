package com.bilibili.upper.module.honour.publish;

import Xf0.InterfaceC3111q;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.bilibili.commons.io.FileUtils;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.videoupload.Profile;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.videocompile.BVideoCompiler;
import com.bilibili.studio.videoeditor.CaptionFx;
import com.bilibili.studio.videoeditor.annual.api.CodecInfo;
import com.bilibili.studio.videoeditor.generalrender.bean.GRContribute;
import com.bilibili.studio.videoeditor.generalrender.model.f;
import com.bilibili.studio.videoeditor.report.bean.UpperUsedFeature;
import com.bilibili.upper.contribute.up.entity.FileEditorInfo;
import com.bilibili.upper.contribute.up.entity.RequestAdd;
import com.bilibili.upper.module.honour.publish.k;
import com.bilibili.upper.module.honour.ui.KingHonourPublishActivity;
import com.bilibili.upper.module.honour.utils.KingHonourConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f113184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.honour.publish.a f113185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public RequestAdd f113186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f113187d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f113189f;

    @Nullable
    public KingHonourPublishActivity.b h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CodecInfo f113192j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f113188e = CoroutineScopeKt.CoroutineScope(JobKt.Job$default((Job) null, 1, (Object) null));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final k f113190g = (k) k.f113201b.getValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public KingHonourConstant.KingHonourFrom f113191i = KingHonourConstant.KingHonourFrom.GAME_TEMPLATE;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/e$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f113193a;

        static {
            int[] iArr = new int[KingHonourConstant.KingHonourFrom.values().length];
            try {
                iArr[KingHonourConstant.KingHonourFrom.GAME_FACTORY.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f113193a = iArr;
        }
    }

    public e(@NotNull Context context) {
        this.f113184a = context;
        CodecInfo codecInfo = new CodecInfo();
        codecInfo.bitRate = 12400000L;
        codecInfo.resolution = 1080;
        codecInfo.frameRate = 30;
        this.f113192j = codecInfo;
    }

    public static final Object a(e eVar, ng0.g gVar, String str, Continuation continuation) {
        RequestAdd requestAdd = eVar.f113186c;
        if (requestAdd != null) {
            requestAdd.cover = str;
        }
        if (requestAdd != null) {
            requestAdd.copyright = 1;
        }
        if (requestAdd != null) {
            requestAdd.tid = 172L;
        }
        if (requestAdd != null) {
            requestAdd.no_reprint = 1L;
        }
        if (requestAdd != null) {
            requestAdd.recreate = 1;
        }
        if (requestAdd != null) {
            requestAdd.tag = "王者荣耀,王者战报,精彩游戏操作,游戏混剪,手机游戏,电子竞技";
        }
        if (requestAdd != null) {
            requestAdd.relation_from = "wangzhezhanbao";
        }
        if (requestAdd != null) {
            RequestAdd.Video video = new RequestAdd.Video();
            RequestAdd requestAdd2 = eVar.f113186c;
            video.title = requestAdd2 != null ? requestAdd2.title : null;
            String strE = gVar.e();
            if (strE != null && strE.length() != 0) {
                video.cid = Long.parseLong(gVar.e());
            }
            video.filename = p.e(gVar.k());
            FileEditorInfo fileEditorInfo = new FileEditorInfo();
            fileEditorInfo.wzry_game_templates = CollectionsKt.p(CollectionsKt.mutableListOf(new String[]{String.valueOf(eVar.f113187d)}), ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
            UpperUsedFeature upperUsedFeature = null;
            if (a.f113193a[eVar.f113191i.ordinal()] == 1) {
                upperUsedFeature = new UpperUsedFeature(CaptionFx.BUBBLEPATH_FIELD_NUMBER, "editor");
                upperUsedFeature.addExtra("game_ids", "tencent_yxzj");
            }
            if (upperUsedFeature != null) {
                fileEditorInfo.features.add(upperUsedFeature);
            }
            video.editor = fileEditorInfo;
            Unit unit = Unit.INSTANCE;
            requestAdd.videos = CollectionsKt.mutableListOf(new RequestAdd.Video[]{video});
        }
        GRContribute gRContribute = new GRContribute(null, 0L, null, null, 15, null);
        gRContribute.setParam(JSON.toJSONString(eVar.f113186c));
        gRContribute.setTemplateId(gRContribute.getTemplateId());
        MediaType mediaType = MediaType.parse("application/json; charset=UTF-8");
        String param = gRContribute.getParam();
        String str2 = param;
        if (param == null) {
            str2 = "";
        }
        RequestBody requestBodyCreate = RequestBody.create(mediaType, str2);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        ((com.bilibili.studio.videoeditor.generalrender.model.a) ServiceGenerator.createService(com.bilibili.studio.videoeditor.generalrender.model.a.class)).add(BiliAccounts.get(eVar.f113184a).getAccessKey(), requestBodyCreate, "").enqueue(new g(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final Object b(e eVar, final String str, Continuation continuation) {
        eVar.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final i iVar = new i(safeContinuation);
        final k kVar = eVar.f113190g;
        List<InterfaceC3111q> list = kVar.f113202a;
        InterfaceC3111q interfaceC3111q = null;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                interfaceC3111q = null;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC3111q interfaceC3111q2 = (InterfaceC3111q) it.next();
                if (Intrinsics.areEqual(interfaceC3111q2 != null ? interfaceC3111q2.getFilePath() : null, str)) {
                    interfaceC3111q = interfaceC3111q2;
                    break;
                }
            }
        }
        if (interfaceC3111q != null) {
            interfaceC3111q.start();
        } else {
            String str2 = com.bilibili.studio.videoeditor.generalrender.model.f.f109601c;
            com.bilibili.studio.videoeditor.generalrender.model.f fVarF = f.a.f();
            Function1 function1 = new Function1(str, kVar, iVar) { // from class: com.bilibili.upper.module.honour.publish.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f113198a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final k f113199b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final i f113200c;

                {
                    this.f113198a = str;
                    this.f113199b = kVar;
                    this.f113200c = iVar;
                }

                public final Object invoke(Object obj) {
                    Object obj2;
                    Profile profile = (Profile) obj;
                    com.bilibili.lib.uploadengine.a aVar = com.bilibili.lib.uploadengine.a.f65021a;
                    String upload = profile.getUpload();
                    String meta = profile.getMeta();
                    String str3 = this.f113198a;
                    InterfaceC3111q interfaceC3111qB = com.bilibili.lib.uploadengine.a.b(str3, 24, upload, meta, null);
                    try {
                        Result.Companion companion = Result.Companion;
                        obj2 = Result.constructor-impl(Long.valueOf(FileUtils.sizeOf(new File(str3))));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (Result.isFailure-impl(obj2)) {
                        obj2 = null;
                    }
                    Long l7 = (Long) obj2;
                    long jLongValue = l7 != null ? l7.longValue() : 0L;
                    k kVar2 = this.f113199b;
                    if (interfaceC3111qB != null) {
                        interfaceC3111qB.addUploadCallback(new k.a(kVar2, interfaceC3111qB, str3, this.f113200c, jLongValue));
                    }
                    if (interfaceC3111qB != null) {
                        interfaceC3111qB.start();
                    }
                    if (interfaceC3111qB != null) {
                        if (kVar2.f113202a == null) {
                            kVar2.f113202a = new ArrayList();
                        }
                        List<InterfaceC3111q> list2 = kVar2.f113202a;
                        if (list2 != null) {
                            ((ArrayList) list2).add(interfaceC3111qB);
                        }
                    } else {
                        kVar2.getClass();
                    }
                    return Unit.INSTANCE;
                }
            };
            fVarF.getClass();
            com.bilibili.studio.videoeditor.generalrender.model.f.a(function1);
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void c(boolean z6) {
        Job job = this.f113189f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        com.bilibili.upper.module.honour.publish.a aVar = this.f113185b;
        if (aVar != null) {
            CoroutineScopeKt.cancel(aVar.f113180d, (CancellationException) null);
            if (aVar.f113179c != null) {
                BVideoCompiler.cancel();
            }
            if (z6 && aVar.f113179c != null) {
                BVideoCompiler.release();
            }
            aVar.f113179c = null;
        }
        k kVar = this.f113190g;
        List<InterfaceC3111q> list = kVar.f113202a;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                k.a((InterfaceC3111q) it.next());
            }
        }
        List<InterfaceC3111q> list2 = kVar.f113202a;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        kVar.f113202a = null;
    }
}
