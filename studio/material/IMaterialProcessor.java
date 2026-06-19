package com.bilibili.studio.material;

import J3.C2328b1;
import J3.C2331c1;
import J3.X0;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.material.MaterialConfig;
import com.bilibili.studio.material.internal.ProcessorData;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.report.ResultCode;
import com.bilibili.studio.material.util.UtilsKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/IMaterialProcessor.class */
public abstract class IMaterialProcessor<T extends ProcessorData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f108441a = LazyKt.lazy(new X0(7));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f108442b = LazyKt.lazy(new Fe1.b(9));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public MaterialConfig f108443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f108444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f108445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f108446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f108447g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f108448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f108449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f108450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f108451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f108452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f108453n;

    /* JADX INFO: renamed from: com.bilibili.studio.material.IMaterialProcessor$process$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/IMaterialProcessor$process$1.class */
    public static final class AnonymousClass1<T extends ProcessorData> extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final IMaterialProcessor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IMaterialProcessor<T> iMaterialProcessor, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = iMaterialProcessor;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IMaterialProcessor.a(this.this$0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.material.IMaterialProcessor$processInternal$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/IMaterialProcessor$processInternal$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Result>>, Object> {
        final ProcessorData $data;
        final SendChannel<h> $sendChannel;
        private Object L$0;
        int label;
        final IMaterialProcessor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(IMaterialProcessor<T> iMaterialProcessor, ProcessorData processorData, SendChannel<? super h> sendChannel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = iMaterialProcessor;
            this.$data = processorData;
            this.$sendChannel = sendChannel;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$data, this.$sendChannel, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Result>> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                IMaterialProcessor.access$reportStart(this.this$0, this.$data);
                Iterator<T> it = this.$data.getItems().iterator();
                while (it.hasNext()) {
                    ((ProcessorItem) it.next()).getReportData().i = System.currentTimeMillis();
                }
                IMaterialProcessor<T> iMaterialProcessor = this.this$0;
                List<ProcessorItem> items = this.$data.getItems();
                MaterialConfig config = this.this$0.getConfig();
                this.L$0 = coroutineScope;
                this.label = 1;
                if (iMaterialProcessor.batchPreProcess(items, config, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = (List) obj;
                    IMaterialProcessor.access$reportResult(this.this$0, this.$data);
                    return list;
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
            }
            BLog.i(UtilsKt.Material_TAG, "idToUrlStrategy: " + this.this$0.getMaterialType());
            List<ProcessorItem> items2 = this.$data.getItems();
            IMaterialProcessor<T> iMaterialProcessor2 = this.this$0;
            SendChannel<h> sendChannel = this.$sendChannel;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items2, 10));
            Iterator<T> it2 = items2.iterator();
            while (it2.hasNext()) {
                arrayList.add(BuildersKt.async$default(coroutineScope, gA0.a.c, (CoroutineStart) null, new IMaterialProcessor$processInternal$2$deferredResults$1$1(iMaterialProcessor2, (ProcessorItem) it2.next(), sendChannel, null), 2, (Object) null));
            }
            this.L$0 = null;
            this.label = 2;
            Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            obj = objAwaitAll;
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list2 = (List) obj;
            IMaterialProcessor.access$reportResult(this.this$0, this.$data);
            return list2;
        }
    }

    public IMaterialProcessor() {
        MaterialType materialType = getMaterialType();
        this.f108443c = new MaterialConfig.MaterialConfigBuilder().filePath(UtilsKt.getDefaultDirPath() + File.separator + materialType.getName().toLowerCase(Locale.getDefault())).build();
        this.f108444d = true;
        this.f108445e = LazyKt.lazy(new Fe1.c(9));
        this.f108446f = LazyKt.lazy(new Fe1.d(11));
        this.f108447g = LazyKt.lazy(new Fe1.e(9));
        this.h = LazyKt.lazy(new Fe1.f(10));
        this.f108448i = LazyKt.lazy(new C2328b1(8));
        this.f108449j = LazyKt.lazy(new C2331c1(7));
        this.f108450k = LazyKt.lazy(new Pd0.c(this, 1));
        this.f108451l = LazyKt.lazy(new com.bilibili.lib.bilipay.ui.recharge.v2.i(this, 2));
        this.f108452m = LazyKt.lazy(new Fe.h(this, 1));
        this.f108453n = LazyKt.lazy(new e(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends com.bilibili.studio.material.internal.ProcessorData> java.lang.Object a(com.bilibili.studio.material.IMaterialProcessor<T> r7, com.bilibili.studio.material.internal.ProcessorItem r8, kotlin.jvm.functions.Function3<? super java.lang.Float, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.IMaterialProcessor.a(com.bilibili.studio.material.IMaterialProcessor, com.bilibili.studio.material.internal.ProcessorItem, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final b access$getCheckFileStrategy(IMaterialProcessor iMaterialProcessor) {
        return (b) iMaterialProcessor.f108446f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void access$reportCancel(com.bilibili.studio.material.IMaterialProcessor r8, com.bilibili.studio.material.internal.ProcessorItem r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.IMaterialProcessor.access$reportCancel(com.bilibili.studio.material.IMaterialProcessor, com.bilibili.studio.material.internal.ProcessorItem):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void access$reportResult(com.bilibili.studio.material.IMaterialProcessor r8, com.bilibili.studio.material.internal.ProcessorData r9) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.IMaterialProcessor.access$reportResult(com.bilibili.studio.material.IMaterialProcessor, com.bilibili.studio.material.internal.ProcessorData):void");
    }

    public static final void access$reportStart(IMaterialProcessor iMaterialProcessor, ProcessorData processorData) {
        iMaterialProcessor.getClass();
        List<ProcessorItem> items = processorData.getItems();
        ArrayList<Map> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (ProcessorItem processorItem : items) {
            xA0.b reportData = processorItem.getReportData();
            reportData.a = processorItem.getRequest().getTaskId();
            reportData.b = ResultCode.START;
            reportData.d = processorItem.getRequest().getMaterialType().getName();
            reportData.e = processorItem.getRequest().getMaterialId();
            reportData.c = processorItem.getRequest().getBizFrom();
            reportData.g = xA0.c.a(processorItem.getRequest().getEngineType());
            arrayList.add(reportData.a());
        }
        for (Map map : arrayList) {
            ((xA0.a) iMaterialProcessor.f108441a.getValue()).getClass();
            Neurons.trackT(true, "editor-basic.material.download", map, 1, new AT0.c(8));
        }
    }

    @Nullable
    public Object batchPreProcess(@NotNull List<? extends ProcessorItem> list, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        Object objA = ((IdToUrlStrategy) this.f108445e.getValue()).a(list, materialConfig, continuation);
        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objA = Unit.INSTANCE;
        }
        return objA;
    }

    @NotNull
    public MaterialConfig getConfig() {
        return this.f108443c;
    }

    @NotNull
    public final List<IStrategy<ProcessorItem>> getDefaultPreStrategies() {
        return (List) this.f108451l.getValue();
    }

    @NotNull
    public final List<IStrategy<ProcessorItem>> getDefaultProStrategies() {
        return (List) this.f108452m.getValue();
    }

    @NotNull
    public abstract MaterialType getMaterialType();

    public boolean getSameDirWithZip() {
        return this.f108444d;
    }

    public final boolean isExist(@NotNull String str) {
        String fileNameFromUrl = UtilsKt.getFileNameFromUrl(str);
        return (getConfig().getUnZip() && StringsKt.w(fileNameFromUrl, ".zip") && new File(getConfig().getFilePath(), UtilsKt.getFilePathNoEx(fileNameFromUrl)).exists()) || new File(getConfig().getFilePath(), fileNameFromUrl).exists();
    }

    @Nullable
    public abstract Object preProcess(@NotNull ProcessorItem processorItem, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    public abstract Object proProcess(@NotNull ProcessorItem processorItem, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    public Object process(@NotNull ProcessorItem processorItem, @Nullable Function3<? super Float, ? super Integer, ? super Integer, Unit> function3, @NotNull Continuation<? super Unit> continuation) {
        return a(this, processorItem, function3, continuation);
    }

    @Nullable
    public final Object processInternal(@NotNull ProcessorData processorData, @NotNull SendChannel<? super h> sendChannel, @NotNull Continuation<? super List<Result>> continuation) {
        return SupervisorKt.supervisorScope(new AnonymousClass2(this, processorData, sendChannel, null), continuation);
    }

    public void setConfig(@NotNull MaterialConfig materialConfig) {
        this.f108443c = materialConfig;
    }

    public final void tryDeleteAllUnusedZip() {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File file;
        if (getConfig().getUnZip()) {
            zA0.b bVar = (zA0.b) this.f108453n.getValue();
            boolean z6 = bVar.d;
            String str = bVar.a;
            if (!z6) {
                File file2 = new File(str);
                if (file2.exists() && file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null) {
                    for (File file3 : fileArrListFiles) {
                        bVar.b(file3);
                    }
                    return;
                }
                return;
            }
            File file4 = new File(str);
            if (file4.exists() && file4.isDirectory() && (fileArrListFiles2 = file4.listFiles()) != null) {
                ArrayList<File> arrayList = new ArrayList();
                for (File file5 : fileArrListFiles2) {
                    if (StringsKt.w(file5.getName(), ".zip")) {
                        arrayList.add(file5);
                    }
                }
                for (File file6 : arrayList) {
                    String filePathNoEx = UtilsKt.getFilePathNoEx(file6.getName());
                    int length = fileArrListFiles2.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            file = null;
                            break;
                        }
                        file = fileArrListFiles2[i7];
                        if (Intrinsics.areEqual(file.getName(), filePathNoEx)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (file != null) {
                        bVar.a(file6);
                    }
                }
            }
        }
    }

    public final void tryDeleteUnusedZip(@Nullable String str) {
        if (getConfig().getUnZip() && str != null) {
            zA0.b bVar = (zA0.b) this.f108453n.getValue();
            boolean z6 = bVar.d;
            String str2 = bVar.a;
            if (!z6) {
                bVar.b(new File(str2, UtilsKt.getFilePathNoEx(UtilsKt.getFileNameFromUrl(str))));
                return;
            }
            String fileNameFromUrl = UtilsKt.getFileNameFromUrl(str);
            File file = new File(str2, fileNameFromUrl);
            if (StringsKt.w(fileNameFromUrl, ".zip") && file.exists()) {
                File file2 = new File(str2, UtilsKt.getFilePathNoEx(fileNameFromUrl));
                if (file2.exists() && file2.isDirectory()) {
                    bVar.a(file);
                }
            }
        }
    }
}
