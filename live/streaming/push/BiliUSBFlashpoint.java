package com.bilibili.live.streaming.push;

import WM.e;
import XM.a;
import ZM.a;
import ZM.c;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.bililive.usblivekit.pccon.protocol.TypeEnum;
import com.bilibili.bililive.usblivekit.pccon.status.PushStatus;
import com.bilibili.bililive.usblivekit.pccon.status.USBStatus;
import com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint;
import com.bilibili.mediastreaming.flashpoint.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliUSBFlashpoint.class */
public final class BiliUSBFlashpoint extends BiliCallbackJavaFlashpoint implements a.a {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String PROTOCOL_TYPE = "usb";

    @NotNull
    private static final String TAG = "BiliUSBFlashpoint";

    @Nullable
    private IBiliBizUSBListener bizUsbListener;

    @NotNull
    private final Context ctx;
    private volatile boolean usbIsReady;

    @NotNull
    private a usbPush;

    @NotNull
    private PushStatus usbPushStatus;

    @NotNull
    private USBStatus usbStatus;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliUSBFlashpoint$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BiliUSBFlashpoint(@NotNull Context context) {
        super(PROTOCOL_TYPE, true, false, TAG);
        this.ctx = context;
        this.usbPush = new a(context, this);
        this.usbStatus = USBStatus.USB_DISCONNECT;
        this.usbPushStatus = PushStatus.WAIT_PC;
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @Override // com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint
    public boolean onConnect() {
        logInfo("onConnect....", null, null, null);
        return true;
    }

    @Override // com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint
    public boolean onDisConnect() {
        logInfo("onDisConnect....", null, null, null);
        return true;
    }

    public void onError(@NotNull String str) {
        i.b(this, "onError, message:" + str, null, 14);
        IBiliBizUSBListener iBiliBizUSBListener = this.bizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBError(str);
        }
    }

    @Override // com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint
    public boolean onIsConnected() {
        PushStatus pushStatus;
        logInfo("onIsConnected....", null, null, null);
        return this.usbStatus == USBStatus.USB_CONNECT && ((pushStatus = this.usbPushStatus) == PushStatus.PC_READY_PUSH || pushStatus == PushStatus.PUSH_ING);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint
    public boolean onNativeStartDeliver() {
        logInfo("onNativeStartDeliver....", null, null, null);
        a aVar = this.usbPush;
        if (aVar.b) {
            return true;
        }
        aVar.b = true;
        e eVar = aVar.f;
        c cVar = aVar.h;
        eVar.getClass();
        try {
            eVar.d();
            if (eVar.f) {
                return true;
            }
            eVar.d = cVar;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                eVar.a.registerReceiver(eVar.g, e.h, 4);
            } else {
                Context context = eVar.a;
                e.a aVar2 = eVar.g;
                IntentFilter intentFilter = e.h;
                if (i7 >= 34) {
                    context.registerReceiver(aVar2, intentFilter, 4);
                } else {
                    context.registerReceiver(aVar2, intentFilter);
                }
            }
            eVar.f = true;
            return true;
        } catch (Exception e7) {
            a.a.a.e("USBTransportManager", String.valueOf(e7.getMessage()), e7);
            return true;
        }
    }

    @Override // com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint
    public void onNativeStopDeliver() {
        logInfo("onNativeStopDeliver....", null, null, null);
        this.usbPush.c();
    }

    public void onPushStatusChange(@NotNull PushStatus pushStatus) {
        logInfo("onPushStatusChange, status:" + pushStatus, null, null, null);
        this.usbPushStatus = pushStatus;
        IBiliBizUSBListener iBiliBizUSBListener = this.bizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBPushStatusChange(pushStatus);
        }
    }

    public void onReady(@Nullable byte[] bArr) {
        logInfo(C4496a.a("onReady ", bArr != null ? new String(bArr, Charsets.UTF_8) : null), null, null, null);
        this.usbIsReady = true;
        IBiliBizUSBListener iBiliBizUSBListener = this.bizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBReady(bArr);
        }
    }

    @Override // com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint
    public boolean onSendPacket(int i7, @NotNull byte[] bArr) {
        WM.c cVar;
        if (!this.usbIsReady) {
            return false;
        }
        ZM.a aVar = this.usbPush;
        aVar.getClass();
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        aVar.b(PushStatus.PUSH_ING);
        TypeEnum.NONE.getValue();
        int value = TypeEnum.FLVStream.getValue();
        int length = bArrCopyOf.length;
        WM.c cVar2 = aVar.d;
        if (cVar2 != null) {
            cVar2.f(ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN).putInt(1).putInt(value).putInt(0).putInt(length).putInt(0).array());
        }
        if (bArrCopyOf.length == 0 || (cVar = aVar.d) == null) {
            return true;
        }
        cVar.f(bArrCopyOf);
        return true;
    }

    public void onStop() {
        logInfo("onStop", null, null, null);
        this.usbIsReady = false;
        IBiliBizUSBListener iBiliBizUSBListener = this.bizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBStop();
        }
    }

    public void onUSBConnectStatusChange(@NotNull USBStatus uSBStatus) {
        logInfo("onUSBConnectStatusChange, " + uSBStatus, null, null, null);
        this.usbStatus = uSBStatus;
        IBiliBizUSBListener iBiliBizUSBListener = this.bizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBConnectStatusChange(uSBStatus);
        }
    }

    public final void setBizUSBListener(@Nullable IBiliBizUSBListener iBiliBizUSBListener) {
        this.bizUsbListener = iBiliBizUSBListener;
    }
}
