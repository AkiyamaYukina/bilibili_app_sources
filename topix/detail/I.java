package com.bilibili.topix.detail;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bapis.bilibili.broadcast.message.topic.DetailEventMessage;
import com.bapis.bilibili.broadcast.v1.RoomReq;
import com.bapis.bilibili.broadcast.v1.RoomResp;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.lib.moss.utils.CommonUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/I.class */
@StabilityInferred(parameters = 0)
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<DetailEventMessage> f112655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f112656c = new a(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MossResponseHandler<RoomReq> f112657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f112658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f112659f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/I$a.class */
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f112660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i7, Looper looper) {
            super(looper);
            this.f112660a = i7;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == RoomResp.EventCase.MSG.getNumber()) {
                Object obj = message.obj;
                if (!(obj instanceof DetailEventMessage)) {
                    obj = null;
                }
                DetailEventMessage detailEventMessage = (DetailEventMessage) obj;
                if (detailEventMessage != null) {
                    this.f112660a.f112655b.setValue(detailEventMessage);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/I$b.class */
    public static final class b implements MossResponseHandler<RoomResp> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f112661a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/I$b$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f112662a;

            static {
                int[] iArr = new int[RoomResp.EventCase.values().length];
                try {
                    iArr[RoomResp.EventCase.MSG.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[RoomResp.EventCase.ERR.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f112662a = iArr;
            }
        }

        public b(I i7) {
            this.f112661a = i7;
        }

        public final void onError(MossException mossException) {
            this.f112661a.getClass();
            BLog.e("TopixDynamicMossWatcher", mossException);
        }

        public final void onNext(Object obj) {
            RoomResp roomResp = (RoomResp) obj;
            I i7 = this.f112661a;
            if (roomResp == null) {
                i7.getClass();
                BLog.v("TopixDynamicMossWatcher", "onNext null");
                return;
            }
            i7.getClass();
            BLog.vfmt("TopixDynamicMossWatcher", "onNext-> %s.", new Object[]{CommonUtilsKt.printProto(roomResp)});
            RoomResp.EventCase eventCase = roomResp.getEventCase();
            int i8 = eventCase == null ? -1 : a.f112662a[eventCase.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    return;
                }
                BLog.e("TopixDynamicMossWatcher", "onNext-> EventCase.ERR: " + roomResp);
                return;
            }
            if (Intrinsics.areEqual("/bilibili.broadcast.message.topic.Topic/DetailNotify", roomResp.getMsg().getTargetPath())) {
                try {
                    DetailEventMessage detailEventMessageUnpack = AnyKt.unpack(roomResp.getMsg().getBody(), DetailEventMessage.class);
                    a aVar = i7.f112656c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = RoomResp.EventCase.MSG.getNumber();
                    messageObtain.obj = detailEventMessageUnpack;
                    aVar.sendMessage(messageObtain);
                    BLog.i("TopixDynamicMossWatcher", "onNext-> data: " + detailEventMessageUnpack);
                } catch (Exception e7) {
                    M.b("onNext-> parseException: ", Log.getStackTraceString(e7), "TopixDynamicMossWatcher");
                }
            }
        }

        public final void onValid() {
            this.f112661a.getClass();
            BLog.i("TopixDynamicMossWatcher", "onValid");
        }
    }

    public I(long j7, @NotNull MutableLiveData<DetailEventMessage> mutableLiveData) {
        this.f112654a = j7;
        this.f112655b = mutableLiveData;
        Boolean bool = (Boolean) ConfigManager.Companion.ab().get("topic_added_dynamic_notify_enable", Boolean.TRUE);
        this.f112658e = bool != null ? bool.booleanValue() : true;
        this.f112659f = new b(this);
    }
}
