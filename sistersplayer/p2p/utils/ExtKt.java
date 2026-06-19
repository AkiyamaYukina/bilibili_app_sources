package com.bilibili.sistersplayer.p2p.utils;

import androidx.compose.ui.node.C4448z;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/ExtKt.class */
public final class ExtKt {
    public static final /* synthetic */ <T> T getField(Object obj, String str) {
        T t7;
        Object objCall;
        Iterator<T> it = KClasses.getMemberProperties(Reflection.getOrCreateKotlinClass(obj.getClass())).iterator();
        while (true) {
            if (!it.hasNext()) {
                t7 = null;
                break;
            }
            T next = it.next();
            if (Intrinsics.areEqual(str, ((KProperty1) next).getName())) {
                t7 = next;
                break;
            }
        }
        KProperty1 kProperty1 = (KProperty1) t7;
        if (kProperty1 == null) {
            objCall = null;
        } else {
            objCall = kProperty1.getGetter().call(new Object[]{obj});
            Intrinsics.reifiedOperationMarker(1, "T?");
        }
        return (T) objCall;
    }

    @NotNull
    public static final Pair<String, Integer> getHostAndPort(@NotNull String str, int i7) {
        String strRemovePrefix = StringsKt.removePrefix(str, "stun:");
        if (StringsKt.Z(strRemovePrefix, "[")) {
            int iA = StringsKt.A(strRemovePrefix, "]:", 0, false, 6);
            return iA != -1 ? TuplesKt.to(strRemovePrefix.substring(1, iA), Integer.valueOf(Integer.parseInt(strRemovePrefix.substring(iA + 2)))) : TuplesKt.to(C4448z.a(1, 1, strRemovePrefix), Integer.valueOf(i7));
        }
        int iD = StringsKt.D(strRemovePrefix, ":", 0, 6);
        return iD != -1 ? TuplesKt.to(strRemovePrefix.substring(0, iD), Integer.valueOf(Integer.parseInt(strRemovePrefix.substring(iD + 1)))) : TuplesKt.to(strRemovePrefix, Integer.valueOf(i7));
    }

    @Nullable
    public static final Inet4Address getInet4Address(@NotNull String str) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : allByName) {
            if (inetAddress instanceof Inet4Address) {
                arrayList.add(inetAddress);
            }
        }
        return !arrayList.isEmpty() ? (Inet4Address) arrayList.get(0) : null;
    }

    @Nullable
    public static final Inet6Address getInet6Address(@NotNull String str) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : allByName) {
            if (inetAddress instanceof Inet6Address) {
                arrayList.add(inetAddress);
            }
        }
        return !arrayList.isEmpty() ? (Inet6Address) arrayList.get(0) : null;
    }

    public static final /* synthetic */ <T> boolean setField(Object obj, String str, T t7) {
        T t8;
        boolean z6;
        Iterator<T> it = KClasses.getMemberProperties(Reflection.getOrCreateKotlinClass(obj.getClass())).iterator();
        while (true) {
            if (!it.hasNext()) {
                t8 = null;
                break;
            }
            T next = it.next();
            if (Intrinsics.areEqual(str, ((KProperty1) next).getName())) {
                t8 = next;
                break;
            }
        }
        KMutableProperty kMutableProperty = (KProperty1) t8;
        if (kMutableProperty instanceof KMutableProperty) {
            kMutableProperty.getSetter().call(new Object[]{obj, t7});
            z6 = true;
        } else {
            z6 = false;
        }
        return z6;
    }

    @NotNull
    public static final List<InetSocketAddress> stunHostName2SocketAddress(@NotNull List<String> list, int i7, boolean z6) {
        InetAddress inet6Address;
        InetSocketAddress inetSocketAddress;
        List<String> list2 = list;
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(getHostAndPort((String) it.next(), i7));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Pair pair : arrayList) {
            if (z6) {
                try {
                    inet6Address = getInet6Address((String) pair.getFirst());
                } catch (Exception e7) {
                    inetSocketAddress = null;
                }
            } else {
                inet6Address = getInet4Address((String) pair.getFirst());
            }
            inetSocketAddress = new InetSocketAddress(inet6Address, ((Number) pair.getSecond()).intValue());
            arrayList2.add(inetSocketAddress);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) obj;
            if (inetSocketAddress2 != null && !inetSocketAddress2.isUnresolved()) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public static /* synthetic */ List stunHostName2SocketAddress$default(List list, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return stunHostName2SocketAddress(list, i7, z6);
    }

    @Nullable
    public static final Object stunHostname2HostAddress(@NotNull List<String> list, @NotNull List<String> list2, @NotNull Continuation<? super Unit> continuation) {
        Object objAwait = BuildersKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new ExtKt$stunHostname2HostAddress$async$1(list, list2, null), 3, (Object) null).await(continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    public static final float toFixed(float f7, int i7) {
        int i8 = i7;
        if (i7 < 0) {
            i8 = 0;
        }
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return Float.parseFloat(String.format("%." + i8 + "f", Arrays.copyOf(new Object[]{Float.valueOf(f7)}, 1)));
        } catch (Exception e7) {
            return -1.0f;
        }
    }

    public static /* synthetic */ float toFixed$default(float f7, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 3;
        }
        return toFixed(f7, i7);
    }

    @NotNull
    public static final String toFormatBytes(long j7, int i7) {
        if (j7 == 0) {
            return "0 Bytes";
        }
        int i8 = i7;
        if (i7 < 0) {
            i8 = 0;
        }
        try {
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new String[]{"Bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"});
            float f7 = j7;
            float fLog10 = (float) Math.log10(f7);
            int iFloor = (int) Math.floor(fLog10 / ((float) Math.log10(r0)));
            return toFixed(f7 / ((float) Math.pow(1024, iFloor)), i8) + " " + arrayListArrayListOf.get(iFloor);
        } catch (Exception e7) {
            return "error Bytes";
        }
    }

    public static /* synthetic */ String toFormatBytes$default(long j7, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 2;
        }
        return toFormatBytes(j7, i7);
    }
}
