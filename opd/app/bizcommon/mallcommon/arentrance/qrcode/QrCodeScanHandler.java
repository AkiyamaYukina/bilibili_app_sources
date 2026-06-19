package com.bilibili.opd.app.bizcommon.mallcommon.arentrance.qrcode;

import Rm0.b;
import Sm0.a;
import Sm0.d;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.sdk.app.PayTask;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.BThreadPool;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.opd.app.bizcommon.mallcommon.arentrance.fragment.AREntranceFragment;
import java.util.concurrent.ExecutorService;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mallcommon/arentrance/qrcode/QrCodeScanHandler.class */
@StabilityInferred(parameters = 0)
public final class QrCodeScanHandler extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AREntranceFragment f74002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f74003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ExecutorService f74004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public State f74005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74006e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mallcommon/arentrance/qrcode/QrCodeScanHandler$State.class */
    public static final class State {
        private static final EnumEntries $ENTRIES;
        private static final State[] $VALUES;
        public static final State PREVIEW = new State("PREVIEW", 0);
        public static final State SUCCESS = new State(BCGToken.SCHEDULE_STATUS_SUCCESS, 1);
        public static final State DONE = new State("DONE", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{PREVIEW, SUCCESS, DONE};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
        }

        private State(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public QrCodeScanHandler(@NotNull AREntranceFragment aREntranceFragment) {
        this.f74002a = aREntranceFragment;
        b bVar = new b(aREntranceFragment);
        this.f74003b = bVar;
        ExecutorService executorServiceNewSingleThreadExecutor = BThreadPool.Companion.newSingleThreadExecutor("ArQRCode");
        this.f74004c = executorServiceNewSingleThreadExecutor;
        this.f74006e = true;
        executorServiceNewSingleThreadExecutor.submit(bVar);
    }

    public final void a() {
        this.f74005d = State.DONE;
        d dVar = d.f23019i;
        if (dVar != null) {
            dVar.d();
        }
        Message.obtain(this.f74003b.a(), 520).sendToTarget();
        try {
            this.f74004c.shutdownNow();
        } catch (Exception e7) {
        }
        removeMessages(516);
        removeMessages(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_DEPTH_ESTIMATION_MAX_SIZE);
    }

    public final void b() {
        Camera camera;
        this.f74005d = State.SUCCESS;
        try {
            d dVar = d.f23019i;
            if (dVar != null && (camera = dVar.f23024e) != null && !dVar.f23026g) {
                camera.startPreview();
                dVar.f23026g = true;
            }
            c();
        } catch (RuntimeException e7) {
            d dVar2 = d.f23019i;
            if (dVar2 != null) {
                dVar2.d();
            }
        }
    }

    public final void c() {
        Camera camera;
        if (this.f74005d == State.SUCCESS) {
            this.f74005d = State.PREVIEW;
            d dVar = d.f23019i;
            if (dVar != null) {
                dVar.c(this.f74003b.a());
            }
            d dVar2 = d.f23019i;
            if (dVar2 == null || (camera = dVar2.f23024e) == null || !dVar2.f23026g) {
                return;
            }
            a aVar = dVar2.f23023d;
            aVar.f23012a = this;
            aVar.f23013b = BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_MIN_THRESHOLD;
            try {
                camera.autoFocus(aVar);
            } catch (RuntimeException e7) {
                e7.getMessage();
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(@NotNull Message message) {
        d dVar;
        Camera camera;
        int i7 = message.what;
        if (i7 == 513) {
            BLog.d("QrCodeFragmentHandler", "Got auto-focus message");
            if (this.f74005d != State.PREVIEW || (dVar = d.f23019i) == null || (camera = dVar.f23024e) == null || !dVar.f23026g) {
                return;
            }
            a aVar = dVar.f23023d;
            aVar.f23012a = this;
            aVar.f23013b = BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_MIN_THRESHOLD;
            try {
                camera.autoFocus(aVar);
                return;
            } catch (RuntimeException e7) {
                e7.getMessage();
                return;
            }
        }
        if (i7 == 521) {
            BLog.d("QrCodeFragmentHandler", "Got restart preview message");
            c();
            return;
        }
        b bVar = this.f74003b;
        if (i7 == 515) {
            if (!this.f74006e) {
                d dVar2 = d.f23019i;
                if (dVar2 != null) {
                    dVar2.c(bVar.a());
                    return;
                }
                return;
            }
            this.f74005d = State.PREVIEW;
            d dVar3 = d.f23019i;
            if (dVar3 != null) {
                dVar3.c(bVar.a());
            }
            BLog.d("QrCodeFragmentHandler", "Got decode failed message");
            return;
        }
        if (i7 != 516) {
            defpackage.a.a(i7, "Unsupported message:", "QrCodeFragmentHandler");
            return;
        }
        if (!this.f74006e) {
            d dVar4 = d.f23019i;
            if (dVar4 != null) {
                dVar4.c(bVar.a());
                return;
            }
            return;
        }
        BLog.d("QrCodeFragmentHandler", "Got decode succeeded message");
        this.f74005d = State.SUCCESS;
        String str = (String) message.obj;
        AREntranceFragment aREntranceFragment = this.f74002a;
        if (str != null) {
            aREntranceFragment.getClass();
            if (str.length() != 0 && (StringsKt.Z(str, "bilibili://mall/ar/container") || StringsKt.Z(str, "bilicomic://mall/ar/container"))) {
                if (BLRouter.routeTo(new RouteRequest.Builder(Uri.parse(str)).requestCode(101).build(), aREntranceFragment).isSuccess()) {
                    return;
                }
                Handler handler = aREntranceFragment.f73985c;
                if (handler != null) {
                    handler.postDelayed(new Qm0.a(aREntranceFragment, 0), PayTask.f60018j);
                }
                Toast toastMakeText = Toast.makeText(BiliContext.application(), 2131829613, 0);
                toastMakeText.setGravity(17, 0, 0);
                ToastHelper.showToastSafely(toastMakeText);
                BLog.e("QRCodeCaptureFragment", "scan result route error, result is: ".concat(str));
                return;
            }
        }
        aREntranceFragment.getClass();
        Toast toastMakeText2 = Toast.makeText(BiliContext.application(), 2131829613, 0);
        toastMakeText2.setGravity(17, 0, 0);
        ToastHelper.showToastSafely(toastMakeText2);
        M.b("Unsupported scan result:", str, "QRCodeCaptureFragment");
        Handler handler2 = aREntranceFragment.f73985c;
        if (handler2 != null) {
            handler2.postDelayed(new Qm0.a(aREntranceFragment, 0), PayTask.f60018j);
        }
    }
}
