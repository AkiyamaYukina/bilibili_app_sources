package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import Dy0.C1610f;
import F3.W5;
import Ky0.RunnableC2469k;
import Ky0.a0;
import aD0.InterfaceC3195a;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.moudle.caption.tts.bean.CaptionTtsInfo;
import com.bilibili.studio.editor.moudle.caption.tts.bean.TtsServerEntity;
import com.bilibili.studio.editor.moudle.caption.tts.bean.TtsTask;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.tts.TtsManager;
import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.C8379B;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/BiliEditorCaptionTtsViewModel.class */
public final class BiliEditorCaptionTtsViewModel extends Yv0.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Float[] f106644o = {Float.valueOf(0.0f), Float.valueOf(9.9f), Float.valueOf(19.8f), Float.valueOf(29.7f), Float.valueOf(39.6f), Float.valueOf(49.5f), Float.valueOf(59.4f), Float.valueOf(69.3f), Float.valueOf(79.2f), Float.valueOf(89.1f), Float.valueOf(99.0f), Float.valueOf(100.0f)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Ly0.H f106645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Ex0.n f106646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Ex0.c f106647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final mx0.b f106648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f106649g;

    @Nullable
    public Job h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f106650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f106651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public com.bilibili.bililive.infra.hierarchy.d f106652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f106653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TtsTask f106654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f106655n;

    @Inject
    public BiliEditorCaptionTtsViewModel(@NotNull Application application, @NotNull Ly0.H h, @NotNull Ex0.n nVar, @NotNull Ex0.c cVar) {
        super(application);
        this.f106645c = h;
        this.f106646d = nVar;
        this.f106647e = cVar;
        this.f106648f = new mx0.b();
        this.f106649g = new MutableLiveData<>();
        this.f106651j = 10;
        this.f106653l = LazyKt.lazy(new W5(6));
    }

    public static Map K0(ix0.a aVar, long j7) {
        Pair pair = TuplesKt.to("speed_level", Integer.valueOf(aVar.c.intValue()));
        Pair pair2 = TuplesKt.to("pitch_level", 0);
        String str = aVar.d;
        String str2 = str;
        if (str == null) {
            str2 = "tianmei";
        }
        Pair pair3 = TuplesKt.to("font_name", str2);
        Pair pair4 = TuplesKt.to("volume", 50);
        Pair pair5 = TuplesKt.to("encode_type", "mp3");
        Pair pair6 = TuplesKt.to("sample_rate", 24000);
        String str3 = aVar.e;
        String str4 = str3;
        if (str3 == null) {
            str4 = "bili";
        }
        return MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, TuplesKt.to("voice_engine", str4), TuplesKt.to("model_id", "tts_pink"), TuplesKt.to("request_id", Long.valueOf(j7))});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0() {
        Q0();
        Ly0.H h = this.f106645c;
        h.f14902b.a();
        a0 a0Var = h.f14904d;
        a0Var.f13078e.j();
        RunnableC2469k runnableC2469k = new RunnableC2469k(a0Var, 0);
        ez0.a aVar = a0Var.f13074a;
        C1610f c1610f = (C1610f) aVar.E.getValue();
        C1610f c1610f2 = c1610f;
        if (c1610f == null) {
            c1610f2 = new C1610f(false, null, FragmentContainerModal.MODAL_ALL);
        }
        aVar.E.setValue(new C1610f(false, runnableC2469k, c1610f2.f3293c));
        a0Var.p();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ix0.a, java.lang.Object] */
    public final ix0.a L0(TtsServerEntity.TtsServerBean ttsServerBean, boolean z6) {
        List<CaptionInfo> listM0 = M0(z6);
        ?? obj = new Object();
        ((ix0.a) obj).c = 0;
        ArrayList arrayList = new ArrayList();
        if (listM0 != null) {
            Iterator<T> it = listM0.iterator();
            while (it.hasNext()) {
                arrayList.add(((CaptionInfo) it.next()).text);
            }
        }
        ((ix0.a) obj).a = arrayList;
        ((ix0.a) obj).c = Integer.valueOf(ttsServerBean.speech_rate);
        ((ix0.a) obj).d = ttsServerBean.voice;
        ((ix0.a) obj).e = ttsServerBean.voice_type == 0 ? "ali" : "bili";
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo> M0(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L6b
            r0 = r4
            Ly0.H r0 = r0.f106645c
            r7 = r0
            r0 = r7
            boolean r0 = r0.n()
            r5 = r0
            r0 = r7
            Ly0.t r0 = r0.f14905e
            Ex0.c r0 = r0.f14982c
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r0 = r0.f4806b
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L24
            r0 = r7
            java.util.List r0 = r0.getCaptionInfoList()
            r6 = r0
        L24:
            r0 = r6
            if (r0 == 0) goto L65
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r6 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L3d:
            r0 = r7
            r6 = r0
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L69
            r0 = r8
            java.lang.Object r0 = r0.next()
            r6 = r0
            r0 = r6
            com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo r0 = (com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo) r0
            boolean r0 = r0.isAsrCaption()
            r1 = r5
            if (r0 != r1) goto L3d
            r0 = r7
            r1 = r6
            boolean r0 = r0.add(r1)
            goto L3d
        L65:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r6 = r0
        L69:
            r0 = r6
            return r0
        L6b:
            r0 = r4
            Ly0.H r0 = r0.f106645c
            Ly0.t r0 = r0.f14905e
            P50.p r0 = r0.f14993o
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L7f
        L7a:
            r0 = 0
            r6 = r0
            goto Lb1
        L7f:
            r0 = r6
            java.lang.String r1 = "caption_info"
            java.lang.Object r0 = com.bilibili.studio.videoeditor.extension.h.a(r0, r1)
            com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo r0 = (com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo) r0
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "getCurCaptionInfo mCaptionInfo="
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "EditorCaptionTtsUseCase"
            r1 = r7
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.e(r0, r1)
            r0 = r6
            if (r0 != 0) goto Lac
            goto L7a
        Lac:
            r0 = r6
            com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo r0 = r0.mo9886clone()
            r6 = r0
        Lb1:
            r0 = r6
            if (r0 == 0) goto Lba
            r0 = r6
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
        Lba:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.BiliEditorCaptionTtsViewModel.M0(boolean):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N0() {
        this.h = BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorCaptionTtsViewModel$initProgressUI$1(this, null), 2, (Object) null);
    }

    public final boolean O0(int i7, long j7) {
        TtsTask ttsTask;
        TtsTask ttsTask2 = this.f106654m;
        if (ttsTask2 != null && ttsTask2.getTaskId() == j7 && (ttsTask = this.f106654m) != null && ttsTask.getTaskType() == i7) {
            return true;
        }
        TtsTask ttsTask3 = this.f106654m;
        BLog.i("BiliEditorTtsViewModel", "startConfirmTextDubbing onSuccess，任务不匹配，不执行后续逻辑，id=" + j7 + ",mCurTtsTask=" + (ttsTask3 != null ? Long.valueOf(ttsTask3.getTaskId()) : null) + ",ttsTaskType=" + i7);
        return false;
    }

    public final boolean P0(@NotNull Context context, boolean z6) {
        if (!Pw0.a.a(BiliContext.application())) {
            ToastHelper.showToastShort(context, 2131842025);
            return false;
        }
        List<CaptionInfo> listM0 = M0(z6);
        if (listM0 == null) {
            return false;
        }
        for (CaptionInfo captionInfo : listM0) {
            String str = captionInfo.text;
            if (str != null && str.length() != 0 && captionInfo.text.length() > 95) {
                ToastHelper.showToastShort(context, 2131842050);
                return false;
            }
        }
        return true;
    }

    public final void Q0() {
        BLog.i("BiliEditorTtsViewModel", "tts面板 release");
        this.f106654m = null;
        com.bilibili.bililive.infra.hierarchy.d dVar = this.f106652k;
        if (dVar != null) {
            dVar.b();
        }
        if (this.f106652k != null) {
            aD0.f.d().a("release");
        }
        this.f106652k = null;
        TtsManager ttsManager = (TtsManager) this.f106653l.getValue();
        CoroutineScopeKt.cancel$default(ttsManager.f108316a, (CancellationException) null, 1, (Object) null);
        ((LinkedHashMap) ttsManager.f108317b).clear();
        mx0.b bVar = this.f106648f;
        bVar.d.setValue(null);
        bVar.c.setValue(null);
    }

    public final void R0(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f106655n;
        if (zw0.b.j()) {
            Xz0.d dVar = Xz0.d.f28458a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf((jCurrentTimeMillis - j7) / 1000.0d)}, 1));
            dVar.getClass();
            Xz0.d.u(str, str2);
        }
    }

    public final void S0() {
        BLog.i("BiliEditorTtsViewModel", "requestTtsData");
        mx0.b bVar = this.f106648f;
        bVar.getClass();
        String accessToken = null;
        AccountService accountService = (AccountService) BLRouter.get$default(BLRouter.INSTANCE, AccountService.class, (String) null, 2, (Object) null);
        if (accountService != null) {
            accessToken = accountService.getAccessToken();
        }
        ((kx0.a) ServiceGenerator.createService(kx0.a.class)).getEditorTtsServerData(accessToken).enqueue(new mx0.a(bVar));
        BLog.e("UpperEditorTtsManager", "getTtsData");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void T0(@NotNull Context context, final float f7, boolean z6, @Nullable final TtsServerEntity.TtsServerBean ttsServerBean) {
        BLog.i("BiliEditorTtsViewModel", "startConfirmTextDubbing");
        V0();
        ArrayList arrayList = new ArrayList();
        final List<CaptionInfo> listM0 = M0(z6);
        mx0.b bVar = this.f106648f;
        if (ttsServerBean != null && ttsServerBean.isOriginalFilm) {
            List<? extends Pair<? extends CaptionInfo, String>> listAsMutableList = TypeIntrinsics.asMutableList(arrayList);
            BLog.i("BiliEditorTtsViewModel", "applyDisabled--禁用--删除tts");
            if (listM0 != null) {
                List<CaptionInfo> list = listM0;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Pair((CaptionInfo) it.next(), ""));
                }
                listAsMutableList.addAll(arrayList2);
            }
            if (this.f106645c.i(listAsMutableList, null, f7)) {
                bVar.d.postValue(3);
                return;
            } else {
                bVar.d.postValue(4);
                return;
            }
        }
        final List listAsMutableList2 = TypeIntrinsics.asMutableList(arrayList);
        if (ttsServerBean == null) {
            bVar.d.postValue(1);
            return;
        }
        ix0.a aVarL0 = L0(ttsServerBean, z6);
        long jCurrentTimeMillis = System.currentTimeMillis();
        final int i7 = 0;
        com.bilibili.studio.editor.tts.g gVar = new com.bilibili.studio.editor.tts.g(context, aVarL0.a, null, K0(aVarL0, jCurrentTimeMillis), 12, new Function1(listM0, this, listAsMutableList2, ttsServerBean, f7) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f106662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorCaptionTtsViewModel f106663b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f106664c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final TtsServerEntity.TtsServerBean f106665d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final float f106666e;

            {
                this.f106662a = listM0;
                this.f106663b = this;
                this.f106664c = listAsMutableList2;
                this.f106665d = ttsServerBean;
                this.f106666e = f7;
            }

            public final Object invoke(Object obj) {
                Unit unit;
                List list2 = this.f106662a;
                List<? extends Pair<? extends CaptionInfo, String>> list3 = this.f106664c;
                List list4 = (List) obj;
                long requestId = 0;
                if (list2 != null) {
                    int i8 = 0;
                    requestId = 0;
                    for (Object obj2 : list2) {
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        CaptionInfo captionInfo = (CaptionInfo) obj2;
                        captionInfo.text = ((TtsInputBean) ((Pair) list4.get(i8)).getFirst()).getText();
                        requestId = ((TtsInputBean) ((Pair) list4.get(i8)).getFirst()).getRequestId();
                        list3.add(new Pair(captionInfo, ((TtsInputBean) ((Pair) list4.get(i8)).getFirst()).getPath()));
                        i8++;
                    }
                }
                BiliEditorCaptionTtsViewModel biliEditorCaptionTtsViewModel = this.f106663b;
                if (biliEditorCaptionTtsViewModel.O0(2, requestId)) {
                    biliEditorCaptionTtsViewModel.f106654m = null;
                    boolean zI = biliEditorCaptionTtsViewModel.f106645c.i(list3, this.f106665d, this.f106666e);
                    mx0.b bVar2 = biliEditorCaptionTtsViewModel.f106648f;
                    if (zI) {
                        bVar2.d.postValue(2);
                    } else {
                        bVar2.d.postValue(1);
                    }
                    biliEditorCaptionTtsViewModel.R0("success");
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, new Function2(this, i7) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f106667a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f106668b;

            {
                this.f106667a = i7;
                this.f106668b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 504
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.H.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, 4);
        this.f106654m = new TtsTask(jCurrentTimeMillis, 2);
        ((TtsManager) this.f106653l.getValue()).f(gVar);
        this.f106655n = System.currentTimeMillis();
        if (zw0.b.j()) {
            Xz0.d.f28458a.getClass();
            Xz0.d.u("start", "");
        }
    }

    public final void U0(@NotNull final Context context, final float f7, @NotNull final TtsServerEntity.TtsServerBean ttsServerBean) {
        V0();
        if (ttsServerBean.isOriginalFilm) {
            this.f106654m = null;
            return;
        }
        final ix0.a aVarL0 = L0(ttsServerBean, false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f106654m = new TtsTask(jCurrentTimeMillis, 1);
        this.f106655n = System.currentTimeMillis();
        if (zw0.b.j()) {
            Xz0.d.f28458a.getClass();
            Xz0.d.u("start", "");
        }
        ((TtsManager) this.f106653l.getValue()).f(new com.bilibili.studio.editor.tts.g(context, aVarL0.a, null, K0(aVarL0, jCurrentTimeMillis), 12, new Function1(aVarL0, ttsServerBean, this, f7) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.I

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ix0.a f106669a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TtsServerEntity.TtsServerBean f106670b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliEditorCaptionTtsViewModel f106671c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final float f106672d;

            {
                this.f106669a = aVarL0;
                this.f106670b = ttsServerBean;
                this.f106671c = this;
                this.f106672d = f7;
            }

            public final Object invoke(Object obj) {
                Unit unit;
                List list;
                InterfaceC3195a interfaceC3195a;
                ix0.a aVar = this.f106669a;
                TtsServerEntity.TtsServerBean ttsServerBean2 = this.f106670b;
                BiliEditorCaptionTtsViewModel biliEditorCaptionTtsViewModel = this.f106671c;
                float f8 = this.f106672d;
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                List list3 = aVar.a;
                long requestId = -1;
                if (list3 != null) {
                    int i7 = 0;
                    requestId = -1;
                    for (Object obj2 : list3) {
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        TtsInputBean ttsInputBean = (TtsInputBean) ((Pair) list2.get(i7)).getFirst();
                        requestId = ((TtsInputBean) ((Pair) list2.get(i7)).getFirst()).getRequestId();
                        arrayList.add(new CaptionTtsInfo(ttsInputBean.getPath(), ttsInputBean.getText(), 0L));
                        i7++;
                    }
                }
                aVar.b = arrayList;
                ttsServerBean2.downloadState = 2;
                if (biliEditorCaptionTtsViewModel.O0(1, requestId)) {
                    if (Intrinsics.areEqual(ttsServerBean2, biliEditorCaptionTtsViewModel.f106648f.e.getValue()) && (list = aVar.b) != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String filePath = ((CaptionTtsInfo) it.next()).getFilePath();
                            if (filePath != null) {
                                BLog.i("BiliEditorTtsViewModel", "playTtsAudio～filePath=" + filePath + ",volume=" + f8);
                                com.bilibili.bililive.infra.hierarchy.d dVar = biliEditorCaptionTtsViewModel.f106652k;
                                if (dVar == null || dVar.a()) {
                                    BLog.i("BiliEditorTtsViewModel", "当前音频正在播放中～不进行重复播放");
                                } else {
                                    com.bilibili.bililive.infra.hierarchy.d dVar2 = biliEditorCaptionTtsViewModel.f106652k;
                                    if (dVar2 != null) {
                                        synchronized (dVar2) {
                                            aD0.f.d().i(1, filePath, BiliContext.application());
                                        }
                                    }
                                    if (biliEditorCaptionTtsViewModel.f106652k != null && (interfaceC3195a = aD0.f.d().f31104c) != null) {
                                        interfaceC3195a.setVolume(f8, f8);
                                    }
                                }
                            }
                        }
                    }
                    biliEditorCaptionTtsViewModel.f106648f.f.postValue(ttsServerBean2);
                    biliEditorCaptionTtsViewModel.f106654m = null;
                    biliEditorCaptionTtsViewModel.R0("success");
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, new Function2(this, ttsServerBean, context) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.J

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionTtsViewModel f106673a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TtsServerEntity.TtsServerBean f106674b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Context f106675c;

            {
                this.f106673a = this;
                this.f106674b = ttsServerBean;
                this.f106675c = context;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object invoke(Object obj, Object obj2) {
                Unit unit;
                Context context2 = this.f106675c;
                long jLongValue = ((Long) obj).longValue();
                BiliEditorCaptionTtsViewModel biliEditorCaptionTtsViewModel = this.f106673a;
                if (biliEditorCaptionTtsViewModel.O0(1, jLongValue)) {
                    biliEditorCaptionTtsViewModel.f106654m = null;
                    TtsServerEntity.TtsServerBean ttsServerBean2 = (TtsServerEntity.TtsServerBean) biliEditorCaptionTtsViewModel.f106648f.e.getValue();
                    if (ttsServerBean2 != null && this.f106674b.id == ttsServerBean2.id) {
                        ToastHelper.showToastShort(context2, 2131842261);
                    }
                    biliEditorCaptionTtsViewModel.R0("fail");
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, 4));
    }

    public final void V0() {
        com.bilibili.bililive.infra.hierarchy.d dVar;
        com.bilibili.bililive.infra.hierarchy.d dVar2 = this.f106652k;
        C8379B.a("stopTtsAudioPlay～isPlaying=", dVar2 != null ? Boolean.valueOf(dVar2.a()) : null, "BiliEditorTtsViewModel");
        com.bilibili.bililive.infra.hierarchy.d dVar3 = this.f106652k;
        if (dVar3 == null || !dVar3.a() || (dVar = this.f106652k) == null) {
            return;
        }
        dVar.b();
    }
}
