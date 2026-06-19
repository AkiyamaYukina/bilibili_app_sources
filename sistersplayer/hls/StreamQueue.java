package com.bilibili.sistersplayer.hls;

import G.f;
import I1.C2157f0;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.A;
import com.bilibili.sistersplayer.NetSpeedMonitor;
import com.bilibili.sistersplayer.p2p.utils.ExtKt;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/StreamQueue.class */
public final class StreamQueue extends LinkedBlockingDeque<byte[]> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "StreamQueue";

    @NotNull
    private final ArrayDeque<Integer> bitRateHistory;
    private volatile boolean closeStream;

    @NotNull
    private final ArrayDeque<Integer> innerOtherRateHistory;
    private final Condition inputFull;

    @NotNull
    private final ReentrantLock inputLock;
    private volatile boolean isEOS;
    private long lastPrint;
    private long lastProduceCount;

    @NotNull
    private final P2PLogger logger;
    private final int maxBuffer;

    @NotNull
    private final ArrayDeque<Integer> otherAppRateHistory;
    private final int printPeriod;
    private long roomId;

    @NotNull
    private final NetSpeedMonitor speedMonitor;

    @NotNull
    private AtomicLong bufferCount = new AtomicLong();

    @NotNull
    private AtomicLong produceCount = new AtomicLong();

    @NotNull
    private AtomicLong consumeCount = new AtomicLong();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/StreamQueue$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StreamQueue(int i7, @NotNull P2PLogger p2PLogger) {
        this.maxBuffer = i7;
        this.logger = p2PLogger;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.inputLock = reentrantLock;
        this.inputFull = reentrantLock.newCondition();
        this.roomId = -1L;
        this.printPeriod = 30;
        this.bitRateHistory = new ArrayDeque<>();
        this.innerOtherRateHistory = new ArrayDeque<>();
        this.otherAppRateHistory = new ArrayDeque<>();
        NetSpeedMonitor netSpeedMonitor = new NetSpeedMonitor();
        netSpeedMonitor.getCurrentSpeed();
        this.speedMonitor = netSpeedMonitor;
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
        P2PLogger.logI$default(p2PLogger, TAG, f.a(hashCode(), i7, "@", " init maxBuffer = "), null, 4, null);
    }

    private final boolean await() throws InterruptedException {
        this.inputLock.lockInterruptibly();
        try {
            P2PLogger.logI$default(this.logger, TAG, "overload start await " + getPrintQueueLog(), null, 4, null);
            this.inputFull.await();
            if (!this.isEOS) {
                P2PLogger.logI$default(this.logger, TAG, C4496a.a("overload end await ", getPrintQueueLog()), null, 4, null);
                this.inputLock.unlock();
                return true;
            }
            P2PLogger.logI$default(this.logger, TAG, "await is EOS", null, 4, null);
            P2PLogger.logI$default(this.logger, TAG, C4496a.a("overload end await ", getPrintQueueLog()), null, 4, null);
            this.inputLock.unlock();
            return false;
        } catch (Throwable th) {
            P2PLogger.logI$default(this.logger, TAG, C4496a.a("overload end await ", getPrintQueueLog()), null, 4, null);
            this.inputLock.unlock();
            throw th;
        }
    }

    private final String generateAxisString(int[] iArr) {
        Integer numMaxOrNull;
        try {
            if (iArr.length == 0 || (numMaxOrNull = ArraysKt.maxOrNull(iArr)) == null) {
                return null;
            }
            int iIntValue = numMaxOrNull.intValue();
            if (iIntValue == 0) {
                return "maxValue = 0";
            }
            StringBuilder sb = new StringBuilder();
            int i7 = iIntValue / 4;
            int i8 = i7;
            if (i7 == 0) {
                i8 = iIntValue;
            }
            if (i8 <= 0) {
                throw new IllegalArgumentException("Step must be positive, was: " + i8 + UtilsKt.DOT);
            }
            int i9 = -i8;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(iIntValue, 0, i9);
            if (progressionLastElement <= iIntValue) {
                while (true) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    sb.append(String.format("%4d |", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)));
                    for (int i10 : iArr) {
                        if (iIntValue > i10 || i10 >= iIntValue + i8) {
                            sb.append("   ");
                        } else {
                            sb.append(" * ");
                        }
                    }
                    sb.append("\n");
                    if (iIntValue == progressionLastElement) {
                        break;
                    }
                    iIntValue += i9;
                }
            }
            sb.append("     ");
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                sb.append("---");
            }
            sb.append("\n     ");
            int length2 = iArr.length;
            for (int i12 = 0; i12 < length2; i12++) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                sb.append(String.format("%2d ", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1)));
            }
            return sb.toString();
        } catch (Exception e7) {
            return null;
        }
    }

    private final String getPrintQueueLog() {
        int iHashCode = hashCode();
        long j7 = this.roomId;
        String formatBytes$default = ExtKt.toFormatBytes$default(this.bufferCount.get(), 0, 1, null);
        int size = size();
        String formatBytes$default2 = ExtKt.toFormatBytes$default(this.produceCount.get(), 0, 1, null);
        String formatBytes$default3 = ExtKt.toFormatBytes$default(this.consumeCount.get(), 0, 1, null);
        StringBuilder sbA = C2157f0.a(iHashCode, j7, "@", " roomid = ");
        bf.a.a(size, " cache = ", formatBytes$default, " size = ", sbA);
        return A.a(" produce = ", formatBytes$default2, " consume = ", formatBytes$default3, sbA);
    }

    private final boolean overload() {
        byte[] bArrPeekLast = peekLast();
        boolean z6 = false;
        if (this.bufferCount.get() - ((long) (bArrPeekLast != null ? bArrPeekLast.length : 0)) > this.maxBuffer) {
            z6 = true;
        }
        return z6;
    }

    private final void printSpeedInfo() {
        try {
            if (this.lastPrint + ((long) (this.printPeriod * 1000)) < System.currentTimeMillis()) {
                double dCurrentTimeMillis = (((this.produceCount.get() - this.lastProduceCount) * ((long) 8)) / ((System.currentTimeMillis() - this.lastPrint) / 1000.0d)) / 1000.0d;
                float f7 = (float) ((dCurrentTimeMillis / ((double) 8)) * ((double) 1000));
                NetSpeedMonitor.Speed currentSpeed = this.speedMonitor.getCurrentSpeed();
                currentSpeed.setAppDownload(currentSpeed.getAppDownload() - f7);
                currentSpeed.setTotalDownload(currentSpeed.getTotalDownload() - f7);
                float appDownload = currentSpeed.getAppDownload();
                float totalDownload = currentSpeed.getTotalDownload();
                float appDownload2 = currentSpeed.getAppDownload();
                this.bitRateHistory.addLast(Integer.valueOf((int) dCurrentTimeMillis));
                this.innerOtherRateHistory.addLast(Integer.valueOf((((int) (appDownload - f7)) * 8) / 1000));
                this.otherAppRateHistory.addLast(Integer.valueOf((((int) (totalDownload - appDownload2)) * 8) / 1000));
                if (this.bitRateHistory.size() > 30) {
                    this.bitRateHistory.removeFirst();
                }
                if (this.innerOtherRateHistory.size() > 30) {
                    this.innerOtherRateHistory.removeFirst();
                }
                if (this.otherAppRateHistory.size() > 30) {
                    this.otherAppRateHistory.removeFirst();
                }
                P2PLogger.logI$default(this.logger, TAG, "put " + getPrintQueueLog() + " " + currentSpeed + " avg = " + String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(dCurrentTimeMillis)}, 1)) + " kbps \nstream:\n" + generateAxisString(CollectionsKt.toIntArray(this.bitRateHistory)) + " \ninnerOther:\n" + generateAxisString(CollectionsKt.toIntArray(this.innerOtherRateHistory)) + " \notherApp:\n" + generateAxisString(CollectionsKt.toIntArray(this.otherAppRateHistory)), null, 4, null);
                this.lastProduceCount = this.produceCount.get();
                this.lastPrint = System.currentTimeMillis();
            }
        } catch (Exception e7) {
        }
    }

    private final void signal(boolean z6) {
        ReentrantLock reentrantLock = this.inputLock;
        reentrantLock.lock();
        try {
            this.isEOS = z6;
            this.inputFull.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    public static /* synthetic */ void signal$default(StreamQueue streamQueue, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        streamQueue.signal(z6);
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
        this.bufferCount.set(0L);
    }

    public final void closeStream() {
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("closeStream ", getPrintQueueLog()), null, 4, null);
        this.closeStream = true;
        signal(true);
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof byte[]) {
            return contains((byte[]) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(byte[] bArr) {
        return super.contains((Object) bArr);
    }

    public final void endOfStream() {
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("endOfStream ", getPrintQueueLog()), null, 4, null);
        signal(true);
    }

    public final long getBufferCount() {
        return this.bufferCount.get();
    }

    public final long getConsumeCount() {
        return this.consumeCount.get();
    }

    public final long getProduceCount() {
        return this.produceCount.get();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(@NotNull byte[] bArr) throws Exception {
        while (overload()) {
            try {
                if (!await()) {
                    return;
                }
            } catch (InterruptedException e7) {
                this.logger.logW(TAG, "put InterruptedException " + getPrintQueueLog(), e7);
                return;
            }
        }
        if (this.closeStream) {
            throw new Exception("Don't put，stream is close");
        }
        AtomicLong atomicLong = this.bufferCount;
        atomicLong.set(atomicLong.get() + ((long) bArr.length));
        AtomicLong atomicLong2 = this.produceCount;
        atomicLong2.set(atomicLong2.get() + ((long) bArr.length));
        printSpeedInfo();
        super.put(bArr);
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof byte[]) {
            return remove((byte[]) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(byte[] bArr) {
        return super.remove((Object) bArr);
    }

    public final void setRoomId(long j7) {
        this.roomId = j7;
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingDeque, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @NotNull
    public byte[] take() throws Exception {
        byte[] bArr = (byte[]) super.take();
        if (bArr != null) {
            AtomicLong atomicLong = this.bufferCount;
            atomicLong.set(atomicLong.get() - ((long) bArr.length));
            AtomicLong atomicLong2 = this.consumeCount;
            atomicLong2.set(atomicLong2.get() + ((long) bArr.length));
        }
        signal(false);
        return bArr;
    }
}
