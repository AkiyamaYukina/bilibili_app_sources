package com.bilibili.studio.upper.publish;

import J3.C2378s1;
import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.k;
import com.bapis.bilibili.broadcast.message.archive.VideoDataReply;
import com.bilibili.base.MainThread;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.upper.publish.model.ArchiveCheckStatus;
import com.bilibili.studio.upper.publish.model.PublishArchiveStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/PublishDynamicMossCallback.class */
public final class PublishDynamicMossCallback extends com.bilibili.studio.upper.service.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IA0.b f108669c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/PublishDynamicMossCallback$a.class */
    public static final class a extends BiliApiDataCallback<PublishArchiveStatus> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PublishDynamicMossCallback f108670b;

        public a(PublishDynamicMossCallback publishDynamicMossCallback) {
            this.f108670b = publishDynamicMossCallback;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(PublishArchiveStatus publishArchiveStatus) {
            Collection<IA0.a> collectionValues;
            Integer num;
            ArchiveCheckStatus archiveCheckStatus;
            PublishArchiveStatus publishArchiveStatus2 = publishArchiveStatus;
            final PublishDynamicMossCallback publishDynamicMossCallback = this.f108670b;
            h.a("pull", "success");
            if ((publishArchiveStatus2 != null ? publishArchiveStatus2.getArchiveReviewStatusMap() : null) == null) {
                BLog.d("PublishDynamicMossCallback", "PUBLISH_DEBUG, onMossTimeout, onDataSuccess, result is empty.");
                return;
            }
            Map<String, Integer> archiveReviewStatusMap = publishArchiveStatus2.getArchiveReviewStatusMap();
            try {
                IA0.b bVar = publishDynamicMossCallback.f108669c;
                if (bVar != null && (collectionValues = bVar.f10090a.values()) != null) {
                    for (IA0.a aVar : collectionValues) {
                        if (archiveReviewStatusMap != null && (num = archiveReviewStatusMap.get(String.valueOf(aVar.f10085b))) != null) {
                            int iIntValue = num.intValue();
                            ArchiveCheckStatus[] archiveCheckStatusArrValues = ArchiveCheckStatus.values();
                            int length = archiveCheckStatusArrValues.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    archiveCheckStatus = null;
                                    break;
                                }
                                archiveCheckStatus = archiveCheckStatusArrValues[i7];
                                if (archiveCheckStatus.getValue() == iIntValue) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            ArchiveCheckStatus archiveCheckStatus2 = archiveCheckStatus;
                            if (archiveCheckStatus == null) {
                                archiveCheckStatus2 = ArchiveCheckStatus.uploadError;
                            }
                            if (aVar.f10087d.compareTo(archiveCheckStatus2) < 0) {
                                aVar.f10087d = archiveCheckStatus2;
                                BLog.d("PublishDynamicMossCallback", "PUBLISH_DEBUG, onMossTimeout, onDataSuccess. aid: " + aVar.f10085b + ", status: " + archiveCheckStatus2);
                                boolean zC = PublishDynamicMossCallback.c(publishDynamicMossCallback, archiveCheckStatus2);
                                HashMap map = new HashMap();
                                map.put("status_completed", String.valueOf(zC));
                                map.put("archive_status", archiveCheckStatus2.name());
                                Neurons.trackT$default(false, "creation.center-plus.publish.pull_archive_status.track_t", map, 0, (Function0) null, 24, (Object) null);
                            }
                        }
                    }
                }
                publishDynamicMossCallback.f108669c.d();
                final ArrayList arrayList = new ArrayList();
                final int i8 = 0;
                MainThread.postOnMainThread(new Function0(i8, publishDynamicMossCallback, arrayList) { // from class: com.bilibili.studio.upper.publish.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f108671a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f108672b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f108673c;

                    {
                        this.f108671a = i8;
                        this.f108672b = publishDynamicMossCallback;
                        this.f108673c = arrayList;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object invoke() {
                        Collection<IA0.a> collectionValues2;
                        switch (this.f108671a) {
                            case 0:
                                List list = (List) this.f108673c;
                                PublishDynamicMossCallback publishDynamicMossCallback2 = (PublishDynamicMossCallback) this.f108672b;
                                IA0.b bVar2 = publishDynamicMossCallback2.f108669c;
                                if (bVar2 != null && (collectionValues2 = bVar2.f10090a.values()) != null) {
                                    for (IA0.a aVar2 : collectionValues2) {
                                        if (PublishDynamicMossCallback.c(publishDynamicMossCallback2, aVar2.f10087d)) {
                                            ((ArrayList) list).add(aVar2);
                                        }
                                    }
                                }
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    String str = ((IA0.a) it.next()).f10084a;
                                    IA0.b bVar3 = publishDynamicMossCallback2.f108669c;
                                    bVar3.f10090a.remove(IA0.b.c(str));
                                    bVar3.d();
                                }
                                break;
                            default:
                                MutableState mutableState = (MutableState) this.f108673c;
                                MutableState mutableState2 = (MutableState) this.f108672b;
                                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                                    mutableState2.setValue(Boolean.TRUE);
                                    mutableState.setValue(Boolean.FALSE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            BLog.d("PublishDynamicMossCallback", "PUBLISH_DEBUG, onMossTimeout, query archive review status failed, e: " + (th != null ? th.getMessage() : null));
            h.a("pull", "error");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/PublishDynamicMossCallback$b.class */
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PublishDynamicMossCallback(@NotNull IA0.b bVar) {
        String str = (String) ConfigManager.Companion.config().get("upper.archive_moss_timeout_for_publish_dynamic", "180000");
        super(str != null ? Long.parseLong(str) : 180000L);
        this.f108669c = bVar;
    }

    public static final boolean c(PublishDynamicMossCallback publishDynamicMossCallback, ArchiveCheckStatus archiveCheckStatus) {
        publishDynamicMossCallback.getClass();
        return archiveCheckStatus == ArchiveCheckStatus.textFailed || archiveCheckStatus == ArchiveCheckStatus.coverFailed || archiveCheckStatus == ArchiveCheckStatus.publishError || archiveCheckStatus == ArchiveCheckStatus.coverPass;
    }

    @Override // com.bilibili.studio.upper.service.d
    public final void a() {
        IA0.b bVar = this.f108669c;
        if (bVar.f10090a.isEmpty()) {
            return;
        }
        List listTake = CollectionsKt.take(bVar.f10090a.values(), 100);
        StringBuilder sb = new StringBuilder();
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            sb.append(((IA0.a) it.next()).f10085b);
            sb.append(",");
        }
        String string = sb.length() == 0 ? "" : sb.delete(sb.length() - 1, sb.length()).toString();
        long jA = com.bilibili.adcommon.utils.a.a();
        BLog.d("PublishDynamicMossCallback", k.b(jA, "PUBLISH_DEBUG, onMossTimeout, moss timeout. mid: ", ", aids: ", string));
        ((IA0.c) ServiceGenerator.createService(IA0.c.class)).getArchiveReviewStatus(string, jA).enqueue(new a(this));
    }

    @Override // com.bilibili.studio.upper.service.d
    public final void b(@NotNull VideoDataReply videoDataReply) {
        if (videoDataReply.getType() != 1 || TextUtils.isEmpty(videoDataReply.getData())) {
            return;
        }
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineExceptionHandler) LazyKt.lazy(new C2378s1(10)).getValue(), (CoroutineStart) null, new PublishDynamicMossCallback$onNext$1(videoDataReply, this, null), 2, (Object) null);
    }
}
