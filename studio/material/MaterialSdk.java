package com.bilibili.studio.material;

import J3.C2337e1;
import android.app.Application;
import androidx.room.B;
import com.bilibili.studio.material.MaterialConfig;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.internal.EngineType;
import com.bilibili.studio.material.internal.ProcessorData;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.j;
import com.bilibili.studio.material.module.DefaultProcessor;
import com.bilibili.studio.material.module.background.BackgroundProcessor;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialSdk.class */
public final class MaterialSdk {

    @NotNull
    public static final MaterialSdk INSTANCE = new MaterialSdk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f108473a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<String> f108474b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Set<String> f108475c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<MaterialType, IMaterialProcessor<? extends ProcessorData>> f108476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<IStrategy<ProcessorItem>> f108477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy f108478f;

    /* JADX INFO: renamed from: com.bilibili.studio.material.MaterialSdk$tryDeleteUnusedZip$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialSdk$tryDeleteUnusedZip$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MaterialType $type;
        final List<String> $urls;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MaterialType materialType, List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = materialType;
            this.$urls = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$type, this.$urls, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IMaterialProcessor iMaterialProcessor = (IMaterialProcessor) MaterialSdk.f108476d.get(this.$type);
            if (iMaterialProcessor == null) {
                return Unit.INSTANCE;
            }
            for (String str : this.$urls) {
                if (str != null && str.length() != 0) {
                    iMaterialProcessor.tryDeleteUnusedZip(str);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.bilibili.studio.material.module.DefaultProcessor, com.bilibili.studio.material.module.bgm.BgmProcessor, java.lang.Object] */
    static {
        Pair pair = TuplesKt.to(MaterialType.Transition.INSTANCE, new DefaultProcessor());
        Pair pair2 = TuplesKt.to(MaterialType.HumanEffect.INSTANCE, new com.bilibili.studio.material.module.humaneffect.a());
        Pair pair3 = TuplesKt.to(MaterialType.Effect.INSTANCE, new DefaultProcessor());
        Pair pair4 = TuplesKt.to(MaterialType.Video.INSTANCE, new DefaultProcessor());
        Pair pair5 = TuplesKt.to(MaterialType.VideoAnimation.INSTANCE, new DefaultProcessor());
        Pair pair6 = TuplesKt.to(MaterialType.Sticker.INSTANCE, new DefaultProcessor());
        Pair pair7 = TuplesKt.to(MaterialType.Filter.INSTANCE, new DefaultProcessor());
        Pair pair8 = TuplesKt.to(MaterialType.Font.INSTANCE, new DefaultProcessor());
        MaterialType.Bgm bgm = MaterialType.Bgm.INSTANCE;
        ?? defaultProcessor = new DefaultProcessor();
        defaultProcessor.f108562o = new MaterialConfig.MaterialConfigBuilder().filePath(UtilsKt.getMusicDirPath()).build();
        Pair pair9 = TuplesKt.to(bgm, (Object) defaultProcessor);
        MaterialType.Audio audio = MaterialType.Audio.INSTANCE;
        DefaultProcessor defaultProcessor2 = new DefaultProcessor();
        ((sA0.a) defaultProcessor2).o = new MaterialConfig.MaterialConfigBuilder().filePath(UtilsKt.getMusicDirPath()).build();
        Pair pair10 = TuplesKt.to(audio, defaultProcessor2);
        Pair pair11 = TuplesKt.to(MaterialType.Flower.INSTANCE, new DefaultProcessor());
        Pair pair12 = TuplesKt.to(MaterialType.CaptionAnimation.INSTANCE, new DefaultProcessor());
        Pair pair13 = TuplesKt.to(MaterialType.CaptionTemplate.INSTANCE, new DefaultProcessor());
        Pair pair14 = TuplesKt.to(MaterialType.Background.INSTANCE, new BackgroundProcessor());
        Pair pair15 = TuplesKt.to(MaterialType.a.f108495c, new DefaultProcessor());
        MaterialType.Rhythms rhythms = MaterialType.Rhythms.INSTANCE;
        DefaultProcessor defaultProcessor3 = new DefaultProcessor();
        ((rA0.a) defaultProcessor3).o = new MaterialConfig.MaterialConfigBuilder().filePath(UtilsKt.getMusicDirPath()).build();
        f108476d = new ConcurrentHashMap<>(MapsKt.mutableMapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, TuplesKt.to(rhythms, defaultProcessor3)}));
        f108477e = new ArrayList();
        f108478f = LazyKt.lazy(new C2337e1(9));
    }

    public static final void access$handleMaterialState(MaterialSdk materialSdk, j jVar, IDownloadMaterialListener iDownloadMaterialListener) {
        FailReason failReason;
        materialSdk.getClass();
        if (jVar instanceof j.d) {
            BLog.d("MaterialSdk", "handleMaterialState Start");
            if (iDownloadMaterialListener != null) {
                iDownloadMaterialListener.onStart();
                return;
            }
            return;
        }
        if (jVar instanceof j.a) {
            i iVar = jVar.f108558a;
            long j7 = iVar.f108527c;
            BLog.d("MaterialSdk", "handleMaterialState Downloading, progress = " + (j7 == 0 ? 0.0d : UtilsKt.ratio(iVar.f108526b, j7)));
            if (iDownloadMaterialListener != null) {
                i iVar2 = jVar.f108558a;
                long j8 = iVar2.f108527c;
                double dRatio = j8 == 0 ? 0.0d : UtilsKt.ratio(iVar2.f108526b, j8);
                i iVar3 = jVar.f108558a;
                iDownloadMaterialListener.onProgress(dRatio, (int) iVar3.f108526b, (int) iVar3.f108527c);
            }
            if (iDownloadMaterialListener != null) {
                iDownloadMaterialListener.onSpeed(jVar.f108558a.f108525a);
                return;
            }
            return;
        }
        if (!(jVar instanceof j.c)) {
            if (jVar instanceof j.e) {
                BLog.e("MaterialSdk", "handleMaterialState Stopped");
                if (iDownloadMaterialListener != null) {
                    iDownloadMaterialListener.onCancel();
                    return;
                }
                return;
            }
            return;
        }
        if (!(iDownloadMaterialListener instanceof ISingleMaterialListener)) {
            if (iDownloadMaterialListener instanceof IMultiMaterialListener) {
                BLog.i("MaterialSdk", "handleMaterialState MultiResult");
                ((IMultiMaterialListener) iDownloadMaterialListener).onResult(((j.c) jVar).f108559b);
                return;
            }
            return;
        }
        Result result = (Result) CollectionsKt.firstOrNull(((j.c) jVar).f108559b.getResults());
        if (result != null && result.isSuccess()) {
            BLog.i("MaterialSdk", "handleMaterialState SingleResult isSuccess");
            ((ISingleMaterialListener) iDownloadMaterialListener).onSuccess(result.getId(), result.getUrl(), result.getFilePath(), result.getFileName());
            return;
        }
        defpackage.a.b(" handleMaterialState SingleResult isFail -> failReason=", (result == null || (failReason = result.getFailReason()) == null) ? null : failReason.getMsg(), "MaterialSdk");
        ISingleMaterialListener iSingleMaterialListener = (ISingleMaterialListener) iDownloadMaterialListener;
        String id = result != null ? result.getId() : null;
        String url = result != null ? result.getUrl() : null;
        FailReason failReason2 = null;
        if (result != null) {
            failReason2 = result.getFailReason();
        }
        iSingleMaterialListener.onFailed(id, url, failReason2);
    }

    public final MaterialTask a(CoroutineScope coroutineScope, MaterialRequest materialRequest) {
        MaterialTask materialTaskB;
        synchronized (this) {
            if (!f108473a.get()) {
                throw new IllegalStateException("Please call ResourceSdk.init() method first");
            }
            materialRequest.dirFilterBlackList(f108474b);
            materialRequest.montageSupportMaterialTypes(f108475c);
            materialRequest.extraStrategies(f108477e);
            com.bilibili.studio.material.internal.c cVar = new com.bilibili.studio.material.internal.c(f108476d);
            Lazy lazy = f108478f;
            materialTaskB = ((com.bilibili.studio.material.internal.a) lazy.getValue()).b(new MaterialTask(coroutineScope, materialRequest, cVar, (com.bilibili.studio.material.internal.a) lazy.getValue()));
        }
        return materialTaskB;
    }

    @NotNull
    public final MaterialSdk addExtraStrategy(@NotNull IStrategy<ProcessorItem> iStrategy) {
        if (!f108473a.get()) {
            ((ArrayList) f108477e).add(iStrategy);
        }
        return this;
    }

    @NotNull
    public final MaterialSdk addFilterDirBlackList(@NotNull String str) {
        if (!f108473a.get()) {
            f108474b.add(str);
        }
        return this;
    }

    @NotNull
    public final MaterialSdk addMaterialConfig(@NotNull MaterialType materialType, @NotNull MaterialConfig materialConfig) {
        if (!f108473a.get()) {
            ConcurrentHashMap<MaterialType, IMaterialProcessor<? extends ProcessorData>> concurrentHashMap = f108476d;
            if (concurrentHashMap.containsKey(materialType)) {
                concurrentHashMap.get(materialType).setConfig(materialConfig);
            } else {
                BLog.w("please add processor for " + materialType + " first");
            }
        }
        return this;
    }

    @NotNull
    public final MaterialSdk addMaterialProcessor(@NotNull MaterialType materialType, @NotNull IMaterialProcessor<? extends ProcessorData> iMaterialProcessor) {
        if (!f108473a.get()) {
            ConcurrentHashMap<MaterialType, IMaterialProcessor<? extends ProcessorData>> concurrentHashMap = f108476d;
            if (concurrentHashMap.containsKey(materialType)) {
                BLog.w("do not add processor for " + materialType + " twice");
            } else {
                concurrentHashMap.put(materialType, iMaterialProcessor);
            }
        }
        return this;
    }

    @NotNull
    public final MaterialSdk addMontageSupportMaterialTypes(@NotNull List<String> list) {
        if (!f108473a.get()) {
            CollectionsKt.addAll(f108475c, list);
        }
        return this;
    }

    public final MaterialTask b(CoroutineScope coroutineScope, String str, String str2, MaterialType materialType, String str3, EngineType engineType, ISingleMaterialListener iSingleMaterialListener) {
        String name = materialType.getName();
        StringBuilder sb = new StringBuilder("downloadSingleMaterial-> bizFrom = ");
        sb.append(str3);
        sb.append(", engineType = ");
        sb.append(engineType);
        sb.append(", materialType = ");
        B.a(name, ", materialId = ", str, ", materialUrl = ", sb);
        sb.append(str2);
        BLog.i("MaterialSdk", sb.toString());
        MaterialRequest materialRequestAdd = new MaterialRequest().add(new Request(str, str2, materialType));
        materialRequestAdd.setBizFrom(str3);
        materialRequestAdd.engineType(engineType);
        MaterialTask materialTaskA = a(coroutineScope, materialRequestAdd);
        FlowKt.launchIn(FlowKt.onEach(MaterialTask.state$default(materialTaskA, 0L, 1, null), new MaterialSdk$downloadSingleMaterial$1$1(iSingleMaterialListener, null)), coroutineScope);
        materialTaskA.start();
        return materialTaskA;
    }

    @NotNull
    public final MaterialTask downloadMultiMaterial(@NotNull CoroutineScope coroutineScope, @NotNull MaterialRequest materialRequest, @NotNull IMultiMaterialListener iMultiMaterialListener) {
        bilibili.live.app.service.resolver.c.a(materialRequest.getRequests().size(), "downloadMultiMaterial-> request = ", "MaterialSdk");
        MaterialTask materialTaskA = a(coroutineScope, materialRequest);
        materialTaskA.resetState();
        FlowKt.launchIn(FlowKt.onEach(MaterialTask.state$default(materialTaskA, 0L, 1, null), new MaterialSdk$downloadMultiMaterial$1$1(iMultiMaterialListener, null)), coroutineScope);
        materialTaskA.start();
        return materialTaskA;
    }

    @NotNull
    public final MaterialTask downloadSingleMaterialById(@NotNull CoroutineScope coroutineScope, @NotNull String str, @NotNull MaterialType materialType, @NotNull String str2, @NotNull EngineType engineType, @Nullable ISingleMaterialListener iSingleMaterialListener) {
        return b(coroutineScope, str, "", materialType, str2, engineType, iSingleMaterialListener);
    }

    @NotNull
    public final MaterialTask downloadSingleMaterialByUrl(@NotNull CoroutineScope coroutineScope, @NotNull String str, @NotNull MaterialType materialType, @NotNull String str2, @NotNull EngineType engineType, @Nullable ISingleMaterialListener iSingleMaterialListener) {
        return b(coroutineScope, "", str, materialType, str2, engineType, iSingleMaterialListener);
    }

    public final void init(@NotNull Application application) {
        AtomicBoolean atomicBoolean = f108473a;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.compareAndSet(false, true);
    }

    public final boolean isExist(@NotNull String str, @NotNull MaterialType materialType) {
        boolean zIsExist;
        synchronized (this) {
            IMaterialProcessor<? extends ProcessorData> iMaterialProcessor = f108476d.get(materialType);
            zIsExist = iMaterialProcessor != null ? iMaterialProcessor.isExist(str) : false;
            BLog.d(UtilsKt.Material_TAG, str + " " + materialType + " isExist = " + zIsExist);
        }
        return zIsExist;
    }

    public final boolean isInitialized() {
        return f108473a.get();
    }

    @NotNull
    public final MaterialSdk reset() {
        f108473a.set(false);
        f108475c.clear();
        ((ArrayList) f108474b).clear();
        return this;
    }

    @Nullable
    public final Object tryDeleteAllUnusedZip(@NotNull Continuation<? super Unit> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        Iterator<T> it = f108476d.entrySet().iterator();
        while (it.hasNext()) {
            ((IMaterialProcessor) ((Map.Entry) it.next()).getValue()).tryDeleteAllUnusedZip();
        }
        Result.Companion companion = kotlin.Result.Companion;
        Unit unit = Unit.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.constructor-impl(unit));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : unit;
    }

    public final void tryDeleteUnusedZip(@Nullable List<String> list, @NotNull MaterialType materialType) {
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        ExecutorService executorService = gA0.a.a;
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(gA0.a.c), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(materialType, list, null), 3, (Object) null);
    }
}
